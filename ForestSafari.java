class ForestSafari {
	
	
    String safariName;
    String location;
    int numberOfAnimals;
    boolean jeepAvailable;
    int safariDurationHours;
    double ticketPrice;
    String bestTimeToVisit;

    void getForestSafariInfo() {
		
        System.out.println("Name: " + safariName);
        System.out.println("Location: " + location);
        System.out.println("Animals: " + numberOfAnimals);
        System.out.println("Jeep Available: " + jeepAvailable);
        System.out.println("Duration: " + safariDurationHours + " hrs");
        System.out.println("Price: " + ticketPrice);
        System.out.println("Best Time: " + bestTimeToVisit);
    }
}
