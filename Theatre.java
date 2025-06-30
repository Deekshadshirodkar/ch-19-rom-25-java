class Theatre{

	static String name;
	static String location;
    static Integer capacity;
    static double ticketPrice;
    static Float screenSize;
    static Long theatreId;
	static String screenType;
	static String audioSystem;
    static Short numOfScreens;
	static int yearEstablished;
	static String manager;
	static String accessibility;
	static Boolean onlineTicket;
	static String languages;
	static Boolean refreshment;
    static Byte vipSeats;
    static Boolean is3DEnabled;
    static Character grade;
	static int staffCount;
	static String type;
	
	
	public static void main(String movie[])
	{
		System.out.println("Theatre Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Ticket Price: ₹" + ticketPrice);
        System.out.println("Screen Size: " + screenSize + " ft");
        System.out.println("Theatre ID: " + theatreId);
		System.out.println("Screen Type : " +screenType);
		System.out.println("Audio System : " +audioSystem);
		System.out.println("Year Established : " +yearEstablished);
		System.out.println("Accessibility : " +accessibility);
        System.out.println("Number of Screens: " + numOfScreens);
        System.out.println("VIP Seats: " + vipSeats);
		System.out.println("Online tickets available: " +onlineTicket);
		System.out.println("Available Languages : " +languages);
		System.out.println("Manager : " +manager);
		System.out.println("IS Refreshment Available: " +refreshment);
		System.out.println("Location : " +location);
        System.out.println("3D Enabled: " + is3DEnabled);
		System.out.println("VIP Seats : " + vipSeats);
        System.out.println("Grade: " + grade);
		System.out.println("Number of Staff : "+ staffCount);
		System.out.println("Type : " +type);
		
		
		name = "Miraj";
		location = "Karwar";
		capacity = 500;
		ticketPrice = 250.0;
		screenSize = 70.5f;
		theatreId = 100012345678L;
		screenType = "IMAX";
		audioSystem = "Dolby Atmos";
		numOfScreens = 5;
		yearEstablished = 2008;
		manager = "Rahul";
		accessibility = "Wheelchair ramps, lifts";
		onlineTicket = true;
		languages = "Hindi,Kannada";
		refreshment = true;
		vipSeats = 20;
		is3DEnabled = true;
		grade = 'A';
		staffCount = 30;
		type = "Multiplex";
	
	
		System.out.println(name);
        System.out.println(capacity);
        System.out.println(ticketPrice);
        System.out.println(screenSize);
		System.out.println(screenType);
        System.out.println(theatreId);
		System.out.println(yearEstablished);
        System.out.println(numOfScreens);
		System.out.println(audioSystem);
        System.out.println(vipSeats);
		System.out.println(onlineTicket);
		System.out.println(languages);
		System.out.println(manager);
		System.out.println(refreshment);
		System.out.println(location);
        System.out.println(is3DEnabled);
        System.out.println(grade);
		System.out.println(vipSeats);
		System.out.println(staffCount);
		System.out.println(type);
		
	}
}
