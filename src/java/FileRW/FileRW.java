package FileRW;

import java.io.*;
import java.util.Scanner;

public class FileRW {
	static File file = new File("C:\\Users\\stalnoy\\Desktop\\fileRW.txt");

	public static void main(String[] args) throws Exception {
		test1();
		test2();
	}

	public static void test1() throws Exception {
		String s = "3 7 8 -15 127";
		FileWriter fw = new FileWriter(file);
		fw.write(s);
		fw.close();
		filezRW();
		Scanner scanner = new Scanner(file);
		String result = " ";
		while (scanner.hasNextLine()) {
			result = result + " " + scanner.nextLine();
		}
		scanner.close();
		if ("  3 7 8 -15 127 130".equals(result)) {
			System.out.println("test 1 - true");
		}
	}

	public static void test2() throws Exception {
		FileWriter fw = new FileWriter(file);
		String s = "1 5.9 45";
		fw.write(s);
		fw.close();
		try {
			filezRW();
		} catch (IllegalStateException e) {
			System.out.println("test 2 - true");
			e.printStackTrace();
		}
	}

	private static void filezRW() throws Exception {
		int sum = 0;
		try (Scanner scanner = new Scanner(new FileReader(file))) {
			while (scanner.hasNextInt()) {
				sum += scanner.nextInt();
			}
			if (scanner.hasNext()) {
				throw new IllegalStateException();
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


