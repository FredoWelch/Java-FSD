import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
	
	
	void addCustomer(Customer customer) throws SQLException;
	void updateCustomerAddress(Customer customer) throws SQLException;
	void updateCustomerEmail(Customer customer) throws SQLException;
	void updateCustomerPhoneNumber(Customer customer) throws SQLException;
	public List<Employee> empLogIn(String name, int emp_id) throws SQLException;
	List<Customer>viewCustomerDetails() throws SQLException;
	List<Bank> viewAccounts(int memId)throws SQLException;
	void deleteCustomer(int memid) throws SQLException;

}
