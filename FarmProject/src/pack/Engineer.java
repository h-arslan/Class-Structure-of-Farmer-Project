package pack;

import java.util.ArrayList;



public class Engineer extends Person {
	public static ArrayList<Engineer> listEngineer=new ArrayList<Engineer>();
	Engineer(){
		
	}
	
	
	
	public Engineer(String userName, String userPhoneNumber, String userEmailAdress, String userPassword) {
		super(userName, userPhoneNumber, userEmailAdress, userPassword);

	}



	@Override
	boolean add() {
		Engineer engineer=new Engineer();
		setUserName(engineer.userName);
		setUserPhoneNumber(engineer.userPhoneNumber);
		setUserEmailAdress(engineer.userEmailAdress);
		setUserPassword(engineer.userPassword);
		if(search(engineer)) {
			System.out.println("Engineer is exist!!!");
			return false;
		}
		listEngineer.add(engineer);
		return true;
	}

	@Override
	boolean delete() {
		Engineer engineer=new Engineer();
		setUserName(engineer.userName);
		setUserPhoneNumber(engineer.userPhoneNumber);
		setUserEmailAdress(engineer.userEmailAdress);
		setUserPassword(engineer.userPassword);
		if(search(engineer)) {
			listEngineer.remove(engineer);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	boolean search(Person engineer) {
		for(Engineer engineerX:listEngineer) {
			if(engineerX.equals(engineer)) {
				return true;
			}
			
		}
		return false;
	}		

}
