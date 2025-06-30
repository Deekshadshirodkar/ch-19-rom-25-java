class Satellite{
	
	static String name;
	static int satelliteId;
	static Integer launchyear;
	static String launchDate;
	static String operator;
	static String country;
	static String launchVehicle;
	static int orbitPeriod;
	static String orbitType;
	static int altitude;
	static double mass;
	static String dimension;
	static int powerOutput;
	static String powerSource;
	static Short code;
	static int designLife;
	static Byte signalstrength;
	static Boolean isActive;
	static Character grade;
	static String communicationBand;
	
	
	
	
	public static void main(String Orbit[])
	{
		System.out.println("Satellite Name : " +name);
		System.out.println("SatelliteId :" +satelliteId);
		System.out.println("Launch Year is: " +launchyear);
		System.out.println("Launched Date is: " +launchDate);
		System.out.println("Launched by : "+operator);
		System.out.println("country of origin : " +country);
		System.out.println("Launch Vehicle is: " +launchVehicle);
		System.out.println("Orbit Period : " +orbitPeriod + "hours");
		System.out.println("Orbit Type : " +orbitType);
		System.out.println("Altitude : " +altitude + "km ");
		System.out.println("Mass of the Satellite: " +mass+ "kg");
		System.out.println("Dimension of the Satellite: " +dimension);
		System.out.println("Power output " +powerOutput+"watts");
		System.out.println("Power Source " +powerSource);
		System.out.println("Code :" +code);
		System.out.println("Design Life : " +designLife + "years");
		System.out.println("Signal Streingth: " +signalstrength);
		System.out.println("Is Satellite Active :" +isActive);
		System.out.println("Grade: " +grade);
		System.out.println("Communication Band : " +communicationBand);
	
		
		String name="INSAT-3D";
		int satelliteId = 39199;
		Integer launchyear=2025;
		String launchDate = "July 26, 2013";
		String operator = "ISRO";
		String country ="India";
		String launchVehicle = "Ariane 5";
		int orbitPeriod = 24;
		String orbitType = "Geostationary Orbit";
		int altitude = 35786;
		double mass=2060.00;
		String dimension = "2.0 m × 1.8 m × 3.2 m";
		int powerOutput = 1600;
		String powerSource = "Solar Panel";
		Short code=123;
		int designLife = 10;
		Byte signalstrength=99;
		Boolean isActive=true;
		Character grade='A';
		String communicationBand = "C-band, Ku-band";
	
	
	
		System.out.println(name);
		System.out.println(satelliteId);
		System.out.println(launchyear);
		System.out.println(launchDate);
		System.out.println(operator);
		System.out.println(country);
		System.out.println(launchVehicle);
		System.out.println(orbitPeriod);
		System.out.println(orbitType);
		System.out.println(altitude);
		System.out.println(mass);
		System.out.println(dimension);
		System.out.println(powerOutput);
		System.out.println(powerSource);
		System.out.println(code);
		System.out.println(designLife);
		System.out.println(signalstrength);
		System.out.println(isActive);
		System.out.println(grade);
		System.out.println(communicationBand);
	
		
	}
}
		