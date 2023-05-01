package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'F';

	// Default Constructor
	public Iphone2() {
		super("Iphone", 800, 'F', true);
		super.youtube();
		super.RatingOfIphone1 = 10.02;
		System.out.println("Rating Of Iphone1 is:" + RatingOfIphone1);

		System.out.println("This is a Default Constructor");
	}

	// Parameterized Constructor
	public Iphone2(char userOfIphone2) {
		super("Iphone", 700, 'M', true);
		super.youtube();
		super.RatingOfIphone1 = 10.02;
		this.userOfIphone2 = userOfIphone2;
		System.out.println("User of Iphone2 is:" + userOfIphone2 + "Rating Of Iphone1 is:" + RatingOfIphone1);
	}

	// Void type Method
	public void dropbox() {
		super.youtube();
		super.RatingOfIphone1 = 10.02;
		System.out.println("Rating Of Iphone1 is:" + RatingOfIphone1);
		System.out.println("This is a Void type Method");
	}

	// Parameterized Method
	public void iphone2Info(char userOfIphone2) {
		super.youtube();
		super.RatingOfIphone1 = 10.02;
		System.out.println("Rating Of Iphone1 is:" + RatingOfIphone1);
		this.userOfIphone2 = userOfIphone2;
		System.out.println("User of Iphone2 is:" + userOfIphone2);
	}

}
