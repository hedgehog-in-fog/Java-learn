package Phone;

class WirelessCharger extends Charger {
	private static final int factor = 50;
	private static final int bateryCapasity = 10000;

	@Override
	void setBateryCapasity(int bateryCapasity) {}

	@Override
	int getFactor() {
		return factor;
	}

	@Override
	int getBateryCapasity() {
		return bateryCapasity;
	}

	@Override
	public void chargePowerBank() {}
}
