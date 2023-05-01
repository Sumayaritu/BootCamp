package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	public void materials() {
		System.out.println("This is a void type Method of Materials class");
	}

	public void materials(int ramPrice) {
		System.out.println("This is a void type Parameterized Method of Materials class");// Void type method can't be
																							// return type
	}

	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice + 300;
		System.out.println("Total Price:" + total1);
		return 0;
	}

	@Override
	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int total2 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + 1500;
		System.out.println("Total Price:" + total2);
		return total2;
	}

	@Override
	public int materials(int laptopPrice, int ramPrice, int cameraPrice) {
		int total3 = laptopPrice + ramPrice + cameraPrice + 5000;
		System.out.println("Total Price:" + total3);
		return total3;
	}

	// We can not Override the Final Method
	/*
	 * public final int materials(int ramPrice, String lensePrice, int
	 * cameraPrice) { int total4 = ramPrice + Integer.parseInt(lensePrice) +
	 * cameraPrice; System.out.println("Total Price:" + total4); return 0; }
	 */

	// We cannot Override the Static type method rather we can use it as it is
	public static int materials(String lensePrice, int ramPrice, int laptopPrice) {
		int total5 = Integer.parseInt(lensePrice) + ramPrice + laptopPrice;
		System.out.println("Total price:" + total5);
		return 0;
	}

}
