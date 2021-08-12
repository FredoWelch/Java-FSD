import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO{
	
	void addCustomer(Customer customer) throws SQLException;
	void updateCustomerAddress(Customer customer) throws SQLException;
	void updateCustomerEmail(Customer customer) throws SQLException;
	void updateCustomerPhoneNumber(Customer customer) throws SQLException;
	List<Bank>viewSavingsAccountBalance(int mem_id, String name) throws SQLException;
	List<Bank>viewCheckingAccountBalance(int mem_id, String name) throws SQLException;
	void applyForCheckingAccount(Customer customer) throws SQLException;
	void applyForSavingsAccount(Customer customer) throws SQLException;
	List<Customer>viewCustomerDetails(int ssn) throws SQLException;
	void checkingWithdraw(double amount, int accNum) throws SQLException;
	void savingsWithdraw(double amount, int accNum)throws SQLException;
	void checkingDeposit(double amount, int accNum)throws SQLException;
	void savingsDeposit(double amount, int accNum)throws SQLException;
	List<Bank>viewCheckingAccountByAccNum(int accNum) throws SQLException;
	List<Bank>viewSavingsAccountByAccNum(int accNum) throws SQLException;
	void transferFromCheckingToSavings(double amount, int mem_id) throws SQLException;
	void transferFromSavingsToChecking(double amount, int mem_id) throws SQLException;
	public List<Customer>viewCustomerDetails() throws SQLException;
	double checkBalance(int acc) throws SQLException;
	public double savingBalance(int acc) throws SQLException;

	

}

