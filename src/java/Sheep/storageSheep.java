package Sheep;

import java.io.*;

public class storageSheep {


	static void saving(Sheep sheep, File file) {
		try (ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream(file))) {
			oOS.writeObject(sheep);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static Sheep receiving(File file) throws IOException, ClassNotFoundException {
		try (ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(file))) {
			return (Sheep) oIS.readObject();
		}
	}
}
