import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImp implements EmployeeDAO{
	
	private static Statement statement = null;
	private static Connection conn = null;
	
	public EmployeeDAOImp() throws SQLException{
		conn = ConnectionFactory.getConnection();
		statement = conn.createStatement();
	}

	@Override
	public List<Customer>viewCustomerDetails() throws SQLException {
		String sql = "select * from cust_table";
		List<Customer> customers = new ArrayList<>();
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			int memberId = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String address = resultSet.getString(3);
			int social = resultSet.getInt(4);
			String email = resultSet.getString(5);
			int phone = resultSet.getInt(6);
			Customer user = new Customer(memberId, name, address, social, email,phone);
			customers.add(user);
			
		}
		return customers;
		
	}

	@Override
	public void addCustomer(Customer customer) throws SQLException {
		String query = "insert into cust_table(name, address, dob, email) values (?,?,?,?)";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, customer.getName());
		preparedStatement.setString(2, customer.getAddress());
		preparedStatement.setInt(3, customer.getSsn());
		preparedStatement.setString(4, customer.getEmail());
		int process = preparedStatement.executeUpdate();
		if(process>0)
			System.out.println("Customer details recorded");
		else
			System.out.println("There seems to be an issue");
		
	}

	@Override
	public void updateCustomerAddress(Customer customer) throws SQLException {
		String query = "update cust_table set, address = ? where mem_id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, customer.getAddress());
		preparedStatement.setInt(2, customer.getMemberId());
		int process = preparedStatement.executeUpdate();
		if(process>0)
			System.out.println("Address Updated Succefully");
		else
			System.out.println("There seems to be an issue");
		
	}

	@Override
	public void updateCustomerEmail(Customer customer) throws SQLException {
		String query = "update cust_table set, email = ? where mem_id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, customer.getEmail());
		preparedStatement.setInt(2, customer.getMemberId());
		int process = preparedStatement.executeUpdate();
		if(process>0)
			System.out.println("Email Updated Succesfully");
		else
			System.out.println("There seems to be an issue");
		
	}

	@Override
	public void updateCustomerPhoneNumber(Customer customer) throws SQLException {
		String query = "update cust_table set, phone = ? where mem_id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setInt(1, customer.getPhone());
		preparedStatement.setInt(2, customer.getMemberId());
		int process = preparedStatement.executeUpdate();
		if(process >0)
			System.out.println("Phone Number Updated Succesfully");
		else
			System.out.println("There seems to be an issue");
		
		
	}
	@Override
	public List<Employee> empLogIn(String name, int id) throws SQLException {
		String email = "f@gmail.com";
		String query = "select * from emp_table where name = ? and emp_id = ? ";
		List<Employee> employees = new ArrayList<>();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			int emp_id = resultSet.getInt(1);
			String emp_name = resultSet.getString(2);
			String emp_email = resultSet.getString(3);
			Employee emp = new Employee(id, emp_name ,emp_email);
			employees.add(emp);
			if(employees.isEmpty())
				System.out.println("You are not a valid employee");
			else 
				System.out.println("\nLogIn Successful");
		}
		return employees;
	}
	@Override
	public List<Bank> viewAccounts(int memId) throws SQLException {
		String query = "select * from savings_acc_table where mem_id = ?";
		String sql = "select * from checking_acc_table where mem_id = ?";
		List<Bank> savings = new ArrayList<>();
		List<Bank> checking = new ArrayList<>();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		PreparedStatement preparedStatement2 = conn.prepareStatement(sql);
		preparedStatement.setInt(1, memId );
		preparedStatement2.setInt(1, memId);
		ResultSet resultSet = preparedStatement.executeQuery();
		ResultSet resultSet2 = preparedStatement2.executeQuery();
		while(resultSet.next() && resultSet2.next()) {
			int memberId = resultSet.getInt(1);
			String nameOnAcc = resultSet.getString(2);
			int accNum1 = resultSet.getInt(3);
			double balance = resultSet.getDouble(4);
			
			int memberId2 = resultSet2.getInt(1);
			String nameOnAcc2 = resultSet2.getString(2);
			int accNum2 = resultSet2.getInt(3);
			double balance2 = resultSet2.getDouble(4);
			Bank acc1 = new Bank(memberId, nameOnAcc, accNum1, balance);
			savings.add(acc1);
			System.out.println("Savings Account Details");
			System.out.println(acc1.toString());
			Bank acc2 = new Bank(memberId2, nameOnAcc2, accNum2, balance2);
			checking.add(acc2);
			System.out.println("\nChecking Account Details");
			System.out.println(acc2.toString());
			return checking;
				
		
		}
		return savings;
		
	}

	@Override
	public void deleteCustomer(int memid) throws SQLException {
		String query = "delete from cust_table where mem_id = ?";
		String sql = "delete from checking_acc_table where mem_id = ?";
		String sql2 = "delete from savings_acc_table where mem_id =? ";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		PreparedStatement preparedStatement2 = conn.prepareStatement(sql);
		PreparedStatement preparedStatement3 = conn.prepareStatement(sql2);
		preparedStatement.setInt(1, memid);
		preparedStatement2.setInt(1, memid);
		preparedStatement3.setInt(1, memid);
		preparedStatement.executeUpdate();
		preparedStatement2.executeUpdate();
		int process = preparedStatement3.executeUpdate();
		if(process>0)
			System.out.println("Customer has been deleted");
		else
			System.out.println("There seems to be an issue");
	}
}
