public class HelloWorld {
	public static void main(String[] args) {

		if (returnStringHello().equals("HEllo")) {
			System.out.print("Выполнено");
		} else {
			throw new IllegalStateException("test 1 failed");
		}
	}

	public static String returnStringHello() {
		return "HElLo";
	}
}
