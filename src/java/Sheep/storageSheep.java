package Sheep;

import java.io.*;

public class storageSheep {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\stalnoy\\Desktop\\sheep.txt");
		Sheep sheep = new Sheep("Бяша", "black");
		sheep.setAge(2);
		sheep.setWeight(31);
		sheep.notHungry = true;
		saving(sheep, file);
		sheep.setAge(3);
		System.out.println(receiving(file));
	}

	static void saving(Sheep sheep, File file) {
		try (ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream(file))) {
			oOS.writeObject(sheep);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static Sheep receiving(File file) {
		try (ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(file))) {
			Sheep sheep = (Sheep) oIS.readObject();
			return sheep;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
