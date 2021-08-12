import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
	
	public List<User> logIn(String userName, int pinNum) throws SQLException;
	public void createUser(User user) throws SQLException;

}
