class PoliceStation{
	
	static String stationName;
	static String location;
	static String headOfficer;
	static int establishedyear;
	static String stationCode;
    static Integer totalOfficers;
	static int vehicles;
    static double areaCoverage;
    static Float averageResponseTime;
	static String workingHours;
    static Short numberOfCells;
    static Byte rating;
    static Boolean isOperational;
    static Character zone;
	static int womenhelplineNo;
	static int emergencyNo;
	static Long contactNo;
	static String availableVehicle;
	
	
	
	public static void main(String station[]){
		System.out.println("Station Name: " + stationName);
		System.out.println("Established year : " +establishedyear);
		System.out.println("Head Officer: " + headOfficer);
		System.out.println("Station Code : " +stationCode);
        System.out.println("Total Officers: " + totalOfficers);
		System.out.println("Location : " +location);
		System.out.println("Total vehicles : " +vehicles);
        System.out.println("Area Coverage: " + areaCoverage + " km²");
        System.out.println("Avg. Response Time: " + averageResponseTime + " mins");
        System.out.println("Working Hours : " + workingHours);
        System.out.println("Number of Cells: " + numberOfCells);
        System.out.println("Rating: " + rating);
        System.out.println("Operational: " + isOperational);
        System.out.println("Zone: " + zone);
		System.out.println("Women Helpline Number : " +womenhelplineNo);
		System.out.println("Contact number : " +contactNo);
		System.out.println("Emergency number : " +emergencyNo);
		System.out.println("Available Vehicle : " +availableVehicle);
		
		
		String stationName = "Central Police Station";
		String location = "Bengaluru, Karnataka";
		String headOfficer = "Inspector Ravi";
		int establishedyear = 1895;
		String stationCode = "PS1211";
		Integer totalOfficers = 75;
		int vehicles = 20;
		double areaCoverage = 52.4;
		Float averageResponseTime = 4.6f;
		String workingHours = "24*7";
		Short numberOfCells = 8;
		Byte rating = 5;
		Boolean isOperational = true;
		Character zone = 'B';
		int womenhelplineNo = 112;
		int emergencyNo = 100;
		Long contactNo =92367856376L;
		String availableVehicle = "5 Jeeps, 3 Bikes";
	
	
	
		System.out.println(stationName);
		System.out.println(establishedyear);
		System.out.println(headOfficer);
		System.out.println(stationCode);
        System.out.println(totalOfficers);
		System.out.println(location);
		System.out.println(vehicles);
        System.out.println(areaCoverage + " km²");
        System.out.println(averageResponseTime + " mins");
        System.out.println(workingHours);
        System.out.println(numberOfCells);
        System.out.println(rating);
        System.out.println(isOperational);
        System.out.println(zone);
		System.out.println(womenhelplineNo);
		System.out.println(contactNo);
		System.out.println(emergencyNo);
		System.out.println(availableVehicle);
		
	
	}
}