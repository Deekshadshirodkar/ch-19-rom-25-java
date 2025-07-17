class SpotifyRunner {
	
    public static void main(String[] args) {
		
        boolean isUserCreated = Spotify.createUser("music_maniac", "Premium", "USA", 24, "iOS");
        System.out.println("Is Spotify User Created: " + isUserCreated);

        if (isUserCreated) {
            Spotify.getUserInfo();
        }
    }
}
