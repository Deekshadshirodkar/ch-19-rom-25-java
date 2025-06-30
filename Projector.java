class Projector{
	
	static String model;
	static String manufacturedDate;
	static String projectorId; 
	static String modelNo;
    static Integer brightnessLumens;
	static String company;
	static String type;
	static float weight;
    static double resolution;
	static String dimension;
	static String coolingSystem;
	static String voltageSupport;
	static String usbPort;
    static double contrastRatio;
    static Long serialNumber;
    static Short yearOfManufacture;
    static Byte energyRating;
    static Boolean isWireless;
	static int warranty;
    static Character displayType;
	
	
	
	public static void main(String projector[]){
		System.out.println("Model: " + model);
		System.out.println("Manufactured Date : " + manufacturedDate);
		System.out.println("Projector Id : " + projectorId);
		System.out.println("Model Number : " +modelNo);
		System.out.println("Projector type : "+type);
		System.out.println("Company : " +company);
        System.out.println("Brightness: " + brightnessLumens + " lumens");
		System.out.println("Weight of the projector : " +weight+ "kg");
        System.out.println("Resolution: " + resolution + " px");
		System.out.println("Dimension : " +dimension);
		System.out.println("Cooling System : " +coolingSystem);
		System.out.println("Voltage Support : " +voltageSupport);
		System.out.println("USB port type : " +usbPort);
        System.out.println("Contrast Ratio: " + contrastRatio);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
        System.out.println("Energy Rating: " + energyRating);
		System.out.println("Warranty : " + warranty + "years");
        System.out.println("Wireless: " + isWireless);
        System.out.println("Display Type: " + displayType);
		
		model = "Epson EX3260";
		manufacturedDate = "01-01-2020";
		projectorId = "PJX-EPS-2024-017"; 
		modelNo = "EB-X41";
		brightnessLumens = 3300;
		company = "Epson";
		type = "LCD";
		weight = 2.5f;
		resolution = 1920.0;
		dimension= "30.2 x 23.7 x 8.2 cm";
		coolingSystem = "Dual-fan internal cooling";
		voltageSupport = "100–240V AC, 50/60 Hz";
		usbPort = "1 Type-A, 1 Type-B";
		contrastRatio = 15000.5;
		serialNumber = 1234567891011L;
		yearOfManufacture = 2022;
		energyRating = 4;
		isWireless = true;
		warranty = 2;
		displayType = 'L';
	
	
		System.out.println(model);
		System.out.println(manufacturedDate);
		System.out.println(projectorId);
		System.out.println(modelNo);
		System.out.println(type);
		System.out.println(company);
        System.out.println(brightnessLumens);
		System.out.println(weight);
        System.out.println(resolution);
		System.out.println(dimension);
		System.out.println(coolingSystem);
		System.out.println(voltageSupport);
		System.out.println(usbPort);
        System.out.println(contrastRatio);
        System.out.println(serialNumber);
        System.out.println(yearOfManufacture);
        System.out.println(energyRating);
		System.out.println(warranty + "years");
        System.out.println(isWireless);
        System.out.println(displayType);
		
	}
}