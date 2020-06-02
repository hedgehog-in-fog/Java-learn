package Phone;

abstract class Charger implements Charging {

	abstract int getFactor();

	abstract int getBateryCapasity();

	public int toChargingProcess() {
			return (int)Math.round(getFactor() * getBateryCapasity() * 0.01);

	}

}
