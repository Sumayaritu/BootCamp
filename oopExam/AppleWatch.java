package oopExam;

/*An Abstract Class starts with Uppercase Letter.
 * An Abstract class can have Variables,Constructors & Methods as well.Inside it Methods can be Implemented and Declared.
 * An Abstract Class can Inherit only one Regular class or an Abstract Class with 'Extends' Keyword and 
*can Inherit more than one Interface with 'Implements' Keyword.
 */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public int appleWatchPrice;// Variable

	public AppleWatch() {
		System.out.println("Apple Watch is a Default Constructor");
	}

	public abstract void appleWatchInfo();

	public void abstractClassInfo() {
		System.out.println(
				"Abstract Class:An Abstract class can have Variables,Constructors & Methods as well.Inside it Methods can be Implemented and Declared."
						+ "An Abstract Class can Inherit only one Regular class or an Abstract Class with 'Extends' Keyword and can Inherit more than one Interface with 'Implements' Keyword."

						+ "Regular Class:A Regular Class can have Variables,Constructors & Methods.Inside it Methods only can be Implemented"
						+ "It can't have Abstract(Declared) Methods.A Regular Class can Inherit only one Regular class or an Abstract Class with 'Extends' Keyword and "
						+ "can Inherit more than one Interface with 'Implements' Keyword."

						+ "Interface:An Interface can have both Abstract & Non-Abstract Methods but in Non-Abstract it can only have Static and Default type Method."
						+ "Interface can't have Constructors.An Interface can not Inherit An Abstract & A Regular class It can only inherit Interface by 'Implements' Keyword more than one time.");
	}

}
