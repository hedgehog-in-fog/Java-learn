package Sheep;

import java.io.*;

public class TestSheep {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\stalnoy\\Desktop\\sheep.txt");
		Sheep sheep = new Sheep("Бяша", "black");
		sheep.setAge(2);
		sheep.setWeight(31);
		sheep.notHungry = true;
		test1(file,sheep);
	}

	static void test1(File file, Sheep sheep) throws IOException {
		storageSheep.saving(sheep,file);
		sheep.notHungry = false;
		if(storageSheep.receiving(file).equals(sheep)){
			System.out.println("test 1 - true");
		}

	}

}
