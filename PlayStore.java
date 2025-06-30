class PlayStore {

    

    public static void main(String[] appnames) {

		String socialApps[] = {"Facebook", "Instagram", "Snapchat", "Twitter", "Threads","Reddit", "Telegram", "WhatsApp", "Messenger", "WeChat"};

		String entertainmentApps[] = {"Netflix", "Amazon Prime Video", "Hotstar", "YouTube", "MX Player","JioCinema", "Spotify", "ZEE5", "Voot", "SonyLIV"};

		String shoppingApps[] = {"Amazon", "Flipkart", "Myntra", "Snapdeal", "Meesho","Ajio", "Tata CLiQ", "Nykaa", "BigBasket", "JioMart"};

		String productivityApps[] = {"Google Keep", "Microsoft To Do", "Evernote", "Trello", "Notion","Zoom", "Google Calendar", "Slack", "Asana", "Google Docs"};

		String educationApps[] = {"BYJU'S", "Unacademy", "Vedantu", "Khan Academy", "Coursera","edX", "Duolingo", "Toppr", "Brainly", "WhiteHat Jr"};

		String financeApps[] = {"Google Pay", "PhonePe", "Paytm", "BHIM", "Cred","Groww", "Zerodha", "Upstox", "CoinSwitch", "Bajaj Finserv"};

		String healthApps[] = {"HealthifyMe", "MyFitnessPal", "Headspace", "Fittr", "Cure.fit","Nike Training Club", "Google Fit", "Doctor on Demand", "Apollo 247", "Practo"};

		String gamesApps[] = {"Candy Crush Saga", "Subway Surfers", "BGMI", "Free Fire", "Among Us","Clash of Clans", "Call of Duty Mobile", "8 Ball Pool", "PUBG New State", "Temple Run"};

		String travelApps[] = {"Google Maps", "Uber", "Ola", "MakeMyTrip", "IRCTC Rail Connect","RedBus", "Airbnb", "Booking.com", "Goibibo", "Yatra"};

		String toolsApps[] = {"Google Chrome", "ShareIt", "Xender", "Turbo VPN", "Files by Google","Cleaner - Phone Booster", "CamScanner", "MX ShareKaro", "RAR", "Speedtest by Ookla"};
	
		System.out.println("Social Apps: " );
		for(String socialApp : socialApps){
				System.out.println(socialApp);
		}
		
		System.out.println("Entertainment Apps : ");
		for(String entertainmentApp : entertainmentApps){
				System.out.println(entertainmentApp);
		}
		
		System.out.println("Shopping Apps :");
		for(String shoppingApp : shoppingApps){
				System.out.println(shoppingApp);
		}
		
		System.out.println("Productivity Apps :");
		for(String productivityApp : productivityApps){
				System.out.println(productivityApp);
		}
		
		System.out.println("Education Apps :");
		for(String educationApp : educationApps){
				System.out.println(educationApp);
		}
		
		System.out.println("Finance Apps :");
		for(String financeApp : financeApps){
				System.out.println(financeApp);
		}
		
		System.out.println("Health Apps: ");
		for(String healthApp : healthApps){
				System.out.println(healthApp);
		}
		
		System.out.println("Games Apps :");
		for(String gamesApp : gamesApps){
				System.out.println(gamesApp);
		}
		
		System.out.println("Travel Apps:");
		for(String travelApp : travelApps){
				System.out.println(travelApp);
		}
		
		System.out.println("Tools Apps :");
		for(String toolsApp : toolsApps){
				System.out.println(toolsApp);
		}
				
	
        /*System.out.println("Social Apps: " + socialApps[0] + ", " + socialApps[1] + ", " + socialApps[2] + ", " + socialApps[3] + ", " + socialApps[4] + ", " + socialApps[5] + ", " + socialApps[6] + ", " + socialApps[7] + ", " + socialApps[8] + ", " + socialApps[9]);

        System.out.println("Entertainment Apps: " + entertainmentApps[0] + ", " + entertainmentApps[1] + ", " + entertainmentApps[2] + ", " + entertainmentApps[3] + ", " + entertainmentApps[4] + ", " + entertainmentApps[5] + ", " + entertainmentApps[6] + ", " + entertainmentApps[7] + ", " + entertainmentApps[8] + ", " + entertainmentApps[9]);

        System.out.println("Shopping Apps: " + shoppingApps[0] + ", " + shoppingApps[1] + ", " + shoppingApps[2] + ", " + shoppingApps[3] + ", " + shoppingApps[4] + ", " + shoppingApps[5] + ", " + shoppingApps[6] + ", " + shoppingApps[7] + ", " + shoppingApps[8] + ", " + shoppingApps[9]);

        System.out.println("Productivity Apps: " + productivityApps[0] + ", " + productivityApps[1] + ", " + productivityApps[2] + ", " + productivityApps[3] + ", " + productivityApps[4] + ", " + productivityApps[5] + ", " + productivityApps[6] + ", " + productivityApps[7] + ", " + productivityApps[8] + ", " + productivityApps[9]);

        System.out.println("Education Apps: " + educationApps[0] + ", " + educationApps[1] + ", " + educationApps[2] + ", " + educationApps[3] + ", " + educationApps[4] + ", " + educationApps[5] + ", " + educationApps[6] + ", " + educationApps[7] + ", " + educationApps[8] + ", " + educationApps[9]);

        System.out.println("Finance Apps: " + financeApps[0] + ", " + financeApps[1] + ", " + financeApps[2] + ", " + financeApps[3] + ", " + financeApps[4] + ", " + financeApps[5] + ", " + financeApps[6] + ", " + financeApps[7] + ", " + financeApps[8] + ", " + financeApps[9]);

        System.out.println("Health Apps: " + healthApps[0] + ", " + healthApps[1] + ", " + healthApps[2] + ", " + healthApps[3] + ", " + healthApps[4] + ", " + healthApps[5] + ", " + healthApps[6] + ", " + healthApps[7] + ", " + healthApps[8] + ", " + healthApps[9]);

        System.out.println("Games Apps: " + gamesApps[0] + ", " + gamesApps[1] + ", " + gamesApps[2] + ", " + gamesApps[3] + ", " + gamesApps[4] + ", " + gamesApps[5] + ", " + gamesApps[6] + ", " + gamesApps[7] + ", " + gamesApps[8] + ", " + gamesApps[9]);

        System.out.println("Travel Apps: " + travelApps[0] + ", " + travelApps[1] + ", " + travelApps[2] + ", " + travelApps[3] + ", " + travelApps[4] + ", " + travelApps[5] + ", " + travelApps[6] + ", " + travelApps[7] + ", " + travelApps[8] + ", " + travelApps[9]);

        System.out.println("Tools Apps: " + toolsApps[0] + ", " + toolsApps[1] + ", " + toolsApps[2] + ", " + toolsApps[3] + ", " + toolsApps[4] + ", " + toolsApps[5] + ", " + toolsApps[6] + ", " + toolsApps[7] + ", " + toolsApps[8] + ", " + toolsApps[9]);
		*/
	}
}
