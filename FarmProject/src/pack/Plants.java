package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Plants {
	String nameOfPlant;
	String mostUsedMineral;
	String lifeTime;
	String plantType;
	Double m2perWater;
	Double price;
	Whether whether;

	
	public static ArrayList <Plants> listPlants=new ArrayList<Plants>();
	Plants(){	
	}

	public Plants(String nameOfPlant, String mostUsedMineral, Double price, Whether whether
			, Double m2perWater,String lifeTime,String plantType) {
		
		this.nameOfPlant = nameOfPlant;
		this.mostUsedMineral = mostUsedMineral;
		this.price = price;
		this.m2perWater = m2perWater;
		this.lifeTime = lifeTime;
		this.plantType=plantType;
		this.whether = whether;
	}

	public String getNameOfPlant() {
		return nameOfPlant;
	}

	public void setNameOfPlant(String nameOfPlant) {
		this.nameOfPlant = nameOfPlant;
	}

	public String getMostUsedMineral() {
		return mostUsedMineral;
	}

	public void setMostUsedMineral(String mostUsedMineral) {
		this.mostUsedMineral = mostUsedMineral;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Whether getWhether() {
		return whether;
	}

	public void setWhether(Whether whether) {
		this.whether = whether;
	}

	public Double getM2perWater() {
		return m2perWater;
	}

	public void setM2perWater(Double m2perWater) {
		this.m2perWater = m2perWater;
	}

	public String getLifeTime() {
		return lifeTime;
	}

	public String getPlantType() {
		return plantType;
	}

	public void setPlantType(String plantType) {
		this.plantType = plantType;
	}

	public void setLifeTime(String lifeTime) {
		this.lifeTime = lifeTime;
	}
	
	//bitkileri arraye kaydetme fonksiyonu 
	public static void putPlantsToList() {
		//adres deðiþecek
		File file =new File("D:\\çalýþmalarým\\DosyaDeneme\\src\\Dosya\\files\\students.txt");
		if(file.exists()) {
			try {//line olarak okuyor sabah bakýalcak o kýsma
				Scanner reader=new Scanner(file);
				while(reader.hasNextLine()) {
					Plants plant=new Plants();
					plant.nameOfPlant=reader.next();
					plant.mostUsedMineral=reader.next();
					plant.lifeTime=reader.next();
					plant.plantType=reader.next();
					plant.price=reader.nextDouble();
					plant.whether.temp_winter=reader.nextDouble();
					plant.whether.temp_autumn=reader.nextDouble();
					plant.whether.temp_summer=reader.nextDouble();
					plant.whether.temp_spring=reader.nextDouble();
					plant.m2perWater=reader.nextDouble();
					//String line=reader.nextLine();
					//System.out.println(line);
				}
				reader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	// toprak tipi ?

	

}
