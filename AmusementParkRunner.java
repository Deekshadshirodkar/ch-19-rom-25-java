class AmusementParkRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        AmusementPark park1 = new AmusementPark();
        park1.parkName = "Wonderla";
        park1.location = "Bangalore";
        park1.numberOfRides = 50;
        park1.waterParkIncluded = true;
        park1.ticketPrice = 1300.0;
        park1.openingTime = "10:00 AM";
        park1.closingTime = "7:00 PM";
        System.out.println("=== Park 1 ===");
        park1.getAmusementParkInfo();

        AmusementPark park2 = new AmusementPark();
        park2.parkName = "Imagicaa";
        park2.location = "Mumbai";
        park2.numberOfRides = 40;
        park2.waterParkIncluded = true;
        park2.ticketPrice = 1500.0;
        park2.openingTime = "11:00 AM";
        park2.closingTime = "6:00 PM";
        System.out.println("=== Park 2 ===");
        park2.getAmusementParkInfo();

        AmusementPark park3 = new AmusementPark();
        park3.parkName = "Essel World";
        park3.location = "Mumbai";
        park3.numberOfRides = 30;
        park3.waterParkIncluded = false;
        park3.ticketPrice = 1200.0;
        park3.openingTime = "10:30 AM";
        park3.closingTime = "6:30 PM";
        System.out.println("=== Park 3 ===");
        park3.getAmusementParkInfo();

        AmusementPark park4 = new AmusementPark();
        park4.parkName = "Adventure Island";
        park4.location = "Delhi";
        park4.numberOfRides = 35;
        park4.waterParkIncluded = true;
        park4.ticketPrice = 1100.0;
        park4.openingTime = "11:00 AM";
        park4.closingTime = "8:00 PM";
        System.out.println("=== Park 4 ===");
        park4.getAmusementParkInfo();

        AmusementPark park5 = new AmusementPark();
        park5.parkName = "Nicco Park";
        park5.location = "Kolkata";
        park5.numberOfRides = 25;
        park5.waterParkIncluded = false;
        park5.ticketPrice = 950.0;
        park5.openingTime = "10:00 AM";
        park5.closingTime = "6:00 PM";
        System.out.println("=== Park 5 ===");
        park5.getAmusementParkInfo();

        AmusementPark park6 = new AmusementPark();
        park6.parkName = "Fun World";
        park6.location = "Bangalore";
        park6.numberOfRides = 20;
        park6.waterParkIncluded = false;
        park6.ticketPrice = 800.0;
        park6.openingTime = "9:30 AM";
        park6.closingTime = "5:30 PM";
        System.out.println("=== Park 6 ===");
        park6.getAmusementParkInfo();

        AmusementPark park7 = new AmusementPark();
        park7.parkName = "Wonder World";
        park7.location = "Chennai";
        park7.numberOfRides = 45;
        park7.waterParkIncluded = true;
        park7.ticketPrice = 1250.0;
        park7.openingTime = "10:00 AM";
        park7.closingTime = "7:30 PM";
        System.out.println("=== Park 7 ===");
        park7.getAmusementParkInfo();

        AmusementPark park8 = new AmusementPark();
        park8.parkName = "Magic Planet";
        park8.location = "Kerala";
        park8.numberOfRides = 18;
        park8.waterParkIncluded = false;
        park8.ticketPrice = 700.0;
        park8.openingTime = "9:00 AM";
        park8.closingTime = "5:00 PM";
        System.out.println("=== Park 8 ===");
        park8.getAmusementParkInfo();

        AmusementPark park9 = new AmusementPark();
        park9.parkName = "Thrill Land";
        park9.location = "Mumbai";
        park9.numberOfRides = 55;
        park9.waterParkIncluded = true;
        park9.ticketPrice = 1400.0;
        park9.openingTime = "10:00 AM";
        park9.closingTime = "8:00 PM";
        System.out.println("=== Park 9 ===");
        park9.getAmusementParkInfo();

        AmusementPark park10 = new AmusementPark();
        park10.parkName = "Wonderla";
        park10.location = "Hyderabad";
        park10.numberOfRides = 60;
        park10.waterParkIncluded = true;
        park10.ticketPrice = 1600.0;
        park10.openingTime = "11:00 AM";
        park10.closingTime = "7:00 PM";
        System.out.println("=== Park 10 ===");
        park10.getAmusementParkInfo();

        AmusementPark park11 = new AmusementPark();
        park11.parkName = "Speed World";
        park11.location = "Pune";
        park11.numberOfRides = 33;
        park11.waterParkIncluded = false;
        park11.ticketPrice = 950.0;
        park11.openingTime = "10:30 AM";
        park11.closingTime = "6:00 PM";
        System.out.println("=== Park 11 ===");
        park11.getAmusementParkInfo();

        AmusementPark park12 = new AmusementPark();
        park12.parkName = "Galaxy Park";
        park12.location = "Ahmedabad";
        park12.numberOfRides = 28;
        park12.waterParkIncluded = false;
        park12.ticketPrice = 850.0;
        park12.openingTime = "9:30 AM";
        park12.closingTime = "5:30 PM";
        System.out.println("=== Park 12 ===");
        park12.getAmusementParkInfo();

        AmusementPark park13 = new AmusementPark();
        park13.parkName = "Ocean Land";
        park13.location = "Goa";
        park13.numberOfRides = 30;
        park13.waterParkIncluded = true;
        park13.ticketPrice = 1350.0;
        park13.openingTime = "10:00 AM";
        park13.closingTime = "7:00 PM";
        System.out.println("=== Park 13 ===");
        park13.getAmusementParkInfo();

        AmusementPark park14 = new AmusementPark();
        park14.parkName = "Mega Fun";
        park14.location = "Delhi NCR";
        park14.numberOfRides = 45;
        park14.waterParkIncluded = true;
        park14.ticketPrice = 1500.0;
        park14.openingTime = "9:45 AM";
        park14.closingTime = "8:00 PM";
        System.out.println("=== Park 14 ===");
        park14.getAmusementParkInfo();

        AmusementPark park15 = new AmusementPark();
        park15.parkName = "Desert Springs";
        park15.location = "Jodhpur";
        park15.numberOfRides = 18;
        park15.waterParkIncluded = false;
        park15.ticketPrice = 800.0;
        park15.openingTime = "10:00 AM";
        park15.closingTime = "5:00 PM";
        System.out.println("=== Park 15 ===");
        park15.getAmusementParkInfo();

        AmusementPark park16 = new AmusementPark();
        park16.parkName = "Riverdale Rides";
        park16.location = "Ranchi";
        park16.numberOfRides = 22;
        park16.waterParkIncluded = false;
        park16.ticketPrice = 900.0;
        park16.openingTime = "9:00 AM";
        park16.closingTime = "6:00 PM";
        System.out.println("=== Park 16 ===");
        park16.getAmusementParkInfo();

        AmusementPark park17 = new AmusementPark();
        park17.parkName = "Sky High";
        park17.location = "Dehradun";
        park17.numberOfRides = 15;
        park17.waterParkIncluded = false;
        park17.ticketPrice = 750.0;
        park17.openingTime = "10:00 AM";
        park17.closingTime = "5:30 PM";
        System.out.println("=== Park 17 ===");
        park17.getAmusementParkInfo();

        AmusementPark park18 = new AmusementPark();
        park18.parkName = "Green Zone";
        park18.location = "Nagpur";
        park18.numberOfRides = 29;
        park18.waterParkIncluded = true;
        park18.ticketPrice = 1050.0;
        park18.openingTime = "10:00 AM";
        park18.closingTime = "6:00 PM";
        System.out.println("=== Park 18 ===");
        park18.getAmusementParkInfo();

        AmusementPark park19 = new AmusementPark();
        park19.parkName = "Crystal Fun Park";
        park19.location = "Indore";
        park19.numberOfRides = 38;
        park19.waterParkIncluded = true;
        park19.ticketPrice = 1180.0;
        park19.openingTime = "10:15 AM";
        park19.closingTime = "7:00 PM";
        System.out.println("=== Park 19 ===");
        park19.getAmusementParkInfo();

        AmusementPark park20 = new AmusementPark();
        park20.parkName = "Sunset Amusements";
        park20.location = "Udaipur";
        park20.numberOfRides = 21;
        park20.waterParkIncluded = false;
        park20.ticketPrice = 880.0;
        park20.openingTime = "10:00 AM";
        park20.closingTime = "6:30 PM";
        System.out.println("=== Park 20 ===");
        park20.getAmusementParkInfo();
    }
}
