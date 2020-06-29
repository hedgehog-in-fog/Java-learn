package FileRW;

import java.io.*;
import java.util.Scanner;

public class FileRW {
	static File file = new File("C:\\Users\\stalnoy\\Desktop\\fileRW.txt");
	static int sum = 0;

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter(file);
		fw.write("4 12 1 78 -14");
		fw.close();
		filezRW();
	}

	private static void filezRW() {
		try (Scanner scanner = new Scanner(new FileReader(file))) {
			while (scanner.hasNextInt()) {
				sum += scanner.nextInt();
			}
			System.out.println(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileWriter fw = new FileWriter(file, true)) {
			fw.write("\n" + sum);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}


