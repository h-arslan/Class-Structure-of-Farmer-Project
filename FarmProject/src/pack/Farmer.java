package pack;

import java.util.ArrayList;



public class Farmer extends Person {
	public static ArrayList <Farmer> listFarmer=new ArrayList<Farmer>();
	Farmer(){
		
	}
	
	

	public Farmer(String userName, String userPhoneNumber, String userEmailAdress, String userPassword) {
		super(userName, userPhoneNumber, userEmailAdress, userPassword);
		// TODO Auto-generated constructor stub
	}



	@Override
	boolean add() {
		Farmer farmer=new Farmer();
		setUserName(farmer.userName);
		setUserPhoneNumber(farmer.userPhoneNumber);
		setUserEmailAdress(farmer.userEmailAdress);
		setUserPassword(farmer.userPassword);
		if(search(farmer)) {
			System.out.println("Farmer is exist!!!");
			return false;
		}
		listFarmer.add(farmer);
		return true;
	}

	@Override
	boolean delete() {
		Farmer farmer=new Farmer();
		setUserName(farmer.userName);
		setUserPhoneNumber(farmer.userPhoneNumber);
		setUserEmailAdress(farmer.userEmailAdress);
		setUserPassword(farmer.userPassword);
		if(search(farmer)) {
			listFarmer.remove(farmer);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	boolean search(Person farmer) {
		for(Farmer farmerX:listFarmer) {
			if(farmerX.equals(farmer)) {
				return true;
			}
			
		}
		return false;
	}

}
