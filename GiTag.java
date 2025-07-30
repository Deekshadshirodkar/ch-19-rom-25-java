class GiTag {

    GiTag() {
        System.out.println("GiTag Constructor Invoked");
    }

    GiTag(String productName, String category, String state, String registeredDate, boolean isHandicraft, String uniqueCode) {
        System.out.println("GiTag Parameterized Constructor Invoked");
        this.productName = productName;
        this.category = category;
        this.state = state;
        this.registeredDate = registeredDate;
        this.isHandicraft = isHandicraft;
        this.uniqueCode = uniqueCode;
    }

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