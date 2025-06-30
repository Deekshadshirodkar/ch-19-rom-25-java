class IPL {

    
    public static void main(String[] teams) {	


		String teamNames[] = {"Chennai Super Kings", "Mumbai Indians", "Royal Challengers Bangalore","Kolkata Knight Riders", "Rajasthan Royals", "Sunrisers Hyderabad","Delhi Capitals", "Punjab Kings", "Lucknow Super Giants", "Gujarat Titans"};
		String cities[] = {"Chennai", "Mumbai", "Bangalore", "Kolkata", "Jaipur","Hyderabad", "Delhi", "Mohali", "Lucknow", "Ahmedabad"};
		String franchises[] = {"India Cements", "Reliance Industries", "United Spirits","Red Chillies Entertainment", "Royal Multisport Pvt. Ltd.","Sun TV Network", "GMR & JSW Group", "KPH Dream Cricket", "RPSG Group", "CVC Capital Partners"};
		String captains[] = {"Ruturaj Gaikwad", "Hardik Pandya", "Faf du Plessis","Shreyas Iyer", "Sanju Samson", "Pat Cummins","Rishabh Pant", "Shikhar Dhawan", "KL Rahul", "Shubman Gill"};
		String coaches[] = {"Stephen Fleming", "Mark Boucher", "Andy Flower","Chandrakant Pandit", "Kumar Sangakkara", "Daniel Vettori","Ricky Ponting", "Trevor Bayliss", "Justin Langer", "Ashish Nehra"};
		String stadiums[] = {"M. A. Chidambaram Stadium", "Wankhede Stadium", "M. Chinnaswamy Stadium","Eden Gardens", "Sawai Mansingh Stadium", "Rajiv Gandhi Intl. Stadium","Arun Jaitley Stadium", "IS Bindra Stadium", "BRSABV Ekana Stadium", "Narendra Modi Stadium"};
		String titlesWon[] = {"5", "5", "0", "2", "1", "1", "0", "0", "0", "1"};
		String jerseyColors[] = {"Yellow", "Blue", "Red", "Purple", "Pink", "Orange","Blue & Red", "Red", "Light Blue", "Aqua Blue"};
		String nicknames[] = {"CSK", "MI", "RCB", "KKR", "RR", "SRH", "DC", "PBKS", "LSG", "GT"};
		String establishedYears[] = {"2008", "2008", "2008", "2008", "2008", "2013", "2008", "2008", "2022", "2022"};

		
		System.out.println("Team Names: ");
		for(String teamName : teamNames){
				System.out.println(teamName);
		}
		
		System.out.println("Cities : ");
		for(String city : cities){
				System.out.println(city);
		}
		
		System.out.println("Franchises: " );
		for(String franchise : franchises){
				System.out.println(franchise);
		}
		
		System.out.println("Captains : ");
		for(String captain : captains){
				System.out.println(captain);
		}
		
		System.out.println("Coaches : ");
		for(String coach : coaches){
				System.out.println(coach);
		}
		
		System.out.println("Stadiums : " );
		for(String stadium : stadiums){
				System.out.println(stadium);
		}
		
		System.out.println("Titles Won: ");		
		for(String titlesWons : titlesWon){
				System.out.println(titlesWons);
		}
		
		System.out.println("Jersey Colors : ");
		for(String jerseyColor : jerseyColors){
				System.out.println(jerseyColor);
		}
		
		System.out.println("Nicknames : " );
		for(String nickname : nicknames){
				System.out.println(nickname);
		}
		
		System.out.println("Established Years: " );
		for(String establishedYear : establishedYears){
				System.out.println(establishedYear);
		}


        /*System.out.println("IPL Team Names: " + teamNames[0] + " , " + teamNames[1] + ", " + teamNames[2] + ", " + teamNames[3] + ", " + teamNames[4] + ", " + teamNames[5] + ", " + teamNames[6] + ", " + teamNames[7] + ", " + teamNames[8] + ", " + teamNames[9]);

        System.out.println("Cities: " + cities[0] + ", " + cities[1] + ", " + cities[2] + ", " + cities[3] + ", " + cities[4] + ", " + cities[5] + ", " + cities[6] + ", " + cities[7] + ", " + cities[8] + ", " + cities[9]);

        System.out.println("Franchise Owners: " + franchises[0] + ", " + franchises[1] + ", " + franchises[2] + ", " + franchises[3] + ", " + franchises[4] + ", " + franchises[5] + ", " + franchises[6] + ", " + franchises[7] + ", " + franchises[8] + ", " + franchises[9]);

        System.out.println("Captains: " + captains[0] + ", " + captains[1] + ", " + captains[2] + ", " + captains[3] + ", " + captains[4] + ", " + captains[5] + ", " + captains[6] + ", " + captains[7] + ", " + captains[8] + ", " + captains[9]);

        System.out.println("Coaches: " + coaches[0] + ", " + coaches[1] + ", " + coaches[2] + ", " + coaches[3] + ", " + coaches[4] + ", " + coaches[5] + ", " + coaches[6] + ", " + coaches[7] + ", " + coaches[8] + ", " + coaches[9]);

        System.out.println("Home Stadiums: " + stadiums[0] + ", " + stadiums[1] + ", " + stadiums[2] + ", " + stadiums[3] + ", " + stadiums[4] + ", " + stadiums[5] + ", " + stadiums[6] + ", " + stadiums[7] + ", " + stadiums[8] + ", " + stadiums[9]);

        System.out.println("Titles Won: " + titlesWon[0] + ", " + titlesWon[1] + ", " + titlesWon[2] + ", " + titlesWon[3] + ", " + titlesWon[4] + ", " + titlesWon[5] + ", " + titlesWon[6] + ", " + titlesWon[7] + ", " + titlesWon[8] + ", " + titlesWon[9]);

        System.out.println("Jersey Colors: " + jerseyColors[0] + ", " + jerseyColors[1] + ", " + jerseyColors[2] + ", " + jerseyColors[3] + ", " + jerseyColors[4] + ", " + jerseyColors[5] + ", " + jerseyColors[6] + ", " + jerseyColors[7] + ", " + jerseyColors[8] + ", " + jerseyColors[9]);

        System.out.println("Nicknames: " + nicknames[0] + ", " + nicknames[1] + ", " + nicknames[2] + ", " + nicknames[3] + ", " + nicknames[4] + ", " + nicknames[5] + ", " + nicknames[6] + ", " + nicknames[7] + ", " + nicknames[8] + ", " + nicknames[9]);

        System.out.println("Established Years: " + establishedYears[0] + ", " + establishedYears[1] + ", " + establishedYears[2] + ", " + establishedYears[3] + ", " + establishedYears[4] + ", " + establishedYears[5] + ", " + establishedYears[6] + ", " + establishedYears[7] + ", " + establishedYears[8] + ", " + establishedYears[9]);
    
		*/
	}
}
