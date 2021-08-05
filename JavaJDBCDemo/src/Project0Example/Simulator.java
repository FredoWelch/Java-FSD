package Project0Example;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Simulator {
	public static void main(String[] args) throws SQLException {
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		
		EmployeeDAD doa = EmployeeDADFactory.getEmployeeDoa();
		
		while(menu != 6) {
		System.out.println("**********************************");
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Look Up Employee by ID");
		System.out.println("5. View All Active Employees");
		System.out.println("6. Exit App");
		System.out.println("**********************************");
		menu = scan.nextInt();
		
		
		Scanner in = new Scanner(System.in);
		Employee employee = new Employee();
		
		switch(menu) {
		
		case 1:
			
			System.out.println("Enter employee name");
			String name = in.nextLine();
			System.out.println("Enter employee email");
			String email = in.nextLine();
			employee.setName(name);
			employee.setEmail(email);
			doa.addEmployee(employee);
			break;
		
		case 2: 
			System.out.println("What would you like to change the name to?");
			name = in.nextLine();
			System.out.println("What would you like to change the email to?");
			email = in.next();
			System.out.println("What is the ID number of the employee you wish to update?");
			int id = in.nextInt();
			employee.setName(name);
			employee.setEmail(email);
			employee.setId(id);
			doa.updateEmployee(employee);
			break;
		
		case 3:	
			System.out.println("What is the ID of the employee you would like to delete");
			id = in.nextInt();
			employee.setId(id);
			doa.deleteEmployee(id);
			break;
		
		case 4:
			System.out.println("What is the employee ID that you wish to find");
			id = in.nextInt();
			employee.setId(id);
			doa.employeeById(id);
			break;
			
		case 5:
			System.out.println("Active employees");
			List<Employee> employees = doa.getEmployee();
            for (Employee emp : employees) {
                System.out.println(emp.toString());
                
            }
            break;
			
		case 6:
			System.out.println("Thank you");
			break;
		
	
			
		
		default:
			System.out.println("Not an option");
			
			
			}
		
		
		}
	}
}
	
