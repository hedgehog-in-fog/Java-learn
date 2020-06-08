package TwoCar;

public class Car {
	private String model;
	private String color;
	private People driver;
	private People passenger;

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public People getDriver() {
		return driver;
	}

	public People getPassenger() {
		return passenger;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDriver(People driver) {
		this.driver = driver;
	}

	public void setPassenger(People passenger) {
		this.passenger = passenger;
	}

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
