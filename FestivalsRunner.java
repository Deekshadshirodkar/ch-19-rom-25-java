class FestivalsRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        		
        Festivals fest1 = new Festivals(1, "Diwali", "India", "Hindu", "October", true, "sweets");
        /*fest1.festivalId = 1;
        fest1.name = "Diwali";
        fest1.country = "India";
        fest1.religion = "Hindu";
        fest1.month = "October";
        fest1.isPublicHoliday = true;
        fest1.specialFood = "Sweets";*/
        System.out.println("=== Festival 1 ===");
        fest1.getFestivalsInfo();

		Festivals fest2 = new Festivals(2, "Christmas", "USA", "Christian", "December", true, "Cake");
        /*Festivals fest2 = new Festivals();
        fest2.festivalId = 2;
        fest2.name = "Christmas";
        fest2.country = "USA";
        fest2.religion = "Christian";
        fest2.month = "December";
        fest2.isPublicHoliday = true;
        fest2.specialFood = "Cake";*/
        System.out.println("=== Festival 2 ===");
        fest2.getFestivalsInfo();

		Festivals fest3 = new Festivals(3, "Eid", "Saudi Arabia", "Muslim", "April", true, "Biryani");
        
        /*Festivals fest3 = new Festivals();
        fest3.festivalId = 3;
        fest3.name = "Eid";
        fest3.country = "Saudi Arabia";
        fest3.religion = "Muslim";
        fest3.month = "April";
        fest3.isPublicHoliday = true;
        fest3.specialFood = "Biryani";*/
        System.out.println("=== Festival 3 ===");
        fest3.getFestivalsInfo();


        Festivals fest4 = new Festivals(4, "Holi", " India", "Hindu", "March", true, "Gujiya");

        /*Festivals fest4 = new Festivals();
        fest4.festivalId = 4;
        fest4.name = "Holi";
        fest4.country = "India";
        fest4.religion = "Hindu";
        fest4.month = "March";
        fest4.isPublicHoliday = true;
        fest4.specialFood = "Gujiya";*/
        System.out.println("=== Festival 4 ===");
        fest4.getFestivalsInfo();


        Festivals fest5 = new Festivals(5, "Thanksgiving","USA", "Secular", "November", true, "Roast Turkey");		
        /*Festivals fest5 = new Festivals();
        fest5.festivalId = 5;
        fest5.name = "Thanksgiving";
        fest5.country = "USA";
        fest5.religion = "Secular";
        fest5.month = "November";
        fest5.isPublicHoliday = true;
        fest5.specialFood = "Roast Turkey";*/
        System.out.println("=== Festival 5 ===");
        fest5.getFestivalsInfo();


		Festivals fest6 = new Festivals(6,"Pongal","India","Hindu", "January", true, "Sakkarai Pongal");
        /*Festivals fest6 = new Festivals();
        fest6.festivalId = 6;
        fest6.name = "Pongal";
        fest6.country = "India";
        fest6.religion = "Hindu";
        fest6.month = "January";
        fest6.isPublicHoliday = true;
        fest6.specialFood = "Sakkarai Pongal";*/
        System.out.println("=== Festival 6 ===");
        fest6.getFestivalsInfo();

		Festivals fest7 = new Festivals(7, "Easter", "Italy", "Christian", "April", true, "Lamb Roast");
        /*Festivals fest7 = new Festivals();
        fest7.festivalId = 7;
        fest7.name = "Easter";
        fest7.country = "Italy";
        fest7.religion = "Christian";
        fest7.month = "April";
        fest7.isPublicHoliday = true;
        fest7.specialFood = "Lamb Roast";*/
        System.out.println("=== Festival 7 ===");
        fest7.getFestivalsInfo();

		Festivals fest8 = new Festivals(8, "Vesak", "Sri Lanka", "Buddhist", "May", true, "Rice and Curry");
        /*Festivals fest8 = new Festivals();
        fest8.festivalId = 8;
        fest8.name = "Vesak";
        fest8.country = "Sri Lanka";
        fest8.religion = "Buddhist";
        fest8.month = "May";
        fest8.isPublicHoliday = true;
        fest8.specialFood = "Rice and Curry";*/
        System.out.println("=== Festival 8 ===");
        fest8.getFestivalsInfo();

		Festivals fest9 = new Festivals(9, "Hanukkah", "Israel", "Jewish", "December", false, "Latkes");
        /*Festivals fest9 = new Festivals();
        fest9.festivalId = 9;
        fest9.name = "Hanukkah";
        fest9.country = "Israel";
        fest9.religion = "Jewish";
        fest9.month = "December";
        fest9.isPublicHoliday = false;
        fest9.specialFood = "Latkes";*/
        System.out.println("=== Festival 9 ===");
        fest9.getFestivalsInfo();

		Festivals fest10 = new Festivals(10, "Onam", "India", "Hindu", "August", true, "Onam Sadya");
        /*Festivals fest10 = new Festivals();
        fest10.festivalId = 10;
        fest10.name = "Onam";
        fest10.country = "India";
        fest10.religion = "Hindu";
        fest10.month = "August";
        fest10.isPublicHoliday = true;
        fest10.specialFood = "Onam Sadya";*/
        System.out.println("=== Festival 10 ===");
        fest10.getFestivalsInfo();

		Festivals fest11 = new Festivals(11, "Durga Puja", "India", "Hindu", "October", true, "Khichuri");
        /*Festivals fest11 = new Festivals();
        fest11.festivalId = 11;
        fest11.name = "Durga Puja";
        fest11.country = "India";
        fest11.religion = "Hindu";
        fest11.month = "October";
        fest11.isPublicHoliday = true;
        fest11.specialFood = "Khichuri";*/
        System.out.println("=== Festival 11 ===");
        fest11.getFestivalsInfo();

		Festivals fest12 = new Festivals(12, "Bihu", "India", "Hindu", "April", true, "Pitha");
        /*Festivals fest12 = new Festivals();
        fest12.festivalId = 12;
        fest12.name = "Bihu";
        fest12.country = "India";
        fest12.religion = "Hindu";
        fest12.month = "April";
        fest12.isPublicHoliday = true;
        fest12.specialFood = "Pitha";*/
        System.out.println("=== Festival 12 ===");
        fest12.getFestivalsInfo();

		Festivals fest13 = new Festivals(13, "Lohri", "India", "Sikh", "January", true, "Rewri and Gajak");
        /*Festivals fest13 = new Festivals();
        fest13.festivalId = 13;
        fest13.name = "Lohri";
        fest13.country = "India";
        fest13.religion = "Sikh";
        fest13.month = "January";
        fest13.isPublicHoliday = true;
        fest13.specialFood = "Rewri and Gajak";*/
        System.out.println("=== Festival 13 ===");
        fest13.getFestivalsInfo();

		Festivals fest14 = new Festivals(14, "Navratri", "India", "Hindu", "October", false, "Falahari food");
        /*Festivals fest14 = new Festivals();
        fest14.festivalId = 14;
        fest14.name = "Navratri";
        fest14.country = "India";
        fest14.religion = "Hindu";
        fest14.month = "October";
        fest14.isPublicHoliday = false;
        fest14.specialFood = "Falahari food";*/
        System.out.println("=== Festival 14 ===");
        fest14.getFestivalsInfo();

		Festivals fest15 = new Festivals(15, "Ram Navami", "India", "Hindu", "April", true, "Halwa & Puri");
        /*Festivals fest15 = new Festivals();
        fest15.festivalId = 15;
        fest15.name = "Ram Navami";
        fest15.country = "India";
        fest15.religion = "Hindu";
        fest15.month = "April";
        fest15.isPublicHoliday = true;
        fest15.specialFood = "Halwa & Puri";*/
        System.out.println("=== Festival 15 ===");
        fest15.getFestivalsInfo();

		Festivals fest16 = new Festivals(16, "Raksha Bandhan", "India", "Hindu", "August", false, "Kaju Katli");
        /*Festivals fest16 = new Festivals();
        fest16.festivalId = 16;
        fest16.name = "Raksha Bandhan";
        fest16.country = "India";
        fest16.religion = "Hindu";
        fest16.month = "August";
        fest16.isPublicHoliday = false;
        fest16.specialFood = "Kaju Katli";*/
        System.out.println("=== Festival 16 ===");
        fest16.getFestivalsInfo();

		Festivals fest17 = new Festivals(17, "Mahavir Jayanti", "India", "Jain", "April", true, "Satvik Food");
        /*Festivals fest17 = new Festivals();
        fest17.festivalId = 17;
        fest17.name = "Mahavir Jayanti";
        fest17.country = "India";
        fest17.religion = "Jain";
        fest17.month = "April";
        fest17.isPublicHoliday = true;
        fest17.specialFood = "Satvik Food";*/
        System.out.println("=== Festival 17 ===");
        fest17.getFestivalsInfo();

		Festivals fest18 = new Festivals(18, "Gudi Padwa", "India", "Hindu", "March", true, "Puran Poli");
        /*Festivals fest18 = new Festivals();
        fest18.festivalId = 18;
        fest18.name = "Gudi Padwa";
        fest18.country = "India";
        fest18.religion = "Hindu";
        fest18.month = "March";
        fest18.isPublicHoliday = true;
        fest18.specialFood = "Puran Poli";*/
        System.out.println("=== Festival 18 ===");
        fest18.getFestivalsInfo();

		Festivals fest19 = new Festivals(19, "Karwa Chauth", "India", "Hindu", "November", false, "Sargi");
        /*Festivals fest19 = new Festivals();
        fest19.festivalId = 19;
        fest19.name = "Karwa Chauth";
        fest19.country = "India";
        fest19.religion = "Hindu";
        fest19.month = "November";
        fest19.isPublicHoliday = false;
        fest19.specialFood = "Sargi";*/
        System.out.println("=== Festival 19 ===");
        fest19.getFestivalsInfo();

		Festivals fest20 = new Festivals(20, "Guru Nanak Jayanti", "India", "Sikh", "November", true, "Langar");
        /*Festivals fest20 = new Festivals();
        fest20.festivalId = 20;
        fest20.name = "Guru Nanak Jayanti";
        fest20.country = "India";
        fest20.religion = "Sikh";
        fest20.month = "November";
        fest20.isPublicHoliday = true;
        fest20.specialFood = "Langar";*/
        System.out.println("=== Festival 20 ===");
        fest20.getFestivalsInfo();

        System.out.println("Main Ended");
    }
}
