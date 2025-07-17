class TwitterRunner {
	
    public static void main(String[] args) {
		
        boolean isAccountCreated = Twitter.createAccount("coderX", 320, 1500, "Code daily. Ship weekly.", true);
        System.out.println("Is Twitter Account Created: " + isAccountCreated);

        if (isAccountCreated) {
            Twitter.getAccountInfo();
        }
    }
}
