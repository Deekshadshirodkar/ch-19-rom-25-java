class NetflixRunner {
	
    public static void main(String[] args) {
		
        boolean isProfileCreated = Netflix.createProfile("MyBinge", "Premium", "English", "Smart TV", "India");
        System.out.println("Is Netflix Profile Created: " + isProfileCreated);

        if (isProfileCreated) {
            Netflix.getProfileInfo();
        }
    }
}
