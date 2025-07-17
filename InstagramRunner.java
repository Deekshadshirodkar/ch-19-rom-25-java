class InstagramRunner {
	
    public static void main(String[] args) {
		
        boolean isAccountCreated = Instagram.createAccount("art_corner", 12000, "artist@insta.com", "Art", true);
        System.out.println("Is Instagram Account Created: " + isAccountCreated);

        if (isAccountCreated) {
            Instagram.getAccountInfo();
        }
    }
}
