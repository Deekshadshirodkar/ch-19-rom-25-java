class TwitterWebsite {

    public static String login(String username, String password) {
		
        System.out.println("Twitter Login with Username & Password:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Login process completed.");
		return "login";
    }

    public static String login(String emailOrPhone) {
		
        System.out.println("Twitter Login with OTP sent to Email/Phone:");
        System.out.println("Email/Phone: " + emailOrPhone);
        System.out.println("Login process completed.");
		return "login";
    }
	
}