class CasinoRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        Casino c1 = new Casino();
        c1.casinoName = "Royal Palace";
        c1.location = "Goa";
        c1.totalGames = 50;
        c1.hasHotel = true;
        c1.hasRestaurant = true;
        c1.entryFee = 1000.0;
        c1.openingHours = "24/7";

        System.out.println("=== Casino 1 ===");
        System.out.println("Name: " + c1.casinoName);
        System.out.println("Location: " + c1.location);
        System.out.println("Total Games: " + c1.totalGames);
        System.out.println("Has Hotel: " + c1.hasHotel);
        System.out.println("Has Restaurant: " + c1.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c1.entryFee);
        System.out.println("Opening Hours: " + c1.openingHours);

        Casino c2 = new Casino();
        c2.casinoName = "Neon Nights";
        c2.location = "Las Vegas";
        c2.totalGames = 120;
        c2.hasHotel = true;
        c2.hasRestaurant = true;
        c2.entryFee = 0.0;
        c2.openingHours = "9 AM - 3 AM";

        System.out.println("=== Casino 2 ===");
        System.out.println("Name: " + c2.casinoName);
        System.out.println("Location: " + c2.location);
        System.out.println("Total Games: " + c2.totalGames);
        System.out.println("Has Hotel: " + c2.hasHotel);
        System.out.println("Has Restaurant: " + c2.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c2.entryFee);
        System.out.println("Opening Hours: " + c2.openingHours);

        Casino c3 = new Casino();
        c3.casinoName = "Ocean Luck";
        c3.location = "Macau";
        c3.totalGames = 85;
        c3.hasHotel = false;
        c3.hasRestaurant = true;
        c3.entryFee = 500.0;
        c3.openingHours = "10 AM - 2 AM";

        System.out.println("=== Casino 3 ===");
        System.out.println("Name: " + c3.casinoName);
        System.out.println("Location: " + c3.location);
        System.out.println("Total Games: " + c3.totalGames);
        System.out.println("Has Hotel: " + c3.hasHotel);
        System.out.println("Has Restaurant: " + c3.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c3.entryFee);
        System.out.println("Opening Hours: " + c3.openingHours);

        Casino c4 = new Casino();
        c4.casinoName = "Desert Mirage";
        c4.location = "Dubai";
        c4.totalGames = 95;
        c4.hasHotel = true;
        c4.hasRestaurant = false;
        c4.entryFee = 2000.0;
        c4.openingHours = "12 PM - 4 AM";

        System.out.println("=== Casino 4 ===");
        System.out.println("Name: " + c4.casinoName);
        System.out.println("Location: " + c4.location);
        System.out.println("Total Games: " + c4.totalGames);
        System.out.println("Has Hotel: " + c4.hasHotel);
        System.out.println("Has Restaurant: " + c4.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c4.entryFee);
        System.out.println("Opening Hours: " + c4.openingHours);

        Casino c5 = new Casino();
        c5.casinoName = "River Gold";
        c5.location = "Singapore";
        c5.totalGames = 65;
        c5.hasHotel = true;
        c5.hasRestaurant = true;
        c5.entryFee = 750.0;
        c5.openingHours = "10 AM - 1 AM";

        System.out.println("=== Casino 5 ===");
        System.out.println("Name: " + c5.casinoName);
        System.out.println("Location: " + c5.location);
        System.out.println("Total Games: " + c5.totalGames);
        System.out.println("Has Hotel: " + c5.hasHotel);
        System.out.println("Has Restaurant: " + c5.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c5.entryFee);
        System.out.println("Opening Hours: " + c5.openingHours);

                Casino c6 = new Casino();
        c6.casinoName = "Star Spin";
        c6.location = "Malaysia";
        c6.totalGames = 88;
        c6.hasHotel = true;
        c6.hasRestaurant = true;
        c6.entryFee = 650.0;
        c6.openingHours = "11 AM - 2 AM";

        System.out.println("=== Casino 6 ===");
        System.out.println("Name: " + c6.casinoName);
        System.out.println("Location: " + c6.location);
        System.out.println("Total Games: " + c6.totalGames);
        System.out.println("Has Hotel: " + c6.hasHotel);
        System.out.println("Has Restaurant: " + c6.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c6.entryFee);
        System.out.println("Opening Hours: " + c6.openingHours);

        Casino c7 = new Casino();
        c7.casinoName = "Gold Rush";
        c7.location = "Nepal";
        c7.totalGames = 70;
        c7.hasHotel = false;
        c7.hasRestaurant = true;
        c7.entryFee = 400.0;
        c7.openingHours = "12 PM - 12 AM";

        System.out.println("=== Casino 7 ===");
        System.out.println("Name: " + c7.casinoName);
        System.out.println("Location: " + c7.location);
        System.out.println("Total Games: " + c7.totalGames);
        System.out.println("Has Hotel: " + c7.hasHotel);
        System.out.println("Has Restaurant: " + c7.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c7.entryFee);
        System.out.println("Opening Hours: " + c7.openingHours);

        Casino c8 = new Casino();
        c8.casinoName = "Jungle Spin";
        c8.location = "Sri Lanka";
        c8.totalGames = 55;
        c8.hasHotel = true;
        c8.hasRestaurant = false;
        c8.entryFee = 300.0;
        c8.openingHours = "2 PM - 2 AM";

        System.out.println("=== Casino 8 ===");
        System.out.println("Name: " + c8.casinoName);
        System.out.println("Location: " + c8.location);
        System.out.println("Total Games: " + c8.totalGames);
        System.out.println("Has Hotel: " + c8.hasHotel);
        System.out.println("Has Restaurant: " + c8.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c8.entryFee);
        System.out.println("Opening Hours: " + c8.openingHours);

        Casino c9 = new Casino();
        c9.casinoName = "Lucky Dice";
        c9.location = "Mumbai";
        c9.totalGames = 40;
        c9.hasHotel = false;
        c9.hasRestaurant = false;
        c9.entryFee = 200.0;
        c9.openingHours = "5 PM - 1 AM";

        System.out.println("=== Casino 9 ===");
        System.out.println("Name: " + c9.casinoName);
        System.out.println("Location: " + c9.location);
        System.out.println("Total Games: " + c9.totalGames);
        System.out.println("Has Hotel: " + c9.hasHotel);
        System.out.println("Has Restaurant: " + c9.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c9.entryFee);
        System.out.println("Opening Hours: " + c9.openingHours);

        Casino c10 = new Casino();
        c10.casinoName = "Thunder Jack";
        c10.location = "Delhi";
        c10.totalGames = 60;
        c10.hasHotel = true;
        c10.hasRestaurant = false;
        c10.entryFee = 350.0;
        c10.openingHours = "6 PM - 3 AM";

        System.out.println("=== Casino 10 ===");
        System.out.println("Name: " + c10.casinoName);
        System.out.println("Location: " + c10.location);
        System.out.println("Total Games: " + c10.totalGames);
        System.out.println("Has Hotel: " + c10.hasHotel);
        System.out.println("Has Restaurant: " + c10.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c10.entryFee);
        System.out.println("Opening Hours: " + c10.openingHours);

		        Casino c11 = new Casino();
        c11.casinoName = "Neon Nights";
        c11.location = "Goa";
        c11.totalGames = 100;
        c11.hasHotel = true;
        c11.hasRestaurant = true;
        c11.entryFee = 850.0;
        c11.openingHours = "6 PM - 6 AM";

        System.out.println("=== Casino 11 ===");
        System.out.println("Name: " + c11.casinoName);
        System.out.println("Location: " + c11.location);
        System.out.println("Total Games: " + c11.totalGames);
        System.out.println("Has Hotel: " + c11.hasHotel);
        System.out.println("Has Restaurant: " + c11.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c11.entryFee);
        System.out.println("Opening Hours: " + c11.openingHours);

        Casino c12 = new Casino();
        c12.casinoName = "Pearl Palace";
        c12.location = "Kolkata";
        c12.totalGames = 65;
        c12.hasHotel = false;
        c12.hasRestaurant = true;
        c12.entryFee = 450.0;
        c12.openingHours = "3 PM - 1 AM";

        System.out.println("=== Casino 12 ===");
        System.out.println("Name: " + c12.casinoName);
        System.out.println("Location: " + c12.location);
        System.out.println("Total Games: " + c12.totalGames);
        System.out.println("Has Hotel: " + c12.hasHotel);
        System.out.println("Has Restaurant: " + c12.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c12.entryFee);
        System.out.println("Opening Hours: " + c12.openingHours);

        Casino c13 = new Casino();
        c13.casinoName = "Silver Ace";
        c13.location = "Hyderabad";
        c13.totalGames = 72;
        c13.hasHotel = true;
        c13.hasRestaurant = false;
        c13.entryFee = 500.0;
        c13.openingHours = "2 PM - 2 AM";

        System.out.println("=== Casino 13 ===");
        System.out.println("Name: " + c13.casinoName);
        System.out.println("Location: " + c13.location);
        System.out.println("Total Games: " + c13.totalGames);
        System.out.println("Has Hotel: " + c13.hasHotel);
        System.out.println("Has Restaurant: " + c13.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c13.entryFee);
        System.out.println("Opening Hours: " + c13.openingHours);

        Casino c14 = new Casino();
        c14.casinoName = "Dragon Fire";
        c14.location = "Manila";
        c14.totalGames = 110;
        c14.hasHotel = true;
        c14.hasRestaurant = true;
        c14.entryFee = 950.0;
        c14.openingHours = "4 PM - 4 AM";

        System.out.println("=== Casino 14 ===");
        System.out.println("Name: " + c14.casinoName);
        System.out.println("Location: " + c14.location);
        System.out.println("Total Games: " + c14.totalGames);
        System.out.println("Has Hotel: " + c14.hasHotel);
        System.out.println("Has Restaurant: " + c14.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c14.entryFee);
        System.out.println("Opening Hours: " + c14.openingHours);

        Casino c15 = new Casino();
        c15.casinoName = "Crystal Club";
        c15.location = "Singapore";
        c15.totalGames = 80;
        c15.hasHotel = false;
        c15.hasRestaurant = true;
        c15.entryFee = 700.0;
        c15.openingHours = "1 PM - 12 AM";

        System.out.println("=== Casino 15 ===");
        System.out.println("Name: " + c15.casinoName);
        System.out.println("Location: " + c15.location);
        System.out.println("Total Games: " + c15.totalGames);
        System.out.println("Has Hotel: " + c15.hasHotel);
        System.out.println("Has Restaurant: " + c15.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c15.entryFee);
        System.out.println("Opening Hours: " + c15.openingHours);

        Casino c16 = new Casino();
        c16.casinoName = "Night Whale";
        c16.location = "Andaman";
        c16.totalGames = 30;
        c16.hasHotel = false;
        c16.hasRestaurant = false;
        c16.entryFee = 250.0;
        c16.openingHours = "6 PM - 11 PM";

        System.out.println("=== Casino 16 ===");
        System.out.println("Name: " + c16.casinoName);
        System.out.println("Location: " + c16.location);
        System.out.println("Total Games: " + c16.totalGames);
        System.out.println("Has Hotel: " + c16.hasHotel);
        System.out.println("Has Restaurant: " + c16.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c16.entryFee);
        System.out.println("Opening Hours: " + c16.openingHours);

        Casino c17 = new Casino();
        c17.casinoName = "Venom Wheel";
        c17.location = "Chennai";
        c17.totalGames = 90;
        c17.hasHotel = true;
        c17.hasRestaurant = true;
        c17.entryFee = 999.0;
        c17.openingHours = "7 PM - 5 AM";

        System.out.println("=== Casino 17 ===");
        System.out.println("Name: " + c17.casinoName);
        System.out.println("Location: " + c17.location);
        System.out.println("Total Games: " + c17.totalGames);
        System.out.println("Has Hotel: " + c17.hasHotel);
        System.out.println("Has Restaurant: " + c17.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c17.entryFee);
        System.out.println("Opening Hours: " + c17.openingHours);

        Casino c18 = new Casino();
        c18.casinoName = "Red Ruby";
        c18.location = "Dubai";
        c18.totalGames = 120;
        c18.hasHotel = true;
        c18.hasRestaurant = true;
        c18.entryFee = 1200.0;
        c18.openingHours = "3 PM - 3 AM";

        System.out.println("=== Casino 18 ===");
        System.out.println("Name: " + c18.casinoName);
        System.out.println("Location: " + c18.location);
        System.out.println("Total Games: " + c18.totalGames);
        System.out.println("Has Hotel: " + c18.hasHotel);
        System.out.println("Has Restaurant: " + c18.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c18.entryFee);
        System.out.println("Opening Hours: " + c18.openingHours);

        Casino c19 = new Casino();
        c19.casinoName = "Golden Hour";
        c19.location = "Pune";
        c19.totalGames = 60;
        c19.hasHotel = false;
        c19.hasRestaurant = true;
        c19.entryFee = 500.0;
        c19.openingHours = "5 PM - 1 AM";

        System.out.println("=== Casino 19 ===");
        System.out.println("Name: " + c19.casinoName);
        System.out.println("Location: " + c19.location);
        System.out.println("Total Games: " + c19.totalGames);
        System.out.println("Has Hotel: " + c19.hasHotel);
        System.out.println("Has Restaurant: " + c19.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c19.entryFee);
        System.out.println("Opening Hours: " + c19.openingHours);

        Casino c20 = new Casino();
        c20.casinoName = "Ocean Deck";
        c20.location = "Bali";
        c20.totalGames = 77;
        c20.hasHotel = true;
        c20.hasRestaurant = true;
        c20.entryFee = 899.0;
        c20.openingHours = "4 PM - 2 AM";

        System.out.println("=== Casino 20 ===");
        System.out.println("Name: " + c20.casinoName);
        System.out.println("Location: " + c20.location);
        System.out.println("Total Games: " + c20.totalGames);
        System.out.println("Has Hotel: " + c20.hasHotel);
        System.out.println("Has Restaurant: " + c20.hasRestaurant);
        System.out.println("Entry Fee: ₹" + c20.entryFee);
        System.out.println("Opening Hours: " + c20.openingHours);

        System.out.println("Main Ended");
    }
}

