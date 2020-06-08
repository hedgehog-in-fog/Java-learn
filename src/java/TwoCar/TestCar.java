package TwoCar;

public class TestCar {
	public static void main(String[] args) {
		Car volga = new Car();
		Car nissan = new Car();
		nissan.model = "vany";
		People lexa = new People("lexa");
		People dima = new People("dima");
		test1(volga, nissan, lexa);
		test2(dima);
		test3(dima);
		test4(lexa, dima);
		test5(nissan);
		test6(nissan, volga);
		test7(nissan, volga);
		test8(volga);
	}


	public static void test1(Car volga, Car nissan, People lexa) {
		volga.color = "yellow";
		volga.model = "L-11";
		nissan.passenger = lexa;
		System.out.println(volga.toString());
		System.out.println(nissan.toString());
		System.out.println("test 1 - true");
	}

	public static void test2(People dima) {
		dima.age = 49;
		int hk = dima.hashCode();
		dima.age = 50;
		if (hk != dima.hashCode()) {
			System.out.println("test 2 - true");
		} else {
			throw new IllegalArgumentException(" test 2 - false");
		}
	}

	public static void test3(People dima) {
		if (dima.hashCode() == dima.hashCode()) {
			System.out.println("test 3 - true");
		} else {
			throw new IllegalArgumentException(" test 3 - false");
		}
	}

	public static void test4(People dima, People lexa) {
		if (lexa.hashCode() != dima.hashCode()) {
			System.out.println("test 4 - true");
		} else {
			throw new IllegalArgumentException(" test 4 - false");
		}
	}

	public static void test5(Car nissan) {
		if (nissan.hashCode() == nissan.hashCode()) {
			System.out.println("test 5 - true");
		} else {
			throw new IllegalArgumentException(" test 5 - false");
		}
	}

	public static void test6(Car nissan, Car volga) {
		if (nissan.hashCode() != volga.hashCode()) {
			System.out.println("test 6 - true");
		} else {
			throw new IllegalArgumentException(" test 6 - false");
		}
	}

	public static void test7(Car nissan, Car volga) {
		if (!nissan.equals(volga)) {
			System.out.println("test 7 - true");
		} else {
			throw new IllegalArgumentException(" test 7 - false");
		}
	}

	public static void test8(Car volga) {
		Car car = new Car();
		car.model = volga.model;
		car.color =volga.color;
		if (volga.equals(car)) {
			System.out.println("test 8 - true");
		} else {
			throw new IllegalArgumentException(" test 8 - false");
		}
	}
}


