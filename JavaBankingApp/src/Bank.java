
public class Bank {
	private int memberId;
	private String name;
	private int accNum;
	private double balance;
	
	public Bank(){
		
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public Bank(int memberId, String name, int accNum, double balance) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.accNum = accNum;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "\nAccount Details [MemberId: " + memberId + ", Name: " + name + ", Account Number: " + accNum + ", Balance: " + balance + "]";
	}

}