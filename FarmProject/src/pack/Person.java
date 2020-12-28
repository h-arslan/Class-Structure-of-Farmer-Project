package pack;

public abstract class Person {
	String userName;
	String userPhoneNumber;
	String userEmailAdress;
	String userPassword;
	
	Person(){
		
	}

	public Person(String userName, String userPhoneNumber, String userEmailAdress, String userPassword) {
		
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.userEmailAdress = userEmailAdress;
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserEmailAdress() {
		return userEmailAdress;
	}

	public void setUserEmailAdress(String userEmailAdress) {
		this.userEmailAdress = userEmailAdress;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	abstract boolean  add();
	abstract boolean delete();
	abstract boolean search(Person person);
	
	
	
	
	
	

}
