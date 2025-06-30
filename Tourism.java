class Tourism {

    
    public static void main(String[] touristplaces) {

	String historicalPlaces[] = { "Taj Mahal", "Red Fort", "Qutub Minar", "Fatehpur Sikri", "Charminar", "Hampi", "Sanchi Stupa", "Konark Sun Temple", "Gateway of India", "Ajanta Caves" };
    String hillStations[] = { "Shimla", "Manali", "Darjeeling", "Nainital", "Ooty", "Munnar", "Kodaikanal", "Gulmarg", "Mussoorie", "Mount Abu" };
    String beaches[] = { "Goa", "Marina Beach", "Kovalam", "Varkala", "Radhanagar Beach", "Juhu Beach", "Gokarna", "Baga Beach", "Puri Beach", "Tarkarli" };
    String wildlifeSanctuaries[] = { "Jim Corbett", "Kaziranga", "Ranthambore", "Sundarbans", "Bandipur", "Gir National Park", "Periyar", "Kanha", "Bandhavgarh", "Pench" };
    String religiousPlaces[] = { "Vaishno Devi", "Golden Temple", "Meenakshi Temple", "Somnath Temple", "Kashi Vishwanath", "Tirupati Balaji", "Jagannath Temple", "Shirdi", "Ajmer Sharif", "Basilica of Bom Jesus" };
    String desertDestinations[] = { "Jaisalmer", "Bikaner", "Pushkar", "Barmer", "Thar Desert", "Osian", "Nagaur", "Mandawa", "Khimsar", "Deshnok" };
    String adventureSpots[] = { "Rishikesh", "Auli", "Leh-Ladakh", "Andaman Islands", "Rohtang Pass", "Bir Billing", "Spiti Valley", "Zanskar", "Tawang", "Coorg" };
    String romanticPlaces[] = { "Udaipur", "Alleppey", "Andaman & Nicobar", "Coorg", "Manali", "Goa", "Munnar", "Jaipur", "Ranikhet", "Lonavala" };
    String heritageSites[] = { "Khajuraho", "Hampi", "Mahabalipuram", "Sanchi", "Elephanta Caves", "Chola Temples", "Rani ki Vav", "Nalanda", "Pattadakal", "Champaner" };
    String modernCities[] = { "Mumbai", "Delhi", "Bangalore", "Hyderabad", "Chennai", "Pune", "Ahmedabad", "Kolkata", "Chandigarh", "Noida" };
    String northIndia[] = { "Amritsar", "Shimla", "Manali", "Rishikesh", "Agra", "Delhi", "Jaipur", "Varanasi", "Haridwar", "Ladakh" };
    String southIndia[] = { "Mysore", "Hampi", "Coorg", "Madurai", "Chennai", "Pondicherry", "Munnar", "Alleppey", "Ooty", "Kanyakumari" };
    String northEastIndia[] = { "Gangtok", "Shillong", "Tawang", "Cherrapunji", "Kaziranga", "Majuli", "Ziro Valley", "Aizawl", "Imphal", "Agartala" };
    String islands[] = { "Andaman Islands", "Nicobar Islands", "Lakshadweep", "Havelock Island", "Neil Island", "Minicoy", "Kalpeni", "Bangaram", "Kavaratti", "Agatti" };
    String offbeatDestinations[] = { "Spiti Valley", "Tawang", "Ziro", "Chopta", "Majuli", "Gokarna", "Shoja", "Mawlynnong", "Valparai", "Dzukou Valley" };

	System.out.println("Historical Places: ");
	for(String historicalPlace : historicalPlaces){
		System.out.println(historicalPlace);
		
	}
	
	System.out.println("Hill Stations : ");
	for(String hillStation : hillStations){
		System.out.println(hillStation);
		
	}
	
	System.out.println("Beaches : ");
	for(String beach : beaches){
		System.out.println(beach);
		
	}
	
	System.out.println("Wildlife Sanctuaries:");
	for(String wildlifeSanctuary : wildlifeSanctuaries){
		System.out.println(wildlifeSanctuary);
		
	}
	
	System.out.println("Religious Places :");
	for(String religiousPlace : religiousPlaces){
		System.out.println(religiousPlace);
		
	}
	
	System.out.println("Desert Destinations : ");
	for(String desertDestination : desertDestinations){
		System.out.println(desertDestination);
		
	}
	
	System.out.println("Adventure Spots: ");
	for(String adventureSpot : adventureSpots){
		System.out.println(adventureSpot);
		
	}
	
	System.out.println("Romantic Places :");
	for(String romanticPlace : romanticPlaces){
		System.out.println(romanticPlace);
		
	}
	
	System.out.println("Heritage Sites:");
	for(String heritageSite : heritageSites){
		System.out.println(heritageSite);
		
	}
	
	System.out.println("Modern Cities: " );
	for(String modernCity : modernCities){
		System.out.println(modernCity);
		
	}
	
	System.out.println("NorthIndia: ");
	for(String northIndias : northIndia){
		System.out.println(northIndias);
		
	}
	
	System.out.println("SouthIndia: ");
	for(String southIndias : southIndia){
		System.out.println(southIndias);
		
	}
	
	System.out.println("northEastIndia :");
	for(String northEastIndias : northEastIndia){
		System.out.println(northEastIndias);
		
	}
	
	System.out.println("Islands: ");
	for(String island : islands){
		System.out.println(island);
		
	}
	
	System.out.println("Offbeat Destinations : ");
	for(String offbeatDestination : offbeatDestinations){
		System.out.println(offbeatDestination);
		
	}
	
	
        /*System.out.println("Historical Places: " + historicalPlaces[0] + ", " + historicalPlaces[1] + ", " + historicalPlaces[2] + ", " + historicalPlaces[3] + ", " + historicalPlaces[4] + ", " + historicalPlaces[5] + ", " + historicalPlaces[6] + ", " + historicalPlaces[7] + ", " + historicalPlaces[8] + ", " + historicalPlaces[9]);

        System.out.println("Hill Stations: " + hillStations[0] + ", " + hillStations[1] + ", " + hillStations[2] + ", " + hillStations[3] + ", " + hillStations[4] + ", " + hillStations[5] + ", " + hillStations[6] + ", " + hillStations[7] + ", " + hillStations[8] + ", " + hillStations[9]);

        System.out.println("Beaches: " + beaches[0] + ", " + beaches[1] + ", " + beaches[2] + ", " + beaches[3] + ", " + beaches[4] + ", " + beaches[5] + ", " + beaches[6] + ", " + beaches[7] + ", " + beaches[8] + ", " + beaches[9]);

        System.out.println("Wildlife Sanctuaries: " + wildlifeSanctuaries[0] + ", " + wildlifeSanctuaries[1] + ", " + wildlifeSanctuaries[2] + ", " + wildlifeSanctuaries[3] + ", " + wildlifeSanctuaries[4] + ", " + wildlifeSanctuaries[5] + ", " + wildlifeSanctuaries[6] + ", " + wildlifeSanctuaries[7] + ", " + wildlifeSanctuaries[8] + ", " + wildlifeSanctuaries[9]);

        System.out.println("Religious Places: " + religiousPlaces[0] + ", " + religiousPlaces[1] + ", " + religiousPlaces[2] + ", " + religiousPlaces[3] + ", " + religiousPlaces[4] + ", " + religiousPlaces[5] + ", " + religiousPlaces[6] + ", " + religiousPlaces[7] + ", " + religiousPlaces[8] + ", " + religiousPlaces[9]);

        System.out.println("Desert Destinations: " + desertDestinations[0] + ", " + desertDestinations[1] + ", " + desertDestinations[2] + ", " + desertDestinations[3] + ", " + desertDestinations[4] + ", " + desertDestinations[5] + ", " + desertDestinations[6] + ", " + desertDestinations[7] + ", " + desertDestinations[8] + ", " + desertDestinations[9]);

        System.out.println("Adventure Spots: " + adventureSpots[0] + ", " + adventureSpots[1] + ", " + adventureSpots[2] + ", " + adventureSpots[3] + ", " + adventureSpots[4] + ", " + adventureSpots[5] + ", " + adventureSpots[6] + ", " + adventureSpots[7] + ", " + adventureSpots[8] + ", " + adventureSpots[9]);

        System.out.println("Romantic Places: " + romanticPlaces[0] + ", " + romanticPlaces[1] + ", " + romanticPlaces[2] + ", " + romanticPlaces[3] + ", " + romanticPlaces[4] + ", " + romanticPlaces[5] + ", " + romanticPlaces[6] + ", " + romanticPlaces[7] + ", " + romanticPlaces[8] + ", " + romanticPlaces[9]);

        System.out.println("Heritage Sites: " + heritageSites[0] + ", " + heritageSites[1] + ", " + heritageSites[2] + ", " + heritageSites[3] + ", " + heritageSites[4] + ", " + heritageSites[5] + ", " + heritageSites[6] + ", " + heritageSites[7] + ", " + heritageSites[8] + ", " + heritageSites[9]);

        System.out.println("Modern Cities: " + modernCities[0] + ", " + modernCities[1] + ", " + modernCities[2] + ", " + modernCities[3] + ", " + modernCities[4] + ", " + modernCities[5] + ", " + modernCities[6] + ", " + modernCities[7] + ", " + modernCities[8] + ", " + modernCities[9]);

        System.out.println("North India: " + northIndia[0] + ", " + northIndia[1] + ", " + northIndia[2] + ", " + northIndia[3] + ", " + northIndia[4] + ", " + northIndia[5] + ", " + northIndia[6] + ", " + northIndia[7] + ", " + northIndia[8] + ", " + northIndia[9]);

        System.out.println("South India: " + southIndia[0] + ", " + southIndia[1] + ", " + southIndia[2] + ", " + southIndia[3] + ", " + southIndia[4] + ", " + southIndia[5] + ", " + southIndia[6] + ", " + southIndia[7] + ", " + southIndia[8] + ", " + southIndia[9]);

        System.out.println("North-East India: " + northEastIndia[0] + ", " + northEastIndia[1] + ", " + northEastIndia[2] + ", " + northEastIndia[3] + ", " + northEastIndia[4] + ", " + northEastIndia[5] + ", " + northEastIndia[6] + ", " + northEastIndia[7] + ", " + northEastIndia[8] + ", " + northEastIndia[9]);

        System.out.println("Islands: " + islands[0] + ", " + islands[1] + ", " + islands[2] + ", " + islands[3] + ", " + islands[4] + ", " + islands[5] + ", " + islands[6] + ", " + islands[7] + ", " + islands[8] + ", " + islands[9]);

        System.out.println("Offbeat Destinations: " + offbeatDestinations[0] + ", " + offbeatDestinations[1] + ", " + offbeatDestinations[2] + ", " + offbeatDestinations[3] + ", " + offbeatDestinations[4] + ", " + offbeatDestinations[5] + ", " + offbeatDestinations[6] + ", " + offbeatDestinations[7] + ", " + offbeatDestinations[8] + ", " + offbeatDestinations[9]);
		*/
	}
}
