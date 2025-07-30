class CasinoRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Casino c1 = new Casino("Royal Palace", "Goa", 50, true, true, 1000.0, "24/7");
        System.out.println("=== Casino 1 ===");
        c1.getCasinoInfo();

        Casino c2 = new Casino("Neon Nights", "Las Vegas", 120, true, true, 0.0, "9 AM - 3 AM");
        System.out.println("=== Casino 2 ===");
        c2.getCasinoInfo();

        Casino c3 = new Casino("Ocean Luck", "Macau", 85, false, true, 500.0, "10 AM - 2 AM");
        System.out.println("=== Casino 3 ===");
        c3.getCasinoInfo();

        Casino c4 = new Casino("Desert Mirage", "Dubai", 95, true, false, 2000.0, "12 PM - 4 AM");
        System.out.println("=== Casino 4 ===");
        c4.getCasinoInfo();

        Casino c5 = new Casino("River Gold", "Singapore", 65, true, true, 750.0, "10 AM - 1 AM");
        System.out.println("=== Casino 5 ===");
        c5.getCasinoInfo();

        Casino c6 = new Casino("Star Spin", "Malaysia", 88, true, true, 650.0, "11 AM - 2 AM");
        System.out.println("=== Casino 6 ===");
        c6.getCasinoInfo();

        Casino c7 = new Casino("Gold Rush", "Nepal", 70, false, true, 400.0, "12 PM - 12 AM");
        System.out.println("=== Casino 7 ===");
        c7.getCasinoInfo();

        Casino c8 = new Casino("Jungle Spin", "Sri Lanka", 55, true, false, 300.0, "2 PM - 2 AM");
        System.out.println("=== Casino 8 ===");
        c8.getCasinoInfo();

        Casino c9 = new Casino("Lucky Dice", "Mumbai", 40, false, false, 200.0, "5 PM - 1 AM");
        System.out.println("=== Casino 9 ===");
        c9.getCasinoInfo();

        Casino c10 = new Casino("Thunder Jack", "Delhi", 60, true, false, 350.0, "6 PM - 3 AM");
        System.out.println("=== Casino 10 ===");
        c10.getCasinoInfo();

        Casino c11 = new Casino("Neon Nights", "Goa", 100, true, true, 850.0, "6 PM - 6 AM");
        System.out.println("=== Casino 11 ===");
        c11.getCasinoInfo();

        Casino c12 = new Casino("Pearl Palace", "Kolkata", 65, false, true, 450.0, "3 PM - 1 AM");
        System.out.println("=== Casino 12 ===");
        c12.getCasinoInfo();

        Casino c13 = new Casino("Silver Ace", "Hyderabad", 72, true, false, 500.0, "2 PM - 2 AM");
        System.out.println("=== Casino 13 ===");
        c13.getCasinoInfo();

        Casino c14 = new Casino("Dragon Fire", "Manila", 110, true, true, 950.0, "4 PM - 4 AM");
        System.out.println("=== Casino 14 ===");
        c14.getCasinoInfo();

        Casino c15 = new Casino("Crystal Club", "Singapore", 80, false, true, 700.0, "1 PM - 12 AM");
        System.out.println("=== Casino 15 ===");
        c15.getCasinoInfo();

        Casino c16 = new Casino("Night Whale", "Andaman", 30, false, false, 250.0, "6 PM - 11 PM");
        System.out.println("=== Casino 16 ===");
        c16.getCasinoInfo();

        Casino c17 = new Casino("Venom Wheel", "Chennai", 90, true, true, 999.0, "7 PM - 5 AM");
        System.out.println("=== Casino 17 ===");
        c17.getCasinoInfo();

        Casino c18 = new Casino("Red Ruby", "Dubai", 120, true, true, 1200.0, "3 PM - 3 AM");
        System.out.println("=== Casino 18 ===");
        c18.getCasinoInfo();

        Casino c19 = new Casino("Golden Hour", "Pune", 60, false, true, 500.0, "5 PM - 1 AM");
        System.out.println("=== Casino 19 ===");
        c19.getCasinoInfo();

        Casino c20 = new Casino("Ocean Deck", "Bali", 77, true, true, 899.0, "4 PM - 2 AM");
        System.out.println("=== Casino 20 ===");
        c20.getCasinoInfo();

        System.out.println("Main Ended");
    }
}


        /*Casino c1 = new Casino();
        c1.casinoName = "Royal Palace";
        c1.location = "Goa";
        c1.totalGames = 50;
        c1.hasHotel = true;
        c1.hasRestaurant = true;
        c1.entryFee = 1000.0;
        c1.openingHours = "24/7";
        System.out.println("=== Casino 1 ===");
        c1.getCasinoInfo();

        Casino c2 = new Casino();
        c2.casinoName = "Neon Nights";
        c2.location = "Las Vegas";
        c2.totalGames = 120;
        c2.hasHotel = true;
        c2.hasRestaurant = true;
        c2.entryFee = 0.0;
        c2.openingHours = "9 AM - 3 AM";
        System.out.println("=== Casino 2 ===");
        c2.getCasinoInfo();

        Casino c3 = new Casino();
        c3.casinoName = "Ocean Luck";
        c3.location = "Macau";
        c3.totalGames = 85;
        c3.hasHotel = false;
        c3.hasRestaurant = true;
        c3.entryFee = 500.0;
        c3.openingHours = "10 AM - 2 AM";
        System.out.println("=== Casino 3 ===");
        c3.getCasinoInfo();

        Casino c4 = new Casino();
        c4.casinoName = "Desert Mirage";
        c4.location = "Dubai";
        c4.totalGames = 95;
        c4.hasHotel = true;
        c4.hasRestaurant = false;
        c4.entryFee = 2000.0;
        c4.openingHours = "12 PM - 4 AM";
        System.out.println("=== Casino 4 ===");
        c4.getCasinoInfo();

        Casino c5 = new Casino();
        c5.casinoName = "River Gold";
        c5.location = "Singapore";
        c5.totalGames = 65;
        c5.hasHotel = true;
        c5.hasRestaurant = true;
        c5.entryFee = 750.0;
        c5.openingHours = "10 AM - 1 AM";
        System.out.println("=== Casino 5 ===");
        c5.getCasinoInfo();

        Casino c6 = new Casino();
        c6.casinoName = "Star Spin";
        c6.location = "Malaysia";
        c6.totalGames = 88;
        c6.hasHotel = true;
        c6.hasRestaurant = true;
        c6.entryFee = 650.0;
        c6.openingHours = "11 AM - 2 AM";
        System.out.println("=== Casino 6 ===");
        c6.getCasinoInfo();

        Casino c7 = new Casino();
        c7.casinoName = "Gold Rush";
        c7.location = "Nepal";
        c7.totalGames = 70;
        c7.hasHotel = false;
        c7.hasRestaurant = true;
        c7.entryFee = 400.0;
        c7.openingHours = "12 PM - 12 AM";
        System.out.println("=== Casino 7 ===");
        c7.getCasinoInfo();

        Casino c8 = new Casino();
        c8.casinoName = "Jungle Spin";
        c8.location = "Sri Lanka";
        c8.totalGames = 55;
        c8.hasHotel = true;
        c8.hasRestaurant = false;
        c8.entryFee = 300.0;
        c8.openingHours = "2 PM - 2 AM";
        System.out.println("=== Casino 8 ===");
        c8.getCasinoInfo();

        Casino c9 = new Casino();
        c9.casinoName = "Lucky Dice";
        c9.location = "Mumbai";
        c9.totalGames = 40;
        c9.hasHotel = false;
        c9.hasRestaurant = false;
        c9.entryFee = 200.0;
        c9.openingHours = "5 PM - 1 AM";
        System.out.println("=== Casino 9 ===");
        c9.getCasinoInfo();

        Casino c10 = new Casino();
        c10.casinoName = "Thunder Jack";
        c10.location = "Delhi";
        c10.totalGames = 60;
        c10.hasHotel = true;
        c10.hasRestaurant = false;
        c10.entryFee = 350.0;
        c10.openingHours = "6 PM - 3 AM";
        System.out.println("=== Casino 10 ===");
        c10.getCasinoInfo();

        Casino c11 = new Casino();
        c11.casinoName = "Neon Nights";
        c11.location = "Goa";
        c11.totalGames = 100;
        c11.hasHotel = true;
        c11.hasRestaurant = true;
        c11.entryFee = 850.0;
        c11.openingHours = "6 PM - 6 AM";
        System.out.println("=== Casino 11 ===");
        c11.getCasinoInfo();

        Casino c12 = new Casino();
        c12.casinoName = "Pearl Palace";
        c12.location = "Kolkata";
        c12.totalGames = 65;
        c12.hasHotel = false;
        c12.hasRestaurant = true;
        c12.entryFee = 450.0;
        c12.openingHours = "3 PM - 1 AM";
        System.out.println("=== Casino 12 ===");
        c12.getCasinoInfo();

        Casino c13 = new Casino();
        c13.casinoName = "Silver Ace";
        c13.location = "Hyderabad";
        c13.totalGames = 72;
        c13.hasHotel = true;
        c13.hasRestaurant = false;
        c13.entryFee = 500.0;
        c13.openingHours = "2 PM - 2 AM";
        System.out.println("=== Casino 13 ===");
        c13.getCasinoInfo();

        Casino c14 = new Casino();
        c14.casinoName = "Dragon Fire";
        c14.location = "Manila";
        c14.totalGames = 110;
        c14.hasHotel = true;
        c14.hasRestaurant = true;
        c14.entryFee = 950.0;
        c14.openingHours = "4 PM - 4 AM";
        System.out.println("=== Casino 14 ===");
        c14.getCasinoInfo();

        Casino c15 = new Casino();
        c15.casinoName = "Crystal Club";
        c15.location = "Singapore";
        c15.totalGames = 80;
        c15.hasHotel = false;
        c15.hasRestaurant = true;
        c15.entryFee = 700.0;
        c15.openingHours = "1 PM - 12 AM";
        System.out.println("=== Casino 15 ===");
        c15.getCasinoInfo();

        Casino c16 = new Casino();
        c16.casinoName = "Night Whale";
        c16.location = "Andaman";
        c16.totalGames = 30;
        c16.hasHotel = false;
        c16.hasRestaurant = false;
        c16.entryFee = 250.0;
        c16.openingHours = "6 PM - 11 PM";
        System.out.println("=== Casino 16 ===");
        c16.getCasinoInfo();

        Casino c17 = new Casino();
        c17.casinoName = "Venom Wheel";
        c17.location = "Chennai";
        c17.totalGames = 90;
        c17.hasHotel = true;
        c17.hasRestaurant = true;
        c17.entryFee = 999.0;
        c17.openingHours = "7 PM - 5 AM";
        System.out.println("=== Casino 17 ===");
        c17.getCasinoInfo();

        Casino c18 = new Casino();
        c18.casinoName = "Red Ruby";
        c18.location = "Dubai";
        c18.totalGames = 120;
        c18.hasHotel = true;
        c18.hasRestaurant = true;
        c18.entryFee = 1200.0;
        c18.openingHours = "3 PM - 3 AM";
        System.out.println("=== Casino 18 ===");
        c18.getCasinoInfo();

        Casino c19 = new Casino();
        c19.casinoName = "Golden Hour";
        c19.location = "Pune";
        c19.totalGames = 60;
        c19.hasHotel = false;
        c19.hasRestaurant = true;
        c19.entryFee = 500.0;
        c19.openingHours = "5 PM - 1 AM";
        System.out.println("=== Casino 19 ===");
        c19.getCasinoInfo();

        Casino c20 = new Casino();
        c20.casinoName = "Ocean Deck";
        c20.location = "Bali";
        c20.totalGames = 77;
        c20.hasHotel = true;
        c20.hasRestaurant = true;
        c20.entryFee = 899.0;
        c20.openingHours = "4 PM - 2 AM";
        System.out.println("=== Casino 20 ===");
        c20.getCasinoInfo();*/