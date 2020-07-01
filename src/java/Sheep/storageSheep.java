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

	static Sheep receiving(File file) {
		Sheep sheep = null;
		try (ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(file))) {
			sheep = (Sheep) oIS.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return sheep;
	}
}
