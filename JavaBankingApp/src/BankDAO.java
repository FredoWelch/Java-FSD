import java.sql.SQLException;

public interface BankDAO {
	void withdrawFunds(double amount, int id) throws SQLException;
	void depositFunds(double amount);
	double checkBalance(int acc) throws SQLException;

}
