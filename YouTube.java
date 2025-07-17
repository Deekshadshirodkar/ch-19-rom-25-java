class YouTube {
    static String channelName;
    static String category;
    static String owner;
    static String email;
    static int subscribers;

    public static boolean createChannel(String chName, String cat, String own, String mail, int subs) {
        boolean isChannelCreated = false;
        boolean channelNameValid = false;
        boolean categoryValid = false;
        boolean ownerValid = false;
        boolean emailValid = false;
        boolean subscribersValid = false;

        if (chName != null) {
            channelName = chName;
            channelNameValid = true;
        } else {
            System.out.println("Please provide a valid channel name");
        }

        if (cat != null) {
            category = cat;
            categoryValid = true;
        } else {
            System.out.println("Please provide a valid category");
        }

        if (own != null) {
            owner = own;
            ownerValid = true;
        } else {
            System.out.println("Please provide a valid owner");
        }

        if (mail != null) {
            email = mail;
            emailValid = true;
        } else {
            System.out.println("Please provide a valid email");
        }

        if (subs >= 0) {
            subscribers = subs;
            subscribersValid = true;
        } else {
            System.out.println("Subscribers cannot be negative");
        }

        if (channelNameValid && categoryValid && ownerValid && emailValid && subscribersValid) {
            isChannelCreated = true;
        } else {
            System.out.println("Channel could not be created");
        }

        return isChannelCreated;
    }

    public static void getChannelInfo() {
        System.out.println("The channel name is " + channelName);
        System.out.println("The category is " + category);
        System.out.println("The owner is " + owner);
        System.out.println("The email is " + email);
        System.out.println("The subscriber count is " + subscribers);
    }
}
