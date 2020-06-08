package TwoCar;

public class Car {
	String model;
	String color;
	People driver;
	People passenger;

	@Override
	public int hashCode() {
		int col = color != null ? color.hashCode() : 0;
		int mod = model != null ? model.hashCode() : 0;
		int driv = driver != null ? driver.hashCode() : 0;
		int pass = passenger != null ? passenger.hashCode() : 0;
		return col + mod + driv + pass;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (o.getClass() != getClass()) return false;
		Car car = (Car) o;
		if (driver != car.driver) return false;
		if(passenger != car.passenger) return false;
		if (model != car.model) return false;
		return color != null ? color.equals(car.color) : car.color == null;
	}

	@Override
	public String toString() {
		return "Car: " +
				"model =" + model  +
				", color =" + color +
				", driver = " + driver +
				", passenger = " + passenger
				;
	}

}
