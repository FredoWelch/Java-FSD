package Project0Example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDADImpl  implements EmployeeDAD{
	
	
	private static Statement statement = null;
	private static Connection conn = null;
	
	public EmployeeDADImpl() throws SQLException {
		conn = ConnectionFactory.getConnection();
		statement = conn.createStatement();
	}

	@Override
	public void addEmployee(Employee employee) throws SQLException {
		String sql = "insert into employee(name, email) values (?,?)";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		//preparedStatement.setInt(1, employee.getId());
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setString(2, employee.getEmail());
		int count = preparedStatement.executeUpdate();
		
		if (count >0)
			System.out.println("Employee saved");
		else
			System.out.println("Something wrong");
		
	}

	@Override
	public void updateEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update employee set name = ?, email =?  where id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setString(2, employee.getEmail());
		preparedStatement.setInt(3, employee.getId());
		int count = preparedStatement.executeUpdate();
		
		if (count >0)
			System.out.println("Employee saved");
		else
			System.out.println("Something wrong");
		
	}
	
	@Override
	public void deleteEmployee(int id) throws SQLException {
		String sql = "delete from employee where id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		 int count = preparedStatement.executeUpdate();
	        if(count > 0)
	            System.out.println("employee delete");
	        else
	            System.out.println("Oops! something went wrong");
		
		
		
	}

	@Override
	public List<Employee> getEmployee() throws SQLException {
		String sql = "select * from employee";
		List<Employee> employees = new ArrayList<>();
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		
			while(resultSet.next()){
	            int id = resultSet.getInt(1);
	            String name = resultSet.getString(2);
	            String email = resultSet.getString(3);
	            Employee employee = new Employee(id, name, email);
	            employees.add(employee);      
	            
			}	
		return employees;
}
	

	@Override
	public Employee employeeById(int id) throws SQLException {
		String sql = "select * from employee where id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		int count = preparedStatement.executeUpdate();
		if(count > 0)
			System.out.println("Employee found");
		else
			System.out.println("Employee not found, something went wrong");
		return null;
	}

		
	}
	


