class MultipleLoginsException extends Exception{
	public MultipleLoginsException() {
		System.out.println("You are already logged in");
	}
	
	
}

class User {
	
	private boolean isLoggedIn = false;
	
	public void login(String email, String password)throws MultipleLoginsException {
		if(!isLoggedIn) {
			if(email.equals("Fred")&& password.equals("Blue")) {
				isLoggedIn = true;
				System.out.println("logged successfully");
			}else {
				System.out.println("Unauthorized user");
			}
			
			}else {
				throw new MultipleLoginsException();
			}
		}
	}


public class AuthentificationErrorsHanlding {
	
	public static void main(String[] args) {
		
		User us = new User();
		
		try {
			us.login("Fred", "Blue");
		} catch (MultipleLoginsException e) {
			
			e.printStackTrace();
		}
		try {
			us.login("Fred", "Blue");
		} catch (MultipleLoginsException e) {
			
			//e.printStackTrace();
		}
		
		
		
	}
	

}
