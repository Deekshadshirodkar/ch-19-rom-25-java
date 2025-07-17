class Amazon {
    static String sellerName;
    static String productType;
    static String warehouseLocation;
    static String contactNumber;
    static double rating;

    public static boolean createSeller(String name, String type, String location, String contact, double rate) {
        boolean isSellerCreated = false;
        boolean sellerNameValid = false;
        boolean productTypeValid = false;
        boolean locationValid = false;
        boolean contactValid = false;
        boolean ratingValid = false;

        if (name != null) {
            sellerName = name;
            sellerNameValid = true;
        } else {
            System.out.println("Provide valid seller name");
        }

        if (type != null) {
            productType = type;
            productTypeValid = true;
        } else {
            System.out.println("Provide valid product type");
        }

        if (location != null) {
            warehouseLocation = location;
            locationValid = true;
        } else {
            System.out.println("Provide valid warehouse location");
        }

        if (contact != null) {
            contactNumber = contact;
            contactValid = true;
        } else {
            System.out.println("Provide valid contact number");
        }

        if (rate >= 0) {
            rating = rate;
            ratingValid = true;
        } else {
            System.out.println("Rating should be non-negative");
        }

        if (sellerNameValid && productTypeValid && locationValid && contactValid && ratingValid) {
            isSellerCreated = true;
        } else {
            System.out.println("Seller could not be created");
        }

        return isSellerCreated;
    }

    public static void getSellerInfo() {
        System.out.println("The seller name is " + sellerName);
        System.out.println("The product type is " + productType);
        System.out.println("The warehouse location is " + warehouseLocation);
        System.out.println("The contact number is " + contactNumber);
        System.out.println("The rating is " + rating);
    }
}
