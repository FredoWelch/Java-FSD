import java.sql.SQLException;

public class DAOFactory {
	private static CustomerDAO dao;
	private static UserDAO daoU;
	private static EmployeeDAO empDao;
	
	private DAOFactory() {
		
	}
	
	public static CustomerDAO getCustomerDao() throws SQLException {
		
		if(dao == null)
			dao = new CustomerDAOImp();
		return dao;
	}	
	
	public  static UserDAO getUserDao()throws SQLException{
		if (daoU ==null)
			daoU = new UserDAOImp();
		return daoU;
		
	}
	
	public static EmployeeDAO getEmployeeDao() throws SQLException{
	if(empDao == null)
		empDao = new EmployeeDAOImp();
	return empDao;
	}
}
