class AmazonWebsite {

    public static String login(String email, String password) {
		
        System.out.println("Amazon Login with Email & Password:");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Login process completed.\n");
		return "login";
    }

    public static String login(long phoneNumber, int otp) {
		
        System.out.println("Amazon Login with Phone & OTP:");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("OTP: " + otp);
        System.out.println("Login process completed.\n");
		return "login";
    }
}
