class Casino {

    String casinoName;
    String location;
    int totalGames;
    boolean hasHotel;
    boolean hasRestaurant;
    double entryFee;
    String openingHours;

    public void getCasinoInfo() {
		
        System.out.println("Name: " + casinoName);
        System.out.println("Location: " + location);
        System.out.println("Total Games: " + totalGames);
        System.out.println("Has Hotel: " + hasHotel);
        System.out.println("Has Restaurant: " + hasRestaurant);
        System.out.println("Entry Fee: ₹" + entryFee);
        System.out.println("Opening Hours: " + openingHours);
    }
}
