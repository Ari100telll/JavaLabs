package lab;

public class HelicopterManager {

	public static void main(String[] args) {
		Helicopter.numberOfHelicopter = 0;
		Helicopter firstHelicopter = new Helicopter();
		Helicopter secondHelicopter = new Helicopter(500, "Hell", 100, 1500);
		Helicopter thirdHelicopter = new Helicopter(1000, "Hell2.0", 3000, 3000, 8, 10, "USA");
		System.out.println(firstHelicopter.toString());
		System.out.println(secondHelicopter.toString());
		System.out.println(thirdHelicopter.toString());
		System.out.println(thirdHelicopter.printNumberOfHelicopter());
		System.out.println(Helicopter.printStaticNumberOfHelicopter());
		Helicopter[] helicopters = new Helicopter[4];
		int currentHelicopterIndex = 0;
		do {
			helicopters[currentHelicopterIndex] = new Helicopter(1000, "Hell2.0." + currentHelicopterIndex, 3000,
					4500);
			currentHelicopterIndex++;
		} while (currentHelicopterIndex != 4);
		for (Helicopter helicopter : helicopters) {
			System.out.println(helicopter.toString());
		}
	}

}
