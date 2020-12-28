package pack;

import com.sun.source.util.Trees;

import java.util.ArrayList;
import java.util.Random;

public class Tree extends Plants implements IPlantOperation{
	
	public static ArrayList <Plants> listTrees=new ArrayList<Plants>();
	
	Tree(){
		
	}

	public Tree(String nameOfPlant, String mostUsedMineral, Double price, Whether whether
			, Double m2perWater, String lifeTime, String plantType) {
		super(nameOfPlant, mostUsedMineral, price, whether, m2perWater, lifeTime,
				plantType);
		
	}
	
	public void add() {
		for(Plants plantX:listPlants) {
			if(plantX.plantType.equals("TREE")) {
				listTrees.add(plantX);
			}
		}
	}
	
	public void selection(String mineral) {
		Random rand=new Random();
		int randomOfIndex=rand.nextInt(listTrees.size());
		Plants selectedTree = new Tree();
		selectedTree= listTrees.get(randomOfIndex);
		while(selectedTree.mostUsedMineral.equals(mineral)) {
			 randomOfIndex=rand.nextInt(listTrees.size());
			 selectedTree= listTrees.get(randomOfIndex);
		}
	}

	
	
	
}
