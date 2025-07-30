class GiTagRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        GiTag tag1 = new GiTag("Mysore Silk", "Textile", "Karnataka", "01-01-2005", true, "KA-001");
		/*GiTag tag1 = new GiTag();
        tag1.productName = "Mysore Silk";
        tag1.category = "Textile";
        tag1.state = "Karnataka";
        tag1.registeredDate = "01-01-2005";
        tag1.isHandicraft = true;
        tag1.uniqueCode = "KA-001";*/
        System.out.println("=== GiTag 1 ===");
        tag1.getGiTagInfo();

        GiTag tag2 = new GiTag("Darjeeling Tea", "Agriculture", "West Bengal", "01-05-2004", false, "WB-001");
		/*GiTag tag2 = new GiTag();
        tag2.productName = "Darjeeling Tea";
        tag2.category = "Agriculture";
        tag2.state = "West Bengal";
        tag2.registeredDate = "01-05-2004";
        tag2.isHandicraft = false;
        tag2.uniqueCode = "WB-001";
        System.out.println("=== GiTag 2 ===");*/
        System.out.println("=== GiTag 2 ===");
        tag2.getGiTagInfo();

        GiTag tag3 = new GiTag("Alphonso Mango", "Fruit", "Maharashtra", "01-03-2006", false, "MH-002");
		/*GiTag tag3 = new GiTag();
        tag3.productName = "Alphonso Mango";
        tag3.category = "Fruit";
        tag3.state = "Maharashtra";
        tag3.registeredDate = "01-03-2006";
        tag3.isHandicraft = false;
        tag3.uniqueCode = "MH-002";*/
        System.out.println("=== GiTag 3 ===");
        tag3.getGiTagInfo();

        GiTag tag4 = new GiTag("Pochampally Ikat", "Textile", "Telangana", "01-11-2005", true, "TS-003");
		/*GiTag tag4 = new GiTag();
        tag4.productName = "Pochampally Ikat";
        tag4.category = "Textile";
        tag4.state = "Telangana";
        tag4.registeredDate = "01-11-2005";
        tag4.isHandicraft = true;
        tag4.uniqueCode = "TS-003";*/
        System.out.println("=== GiTag 4 ===");
        tag4.getGiTagInfo();

        GiTag tag5 = new GiTag("Kanchipuram Silk", "Textile", "Tamil Nadu", "01-08-2006", true, "TN-004");
		/*GiTag tag5 = new GiTag();
        tag5.productName = "Kanchipuram Silk";
        tag5.category = "Textile";
        tag5.state = "Tamil Nadu";
        tag5.registeredDate = "01-08-2006";
        tag5.isHandicraft = true;
        tag5.uniqueCode = "TN-004";*/
        System.out.println("=== GiTag 5 ===");
        tag5.getGiTagInfo();

        GiTag tag6 = new GiTag("Banarasi Saree", "Textile", "Uttar Pradesh", "01-02-2009", true, "UP-005");
		/*GiTag tag6 = new GiTag();
        tag6.productName = "Banarasi Saree";
        tag6.category = "Textile";
        tag6.state = "Uttar Pradesh";
        tag6.registeredDate = "01-02-2009";
        tag6.isHandicraft = true;
        tag6.uniqueCode = "UP-005";*/
        System.out.println("=== GiTag 6 ===");
        tag6.getGiTagInfo();

        GiTag tag7 = new GiTag("Nagpur Orange", "Fruit", "Maharashtra", "01-03-2010", false, "MH-006");
		/*GiTag tag7 = new GiTag();
        tag7.productName = "Nagpur Orange";
        tag7.category = "Fruit";
        tag7.state = "Maharashtra";
        tag7.registeredDate = "01-03-2010";
        tag7.isHandicraft = false;
        tag7.uniqueCode = "MH-006";*/
        System.out.println("=== GiTag 7 ===");
        tag7.getGiTagInfo();

        GiTag tag8 = new GiTag("Kashmir Pashmina", "Textile", "Jammu and Kashmir", "01-01-2008", true, "JK-007");
		/*GiTag tag8 = new GiTag();
        tag8.productName = "Kashmir Pashmina";
        tag8.category = "Textile";
        tag8.state = "Jammu and Kashmir";
        tag8.registeredDate = "01-01-2008";
        tag8.isHandicraft = true;
        tag8.uniqueCode = "JK-007";*/
        System.out.println("=== GiTag 8 ===");
        tag8.getGiTagInfo();

        GiTag tag9 = new GiTag("Thanjavur Painting", "Handicraft", "Tamil Nadu", "01-06-2007", true, "TN-008");
		/*GiTag tag9 = new GiTag();
        tag9.productName = "Thanjavur Painting";
        tag9.category = "Handicraft";
        tag9.state = "Tamil Nadu";
        tag9.registeredDate = "01-06-2007";
        tag9.isHandicraft = true;
        tag9.uniqueCode = "TN-008";*/
        System.out.println("=== GiTag 9 ===");
        tag9.getGiTagInfo();

        GiTag tag10 = new GiTag("Madhubani Paintings", "Handicraft", "Bihar", "01-04-2008", true, "BR-009");
		/*GiTag tag10 = new GiTag();
        tag10.productName = "Madhubani Paintings";
        tag10.category = "Handicraft";
        tag10.state = "Bihar";
        tag10.registeredDate = "01-04-2008";
        tag10.isHandicraft = true;
        tag10.uniqueCode = "BR-009";*/
        System.out.println("=== GiTag 10 ===");
        tag10.getGiTagInfo();

        GiTag tag11 = new GiTag("Blue Pottery", "Craft", "Rajasthan", "01-07-2007", true, "RJ-010");
		/*GiTag tag11 = new GiTag();
        tag11.productName = "Blue Pottery";
        tag11.category = "Craft";
        tag11.state = "Rajasthan";
        tag11.registeredDate = "01-07-2007";
        tag11.isHandicraft = true;
        tag11.uniqueCode = "RJ-010";*/
        System.out.println("=== GiTag 11 ===");
        tag11.getGiTagInfo();

        GiTag tag12 = new GiTag("Hyderabadi Haleem", "Food", "Telangana", "01-04-2010", false, "TS-011");
		/*GiTag tag12 = new GiTag();
        tag12.productName = "Hyderabadi Haleem";
        tag12.category = "Food";
        tag12.state = "Telangana";
        tag12.registeredDate = "01-04-2010";
        tag12.isHandicraft = false;
        tag12.uniqueCode = "TS-011";*/
        System.out.println("=== GiTag 12 ===");
        tag12.getGiTagInfo();

        GiTag tag13 = new GiTag("Kangra Tea", "Agriculture", "Himachal Pradesh", "01-01-2005", false, "HP-012");
		/*GiTag tag13 = new GiTag();
        tag13.productName = "Kangra Tea";
        tag13.category = "Agriculture";
        tag13.state = "Himachal Pradesh";
        tag13.registeredDate = "01-01-2005";
        tag13.isHandicraft = false;
        tag13.uniqueCode = "HP-012";*/
        System.out.println("=== GiTag 13 ===");
        tag13.getGiTagInfo();

        GiTag tag14 = new GiTag("Lucknow Chikan Craft", "Handicraft", "Uttar Pradesh", "01-02-2008", true, "UP-013");
		/*GiTag tag14 = new GiTag();
        tag14.productName = "Lucknow Chikan Craft";
        tag14.category = "Handicraft";
        tag14.state = "Uttar Pradesh";
        tag14.registeredDate = "01-02-2008";
        tag14.isHandicraft = true;
        tag14.uniqueCode = "UP-013";*/
        System.out.println("=== GiTag 14 ===");
        tag14.getGiTagInfo();

        GiTag tag15 = new GiTag("Bikaneri Bhujia", "Food", "Rajasthan", "01-01-2010", false, "RJ-014");
		/*GiTag tag15 = new GiTag();
        tag15.productName = "Bikaneri Bhujia";
        tag15.category = "Food";
        tag15.state = "Rajasthan";
        tag15.registeredDate = "01-01-2010";
        tag15.isHandicraft = false;
        tag15.uniqueCode = "RJ-014";*/
        System.out.println("=== GiTag 15 ===");
        tag15.getGiTagInfo();

        GiTag tag16 = new GiTag("Sanganeri Hand Block Print", "Handicraft", "Rajasthan", "01-03-2009", true, "RJ-015");
		/*GiTag tag16 = new GiTag();
		tag16.productName = "Sanganeri Hand Block Print";
        tag16.category = "Handicraft";
        tag16.state = "Rajasthan";
        tag16.registeredDate = "01-03-2009";
        tag16.isHandicraft = true;
        tag16.uniqueCode = "RJ-015";*/
        System.out.println("=== GiTag 16 ===");
        tag16.getGiTagInfo();

        GiTag tag17 = new GiTag("Tanjore Dolls", "Handicraft", "Tamil Nadu", "01-04-2007", true, "TN-016");
		/*GiTag tag17 = new GiTag();
        tag17.productName = "Tanjore Dolls";
        tag17.category = "Handicraft";
        tag17.state = "Tamil Nadu";
        tag17.registeredDate = "01-04-2007";
        tag17.isHandicraft = true;
        tag17.uniqueCode = "TN-016";*/
        System.out.println("=== GiTag 17 ===");
        tag17.getGiTagInfo();

        GiTag tag18 = new GiTag("Kolhapuri Chappal", "Footwear", "Maharashtra", "01-01-2005", true, "MH-017");
		/*GiTag tag18 = new GiTag();
        tag18.productName = "Kolhapuri Chappal";
        tag18.category = "Footwear";
        tag18.state = "Maharashtra";
        tag18.registeredDate = "01-01-2005";
        tag18.isHandicraft = true;
        tag18.uniqueCode = "MH-017";*/
        System.out.println("=== GiTag 18 ===");
        tag18.getGiTagInfo();

        GiTag tag19 = new GiTag("Channapatna Toys", "Toy", "Karnataka", "01-06-2006", true, "KA-018");
		/*GiTag tag19 = new GiTag();
        tag19.productName = "Channapatna Toys";
        tag19.category = "Toy";
        tag19.state = "Karnataka";
        tag19.registeredDate = "01-06-2006";
        tag19.isHandicraft = true;
        tag19.uniqueCode = "KA-018";*/
        System.out.println("=== GiTag 19 ===");
        tag19.getGiTagInfo();

        GiTag tag20 = new GiTag("Bastar Dhokra", "Metal Craft", "Chhattisgarh", "01-09-2011", true, "CG-019");
		 /*GiTag tag20 = new GiTag();
        tag20.productName = "Bastar Dhokra";
        tag20.category = "Metal Craft";
        tag20.state = "Chhattisgarh";
        tag20.registeredDate = "01-09-2011";
        tag20.isHandicraft = true;
        tag20.uniqueCode = "CG-019";*/
        System.out.println("=== GiTag 20 ===");
        tag20.getGiTagInfo();

        System.out.println("Main Ended");
    }
}
