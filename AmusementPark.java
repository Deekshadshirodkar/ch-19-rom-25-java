class AmusementPark {
	
	
    String parkName;
    String location;
    int numberOfRides;
    boolean waterParkIncluded;
    double ticketPrice;
    String openingTime;
    String closingTime;

    public void getAmusementParkInfo() {
		
        System.out.println("Name: " + parkName);
        System.out.println("Location: " + location);
        System.out.println("Rides: " + numberOfRides);
        System.out.println("Water Park: " + waterParkIncluded);
        System.out.println("Price: " + ticketPrice);
        System.out.println("Open: " + openingTime);
        System.out.println("Close: " + closingTime);
    }
}
