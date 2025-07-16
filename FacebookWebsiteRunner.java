class FacebookWebsiteRunner{

	public static void main(String[] args) {
		
        String login = FacebookWebsite.login("deeksha@gmail.com", "deeksha123");
		
        String loginOption = FacebookWebsite.login(9876543210L, "deeksha123");
    }
	
}