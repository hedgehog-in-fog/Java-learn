package FileRW;

import java.io.*;
import java.util.Scanner;

public class FileRW {
	static File file = new File("C:\\Users\\stalnoy\\Desktop\\fileRW.txt");

	public static void main(String[] args) throws IOException {
		test1(" 45 68 99");
		filezRW();
	}
	public static void test1(String s) throws IOException {
		FileWriter fw = new FileWriter(file);
		fw.write(s);
		fw.close();
	}

	private static void filezRW() {
		int sum = 0;
		try (Scanner scanner = new Scanner(new FileReader(file))) {
			while (scanner.hasNextInt()) {
				sum += scanner.nextInt();
			}
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


