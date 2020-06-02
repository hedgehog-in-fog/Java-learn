package Phone;

public class TestCharger {
	public static void main(String[] args) {
		Phone phone = new Phone(4,"S1",40);
		Charging powerBank = new PowerBank(30);
		Charging chargerMobile = new ChargerMobile();
		Charging wirelessCharger = new WirelessCharger();
		test1(phone, powerBank);
		test2(phone, powerBank);
		test3(phone, chargerMobile);
		test4(phone, wirelessCharger);
	}
//зарядки powerBanka больше, чем требуется
	public static void test1(Phone phone, Charging charging){
		phone.phoneCall();
		phone.toCharge(charging);
		if(phone.getCapacityAccum() == phone.getNamCapacityAccum()){
			System.out.println("test1 - true");
		}else {
			throw new RuntimeException("test 1: powerBank не заряжает");
		}
	}
//Зарядки powerBanka меньше, чем требуется
	public static void  test2(Phone phone, Charging charging){
		phone.phoneCall();
		phone.phoneCall();
		phone.toCharge(charging);
		if(phone.getCapacityAccum() == 29){
			System.out.println("test2 - true");
		}else {
			throw new RuntimeException("test 2: powerBank не заряжает");
		}
	}

	public static void test3(Phone phone, Charging charging){
		phone.phoneCall();
		phone.toCharge(charging);
		if(phone.getCapacityAccum() == phone.getNamCapacityAccum()){
			System.out.println("test3 - true");
		}else {
			throw new RuntimeException("test 3: chargerMobile не заряжает");
		}
	}

	public static void test4(Phone phone, Charging charging){
		phone.phoneCall();
		phone.phoneCall();
		phone.toCharge(charging);
		if(phone.getCapacityAccum() == phone.getNamCapacityAccum()){
			System.out.println("test4 - true");
		}else {
			throw new RuntimeException("test 4: wirelessCharger не заряжает");
		}
	}

}
