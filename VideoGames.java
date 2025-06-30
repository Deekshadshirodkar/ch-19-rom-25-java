class VideoGames{

	static String title;
	static String developer;
    static Integer releaseYear;
	static String releaseDate;
    static Double rating;
    static int sizeInGB;
	static int price;
    static Long gameId;
    static Short numberOfLevels;
	static String gameType;
	static String platform;
	static String graphicsQuality;
	static String gameSettings;
    static Byte ageRating;
	static String gameFormat;
	static String multiplayerMode;
	static String operatingSystem;
    static Boolean isMultiplayer;
    static Character platformCode;
	
	
	
	
	public static void main(String play[])
	{
		System.out.println("Game Title: " + title);
		System.out.println("Developed by: " +developer);
        System.out.println("Release Year: " + releaseYear);
		System.out.println("Release Date: " + releaseDate);
        System.out.println("Rating: " + rating + " stars");
        System.out.println("Size: " + sizeInGB + " GB");
        System.out.println("Game ID: " + gameId);
		System.out.println("Price : " +price);
        System.out.println("Number of Levels: " + numberOfLevels);
		System.out.println("Game Type : " +gameType);
		System.out.println("Gaming platform : " +platform);
		System.out.println("Garaphics Quality : " +graphicsQuality);
		System.out.println("Game Settings: " + gameSettings);
        System.out.println("Age Rating: " + ageRating);
		System.out.println("Game Format : " +gameFormat);
        System.out.println("Multiplayer: " + isMultiplayer);
        System.out.println("Platform Code: " + platformCode);
		System.out.println("Operating System: " +operatingSystem);
		
		
		title = "God of War";
		developer = "Ankit Verma";
		releaseYear = 2023;
		releaseDate = "02-02-2023";
		rating = 4.7;
		sizeInGB = 8;
		price = 69000;
		gameId = 987654321L;
		numberOfLevels = 25;
		gameType = "Single-player, Multiplayer";
		platform = "PC, PlayStation, Mobile";
		graphicsQuality = "2D, 3D, 4K Support";
		gameSettings ="Audio, Graphics";
		ageRating = 16;
		gameFormat = "Digital / Physical";
		multiplayerMode = "Online/Offline/Local Co-op";
		operatingSystem = "Windows/macOS/Linux";
		isMultiplayer = true;
		platformCode = 'P';
	
	
	
	
		System.out.println(title);
		System.out.println(developer);
        System.out.println(releaseYear);
		System.out.println(releaseDate);
        System.out.println(rating);
        System.out.println(sizeInGB);
        System.out.println(gameId);
		System.out.println(price);
        System.out.println(numberOfLevels);
		System.out.println(gameType);
		System.out.println(platform);
		System.out.println(graphicsQuality);
		System.out.println(gameSettings);
        System.out.println(ageRating);
		System.out.println(gameFormat);
        System.out.println(isMultiplayer);
        System.out.println(platformCode);
		System.out.println(operatingSystem);

	}
}