class LinkedInRunner {
	
    public static void main(String[] args) {
		
        boolean isProfileCreated = LinkedIn.createProfile("Neha Sharma", "Software Developer", "Infosys", "4 years", "neha@li.com");
        System.out.println("Is LinkedIn Profile Created: " + isProfileCreated);

        if (isProfileCreated) {
            LinkedIn.getProfileInfo();
        }
    }
}
