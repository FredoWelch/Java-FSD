package Project0Example;
import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAD {
	void addEmployee(Employee employee) throws SQLException;
	
	void updateEmployee(Employee employee) throws SQLException;
	void deleteEmployee(int id) throws SQLException;
	
	
	List<Employee> getEmployee() throws SQLException;
	Employee employeeById(int id) throws SQLException;

	

}
