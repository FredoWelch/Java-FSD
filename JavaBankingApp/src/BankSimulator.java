import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;



public class BankSimulator {
	public static void main(String[] args) throws SQLException {
		int menu = 0;
		int loginMenu = 0;
		boolean loggedin = false;
		Scanner scan = new Scanner(System.in);
		Scanner logScan = new Scanner(System.in);
		CustomerDAO dao = DAOFactory.getCustomerDao();
		UserDAO daoU = DAOFactory.getUserDao();
		EmployeeDAO empDao = DAOFactory.getEmployeeDao();
		Customer cust = new Customer();
		Bank bank = new Bank();
		User users = new User();
		
		while(!loggedin) {
			System.out.println("WELCOME!");
		System.out.println("1. Create a user login");
		System.out.println("2. Login");
		loginMenu = logScan.nextInt();
		switch(loginMenu) {
		case 1:
			System.out.println("What is your desired username");
			 String loginName = scan.next();
			System.out.println("What is your desired pin number");
			int loginPin = scan.nextInt();
			users.setUserName(loginName);
			users.setPinNum(loginPin);
			daoU.createUser(users);
			List<User> logger = daoU.logIn(loginName,loginPin);
			System.out.println(logger.toString());
			loggedin = true;
			break;
			
		
		case 2: 
			System.out.println("What is your user name?");
			String userName = scan.next();
			System.out.println("what is your pin?");
			int pinNum =scan.nextInt();
			List<User> logger1 = daoU.logIn(userName, pinNum);
			if(logger1.isEmpty()) {
			System.out.println("Login Failed Please Try Again or Create a user Account");
			
			}else {
				loggedin =true;
			
			}
			break;		
			
			}
		
		}
		
		
		while (menu !=9) {
		System.out.println("***********************************");
		System.out.println("Welcome how may I asssist you?");
		System.out.println("1. Register as a Customer");
		System.out.println("2. Apply for Checking Account");
		System.out.println("3. Apply for Savings Account");
		System.out.println("4. View Account Balances");
		System.out.println("5. Withdraw Funds");
		System.out.println("6. Deposit Funds");
		System.out.println("7. Transfer Funds");
		System.out.println("8. Admin Menu");
		System.out.println("9. Exit");
		System.out.println("***********************************");
		
		menu = scan.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("Please provide your name:");
			String name = scan.next();
			System.out.println("Please provide us with your address:");
			String address = scan.next();
			System.out.println("Please provide us with you SSN:");
			int ssn = scan.nextInt();
			System.out.println("Please provied us with your email address:");
			String email = scan.next();
			System.out.println("Please provide us with your phone number");
			int phone = scan.nextInt();
			cust.setName(name);
			cust.setAddress(address);
			cust.setSsn(ssn);
			cust.setEmail(email);
			cust.setPhone(phone);
			dao.addCustomer(cust);
			List<Customer> customers = dao.viewCustomerDetails(cust.getSsn());
			System.out.println(customers.toString());
			break;
			
				
		case 2:
				System.out.println("To apply for a Checkings accounts you will need to provide your name and member ID.");
				System.out.println("Please enter your name:");
				String checkingAccName = scan.next();
				System.out.println("Please enter your member ID");
				int id = scan.nextInt();
				cust.setName(checkingAccName);
				cust.setMemberId(id);
				dao.applyForCheckingAccount(cust);
				List<Bank> user = dao.viewCheckingAccountBalance(cust.getMemberId(), cust.getName());
				System.out.println(user.toString());
				break;
			
		case 3:
			System.out.println("To apply for a Savings accounts you will need to provide your name and member ID.");
			System.out.println("Please enter your name:");
			String savingsAccName = scan.next();
			System.out.println("Please enter your member ID");
			int savingsAccId = scan.nextInt();
			cust.setName(savingsAccName);
			cust.setMemberId(savingsAccId);
			dao.applyForSavingsAccount(cust);
			List<Bank> user1 = dao.viewSavingsAccountBalance(cust.getMemberId(), cust.getName());
			System.out.println(user1.toString());
			break;
		
		case 4:
			System.out.println("To view account balances you will need to provide your name and memeberID:");
			System.out.println("Please enter your name");
			String accName = scan.next();
			System.out.println("Please enter your member ID");
			int memId = scan.nextInt();
			cust.setName(accName);
			cust.setMemberId(memId);
			List<Bank> checkingAcc = dao.viewCheckingAccountBalance(memId, accName);
			if(checkingAcc.isEmpty())
				System.out.println("The info you provided did not match any CHECKING ACCOUNT in our system");
			else
				System.out.println(checkingAcc.toString());
			
			List<Bank> savingsAcc = dao.viewSavingsAccountBalance(memId, accName);
			if(savingsAcc.isEmpty())
				System.out.println("The info you provided did not match any SAVINGS ACCOUNT in our system");
			else
				System.out.println(savingsAcc.toString());
			break;
			
		case 5:
			Scanner in = new Scanner(System.in);
			boolean view = true;
			int withDrawmenu = 0;
			while(withDrawmenu != 3) {
				System.out.println("Which account would you like to WITHDRAW"
						+ " from?");
				System.out.println("1. Checking Account");
				System.out.println("2. Savings Account");
				System.out.println("3. Exit");
				withDrawmenu = in.nextInt();
				switch(withDrawmenu){
				case 1: 
					System.out.println("What is your Checking Acc Number?");
					int accNum = in.nextInt();
					System.out.println("How much do you wish to withdraw?");
					double withDrawAmount = in.nextDouble();
					List<Bank> withDrawCheckingAcc = dao.viewCheckingAccountByAccNum(accNum);
					if(withDrawCheckingAcc.isEmpty()) {
						System.out.println("This is NOT a valid Checking Account");
						break;
					
					}
					else {
						if(dao.checkBalance(accNum)<withDrawAmount) {
							System.out.println("Insufficient Funds");
							break;
						}else {
							dao.checkingWithdraw(withDrawAmount, accNum);
						
						System.out.println(withDrawCheckingAcc.toString());
						
				
					
					break;
						}
						
					}
					
				case 2:
					System.out.println("What is your Savings Acc Number?");
					int savingsAccNum = in.nextInt();
					System.out.println("How much do you wish to withdraw?");
					double savingsAmount = in.nextDouble();
					List<Bank> withDrawSavingsAcc = dao.viewSavingsAccountByAccNum(savingsAccNum);
					if(withDrawSavingsAcc.isEmpty()) {
						System.out.println("This is NOT a valid Savings Account");
						break;
					}else {
						if(dao.savingBalance(savingsAccNum)<savingsAmount) {
							System.out.println("Insufficient Funds");
							break;
						}else {
							dao.savingsWithdraw(savingsAmount, savingsAccNum);
						System.out.println(withDrawSavingsAcc.toString());
						break;
				
						}
					}	
				case 3: 
					break;
						}
					}
			break;
			
				
				case 6:
					Scanner input = new Scanner(System.in);
					boolean view2 = true;
					int withDrawmenu2 = 0;
					while(withDrawmenu2!=3) {
						System.out.println("Which account would you like to DEPOSIT to?");
						System.out.println("1. Checking Account");
						System.out.println("2. Savings Account");
						System.out.println("3. Exit");
						withDrawmenu2 = input.nextInt();
						switch(withDrawmenu2){
						case 1: 
							System.out.println("What is your Checking Acc Number?");
							int accNum = input.nextInt();
							System.out.println("How much do you wish to deposit?");
							double withDrawAmount = input.nextDouble();
							
							dao.checkingDeposit(withDrawAmount, accNum);;
							List<Bank> depositCheckingAcc = dao.viewCheckingAccountByAccNum(accNum);
							if(depositCheckingAcc.isEmpty())
								System.out.println("This is NOT a valid Checking Account");
							else
								System.out.println(depositCheckingAcc.toString());
								view2 = false;
							break;
						
						
						case 2:
							System.out.println("What is your Savings Acc Number?");
							int savingsAccNum = input.nextInt();
							System.out.println("How much do you wish to deposit?");
							double savingsAmount = input.nextDouble();
							
							dao.savingsDeposit(savingsAmount, savingsAccNum);
							List<Bank> depositSavingsAcc = dao.viewSavingsAccountByAccNum(savingsAccNum);
							if(depositSavingsAcc.isEmpty())
								System.out.println("This is NOT a valid Savings Account");
							else
								System.out.println(depositSavingsAcc.toString());
								view2 = false;
							break;
						
						case 3:
							break;
							
						}
						
					
					}
					break;
				
								
				case 7:
					Scanner sc = new Scanner(System.in);
					int transferMenu = 0;
					System.out.println("What Account would you like to transfer money from?");
					System.out.println("1. Checking to Savings");
					System.out.println("2. Savings to Checking");
					transferMenu = sc.nextInt();
					switch(transferMenu) {
					
					case 1:
						System.out.println("To transfer money from your CHECKING to you SAVINGS you need to proved you MemberID:");
						System.out.println("Please enter your MemberID");
						
						int mem_Id = sc.nextInt();
						System.out.println("Please enter account number");
						int accNum = sc.nextInt();
						System.out.println("How much would you like to transfer?");
						double amount = sc.nextDouble();
						if(dao.checkBalance(accNum)<amount) {
							System.out.println("Insufficient Funds");
						}else {
						}dao.transferFromCheckingToSavings(amount, mem_Id);
						break;
					
					case 2:	
						System.out.println("To transfer money from your CHECKING to you SAVINGS you need to proved you MemberID:");
						System.out.println("Please enter your MemberID");
						int memID = sc.nextInt();
						System.out.println("Whats is you acount number?");
						int accNum1 = sc.nextInt();
						System.out.println("How much would you like to transfer?");
						double amount1 = sc.nextDouble();
						if(dao.savingBalance(accNum1)<amount1) {
							System.out.println("Insufficient funds");
						}else {
							dao.transferFromSavingsToChecking(amount1, memID);
							
						}
						
						break;
						
						
					}
					break;
				case 8:
					Scanner empIn = new Scanner(System.in);
					int adminMenu =0;
					
					System.out.println("What is your name?");
					String userName = empIn.next();
					System.out.println("what is your employee ID number?");
					int empId =empIn.nextInt();
					List<Employee> logger1 = empDao.empLogIn(userName, empId);
					if(logger1.isEmpty()) {
					System.out.println("Login Failed are you REALLY an employee");
					
					}else {
						boolean finished = false;
						while(!finished) {
						System.out.println("1 View All Customer Details");
						System.out.println("2. View All Accounts");
						System.out.println("3. Delete Customer");
						System.out.println("4. Exit");
						adminMenu = empIn.nextInt();
						switch(adminMenu) {
						case 1:
							List<Customer> allCustomers = dao.viewCustomerDetails();
							System.out.println(allCustomers.toString());
							break;
							
							
						case 2:	
							System.out.println("What is the member ID of the users accounts you wish to see?");
							memId = empIn.nextInt();
							List<Bank> accounts = empDao.viewAccounts(memId);
							break;
							
						case 3:
							System.out.println("What is the memeber ID of the customer you would like to delete?");
							memId = empIn.nextInt();
							empDao.deleteCustomer(memId);
							break;
						case 4:
							finished = true;
							break;
							
						}
						
						
						}
					}
					break;
					
				case 9:
					System.out.println("Thanks for coming in.");
					break;
					
					
					}	
		
				}
			}
		}
	


