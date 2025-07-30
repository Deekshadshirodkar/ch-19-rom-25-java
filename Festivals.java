class Festivals {
	
	Festivals(){
		System.out.println("Festivals Constructor Invoked");
		
	}
	
	Festivals(int festivalId, String name, String country, String religion, String month, boolean isPublicHoliday, String specialFood){
		System.out.println("Festival Parameterized Constructor Invoked");
		this.festivalId = festivalId;
		this.name = name;
		this.country = country;
		this.religion = religion;
		this.month = month;
		this.isPublicHoliday = isPublicHoliday;

		this.specialFood = specialFood;
	}
	
    int festivalId;
    String name;
    String country;
    String religion;
    String month;
    boolean isPublicHoliday;
    String specialFood;

    public void getFestivalsInfo() {
		
        System.out.println("Festival ID: " + festivalId);
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Religion: " + religion);
        System.out.println("Month: " + month);
        System.out.println("Public Holiday: " + isPublicHoliday);
        System.out.println("Special Food: " + specialFood);
    }
}
