package Phone;

class PowerBank extends Charger {
	private static final int factor = 70;
	private int bateryCapasity;

	@Override
	int getFactor() {
		return factor;
	}

	@Override
	public int getBateryCapasity() {
		return bateryCapasity;
	}

	public PowerBank(int bateryCapasity) {
		this.bateryCapasity = bateryCapasity;
	}

}
