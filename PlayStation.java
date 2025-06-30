class PlayStation {

    
    public static void main(String[] games) {
	
	String actionGames[] = {"God of War", "Ghost of Tsushima", "Spider-Man", "Horizon Zero Dawn", "Infamous: Second Son","Returnal", "Ratchet & Clank: Rift Apart", "Devil May Cry 5", "Uncharted 4", "Control"};

    String adventureGames[] = {"The Last of Us Part II", "Red Dead Redemption 2", "Days Gone", "Death Stranding", "Life is Strange","Detroit: Become Human", "Assassin’s Creed Valhalla", "Final Fantasy XV", "Yakuza: Like a Dragon", "Alan Wake Remastered"};

    String shooterGames[] = {"Call of Duty: Modern Warfare II", "Battlefield V", "Destiny 2", "Far Cry 6", "Resident Evil Village","Metro Exodus", "Borderlands 3", "Rainbow Six Siege", "Doom Eternal", "Apex Legends"};

    String racingGames[] = {"Gran Turismo 7", "Need for Speed Heat", "F1 2021", "WRC 10", "Dirt 5","Hot Wheels Unleashed", "MotoGP 22", "Crash Team Racing", "Project CARS 3", "Assetto Corsa"};

    String sportsGames[] = {"FIFA 24", "NBA 2K24", "WWE 2K24", "MLB The Show 24", "eFootball 2024","Tony Hawk’s Pro Skater 1+2", "PGA Tour 2K23", "Madden NFL 24", "Tennis World Tour 2", "UFC 5"};

    String rpgGames[] = {"Elden Ring", "Final Fantasy VII Remake", "Cyberpunk 2077", "Persona 5 Royal", "Tales of Arise","Hogwarts Legacy", "Diablo IV", "Assassin's Creed Odyssey", "Scarlet Nexus", "Dragon Age: Inquisition"};

    String horrorGames[] = {"Resident Evil 4 Remake", "The Evil Within 2", "Until Dawn", "Little Nightmares II", "Dead by Daylight","Outlast 2", "The Dark Pictures: Man of Medan", "Martha Is Dead", "The Quarry", "Alien: Isolation"};

    String platformerGames[] = {"Sackboy: A Big Adventure", "Crash Bandicoot 4", "Spyro Reignited Trilogy", "Rayman Legends", "Knack 2","Cuphead", "LittleBigPlanet 3", "Astro’s Playroom", "Braid", "Oddworld: Soulstorm"};

    String fightingGames[] = {"Tekken 7", "Mortal Kombat 11", "Street Fighter 6", "Dragon Ball FighterZ", "Injustice 2","Guilty Gear Strive", "Dead or Alive 6", "BlazBlue: Cross Tag Battle", "One Punch Man", "JoJo's Bizarre Adventure"};

    String openWorldGames[] = {"Elden Ring", "GTA V", "Horizon Forbidden West", "Spider-Man: Miles Morales", "Red Dead Redemption 2","Assassin's Creed Valhalla", "Cyberpunk 2077", "Watch Dogs: Legion", "Dying Light 2", "Far Cry 6"};

	
	System.out.println("Action Games: ");
	for(String actionGame : actionGames){
		System.out.println(actionGame);
		
	}
	
	System.out.println("Adventure Games :");
	for(String adventureGame : adventureGames){
		System.out.println(adventureGame);
		
	}
	
	System.out.println("Shooter Games : ");
	for(String shooterGame : shooterGames){
		System.out.println(shooterGame);
		
	}
	
	System.out.println("Racing Games : ");
	for(String racingGame : racingGames){
		System.out.println(racingGame);
		
	}
	
	System.out.println("Sports Games :");
	for(String sportsGame : sportsGames){
		System.out.println(sportsGame);
		
	}
	
	System.out.println("RPG Games :");
	for(String rpgGame : rpgGames){
		System.out.println(rpgGame);
		
	}
	
	System.out.println("Horror Games : ");
	for(String horrorGame : horrorGames){
		System.out.println(horrorGame);
		
	}
	
	System.out.println("Platformer Games :");
	for(String platformerGame : platformerGames){
		System.out.println(platformerGame);
		
	}
	
	System.out.println("Fighting Games :");
	for(String fightingGame : fightingGames){
		System.out.println(fightingGame);
		
	}
	
	System.out.println("Open World Games : ");
	for(String openWorldGame : openWorldGames){
		System.out.println(openWorldGame);
		
	}
	
        /*System.out.println("Action Games: " + actionGames[0] + ", " + actionGames[1] + ", " + actionGames[2] + ", " + actionGames[3] + ", " + actionGames[4] + ", " + actionGames[5] + ", " + actionGames[6] + ", " + actionGames[7] + ", " + actionGames[8] + ", " + actionGames[9]);

        System.out.println("Adventure Games: " + adventureGames[0] + ", " + adventureGames[1] + ", " + adventureGames[2] + ", " + adventureGames[3] + ", " + adventureGames[4] + ", " + adventureGames[5] + ", " + adventureGames[6] + ", " + adventureGames[7] + ", " + adventureGames[8] + ", " + adventureGames[9]);

        System.out.println("Shooter Games: " + shooterGames[0] + ", " + shooterGames[1] + ", " + shooterGames[2] + ", " + shooterGames[3] + ", " + shooterGames[4] + ", " + shooterGames[5] + ", " + shooterGames[6] + ", " + shooterGames[7] + ", " + shooterGames[8] + ", " + shooterGames[9]);

        System.out.println("Racing Games: " + racingGames[0] + ", " + racingGames[1] + ", " + racingGames[2] + ", " + racingGames[3] + ", " + racingGames[4] + ", " + racingGames[5] + ", " + racingGames[6] + ", " + racingGames[7] + ", " + racingGames[8] + ", " + racingGames[9]);

        System.out.println("Sports Games: " + sportsGames[0] + ", " + sportsGames[1] + ", " + sportsGames[2] + ", " + sportsGames[3] + ", " + sportsGames[4] + ", " + sportsGames[5] + ", " + sportsGames[6] + ", " + sportsGames[7] + ", " + sportsGames[8] + ", " + sportsGames[9]);

		System.out.println("RPG Games: " + rpgGames[0] + ", " + rpgGames[1] + ", " + rpgGames[2] + ", " + rpgGames[3] + ", " + rpgGames[4] + ", " + rpgGames[5] + ", " + rpgGames[6] + ", " + rpgGames[7] + ", " + rpgGames[8] + ", " + rpgGames[9]);

        System.out.println("Horror Games: " + horrorGames[0] + ", " + horrorGames[1] + ", " + horrorGames[2] + ", " + horrorGames[3] + ", " + horrorGames[4] + ", " + horrorGames[5] + ", " + horrorGames[6] + ", " + horrorGames[7] + ", " + horrorGames[8] + ", " + horrorGames[9]);

        System.out.println("Platformer Games: " + platformerGames[0] + ", " + platformerGames[1] + ", " + platformerGames[2] + ", " + platformerGames[3] + ", " + platformerGames[4] + ", " + platformerGames[5] + ", " + platformerGames[6] + ", " + platformerGames[7] + ", " + platformerGames[8] + ", " + platformerGames[9]);

        System.out.println("Fighting Games: " + fightingGames[0] + ", " + fightingGames[1] + ", " + fightingGames[2] + ", " + fightingGames[3] + ", " + fightingGames[4] + ", " + fightingGames[5] + ", " + fightingGames[6] + ", " + fightingGames[7] + ", " + fightingGames[8] + ", " + fightingGames[9]);

        System.out.println("Open World Games: " + openWorldGames[0] + ", " + openWorldGames[1] + ", " + openWorldGames[2] + ", " + openWorldGames[3] + ", " + openWorldGames[4] + ", " + openWorldGames[5] + ", " + openWorldGames[6] + ", " + openWorldGames[7] + ", " + openWorldGames[8] + ", " + openWorldGames[9]);
		*/
	}
}
