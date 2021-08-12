import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CustomerDAOImp implements CustomerDAO, BankDAO{
	
	private static Statement statement = null;
	private static Connection conn = null;
	
	public CustomerDAOImp() throws SQLException{
		conn = ConnectionFactory.getConnection();
		statement = conn.createStatement();
	}
	

	@Override
	public void addCustomer(Customer customer) throws SQLException {
		String query = "insert into cust_table(name, address, ssn, email, phone) values (?,?,?,?,?)";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, customer.getName());
		preparedStatement.setString(2, customer.getAddress());
		preparedStatement.setInt(3, customer.getSsn());
		preparedStatement.setString(4, customer.getEmail());
		preparedStatement.setInt(5, customer.getPhone());
		int process = preparedStatement.executeUpdate();
		if (process >0)
			System.out.println("Customer Details Recorded");
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
	public List<Bank>viewSavingsAccountBalance(int mem_id, String name) throws SQLException {
		String query = "select * from savings_acc_table where mem_id = ? and name = ?";
		List<Bank> customers = new ArrayList<>();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setInt(1, mem_id );
		preparedStatement.setString(2, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			int memberId = resultSet.getInt(1);
			String nameOnAcc = resultSet.getString(2);
			int accNum = resultSet.getInt(3);
			double balance = resultSet.getDouble(4);
			
			Bank user = new Bank(memberId, name, accNum, balance);
			customers.add(user);
			System.out.println("\n\n Showing Savings Account Details Below");
		}
		return customers;
	}

	@Override
	public List<Bank>viewCheckingAccountBalance(int mem_id, String name) throws SQLException {
		String query = "select * from checking_acc_table where mem_id = ? and name = ?";
		List<Bank> customers = new ArrayList<>();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setInt(1, mem_id );
		preparedStatement.setString(2, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			int memberId = resultSet.getInt(1);
			String nameOnAcc = resultSet.getString(2);
			int accNum = resultSet.getInt(3);
			double balance = resultSet.getDouble(4);
			
			Bank user = new Bank(memberId, name, accNum, balance);
			customers.add(user);
			System.out.println("\n\nShowing Checking Account Details Below");
			
		}
		return customers;
		
		
	}

	@Override
	public void applyForCheckingAccount(Customer customer) throws SQLException {
		String query = "insert into checking_acc_table(name, mem_id,balance) values (?,?,50.00)";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, customer.getName());
		preparedStatement.setInt(2, customer.getMemberId());
		int process = preparedStatement.executeUpdate();
		if(process >0)
			System.out.println("Checking Account Created Successfully");
		else
			System.out.println("There seems to be an issues");
		
		
		
	}

	@Override
	public void applyForSavingsAccount(Customer customer) throws SQLException {
		String query = "insert into savings_acc_table(name, mem_id, balance) values (?,?, 100.00)";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, customer.getName());;
		preparedStatement.setInt(2,customer.getMemberId());
		int process = preparedStatement.executeUpdate();
		if(process > 0)
			System.out.println("Savings Account Created Successfully");
		else
			System.out.println("There seems to be an issue");
		
	}


	@Override
	public List<Customer> viewCustomerDetails(int ssn) throws SQLException {
		String sql = "select * from cust_table where ssn = ?";
		List<Customer> customers = new ArrayList<>();
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, ssn);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			int memberId = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String address = resultSet.getString(3);
			int social = resultSet.getInt(4);
			String email = resultSet.getString(5);
			int phone = resultSet.getInt(6);
			Customer user = new Customer(memberId, name, address, ssn, email,phone);
			customers.add(user);
			
		}
		return customers;
		
	}


	@Override
	public void checkingWithdraw(double amount, int accNum) throws SQLException {
		String query = "update checking_acc_table set balance = balance - ?  where acc_num = ?" ;
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setDouble(1, amount);
		preparedStatement.setInt(2, accNum);
		int process = preparedStatement.executeUpdate();
		if(process > 0)
			System.out.println("Funds Withdrew Successfully");
		else
			System.out.println("There seems to be an issue");
		
		
	}

		@Override
		public void savingsWithdraw(double amount, int accNum) throws SQLException {
			String query = "update savings_acc_table set balance = balance - ?  where acc_num = ?" ;
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setDouble(1, amount);
			preparedStatement.setInt(2, accNum);
			int process = preparedStatement.executeUpdate();
			if(process > 0)
				System.out.println("Funds Withdrew Successfully");
			else
				System.out.println("There seems to be an issue");
			
			
		}


		@Override
		public void checkingDeposit(double amount, int accNum) throws SQLException {
			String query = "update checking_acc_table set balance = balance + ?  where acc_num = ?" ;
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setDouble(1, amount);
			preparedStatement.setInt(2, accNum);
			int process = preparedStatement.executeUpdate();
			if(process > 0)
				System.out.println("Funds Withdrew Successfully");
			else
				System.out.println("There seems to be an issue");
			
		}


		@Override
		public void savingsDeposit(double amount, int accNum) throws SQLException {
			String query = "update savings_acc_table set balance = balance + ?  where acc_num = ?" ;
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setDouble(1, amount);
			preparedStatement.setInt(2, accNum);
			int process = preparedStatement.executeUpdate();
			if(process > 0)
				System.out.println("Funds Withdrew Successfully");
			else
				System.out.println("There seems to be an issue");
			
		}
		
	


	@Override
	public List<Bank> viewCheckingAccountByAccNum(int accNum) throws SQLException {
		String query = "select * from checking_acc_table where acc_num = ?";
		List<Bank> customers = new ArrayList<>();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setInt(1, accNum );
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			int memberId = resultSet.getInt(1);
			String nameOnAcc = resultSet.getString(2);
			int accNum1 = resultSet.getInt(3);
			double balance = resultSet.getDouble(4);
			
			Bank user = new Bank(memberId, nameOnAcc, accNum, balance);
			customers.add(user);
			System.out.println("\n\nShowing Checking Account Details Below");
			
		}
		return customers;
		

	

	}


	@Override
	public void depositFunds(double amount) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Bank> viewSavingsAccountByAccNum(int accNum) throws SQLException {
		String query = "select * from savings_acc_table where acc_num = ?";
		List<Bank> customers = new ArrayList<>();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setInt(1, accNum );
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			int memberId = resultSet.getInt(1);
			String nameOnAcc = resultSet.getString(2);
			int accNum1 = resultSet.getInt(3);
			double balance = resultSet.getDouble(4);
			
			Bank user = new Bank(memberId, nameOnAcc, accNum, balance);
			customers.add(user);
			
				System.out.println("\n\nShowing Savings Account Details Below");
			
		}
		return customers;
	}


	@Override
	public void withdrawFunds(double amount, int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void transferFromCheckingToSavings(double amount, int mem_id) throws SQLException {
		String query = "update checking_acc_table set balance = balance - ?  where mem_id = ?";
		String sql ="update savings_acc_table set balance = balance + ?  where mem_id = ?" ;
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setDouble(1, amount);
		preparedStatement.setInt(2, mem_id);
		int process = preparedStatement.executeUpdate();
		if(process>0)
			System.out.println("$"+amount + " is being transferred to your SAVINGS ACCOUNT");
		else
			System.out.println("There seems to be an issue");
		PreparedStatement preparedStatement2 = conn.prepareStatement(sql);
		preparedStatement2.setDouble(1, amount);
		preparedStatement2.setInt(2, mem_id);
		int process2 = preparedStatement2.executeUpdate();
		if(process2>0)
			System.out.println("$"+amount + " was just transferred from your CHECKING ACCOUNT");
		else
			System.out.println("There seems to be an issue");
		

		
	}


	@Override
	public void transferFromSavingsToChecking(double amount, int mem_id) throws SQLException {
		String query = "update savings_acc_table set balance = balance - ?  where mem_id = ?";
		String sql ="update checking_acc_table set balance = balance + ?  where mem_id = ?" ;
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setDouble(1, amount);
		preparedStatement.setInt(2, mem_id);
		int process = preparedStatement.executeUpdate();
		if(process>0)
			System.out.println("$"+amount + " is being transferred to your CHEKCING ACCOUNT from your SAVINGS ACCOUNT");
		else
			System.out.println("There seems to be an issue");
		PreparedStatement preparedStatement2 = conn.prepareStatement(sql);
		preparedStatement2.setDouble(1, amount);
		preparedStatement2.setInt(2, mem_id);
		int process2 = preparedStatement2.executeUpdate();
		if(process2>0)
			System.out.println("$"+amount + " was just transferred from your SAVINGS ACCOUNT to your CHECKING ACCOUNT");
		else
			System.out.println("There seems to be an issue");
		
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
	public double checkBalance(int acc) throws SQLException {
		Bank bank = new Bank();
		String query = "select balance from checking_acc_table where acc_num ="+acc;
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			double balance = resultSet.getDouble(1);
			bank.setBalance(balance);
			
			
		}
		return bank.getBalance();
	}


	@Override
	public double savingBalance(int acc) throws SQLException {
		Bank bank = new Bank();
		String query = "select balance from savings_acc_table where acc_num ="+acc;
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			double balance = resultSet.getDouble(1);
			bank.setBalance(balance);
		
	}
	return bank.getBalance();
	
	}	
			
		
	}


	

