class Netflix {
    static String profileName;
    static String planType;
    static String language;
    static String device;
    static String region;

    public static boolean createProfile(String name, String plan, String lang, String dev, String reg) {
        boolean isProfileCreated = false;
        boolean nameValid = false;
        boolean planValid = false;
        boolean langValid = false;
        boolean devValid = false;
        boolean regionValid = false;

        if (name != null) {
            profileName = name;
            nameValid = true;
        } else {
            System.out.println("Enter valid profile name");
        }

        if (plan != null) {
            planType = plan;
            planValid = true;
        } else {
            System.out.println("Enter valid plan type");
        }

        if (lang != null) {
            language = lang;
            langValid = true;
        } else {
            System.out.println("Enter valid language");
        }

        if (dev != null) {
            device = dev;
            devValid = true;
        } else {
            System.out.println("Enter valid device");
        }

        if (reg != null) {
            region = reg;
            regionValid = true;
        } else {
            System.out.println("Enter valid region");
        }

        if (nameValid && planValid && langValid && devValid && regionValid) {
            isProfileCreated = true;
        } else {
            System.out.println("Netflix profile not created");
        }

        return isProfileCreated;
    }

    public static void getProfileInfo() {
        System.out.println("Profile Name: " + profileName);
        System.out.println("Plan Type: " + planType);
        System.out.println("Language: " + language);
        System.out.println("Device: " + device);
        System.out.println("Region: " + region);
    }
}
