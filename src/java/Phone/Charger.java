package Phone;

abstract class Charger implements Charging {

	abstract int getFactor();

	abstract int getBateryCapasity();

	abstract void setBateryCapasity(int bateryCapasity);

	public int toChargingProcess(int quantityCharg) {
		if (quantityCharg < getBateryCapasity() * getFactor() * 0.01) {
			setBateryCapasity(getBateryCapasity() - (int)Math.round(quantityCharg/(getFactor()*0.01)));
			return quantityCharg;
		} else {
			int i = (int) Math.round(getBateryCapasity() * getFactor() * 0.01);
			setBateryCapasity(0);
			return i;
		}
	}

}
