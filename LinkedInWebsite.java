class LinkedInWebsite {

    public static String login(String email, String password) {
		
        System.out.println("LinkedIn Login with Email & Password:");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Login process completed.");
		return "login";
    }

    public static String login(long phoneNumber, int otp) {
		
        System.out.println("LinkedIn Login with Phone & OTP:");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("OTP: " + otp);
        System.out.println("Login process completed.");
		return "login";
    }
	
}