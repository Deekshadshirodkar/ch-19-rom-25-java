class FacebookWebsite {

    public static String login(String email, String password) {
		
        System.out.println("Facebook Login with Email & Password:");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Login process completed.\n");
		return "login";
    }

    public static String login(long phoneNumber, String password) {
		
        System.out.println("Facebook Login with Phone & Password:");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Password: " + password);
        System.out.println("Login process completed.\n");
		return "login";
    }

}