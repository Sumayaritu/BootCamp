package oopExam;

public class TestPhone {

	public static void main(String[] args) {

		System.out.println("-------------------------[ENCAPSULATION]-------------------------");

		Iphone1 iphone1 = new Iphone1();

		iphone1.setInfo("2000");
		iphone1.setPrice(750);
		iphone1.setUser('F');
		iphone1.setMadeInUSA(false);

		System.out.println("I bought this phone in:" + iphone1.getInfo() + "\nThe price was" + iphone1.getPrice() + "$"
				+ "\nUser's Sex:" + iphone1.getUser() + "\nMade In USA:" + iphone1.getMadeInUSA());

		System.out.println("-------------------------[ABSTRACTION]-------------------------");

		Iphone1 iph1 = new Iphone1("2000", 750, 'F', false);
		iphone1.regularClassInfo();
		iphone1.youtube();
		iphone1.watchInfo();
		iphone1.digitalWatchInfo();
		iphone1.appleWatchInfo();
		iphone1.abstractClassInfo();
		iphone1.pagerInfo();
		iphone1.wakitokiInfo();
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		Iphone1.battery();
		iphone1.wireless();

		// AppleWatch
		AppleWatch appleWatch = new Iphone1();

		appleWatch.abstractClassInfo();
		appleWatch.appleWatchSeriesInfo();
		appleWatch.watchInfo();
		appleWatch.digitalWatchInfo();
		appleWatch.appleWatchInfo();

		// Phone
		Phone phone = new Iphone1();
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.camera();
		Phone.battery();
		phone.wireless();
		phone.pagerInfo();
		phone.wakitokiInfo();

		// Iphone1 and Iphone2
		System.out.println("-------------------------[USE OF SUPER]-------------------------");

		Iphone1 iphn1 = new Iphone1();// Default Constructor
		Iphone1 iphon1 = new Iphone1("Iphone", 1500, 'F', true);// Parameterized Constructor

		iphn1.regularClassInfo();
		iphn1.youtube();// Void Method

		Iphone2 iphone2 = new Iphone2();// Default Constructor
		Iphone2 iphone = new Iphone2('F');// Parameterized Constructor

		iphone2.dropbox();// Void type Method
		iphone2.iphone2Info('M');// Parameterized Method

		System.out.println("-------------------------[INHERITANCE]-------------------------");
		Iphone1 ipn1 = new Iphone1();// Single Inheritance
		iphn1.youtube();
		iphn1.regularClassInfo();

		Iphone2 iphn2 = new Iphone2();
		iphn2.dropbox();
		iphn2.iphone2Info('F');
		iphn2.youtube();
		iphn2.regularClassInfo();

		Iphone3 iphone3 = new Iphone3();
		iphone3.map();
		iphone3.youtube();
		iphone3.regularClassInfo();

		Iphone4 iphone4 = new Iphone4();
		iphone4.photos();
		iphone4.dropbox();
		iphone4.iphone2Info('M');
		iphone4.youtube();
		iphone4.regularClassInfo();

		Iphone5 iphone5 = new Iphone5();// Multi-level Inheritance
		iphone5.email();
		iphone5.photos();
		iphone5.dropbox();
		iphone5.iphone2Info('F');
		iphone5.youtube();
		iphone5.regularClassInfo();

		Iphone6 iphone6 = new Iphone6();// Hirachical Inheritance
		iphone6.compass();
		iphone6.email();
		iphone6.photos();
		iphone6.dropbox();
		iphone6.iphone2Info('M');
		iphone6.youtube();
		iphone6.regularClassInfo();

		System.out.println("-------------------------[POLYMORPHISM]-------------------------");

		Iphone6 iphn6 = new Iphone6();
		iphn6.compass();
		iphn6.materials();
		iphn6.materials(2000);
		iphn6.materials(1400, 2000);
		iphn6.materials(700, 900, 800);
		iphn6.materials(500, 800, "400");
		iphn6.materials(1400, "1000", 1100);
		Iphone6.materials("1500", 700, 1000);

		ConfiguredIphone6 configuredIphone6 = new ConfiguredIphone6();
		configuredIphone6.materials();
		configuredIphone6.compass();
		configuredIphone6.materials(1400);
		configuredIphone6.materials(600, 700, "900");
		configuredIphone6.materials(800, 900);
		configuredIphone6.materials(2000, 300, "800");
		ConfiguredIphone6.materials("500", 700, 900);

	}

}
