package Queues;

import java.io.*;
import java.util.*;

public class returnEvenNumbersInReverse {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\stalnoy\\Desktop\\queues.txt");
		FileInputStream fileInputStream = new FileInputStream(file);

		//test 1
		FileWriter fw = new FileWriter(file);
		fw.write("44 55 66 77 88 99 34 56 57 58");
		fw.close();
		if(returnsEvenNumbersInReverse(fileInputStream).toString().equals("[58, 56, 34, 88, 66, 44]")){
			System.out.println("test 1 - true");
		}

	}

	public static Collection returnsEvenNumbersInReverse(InputStream i) {
		Deque <Integer> deque = new ArrayDeque<>();
		Scanner scanner = new Scanner(i);
		int number;
		while (scanner.hasNext()) {
			number = scanner.nextInt();
			if ((number % 2) == 0)
				deque.addFirst(number);
		}
		return deque;
	}
}
