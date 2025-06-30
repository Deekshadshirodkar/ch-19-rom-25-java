class SolarSystem{

	static String systemName;
	static String starName;
    static int numberOfPlanets ;
	static String planets ;
	static String ringsPresent;
	static String habitablePlanet;
	static int dwarfPlanet;
    static double totalMass ;
    static float ageInBillions ;
	static float diameter ;
    static String gravitationalCenter ;
	static String artificialSatellite;
    static Short numberOfMoons ;
	static String asteroidBelt;
	static float asteroids ;
	static int noOfComets ;
    static byte numberOfStars ;
    static boolean hasAsteroidBelt ;
    static Character category ;
	static String galaxy;
	
	

	
	public static void main(String planet[])
	{
		System.out.println("System Name: " + systemName);
		System.out.println("Star Name : " + starName);
        System.out.println("Number of Planets: " + numberOfPlanets);
		System.out.println("Planets Name : " +planets);
		System.out.println("Planets which has rings : " +ringsPresent);
		System.out.println("Habitable Planet : " +habitablePlanet);
		System.out.println("Number of Dwarf Planets : " +dwarfPlanet);
        System.out.println("Total Mass: " + totalMass + " kg");
        System.out.println("Age: " + ageInBillions + " billion years");
		System.out.println("Diameter : " +diameter);
		System.out.println("Gravitational Center : " +gravitationalCenter);
		System.out.println("Artificial Satellite : " +artificialSatellite);
        System.out.println("Total Moons: " + numberOfMoons);
        System.out.println("Stars: " + numberOfStars);
		System.out.println("Asteroids : " +asteroids);
		System.out.println("Number of Comets : " + noOfComets);
        System.out.println("Has Asteroid Belt: " + hasAsteroidBelt);
		System.out.println("Asteroid belt : " +asteroidBelt);
        System.out.println("Category: " + category);
		System.out.println("Our home galaxy: " +galaxy);
		
		
		systemName = "Solar System";
		starName = "Sun";
		numberOfPlanets = 8;
		planets = "Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune";
		ringsPresent = "Jupiter, Saturn, Uranus, Neptune";
		habitablePlanet = "Earth";
		dwarfPlanet = 5;
		totalMass = 1.0014e30;
		ageInBillions = 4.6f;
		diameter = 287.46f;
		gravitationalCenter = "Near the sun";
		artificialSatellite = "Thousands (Earth orbit, Mars orbit, etc.)";
		numberOfMoons = 290;
		asteroidBelt = "Between Mars and Jupiter";
		asteroids = 1.1f;
		noOfComets = 3700;
		numberOfStars = 1;
		hasAsteroidBelt = true;
		category = 'G';
		galaxy="Milky Way";
		
		
		System.out.println(systemName);
		System.out.println(starName);
        System.out.println(numberOfPlanets);
		System.out.println(planets);
		System.out.println(ringsPresent);
		System.out.println(habitablePlanet);
		System.out.println(dwarfPlanet);
        System.out.println(totalMass);
        System.out.println(ageInBillions);
		System.out.println(diameter);
		System.out.println(gravitationalCenter);
		System.out.println(artificialSatellite);
        System.out.println(numberOfMoons);
        System.out.println(numberOfStars);
		System.out.println(asteroids);
		System.out.println(noOfComets);
        System.out.println(hasAsteroidBelt);
		System.out.println(asteroidBelt);
        System.out.println(category);
		System.out.println(galaxy);
	
	}
}