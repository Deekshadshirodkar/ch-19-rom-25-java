class Instagram {
    static String handle;
    static int followers;
    static String email;
    static String category;
    static boolean verified;

    public static boolean createAccount(String h, int f, String em, String cat, boolean ver) {
        boolean isAccountCreated = false;
        boolean handleValid = false;
        boolean followersValid = false;
        boolean emailValid = false;
        boolean categoryValid = false;

        if (h != null) {
            handle = h;
            handleValid = true;
        } else {
            System.out.println("Enter valid handle");
        }

        if (f >= 0) {
            followers = f;
            followersValid = true;
        } else {
            System.out.println("Followers can't be negative");
        }

        if (em != null) {
            email = em;
            emailValid = true;
        } else {
            System.out.println("Enter valid email");
        }

        if (cat != null) {
            category = cat;
            categoryValid = true;
        } else {
            System.out.println("Enter valid category");
        }

        verified = ver;

        if (handleValid && followersValid && emailValid && categoryValid) {
            isAccountCreated = true;
        } else {
            System.out.println("Instagram account not created");
        }

        return isAccountCreated;
    }

    public static void getAccountInfo() {
        System.out.println("Handle: " + handle);
        System.out.println("Followers: " + followers);
        System.out.println("Email: " + email);
        System.out.println("Category: " + category);
        System.out.println("Verified: " + verified);
    }
}
