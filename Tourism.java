class Tourism {

    /*static String tajMahal = "Taj Mahal";
    static String redFort = "Red Fort";
    static String qutubMinar = "Qutub Minar";
    static String fatehpurSikri = "Fatehpur Sikri";
    static String charminar = "Charminar";
    static String hampi = "Hampi";
    static String sanchiStupa = "Sanchi Stupa";
    static String konark = "Konark Sun Temple";
    static String gateway = "Gateway of India";
    static String ajantaCaves = "Ajanta Caves";
    static String historicalPlaces[] = {tajMahal, redFort, qutubMinar, fatehpurSikri, charminar, hampi, sanchiStupa, konark, gateway, ajantaCaves};

    static String shimla = "Shimla";
    static String manali = "Manali";
    static String darjeeling = "Darjeeling";
    static String nainital = "Nainital";
    static String ooty = "Ooty";
    static String munnar = "Munnar";
    static String kodaikanal = "Kodaikanal";
    static String gulmarg = "Gulmarg";
    static String mussoorie = "Mussoorie";
    static String mountAbu = "Mount Abu";
    static String hillStations[] = {shimla, manali, darjeeling, nainital, ooty, munnar, kodaikanal, gulmarg, mussoorie, mountAbu};

    static String goa = "Goa";
    static String marina = "Marina Beach";
    static String kovalam = "Kovalam";
    static String varkala = "Varkala";
    static String radhanagar = "Radhanagar Beach";
    static String juhu = "Juhu Beach";
    static String gokarna = "Gokarna";
    static String baga = "Baga Beach";
    static String puri = "Puri Beach";
    static String tarkarli = "Tarkarli";
    static String beaches[] = {goa, marina, kovalam, varkala, radhanagar, juhu, gokarna, baga, puri, tarkarli};

    static String corbett = "Jim Corbett";
    static String kaziranga = "Kaziranga";
    static String ranthambore = "Ranthambore";
    static String sundarbans = "Sundarbans";
    static String bandipur = "Bandipur";
    static String gir = "Gir National Park";
    static String periyar = "Periyar";
    static String kanha = "Kanha";
    static String bandhavgarh = "Bandhavgarh";
    static String pench = "Pench";
    static String wildlifeSanctuaries[] = {corbett, kaziranga, ranthambore, sundarbans, bandipur, gir, periyar, kanha, bandhavgarh, pench};

    static String vaishno = "Vaishno Devi";
    static String golden = "Golden Temple";
    static String meenakshi = "Meenakshi Temple";
    static String somnath = "Somnath Temple";
    static String kashi = "Kashi Vishwanath";
    static String tirupati = "Tirupati Balaji";
    static String jagannath = "Jagannath Temple";
    static String shirdi = "Shirdi";
    static String ajmer = "Ajmer Sharif";
    static String basilica = "Basilica of Bom Jesus";
    static String religiousPlaces[] = {vaishno, golden, meenakshi, somnath, kashi, tirupati, jagannath, shirdi, ajmer, basilica};

    static String jaisalmer = "Jaisalmer";
    static String bikaner = "Bikaner";
    static String pushkar = "Pushkar";
    static String barmer = "Barmer";
    static String thar = "Thar Desert";
    static String osian = "Osian";
    static String nagaur = "Nagaur";
    static String mandawa = "Mandawa";
    static String khimsar = "Khimsar";
    static String deshnok = "Deshnok";
    static String desertDestinations[] = {jaisalmer, bikaner, pushkar, barmer, thar, osian, nagaur, mandawa, khimsar, deshnok};

    static String rishikesh = "Rishikesh";
    static String auli = "Auli";
    static String leh = "Leh-Ladakh";
    static String andaman = "Andaman Islands";
    static String rohtang = "Rohtang Pass";
    static String bir = "Bir Billing";
    static String spiti = "Spiti Valley";
    static String zanskar = "Zanskar";
    static String tawang = "Tawang";
    static String coorg = "Coorg";
    static String adventureSpots[] = {rishikesh, auli, leh, andaman, rohtang, bir, spiti, zanskar, tawang, coorg};

    static String udaipur = "Udaipur";
    static String alleppey = "Alleppey";
    static String andamanNicobar = "Andaman & Nicobar";
    static String manaliAgain = "Manali";
    static String goaAgain = "Goa";
    static String munnarAgain = "Munnar";
    static String jaipur = "Jaipur";
    static String ranikhet = "Ranikhet";
    static String lonavala = "Lonavala";
    static String romanticPlaces[] = {udaipur, alleppey, andamanNicobar, coorg, manaliAgain, goaAgain, munnarAgain, jaipur, ranikhet, lonavala};

    static String khajuraho = "Khajuraho";
    static String mahabalipuram = "Mahabalipuram";
    static String elephanta = "Elephanta Caves";
    static String chola = "Chola Temples";
    static String raniVav = "Rani ki Vav";
    static String nalanda = "Nalanda";
    static String pattadakal = "Pattadakal";
    static String champaner = "Champaner";
    static String heritageSites[] = {khajuraho, hampi, mahabalipuram, sanchiStupa, elephanta, chola, raniVav, nalanda, pattadakal, champaner};

    static String mumbai = "Mumbai";
    static String delhi = "Delhi";
    static String bangalore = "Bangalore";
    static String hyderabad = "Hyderabad";
    static String chennai = "Chennai";
    static String pune = "Pune";
    static String ahmedabad = "Ahmedabad";
    static String kolkata = "Kolkata";
    static String chandigarh = "Chandigarh";
    static String noida = "Noida";
    static String modernCities[] = {mumbai, delhi, bangalore, hyderabad, chennai, pune, ahmedabad, kolkata, chandigarh, noida};

    static String amritsar = "Amritsar";
    static String agra = "Agra";
    static String varanasi = "Varanasi";
    static String haridwar = "Haridwar";
    static String ladakh = "Ladakh";
    static String northIndia[] = {amritsar, shimla, manali, rishikesh, agra, delhi, jaipur, varanasi, haridwar, ladakh};

    static String mysore = "Mysore";
    static String madurai = "Madurai";
    static String pondicherry = "Pondicherry";
    static String kanyakumari = "Kanyakumari";
    static String southIndia[] = {mysore, hampi, coorg, madurai, chennai, pondicherry, munnar, alleppey, ooty, kanyakumari};

    static String gangtok = "Gangtok";
    static String shillong = "Shillong";
    static String cherrapunji = "Cherrapunji";
    static String majuli = "Majuli";
    static String ziro = "Ziro Valley";
    static String aizawl = "Aizawl";
    static String imphal = "Imphal";
    static String agartala = "Agartala";
    static String northEastIndia[] = {gangtok, shillong, tawang, cherrapunji, kaziranga, majuli, ziro, aizawl, imphal, agartala};

    static String nicobar = "Nicobar Islands";
    static String lakshadweep = "Lakshadweep";
    static String havelock = "Havelock Island";
    static String neil = "Neil Island";
    static String minicoy = "Minicoy";
    static String kalpeni = "Kalpeni";
    static String bangaram = "Bangaram";
    static String kavaratti = "Kavaratti";
    static String agatti = "Agatti";
    static String islands[] = {andaman, nicobar, lakshadweep, havelock, neil, minicoy, kalpeni, bangaram, kavaratti, agatti};

    static String chopta = "Chopta";
    static String shoja = "Shoja";
    static String mawlynnong = "Mawlynnong";
    static String valparai = "Valparai";
    static String dzukou = "Dzukou Valley";
    static String offbeatDestinations[] = {spiti, tawang, ziro, chopta, majuli, gokarna, shoja, mawlynnong, valparai, dzukou};
	*/

    public static void main(String[] touristplaces) {

		String tajMahal = "Taj Mahal";
        String redFort = "Red Fort";
        String qutubMinar = "Qutub Minar";
        String fatehpurSikri = "Fatehpur Sikri";
        String charminar = "Charminar";
        String hampi = "Hampi";
        String sanchiStupa = "Sanchi Stupa";
        String konark = "Konark Sun Temple";
        String gateway = "Gateway of India";
        String ajantaCaves = "Ajanta Caves";
        String historicalPlaces[] = {tajMahal, redFort, qutubMinar, fatehpurSikri, charminar, hampi, sanchiStupa, konark, gateway, ajantaCaves};

        String shimla = "Shimla";
        String manali = "Manali";
        String darjeeling = "Darjeeling";
        String nainital = "Nainital";
        String ooty = "Ooty";
        String munnar = "Munnar";
        String kodaikanal = "Kodaikanal";
        String gulmarg = "Gulmarg";
        String mussoorie = "Mussoorie";
        String mountAbu = "Mount Abu";
        String hillStations[] = {shimla, manali, darjeeling, nainital, ooty, munnar, kodaikanal, gulmarg, mussoorie, mountAbu};

		String goa = "Goa";
        String marina = "Marina Beach";
        String kovalam = "Kovalam";
        String varkala = "Varkala";
        String radhanagar = "Radhanagar Beach";
        String juhu = "Juhu Beach";
        String gokarna = "Gokarna";
        String baga = "Baga Beach";
        String puri = "Puri Beach";
        String tarkarli = "Tarkarli";
        String beaches[] = {goa, marina, kovalam, varkala, radhanagar, juhu, gokarna, baga, puri, tarkarli};

        String corbett = "Jim Corbett";
        String kaziranga = "Kaziranga";
        String ranthambore = "Ranthambore";
        String sundarbans = "Sundarbans";
        String bandipur = "Bandipur";
        String gir = "Gir National Park";
        String periyar = "Periyar";
        String kanha = "Kanha";
        String bandhavgarh = "Bandhavgarh";
        String pench = "Pench";
        String wildlifeSanctuaries[] = {corbett, kaziranga, ranthambore, sundarbans, bandipur, gir, periyar, kanha, bandhavgarh, pench};

        String vaishno = "Vaishno Devi";
        String golden = "Golden Temple";
        String meenakshi = "Meenakshi Temple";
        String somnath = "Somnath Temple";
        String kashi = "Kashi Vishwanath";
        String tirupati = "Tirupati Balaji";
        String jagannath = "Jagannath Temple";
        String shirdi = "Shirdi";
        String ajmer = "Ajmer Sharif";
        String basilica = "Basilica of Bom Jesus";
        String religiousPlaces[] = {vaishno, golden, meenakshi, somnath, kashi, tirupati, jagannath, shirdi, ajmer, basilica};

        String jaisalmer = "Jaisalmer";
        String bikaner = "Bikaner";
        String pushkar = "Pushkar";
        String barmer = "Barmer";
        String thar = "Thar Desert";
        String osian = "Osian";
        String nagaur = "Nagaur";
        String mandawa = "Mandawa";
        String khimsar = "Khimsar";
        String deshnok = "Deshnok";
        String desertDestinations[] = {jaisalmer, bikaner, pushkar, barmer, thar, osian, nagaur, mandawa, khimsar, deshnok};

        String rishikesh = "Rishikesh";
        String auli = "Auli";
        String leh = "Leh-Ladakh";
        String andaman = "Andaman Islands";
        String rohtang = "Rohtang Pass";
        String bir = "Bir Billing";
        String spiti = "Spiti Valley";
        String zanskar = "Zanskar";
        String tawang = "Tawang";
        String coorg = "Coorg";
        String adventureSpots[] = {rishikesh, auli, leh, andaman, rohtang, bir, spiti, zanskar, tawang, coorg};

        String udaipur = "Udaipur";
        String alleppey = "Alleppey";
        String andamanNicobar = "Andaman & Nicobar";
        String manaliAgain = "Manali";
        String goaAgain = "Goa";
        String munnarAgain = "Munnar";
        String jaipur = "Jaipur";
        String ranikhet = "Ranikhet";
        String lonavala = "Lonavala";
        String romanticPlaces[] = {udaipur, alleppey, andamanNicobar, coorg, manaliAgain, goaAgain, munnarAgain, jaipur, ranikhet, lonavala};

        String khajuraho = "Khajuraho";
        String mahabalipuram = "Mahabalipuram";
        String elephanta = "Elephanta Caves";
        String chola = "Chola Temples";
        String raniVav = "Rani ki Vav";
        String nalanda = "Nalanda";
        String pattadakal = "Pattadakal";
        String champaner = "Champaner";
        String heritageSites[] = {khajuraho, hampi, mahabalipuram, sanchiStupa, elephanta, chola, raniVav, nalanda, pattadakal, champaner};

        String mumbai = "Mumbai";
        String delhi = "Delhi";
        String bangalore = "Bangalore";
        String hyderabad = "Hyderabad";
        String chennai = "Chennai";
        String pune = "Pune";
        String ahmedabad = "Ahmedabad";
        String kolkata = "Kolkata";
        String chandigarh = "Chandigarh";
        String noida = "Noida";
        String modernCities[] = {mumbai, delhi, bangalore, hyderabad, chennai, pune, ahmedabad, kolkata, chandigarh, noida};

        String amritsar = "Amritsar";
        String agra = "Agra";
        String varanasi = "Varanasi";
        String haridwar = "Haridwar";
        String ladakh = "Ladakh";
        String northIndia[] = {amritsar, shimla, manali, rishikesh, agra, delhi, jaipur, varanasi, haridwar, ladakh};

        String mysore = "Mysore";
        String madurai = "Madurai";
        String pondicherry = "Pondicherry";
        String kanyakumari = "Kanyakumari";
        String southIndia[] = {mysore, hampi, coorg, madurai, chennai, pondicherry, munnar, alleppey, ooty, kanyakumari};

        String gangtok = "Gangtok";
        String shillong = "Shillong";
        String cherrapunji = "Cherrapunji";
        String majuli = "Majuli";
        String ziro = "Ziro Valley";
        String aizawl = "Aizawl";
        String imphal = "Imphal";
        String agartala = "Agartala";
        String northEastIndia[] = {gangtok, shillong, tawang, cherrapunji, kaziranga, majuli, ziro, aizawl, imphal, agartala};

        String nicobar = "Nicobar Islands";
        String lakshadweep = "Lakshadweep";
        String havelock = "Havelock Island";
        String neil = "Neil Island";
        String minicoy = "Minicoy";
        String kalpeni = "Kalpeni";
        String bangaram = "Bangaram";
        String kavaratti = "Kavaratti";
        String agatti = "Agatti";
        String islands[] = {andaman, nicobar, lakshadweep, havelock, neil, minicoy, kalpeni, bangaram, kavaratti, agatti};

        String chopta = "Chopta";
        String shoja = "Shoja";
        String mawlynnong = "Mawlynnong";
        String valparai = "Valparai";
        String dzukou = "Dzukou Valley";
        String offbeatDestinations[] = {spiti, tawang, ziro, chopta, majuli, gokarna, shoja, mawlynnong, valparai, dzukou};


	System.out.println("Main Started" );
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
	
	System.out.println("Main Ended");
	
	
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
