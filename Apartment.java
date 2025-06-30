class Apartment{

	static String apartmentName;
	static String societyName;
	static String apartmentOwner;
	static String location ;
    static Integer flatNumber;
	static int floorNo;
	static String furnishingStatus;
	static int advance ;
	static String roomType;
    static double rentAmount;
    static Float carpetArea ;
    static Long registryNumber;
    static Short numberOfRooms;
    static Byte numberOfBalconies;
    static Boolean isFurnished;
    static Character buildingBlock;
	static String security;
	static String parking;
	static String lift;
	static String waterSupply;
	
	
	
	public static void main(String room[]){
		
		System.out.println("Apartment Name: " + apartmentName);
		System.out.println("Society Name : " +societyName );
		System.out.println("Apartment Owned by : " +apartmentOwner);
		System.out.println("Location : " +location);
        System.out.println("Flat Number: " + flatNumber);
		System.out.println("Floor Number : " +floorNo);
		System.out.println("Furnishing Status : " +furnishingStatus );
		System.out.println("Room Type : " +roomType);
        System.out.println("Rent Amount: Rs." + rentAmount);
		System.out.println("Advance : Rs." +advance);
        System.out.println("Carpet Area: " + carpetArea + " sq.ft.");
        System.out.println("Registry Number: " + registryNumber);
        System.out.println("Rooms: " + numberOfRooms);
        System.out.println("Balconies: " + numberOfBalconies);
        System.out.println("Furnished: " + isFurnished);
        System.out.println("Block: " + buildingBlock);
		System.out.println("Security :  " +security);
		System.out.println("Parking : " +parking);
		System.out.println("Lift : " +lift);
		System.out.println("Water Suppy : " +waterSupply);
		
		
		apartmentName = "Sunset Residency";
		societyName = "Green Valley Society";
		apartmentOwner = "Ram";
		location = "Bengaluru";
		flatNumber = 302;
		floorNo = 3;
		furnishingStatus = "Fully furnished";
		advance = 50000;
		roomType = "3BHK";
		rentAmount = 18500.75;
		carpetArea = 1120.5f;
		registryNumber = 9876543210123L;
		numberOfRooms = 3;
		numberOfBalconies = 2;
		isFurnished = true;
		buildingBlock = 'B';
		security = "Available";
		parking = "Available";
		lift = "Available";
		waterSupply = "Municipal/Borewell";
	
	
		
		System.out.println("Apartment Name: " + apartmentName);
		System.out.println("Society Name : " +societyName );
		System.out.println("Apartment Owned by : " +apartmentOwner);
		System.out.println("Location : " +location);
        System.out.println("Flat Number: " + flatNumber);
		System.out.println("Floor Number : " +floorNo);
		System.out.println("Furnishing Status : " +furnishingStatus );
		System.out.println("Room Type : " +roomType);
        System.out.println("Rent Amount: Rs." + rentAmount);
		System.out.println("Advance : Rs." +advance);
        System.out.println("Carpet Area: " + carpetArea + " sq.ft.");
        System.out.println("Registry Number: " + registryNumber);
        System.out.println("Rooms: " + numberOfRooms);
        System.out.println("Balconies: " + numberOfBalconies);
        System.out.println("Furnished: " + isFurnished);
        System.out.println("Block: " + buildingBlock);
		System.out.println("Security :  " +security);
		System.out.println("Parking : " +parking);
		System.out.println("Lift : " +lift);
		System.out.println("Water Suppy : " +waterSupply);
		
	}
}