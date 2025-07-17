class Flipkart {
    static String sellerID;
    static String category;
    static String warehouse;
    static String location;
    static double rating;

    public static boolean registerSeller(String id, String cat, String ware, String loc, double rate) {
        boolean isSellerRegistered = false;
        boolean idValid = false;
        boolean catValid = false;
        boolean wareValid = false;
        boolean locValid = false;
        boolean rateValid = false;

        if (id != null) {
            sellerID = id;
            idValid = true;
        } else {
            System.out.println("Enter valid seller ID");
        }

        if (cat != null) {
            category = cat;
            catValid = true;
        } else {
            System.out.println("Enter valid category");
        }

        if (ware != null) {
            warehouse = ware;
            wareValid = true;
        } else {
            System.out.println("Enter valid warehouse");
        }

        if (loc != null) {
            location = loc;
            locValid = true;
        } else {
            System.out.println("Enter valid location");
        }

        if (rate >= 0) {
            rating = rate;
            rateValid = true;
        } else {
            System.out.println("Rating must be non-negative");
        }

        if (idValid && catValid && wareValid && locValid && rateValid) {
            isSellerRegistered = true;
        } else {
            System.out.println("Flipkart seller not registered");
        }

        return isSellerRegistered;
    }

    public static void getSellerInfo() {
        System.out.println("Seller ID: " + sellerID);
        System.out.println("Category: " + category);
        System.out.println("Warehouse: " + warehouse);
        System.out.println("Location: " + location);
        System.out.println("Rating: " + rating);
    }
}
