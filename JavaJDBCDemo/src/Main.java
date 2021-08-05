import java.sql.*;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/";
		
		String username = "root";
		String password = "Lilsizzle3!";
		String database = "revature";
		
		Connection conn = DriverManager.getConnection((url+database), username, password);
		
		
		Statement statement = conn.createStatement();
		
		//String query = "create table employee (id  integer primary key auto_increment, name char(50),email char(50))";
		//statement.executeUpdate(query);
	//	System.out.println("Table created");
		
		//String query = "insert into employee (name,email) values (?, ?)";
		//PreparedStatement preparestatement = conn.prepareStatement(query);
		//preparestatement.setString(1, "Mark Smith");
		//preparestatement.setString(2, "m@gmail.com");
		//int rowAffected = preparestatement.executeUpdate();
		//preparestatement.setString(1, "Stan Wills");
		//preparestatement.setString(2, "s@gmail.com");
		//int rowAffected2 = preparestatement.executeUpdate();
		
		
		//String query = "update employee set name = ?, email = ? where id = ?";
		//PreparedStatement prepareStatement = conn.prepareStatement(query);
		//prepareStatement.setString(1, "Paul");
		//prepareStatement.setString(2, "p@gmail.com");
		//prepareStatement.setInt(3, 1);
		//int rowAffected = prepareStatement.executeUpdate();
		
		
		//String query = "delete from employee where id = ?";
		//PreparedStatement preparedStatement = conn.prepareStatement(query);
		//preparedStatement.setInt(1, 2);
		//int rowAffected = preparedStatement.executeUpdate();
		
		String query2 = "select * from employee";
		ResultSet resultSet = statement.executeQuery(query2);
		while(resultSet.next()) {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String email = resultSet.getString(3);
			System.out.println("Id = "+ id+ ", Name = "+ name+", Email: "+ email);
			
		}
		
		
		if(conn.isClosed()) {
			System.out.println("connection closed");
		}else {
			System.out.println("connection open");
		}
	}
}
