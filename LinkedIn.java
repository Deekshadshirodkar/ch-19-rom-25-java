class LinkedIn {
    static String profileName;
    static String jobTitle;
    static String company;
    static String experience;
    static String email;

    public static boolean createProfile(String name, String job, String comp, String exp, String mail) {
        boolean isProfileCreated = false;
        boolean nameValid = false;
        boolean jobValid = false;
        boolean compValid = false;
        boolean expValid = false;
        boolean emailValid = false;

        if (name != null) {
            profileName = name;
            nameValid = true;
        } else {
            System.out.println("Enter valid profile name");
        }

        if (job != null) {
            jobTitle = job;
            jobValid = true;
        } else {
            System.out.println("Enter valid job title");
        }

        if (comp != null) {
            company = comp;
            compValid = true;
        } else {
            System.out.println("Enter valid company");
        }

        if (exp != null) {
            experience = exp;
            expValid = true;
        } else {
            System.out.println("Enter valid experience");
        }

        if (mail != null) {
            email = mail;
            emailValid = true;
        } else {
            System.out.println("Enter valid email");
        }

        if (nameValid && jobValid && compValid && expValid && emailValid) {
            isProfileCreated = true;
        } else {
            System.out.println("LinkedIn profile not created");
        }

        return isProfileCreated;
    }

    public static void getProfileInfo() {
        System.out.println("Profile Name: " + profileName);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company: " + company);
        System.out.println("Experience: " + experience);
        System.out.println("Email: " + email);
    }
}
