class Temple{

	static String templeName;
    static int establishedYear;
	static String founder;
	static String location;
	static String architectureStyle;
    static double donationAmount;
    static double areaInAcres;
    static long templeId;
    static short numberOfShrines;
    static byte numberOfSteps;
	static String gopurHeight;
	static String timings;
	static int aarti ;
	static String prasad ;
    static boolean isOpen ;
    static char templeGrade;
	static String Opened;
	static String priest;
	static int totalPillars;
	static String templeRules;
	
	public static void main(String pray[]){
		
		System.out.println("Temple Name: " + templeName);
        System.out.println("Established Year: " + establishedYear);
		System.out.println("Founder : " +founder);
		System.out.println("Location : " +location); 
		System.out.println("Architectural Style : " +architectureStyle );
        System.out.println("Total Donations: Rs." + donationAmount);
        System.out.println("Area: " + areaInAcres + " acres");
        System.out.println("Temple ID: " + templeId);
		System.out.println("Total number of Shrines : " + numberOfShrines);
        System.out.println("Steps: " + numberOfSteps);
		System.out.println("Height of Gopur : " + gopurHeight);
		System.out.println("Timings : " +timings);
		System.out.println("Is prasad available :" +prasad); 
        System.out.println("Is Open: " + isOpen);
        System.out.println("Temple Grade: " + templeGrade);
		System.out.println("Date of Inaugration :" +Opened);
		System.out.println("Priest of the temple : " +priest);
		System.out.println("Number of Pillars : " + totalPillars);
		System.out.println("Temple Rules : " +templeRules);
		
		
		templeName = "Shri Siddhivinayak Temple";
		establishedYear = 1801;
		founder = "Shree Ram ";
		location = "Karwar ";
		architectureStyle = "Dravidian";
		donationAmount = 1200000.75;
		areaInAcres = 5000.0;
		templeId = 123456789012L;
		numberOfShrines = 4;
		numberOfSteps = 30;
		gopurHeight = "200 ft";
		timings = "6AM - 9PM ";
		aarti = 3;
		prasad = "Available";
		isOpen = true;
		templeGrade = 'A';
		Opened = "25-11-1801";
		priest = "Ravindra";
		totalPillars = 20;
		templeRules = "Traditional dress, No photography, etc.";
	
		System.out.println(templeName);
        System.out.println(establishedYear);
		System.out.println(founder);
		System.out.println(location); 
		System.out.println(architectureStyle );
        System.out.println(donationAmount);
        System.out.println( areaInAcres);
        System.out.println( templeId);
		System.out.println(numberOfShrines);
        System.out.println(numberOfSteps);
		System.out.println(gopurHeight);
		System.out.println(timings);
		System.out.println(prasad); 
        System.out.println(isOpen);
        System.out.println(templeGrade);
		System.out.println(Opened);
		System.out.println(priest);
		System.out.println(totalPillars);
		System.out.println(templeRules);
		

	
	}
}