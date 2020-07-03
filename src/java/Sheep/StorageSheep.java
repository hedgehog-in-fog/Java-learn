package Sheep;

import java.io.*;

public class StorageSheep {


	public static void saving(Sheep sheep, File file) {
		try (ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream(file))) {
			oOS.writeObject(sheep);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Sheep receiving(File file) throws IOException, ClassNotFoundException {
		try (ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(file))) {
			return (Sheep) oIS.readObject();
		}
	}
}
