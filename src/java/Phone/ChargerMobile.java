package Phone;

class ChargerMobile extends Charger {
	private static final int factor = 95;
	private static final int bateryCapasity = 10000;

	@Override
	int getFactor() {
		return factor;
	}

	@Override
	int getBateryCapasity() {
		return bateryCapasity;
	}

	@Override
	void setBateryCapasity(int bateryCapasity) {}

}
