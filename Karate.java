class Karate {

    

    Karate() {
        System.out.println("Karate Constructor Invoked");
    }

    Karate(int beltLevel, String studentName, String dojoName, String instructor, boolean isProfessional, String country, int yearsOfTraining) {
        System.out.println("Karate Parameterized Constructor Invoked");
        this.beltLevel = beltLevel;
        this.studentName = studentName;
        this.dojoName = dojoName;
        this.instructor = instructor;
        this.isProfessional = isProfessional;
        this.country = country;
        this.yearsOfTraining = yearsOfTraining;
    }

	int beltLevel;
    String studentName;
    String dojoName;
    String instructor;
    boolean isProfessional;
    String country;
    int yearsOfTraining;
	
	
    public void getKarateInfo() {
        System.out.println("Belt Level: " + beltLevel);
        System.out.println("Student Name: " + studentName);
        System.out.println("Dojo Name: " + dojoName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Is Professional: " + isProfessional);
        System.out.println("Country: " + country);
        System.out.println("Years of Training: " + yearsOfTraining);
    }
}

