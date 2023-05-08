package oopExam;

public class Iphone6 extends Iphone5 {

	public void compass() {
		System.out.println("Compass is a one of the feature of Iphone6");
	}

	/*
	 * Method Overloading: When different methods exists with the same method name
	 * but with different parameters or signature, it is called method overloading.
	 * Method Overloading occurs during compile time.It's also called Static
	 * Polymorphism or early binding or method overloading or compile time
	 * Polymorphism. Method Overriding: When different methods exist with the same
	 * method name with same parameters or signature but with different syntax or
	 * logic, it is called method overriding. Method Overriding occurs during run
	 * time. It's also called Dynamic Polymorphism or late binding or method
	 * overriding or run time polymorphism.
	 */
	public int materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice;
		System.out.println("Total Price:" + total1);
		return total1;
	}

	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int total2 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("Total Price:" + total2);
		return total2;
	}

	public void materials() {
		System.out.println("This is a void type Method of Materials class");
	}

	public void materials(int ramPrice) {
		System.out.println("This is a void type Parameterized Method of Materials class");// Void type method can't be
																							// return type
	}

	public int materials(int laptopPrice, int ramPrice, int cameraPrice) {
		int total3 = laptopPrice + ramPrice + cameraPrice;
		System.out.println("Total Price:" + total3);
		return total3;
	}

	public final int materials(int ramPrice, String lensePrice, int cameraPrice) {
		int total4 = ramPrice + Integer.parseInt(lensePrice) + cameraPrice;
		System.out.println("Total Price:" + total4);
		return total4;
	}

	public static int materials(String lensePrice, int ramPrice, int laptopPrice) {
		int total5 = Integer.parseInt(lensePrice) + ramPrice + laptopPrice;
		System.out.println("Total price:" + total5);
		return total5;
	}

	
}
