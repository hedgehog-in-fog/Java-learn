package Sheep;

import java.io.*;

public class TestSheep {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int i = -10;
		System.out.println((char) i);
		File file = new File("C:\\Users\\stalnoy\\Desktop\\sheep.txt");
		Sheep sheep = new Sheep("Бяша", "black");
		sheep.setAge(2);
		sheep.setWeight(31);
		sheep.notHungry = true;
		test1(file,sheep);
		test2(file);
	}

	static void test1(File file, Sheep sheep) throws IOException, ClassNotFoundException {
		storageSheep.saving(sheep,file);
		sheep.notHungry = false;
		if(storageSheep.receiving(file).equals(sheep)){
			System.out.println("test 1 - true");
		}

	}

	static void test2(File file) throws IOException, ClassNotFoundException {
		try {
			file.delete();
			storageSheep.receiving(file);
		}catch (FileNotFoundException e){
			System.out.println("test 2 - true");
			e.printStackTrace();
		}
	}

}
