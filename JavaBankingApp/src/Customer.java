
public class Customer extends Bank {
	
private int memberId;
private String name;
private String address;
private int ssn;
private String email;
private int phone;

public Customer() {
	
}

public Customer(int memberId, String name, String address, int ssn, String email, int phone) {
	super();
	this.memberId = memberId;
	this.name = name;
	this.address = address;
	this.ssn = ssn;
	this.email = email;
	this.phone = phone;
}

public int getPhone() {
	return phone;
}

public void setPhone(int phone) {
	this.phone = phone;
}

public void setMemberId(int memberId) {
	this.memberId = memberId;
}

public int getMemberId() {
	return memberId;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getSsn() {
	return ssn;
}

public void setSsn(int ssn) {
	this.ssn = ssn;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "\nCustomer Summary [MemberId: " + memberId + ", Name: " + name + ", Address: " + address + ", SSN: " + ssn + ", Email: "
			+ email + ", Phone: " + phone + "]";
}


}






