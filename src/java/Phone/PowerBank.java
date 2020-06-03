package Phone;

class PowerBank extends Charger {
	private static final int factor = 70;
	private int bateryCapasity;
	private int namBaretyCapasity;


	public PowerBank(int bateryCapasity) {
		this.bateryCapasity = bateryCapasity;
		namBaretyCapasity = bateryCapasity;
	}

	public int getNamBaretyCapasity() {
		return namBaretyCapasity;
	}

	@Override
	int getFactor() {
		return factor;
	}

	@Override
	public int getBateryCapasity() {
		return bateryCapasity;
	}
	@Override
	public void setBateryCapasity(int bateryCapasity) {
		this.bateryCapasity = bateryCapasity;
	}

	public void chargePowerBank(){
     bateryCapasity = namBaretyCapasity;
	}
}
