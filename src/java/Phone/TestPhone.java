package Phone;

public class TestPhone {
	public static void main(String[] args) {
		final Phone xiaomi = new Phone(8, "xiaomi", 100);

		if (xiaomi.phoneCall().equals("Звонок")
				&& xiaomi.getCapacityAccum() == (xiaomi.getNamCapacityAccum() - xiaomi.getQuantityCall() * 4 * xiaomi.getDiagonal())) {
			System.out.println("Телефон звонит верно ");
		} else {
			throw new IllegalStateException("test 1(call) failed");
		}

		boolean is2test = false;
		try {
			xiaomi.phoneCall();
			xiaomi.phoneCall();
			xiaomi.phoneCall();
			xiaomi.phoneCall();

		} catch (IllegalArgumentException e) {
			is2test = true;
		} finally {
			if (is2test) {
				System.out.println("charde phone");
			} else {
				throw new IllegalStateException("not charde phone");
			}
		}


		if (xiaomi.charge() == xiaomi.getNamCapacityAccum()) {
			System.out.println("телефон заряжен");
		} else {
			throw new IllegalStateException("test 2(charde) failed");
		}

	}
}
