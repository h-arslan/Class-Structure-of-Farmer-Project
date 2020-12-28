package pack;

import java.util.ArrayList;
import java.util.Random;

public class Herbs extends Plants implements IPlantOperation{
	//herblisti türünü herb yapýnca add fonksiyonu çalýþmýyor!!
	public static ArrayList <Plants> listHerbs=new ArrayList<Plants>();
	
	Herbs(){
		
	}

	
	
	public Herbs(String nameOfPlant, String mostUsedMineral, Double price, Whether whether
			, Double m2perWater, String lifeTime, String plantType) {
		super(nameOfPlant, mostUsedMineral, price, whether, m2perWater, lifeTime,
				plantType);
	}



	public void add() {
		for(Plants plantX:listPlants) {
			if(plantX.plantType.equals("HERB")) {
				listHerbs.add(plantX);
			}
		}
	}
	//kullandýðý mineral çeþidine göre seçim yapýlacak.parametre olarak girilen mineral olacak.
	public void selection(String mineral) {
		Random rand=new Random();
		int randomOfIndex=rand.nextInt(listHerbs.size());
		Plants selectedHerb =new Herbs();
		selectedHerb= listHerbs.get(randomOfIndex);
		while(selectedHerb.mostUsedMineral.equals(mineral)) {
			 randomOfIndex=rand.nextInt(listHerbs.size());
			 selectedHerb= listHerbs.get(randomOfIndex);
		}
	}
	
	

}
