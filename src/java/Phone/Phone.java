package Phone;

public class Phone {
	private int diagonal;
	private int capacityAccum;
	private String model;
	private int namCapacityAccum;
	private int quantityCall;

	public Phone(int diagonal, String model, int namCapacityAccum) {
		this.namCapacityAccum = namCapacityAccum;
		this.diagonal = diagonal;
		this.model = model;
	}

	public int getQuantityCall() {
		return quantityCall;
	}

	public int getNamCapacityAccum() {
		return namCapacityAccum;
	}

	public int getDiagonal() {
		return diagonal;
	}

	public int getCapacityAccum() {
		return capacityAccum;
	}


	public String phoneCall() {
		quantityCall++;
		if (namCapacityAccum >= diagonal * 4 * quantityCall) {
			capacityAccum = namCapacityAccum - diagonal * 4 * quantityCall;
		} else {
			throw new IllegalArgumentException("charge phone");
		}

		return "Звонок";
	}

	public int toCharge(Charging charging) {
		quantityCall = 0;
		int actualCharge = charging.toChargingProcess(namCapacityAccum - capacityAccum);
		return capacityAccum = capacityAccum + actualCharge;
	}

	public int charge() {
		quantityCall = 0;
		return (capacityAccum = namCapacityAccum);
	}
}
