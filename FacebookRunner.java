class FacebookRunner {
	
    public static void main(String[] args) {
		
        boolean isProfileCreated = Facebook.createProfile("john_doe", 28, "john@fb.com", "Male", "9876543210");
        System.out.println("Is Profile Created: " + isProfileCreated);

        if (isProfileCreated) {
            Facebook.getProfileInfo();
        }
    }
}
