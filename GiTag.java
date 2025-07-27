class GiTag {
	
	
    String productName;
    String category;
    String state;
    String registeredDate;
    boolean isHandicraft;
    String uniqueCode;

    public void getGiTagInfo() {
		
        System.out.println("Product: " + productName);
        System.out.println("Category: " + category);
        System.out.println("State: " + state);
        System.out.println("Date: " + registeredDate);
        System.out.println("Handicraft: " + isHandicraft);
        System.out.println("Code: " + uniqueCode);
    }
}