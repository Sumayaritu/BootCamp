package oopExam;

/*1)Yes I can make a relation between Phone Interface with 'Implements' keyword
 *  and AppleWatch Abstract class with 'Extends' keyword.
 */

public class Iphone1 extends AppleWatch implements Phone {

	private String Info;
	private int Price;
	private char User;
	private boolean MadeInUSA;
	public double RatingOfIphone1;

	public String getInfo() {
		return Info;
	}

	public void setInfo(String Info) {
		this.Info = Info;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}

	public char getUser() {
		return User;
	}

	public void setUser(char User) {
		this.User = User;
	}

	public boolean getMadeInUSA() {
		return MadeInUSA;
	}

	public void setMadeInUSA(boolean MadeInUSA) {
		this.MadeInUSA = MadeInUSA;
	}

	// Default Constructor
	public Iphone1() {
		System.out.println("This is a Default Constructor");
	}

	// Parameterized Constructor
	public Iphone1(String Info, int Price, char User, boolean MadeInUSA) {
		this.Info = Info;
		this.Price = Price;
		this.User = User;
		this.MadeInUSA = MadeInUSA;
		System.out.println("Iphone1 was realesed on:" + Info + "\nPrice was:" + Price + "$" + "\nUser's Sex is:" + User
				+ "\nMade In USA?:" + MadeInUSA);
	}

	public void regularClassInfo() {
		System.out.println(
				"Regular Class:A Regular Class can have Variables,Constructors & Methods.Inside it Methods only can be Implemented"
						+ "It can't have Abstract(Declared) Methods.A Regular Class can Inherit only one Regular class or an Abstract Class with 'Extends' Keyword and "
						+ "can Inherit more than one Interface with 'Implements' Keyword.");
	}

	// Default Method
	public void youtube() {
		System.out.println("This is a Default type Method of Class Iphone1");
	}

	@Override
	public void watchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void digitalWatchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub
	}

	@Override
	public void pagerInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void wakitokiInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	public static void battery() {
		// TODO Auto-generated method stub

	}

}
