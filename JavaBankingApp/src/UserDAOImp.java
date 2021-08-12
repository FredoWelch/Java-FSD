import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class UserDAOImp  implements UserDAO{
	private static Statement statement = null;
	private static Connection conn = null;
	
	public UserDAOImp() throws SQLException {
		conn = ConnectionFactory.getConnection();
		statement = conn.createStatement();
	}

	@Override
	public List<User> logIn(String userName, int pinNum) throws SQLException {
		String query = "select * from user_table where user_name = ? and pin = ? ";
		List<User> user = new ArrayList<>();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, userName);
		preparedStatement.setInt(2, pinNum);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			String name = resultSet.getString(1);
			int pin = resultSet.getInt(2);
			boolean admin = resultSet.getBoolean(3);
			User us = new User(userName, pinNum, admin);
			user.add(us);
			if(user.isEmpty())
				System.out.println("You are not a valid user");
			else 
				System.out.println("\nLogIn Successful");
			
			
			
		}
		return user;
	}

	@Override
	public void createUser(User user) throws SQLException {
		String query = "insert into user_table(user_name, pin, admin) values (?,?,false)";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, user.getUserName());
		preparedStatement.setInt(2, user.getPinNum());
		int process = preparedStatement.executeUpdate();
		if(process >0)
			System.out.println("\n\nUser has been saved");
		else
			System.out.println("There seems to be an issue");
		
		
	}

}
