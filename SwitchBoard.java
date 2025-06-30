class SwitchBoard{
	
	static String switchBoardId;
	static String company;
	static String madeIn;
	static String modelNo;
	static String type;
    static Integer totalSwitches;
	static int totalSocket;
	static int regulator;
    static double voltage;
    static Float current;
    static Long serialNumber;
    static Short yearInstalled;
	static String installationDate;
    static Byte powerRating;
	static String wiringType;
	static String wireColorCode;
	static String warranty;
    static Boolean isActive;
    static Character panelType;
	static String lastmaintenance;
	
	
	public static void main(String board[]){
		System.out.println("SwitchBoard ID: " + switchBoardId);
		System.out.println("Company Name :" +company);
		System.out.println("Made In : "+madeIn);
		System.out.println("Modek Number : "+modelNo);
		System.out.println("Model Type : " + type);
        System.out.println("Total Switches: " + totalSwitches);
		System.out.println("number of Sockets: "+totalSocket);
		System.out.println("Number of Regulator : " +regulator);
        System.out.println("Voltage: " + voltage + " V");
        System.out.println("Current: " + current + " A");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Year Installed: " + yearInstalled);
		System.out.println("Installation Date: " + installationDate);
        System.out.println("Power Rating: " + powerRating);
		System.out.println("Wiring Type : " +wiringType );
		System.out.println("Wire Color Code: " +wireColorCode);
		System.out.println("Warranty :"+warranty);
        System.out.println("Is Active: " + isActive);
        System.out.println("Panel Type: " + panelType);
		System.out.println("Last Maintenance : " +lastmaintenance);
		
		
		switchBoardId = "SB-1001";
		company = "Anchor";
		madeIn = "India";
		modelNo = "LGR-6M-SSWH";
		type = "Modular Surface-Mounted";
		totalSwitches = 10;
		totalSocket = 2;
		regulator = 1;
		voltage = 220.0;
		current = 15.5f;
		serialNumber = 1234567890123L;
		yearInstalled = 2022;
		installationDate = "02-04-2022";
		powerRating = 5;
		wiringType = "Copper, 1.5 sq. mm for lights, 2.5 sq. mm for sockets";
		wireColorCode = "Red (Live), Black (Neutral), Green (Earth)";
		warranty = "10 Years";
		isActive = true;
		panelType = 'A';
		lastmaintenance = "18-04-2024";
	
	
		System.out.println(switchBoardId);
		System.out.println(company);
		System.out.println(madeIn);
		System.out.println(modelNo);
		System.out.println(type);
        System.out.println(totalSwitches);
		System.out.println(totalSocket);
		System.out.println(regulator);
        System.out.println(voltage);
        System.out.println(current);
        System.out.println(serialNumber);
        System.out.println(yearInstalled);
		System.out.println(installationDate);
        System.out.println(powerRating);
		System.out.println(wiringType );
		System.out.println(wireColorCode);
		System.out.println(warranty);
        System.out.println(isActive);
        System.out.println(panelType);
		System.out.println(lastmaintenance);
	
	}
}