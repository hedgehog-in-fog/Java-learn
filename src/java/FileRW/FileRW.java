package FileRW;
import java.io.*;
import java.math.BigInteger;

public class FileRW {
	static File file = new File("C:\\Users\\stalnoy\\Desktop\\fileRW.txt");
	static int sum;

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter(file);
		fw.write("-72397654 -1");
		fw.close();
		filezRW();
	}

	private static void filezRW() throws IOException {

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			int i;
			while ((i = bufferedReader.read()) != Integer.parseInt(" ")){
				sum += i;
				bufferedReader.mark(11);
			}
		}

		try (FileReader fr = new FileReader(file)) {

			char[] buf = new char[23];
			StringBuilder stringBuilder = new StringBuilder();
			fr.read(buf);
			stringBuilder.append(buf);
			int r1 = Integer.parseInt(stringBuilder.substring(stringBuilder.indexOf(" ") + 1).replaceAll("\\u0000", ""));
			int r2 = Integer.parseInt(stringBuilder.substring(0, stringBuilder.indexOf(" ")));
			sum = r1 + r2;
		} catch (Exception e) {

			e.printStackTrace();
		}

		try (FileWriter fw = new FileWriter(file, true)) {
			fw.write("\n" + sum);
		}
	}
}
