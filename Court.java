class Court{
	
	static String courtName;
	static String location;
	static String courtType;
	static int establishedYear;
	static int judges;
	static String cases;
	static int hearingRooms;
	static String timing;
    static Integer totalCases;
    static double successRate;
    static Float penaltyAmount;
    static Long courtID;
    static Short rooms;
	static String library;
	static String parking;
	static String benchType;
	static String caseFilling;
    static Byte clerks;
    static Boolean isActive;
    static Character grade;
	
	
	public static void main(String judge[])
	{
		System.out.println("Court Name: " + courtName);
		System.out.println("Location : " +location);
		System.out.println("Court Type : " +courtType);
		System.out.println("Established Year : " + establishedYear);
		System.out.println("Number of Judges: " +judges);
		System.out.println("Type of cases : " +cases);
		System.out.println("Number of hearing Rooms : " +hearingRooms);
		System.out.println("Timing : " +timing);
        System.out.println("Total Cases: " + totalCases);
        System.out.println("Success Rate: " + successRate + "%");
        System.out.println("Penalty Amount: Rs." + penaltyAmount);
        System.out.println("Court ID: " + courtID);
        System.out.println("Number of Rooms: " + rooms);
		System.out.println("Is Library available : " + library);
		System.out.println("Parking : " +parking);
		System.out.println("Bench Type : " +benchType);
		System.out.println("Case Filling Method : " + caseFilling);
        System.out.println("Number of Clerks: " + clerks);
        System.out.println("Active: " + isActive);
        System.out.println("Grade: " + grade);
		
		courtName = "Bombay High Court";
		location = "Mumbai";
		courtType = "Supreme, High, District, Sessions, Civil, Family";
		establishedYear = 1862;
		judges = 50;
		cases =  "Civil, Criminal, Commercial, etc.";
		hearingRooms = 10;
		timing = "10:00 AM - 5:00 PM";
		totalCases = 5123;
		successRate = 87.4;
		penaltyAmount = 25000.5f;
		courtID = 123456789L;
		rooms = 30;
		library = "Available";
		parking = "Available";
		benchType = "Single, Division Bench, Full Bench, etc.";
		caseFilling = " Manual / e-Filing";
		clerks = 12;
		isActive = true;
		grade = 'A';
	
	
		System.out.println("Court Name: " + courtName);
		System.out.println("Location : " +location);
		System.out.println("Court Type : " +courtType);
		System.out.println("Established Year : " + establishedYear);
		System.out.println("Number of Judges: " +judges);
		System.out.println("Type of cases : " +cases);
		System.out.println("Number of hearing Rooms : " +hearingRooms);
		System.out.println("Timing : " +timing);
        System.out.println("Total Cases: " + totalCases);
        System.out.println("Success Rate: " + successRate + "%");
        System.out.println("Penalty Amount: Rs." + penaltyAmount);
        System.out.println("Court ID: " + courtID);
        System.out.println("Number of Rooms: " + rooms);
		System.out.println("Is Library available : " + library);
		System.out.println("Parking : " +parking);
		System.out.println("Bench Type : " +benchType);
		System.out.println("Case Filling Method : " + caseFilling);
        System.out.println("Number of Clerks: " + clerks);
        System.out.println("Active: " + isActive);
        System.out.println("Grade: " + grade);
		
	}
}