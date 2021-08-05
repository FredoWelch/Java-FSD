
class InsufficientFundException extends Exception{ 
	public InsufficientFundException() {
		System.out.println("Insufficient funds");
	}
	public InsufficientFundException(String message) {
		System.out.println(message);
	}
	
	
}


class BankAccount{
	
	private int balance;
	private int accountNumber;
	
	public BankAccount(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("You deposited in $"+ amount +" to your account. Your blance is now $" + balance);
	}
	
	public void withdraw(int amount) throws InsufficientFundException {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("You withdrew " + amount + " from your account your balance is now $" + balance);
		}else {
			throw new InsufficientFundException();
		}
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
}


public class ErrorHandling2 {
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount(1223344);
		ba.deposit(400);
		ba.deposit(600);
		ba.getAccountNumber();
		
		try {
			ba.withdraw(4000);
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
