class InstagramWebsite {

    // Login using email/username and password
    public static String login(String userOrEmail, int password) {
	
        System.out.println("Login attempted using email/username and password.");
        System.out.println("Username/Email: " + userOrEmail);
        System.out.println("Password: " + password);
        return "login";
    }

    // Login using email/username and phone number
    public static String login(String userOrEmail, long phoneNumber) {
        System.out.println("Login attempted using email/username and phone number.");
        System.out.println("Username/Email: " + userOrEmail);
        System.out.println("Phone Number: " + phoneNumber);
        return "login";
    }
}