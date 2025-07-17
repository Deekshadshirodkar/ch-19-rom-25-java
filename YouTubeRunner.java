class YouTubeRunner {
	
    public static void main(String[] args) {
		
        boolean isChannelCreated = YouTube.createChannel("LearnWithMe", "Education", "Arun", "arun@yt.com", 50000);
        System.out.println("Is Channel Created: " + isChannelCreated);

        if (isChannelCreated) {
            YouTube.getChannelInfo();
        }
    }
}
