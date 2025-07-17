class Zomato {
    static String restaurantName;
    static String city;
    static double rating;
    static String ownerName;
    static String licenseNo;

    public static boolean registerRestaurant(String name, String ct, double rt, String owner, String lic) {
        boolean isRestaurantRegistered = false;
        boolean nameValid = false;
        boolean cityValid = false;
        boolean ratingValid = false;
        boolean ownerValid = false;
        boolean licenseValid = false;

        if (name != null) {
            restaurantName = name;
            nameValid = true;
        } else {
            System.out.println("Enter valid restaurant name");
        }

        if (ct != null) {
            city = ct;
            cityValid = true;
        } else {
            System.out.println("Enter valid city");
        }

        if (rt >= 0) {
            rating = rt;
            ratingValid = true;
        } else {
            System.out.println("Rating must be non-negative");
        }

        if (owner != null) {
            ownerName = owner;
            ownerValid = true;
        } else {
            System.out.println("Enter valid owner name");
        }

        if (lic != null) {
            licenseNo = lic;
            licenseValid = true;
        } else {
            System.out.println("Enter valid license number");
        }

        if (nameValid && cityValid && ratingValid && ownerValid && licenseValid) {
            isRestaurantRegistered = true;
        } else {
            System.out.println("Restaurant registration failed");
        }

        return isRestaurantRegistered;
    }

    public static void getRestaurantInfo() {
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("City: " + city);
        System.out.println("Rating: " + rating);
        System.out.println("Owner: " + ownerName);
        System.out.println("License Number: " + licenseNo);
    }
}
