class CountryRunner{

	public static void main(String country[]){
	
		String CountryName  = "Saudi Arabia";
		int countryCode = Country.getCountryCode(CountryName);
		System.out.println("The Country Code of " + CountryName + " is " + countryCode);
		
	}
}