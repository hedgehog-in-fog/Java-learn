package Queues;

import java.io.*;
import java.util.*;

public class ReturnEvenNumbersInReverse {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\stalnoy\\Desktop\\queues.txt");
		Deque<Integer> arrayList = new ArrayDeque<>();
		arrayList.add(58);
		arrayList.add(56);
		arrayList.add(34);
		arrayList.add(88);
		arrayList.add(66);
		arrayList.add(44);

		//test 1
		try (FileWriter fw = new FileWriter(file)) {
			fw.write("44 55 66 77 88 99 34 56 57 58");
		}
		try (FileInputStream fileInputStream = new FileInputStream(file)) {
			if (returnsEvenNumbersInReverse(fileInputStream).containsAll(arrayList)) {
				System.out.println("test 1 - true");
			}
		}
	}

	public static Collection<Integer> returnsEvenNumbersInReverse(InputStream i) {
		Deque<Integer> deque = new ArrayDeque<>();
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
