class Casino {


    Casino() {
        System.out.println("Casino Constructor Invoked");
    }

    Casino(String casinoName, String location, int totalGames, boolean hasHotel, boolean hasRestaurant, double entryFee, String openingHours) {
        System.out.println("Casino Parameterized Constructor Invoked");
        this.casinoName = casinoName;
        this.location = location;
        this.totalGames = totalGames;
        this.hasHotel = hasHotel;
        this.hasRestaurant = hasRestaurant;
        this.entryFee = entryFee;
        this.openingHours = openingHours;
    }
	
	
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
