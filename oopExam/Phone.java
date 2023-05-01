package oopExam;

/*Interface Can't Inherit any Abstract class and Regular class. 
 * Interface can only Inherit Interface by itself by 'Implements' Keyword more than One.
 * 'Implements' Keyword is used by Abstract and Regular class only to Inherit Interface.
 */

public interface Phone extends Pager, Wakitoki {

	/*
	 * Interface can't have Constructor. It can have Abstarct and
	 * Non-Abstract(Implemented) Method which are Static and Default type Method
	 * Only.
	 */

	public String phoneName = "Iphone";

	// Abstract Method
	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public static void battery() {
		System.out.println("Battery is a Static Method from Java");
	}

	public default void wireless() {
		System.out.println("Wireless is a Default Method from Java");
	}

}
