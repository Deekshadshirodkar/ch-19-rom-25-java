class AmusementPark {


    AmusementPark() {
        System.out.println("Amusement Park Constructor Invoked");
    }

    AmusementPark(String parkName, String location, int numberOfRides, boolean waterParkIncluded, double ticketPrice, String openingTime, String closingTime) {
        System.out.println("Amusement Park Parameterized Constructor Invoked");
        this.parkName = parkName;
        this.location = location;
        this.numberOfRides = numberOfRides;
        this.waterParkIncluded = waterParkIncluded;
        this.ticketPrice = ticketPrice;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

	String parkName;
    String location;
    int numberOfRides;
    boolean waterParkIncluded;
    double ticketPrice;
    String openingTime;
    String closingTime;
	
	
    public void getAmusementParkInfo() {
        System.out.println("Park Name: " + parkName);
        System.out.println("Location: " + location);
        System.out.println("Number of Rides: " + numberOfRides);
        System.out.println("Water Park Included: " + waterParkIncluded);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
    }
}
