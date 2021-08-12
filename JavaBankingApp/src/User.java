
public class User {
	private String userName;
	private int pinNum;
	private boolean admin;
	
	public User() {
		
	}
	
	public User(String userName, int pinNum, boolean admin) {
		super();
		this.userName = userName;
		this.pinNum = pinNum;
		this.admin = admin;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPinNum() {
		return pinNum;
	}

	public void setPinNum(int pinNum) {
		this.pinNum = pinNum;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "\nUser [User Name: " + userName + ", Pin: " + pinNum + ", Admin: " + admin + "]";
	}
	
	

}
