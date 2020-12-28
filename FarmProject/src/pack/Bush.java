package pack;

import java.util.ArrayList;
import java.util.Random;

public class Bush extends Plants implements IPlantOperation {

	public static ArrayList <Plants> listBushes=new ArrayList<Plants>();
	
	Bush(){
		
	}

	public Bush(String nameOfPlant, String mostUsedMineral, Double price, Whether whether,
			 Double m2perWater, String lifeTime, String plantType) {
		super(nameOfPlant, mostUsedMineral, price, whether, m2perWater, lifeTime,
				plantType);
		// TODO Auto-generated constructor stub
	}
	
	public void add() {
		for(Plants plantX:listPlants) {
			if(plantX.plantType.equals("BUSH")) {
				listBushes.add(plantX);
			}
		}
	}
	
	public void selection(String mineral) {
		Random rand=new Random();
		int randomOfIndex=rand.nextInt(listBushes.size());
		Plants selectedBush =new Bush();
		selectedBush= listBushes.get(randomOfIndex);
		while(selectedBush.mostUsedMineral.equals(mineral)) {
			 randomOfIndex=rand.nextInt(listBushes.size());
			 selectedBush= listBushes.get(randomOfIndex);
		}
	}
	
	

}
