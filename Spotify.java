class Spotify {
    static String userName;
    static String subscriptionType;
    static String country;
    static int age;
    static String device;

    public static boolean createUser(String name, String type, String cnt, int ag, String dev) {
        boolean isUserCreated = false;
        boolean nameValid = false;
        boolean typeValid = false;
        boolean countryValid = false;
        boolean ageValid = false;
        boolean deviceValid = false;

        if (name != null) {
            userName = name;
            nameValid = true;
        } else {
            System.out.println("Enter valid user name");
        }

        if (type != null) {
            subscriptionType = type;
            typeValid = true;
        } else {
            System.out.println("Enter valid subscription type");
        }

        if (cnt != null) {
            country = cnt;
            countryValid = true;
        } else {
            System.out.println("Enter valid country");
        }

        if (ag > 0) {
            age = ag;
            ageValid = true;
        } else {
            System.out.println("Age must be greater than 0");
        }

        if (dev != null) {
            device = dev;
            deviceValid = true;
        } else {
            System.out.println("Enter valid device");
        }

        if (nameValid && typeValid && countryValid && ageValid && deviceValid) {
            isUserCreated = true;
        } else {
            System.out.println("Spotify user not created");
        }

        return isUserCreated;
    }

    public static void getUserInfo() {
        System.out.println("User Name: " + userName);
        System.out.println("Subscription Type: " + subscriptionType);
        System.out.println("Country: " + country);
        System.out.println("Age: " + age);
        System.out.println("Device: " + device);
    }
}
