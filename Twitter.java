class Twitter {
    static String username;
    static int tweets;
    static int followers;
    static String bio;
    static boolean verified;

    public static boolean createAccount(String uname, int tw, int foll, String b, boolean ver) {
        boolean isAccountCreated = false;
        boolean usernameValid = false;
        boolean tweetsValid = false;
        boolean followersValid = false;
        boolean bioValid = false;

        if (uname != null) {
            username = uname;
            usernameValid = true;
        } else {
            System.out.println("Enter valid username");
        }

        if (tw >= 0) {
            tweets = tw;
            tweetsValid = true;
        } else {
            System.out.println("Tweets must be non-negative");
        }

        if (foll >= 0) {
            followers = foll;
            followersValid = true;
        } else {
            System.out.println("Followers must be non-negative");
        }

        if (b != null) {
            bio = b;
            bioValid = true;
        } else {
            System.out.println("Enter valid bio");
        }

        verified = ver;

        if (usernameValid && tweetsValid && followersValid && bioValid) {
            isAccountCreated = true;
        } else {
            System.out.println("Twitter account not created");
        }

        return isAccountCreated;
    }

    public static void getAccountInfo() {
        System.out.println("Username: " + username);
        System.out.println("Tweets: " + tweets);
        System.out.println("Followers: " + followers);
        System.out.println("Bio: " + bio);
        System.out.println("Verified: " + verified);
    }
}
