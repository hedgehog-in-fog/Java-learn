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

//	static Sheep receiving(File file) {
//		Sheep sheep = null;
//		try (ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(file))) {
//			sheep = (Sheep) oIS.readObject();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		return sheep;
//	}

	static Sheep receiving(File file) throws IOException, ClassNotFoundException {
		FileInputStream fIS = new FileInputStream(file);
		ObjectInputStream oIS = new ObjectInputStream(fIS);
		Sheep receivingSheep = (Sheep) oIS.readObject();
		fIS.close();
		oIS.close();
			return receivingSheep ;
	}
}
