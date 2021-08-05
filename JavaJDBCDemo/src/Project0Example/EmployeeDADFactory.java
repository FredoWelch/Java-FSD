package Project0Example;
import java.sql.SQLException;

public class EmployeeDADFactory {
	private static EmployeeDAD doa;
	
	private EmployeeDADFactory() {
		
	}
	
	public static EmployeeDAD getEmployeeDoa() throws SQLException {
		if(doa == null)
			doa = new EmployeeDADImpl();
		return doa;
	}

}
 