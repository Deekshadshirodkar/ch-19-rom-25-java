class Karate {
	
    int beltLevel;
    String studentName;
    String dojoName;
    String instructor;
    boolean isProfessional;
    String country;
    int yearsOfTraining;

    public void getKarateInfo() {
		
        System.out.println("Belt Level: " + beltLevel);
        System.out.println("Name: " + studentName);
        System.out.println("Dojo: " + dojoName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Professional: " + isProfessional);
        System.out.println("Country: " + country);
        System.out.println("Years of Training: " + yearsOfTraining);
    }
}
