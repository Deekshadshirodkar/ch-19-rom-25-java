class Facebook {
    static String username;
    static int age;
    static String email;
    static String gender;
    static String phone;

    public static boolean createProfile(String uname, int a, String mail, String gen, String ph) {
        boolean isProfileCreated = false;
        boolean usernameValid = false;
        boolean ageValid = false;
        boolean emailValid = false;
        boolean genderValid = false;
        boolean phoneValid = false;

        if (uname != null) {
            username = uname;
            usernameValid = true;
        } else {
            System.out.println("Enter valid username");
        }

        if (a > 0) {
            age = a;
            ageValid = true;
        } else {
            System.out.println("Age must be positive");
        }

        if (mail != null) {
            email = mail;
            emailValid = true;
        } else {
            System.out.println("Enter valid email");
        }

        if (gen != null) {
            gender = gen;
            genderValid = true;
        } else {
            System.out.println("Enter valid gender");
        }

        if (ph != null) {
            phone = ph;
            phoneValid = true;
        } else {
            System.out.println("Enter valid phone number");
        }

        if (usernameValid && ageValid && emailValid && genderValid && phoneValid) {
            isProfileCreated = true;
        } else {
            System.out.println("Profile not created");
        }

        return isProfileCreated;
    }

    public static void getProfileInfo() {
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
    }
}
