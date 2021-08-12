import java.sql.Connection;
import java.sql.*;

public class ConnectionFactory {
	
	private static Connection conn = null;
	
	
	public static Connection getConnection() throws SQLException {
		if (conn == null) {
			String url= "jdbc:mysql://localhost:3306/java_bank";
			String username = "root";
			String password = "Lilsizzle3!";
			conn = DriverManager.getConnection(url, username, password);
		}
		return conn;
	} 

}
