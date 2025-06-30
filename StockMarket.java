class StockMarket {


    public static void main(String[] stocknames) {
		
		String techStocks[] = {"TCS", "Infosys", "Wipro", "Tech Mahindra", "HCL Technologies","Oracle Financial", "L&T Infotech", "Coforge", "Mindtree", "Persistent Systems"};

		String bankingStocks[] = {"HDFC Bank", "ICICI Bank", "SBI", "Kotak Mahindra Bank", "Axis Bank","Yes Bank", "Bank of Baroda", "Punjab National Bank", "IDFC First Bank", "Federal Bank"};

		String pharmaStocks[] = {"Sun Pharma", "Dr. Reddy's", "Cipla", "Lupin", "Divi's Labs","Aurobindo Pharma", "Biocon", "Zydus Life", "Torrent Pharma", "Glenmark"};

		String autoStocks[] = {"Maruti Suzuki", "Tata Motors", "Mahindra & Mahindra", "Bajaj Auto", "Hero MotoCorp","Eicher Motors", "Ashok Leyland", "TVS Motor", "Force Motors", "Escorts"};

		String energyStocks[] = {"Reliance Industries", "ONGC", "NTPC", "Power Grid", "Tata Power","Adani Green", "Indian Oil", "BPCL", "HPCL", "NHPC"};

		String fmcgStocks[] = {"HUL", "ITC", "Nestle India", "Dabur", "Britannia","Godrej Consumer", "Colgate-Palmolive", "Marico", "Emami", "Tata Consumer"};

		String metalStocks[] = {"Tata Steel", "JSW Steel", "Hindalco", "Vedanta", "NMDC","SAIL", "Jindal Steel", "MOIL", "National Aluminium", "Ratnamani Metals"};

		String realEstateStocks[] = {"DLF", "Godrej Properties", "Oberoi Realty", "Prestige Estates", "Brigade Enterprises","Sobha Ltd", "Phoenix Mills", "Indiabulls Real Estate", "Puravankara", "Macrotech Developers"};

		String telecomStocks[] = {"Bharti Airtel", "Vodafone Idea", "Reliance Jio (RIL)", "Tata Communications", "MTNL","RailTel", "Indus Towers", "Tejas Networks", "HFCL", "GTPL Hathway"};

		String aviationStocks[] = {"IndiGo (InterGlobe Aviation)", "SpiceJet", "Jet Airways", "Air India (Tata Group)", "Go First","Blue Dart", "Logistics India", "Taneja Aerospace", "Deccan Aviation", "Indamer Aviation"};
			
		
		System.out.println("Tech Stocks: "	);	
		for(String techStock : techStocks){
				System.out.println(techStock);
		}
		
		System.out.println("Banking Stocks :");
		for(String bankingStock : bankingStocks){
				System.out.println(bankingStock);
		}
		
		System.out.println("Pharma Stocks :");
		for(String pharmaStock : pharmaStocks){
				System.out.println(pharmaStock);
		}
		
		System.out.println("Auto Stocks :");
		for(String autoStock : autoStocks){
				System.out.println(autoStock);
		}
		
		System.out.println("Energy Stocks :");
		for(String energyStock : energyStocks){
				System.out.println(energyStock);
		}
		
		System.out.println("fmcg Stocks :");
		for(String fmcgStock : fmcgStocks){
				System.out.println(fmcgStock);
		}
		
		System.out.println("Metal Stocks :");
		for(String metalStock : metalStocks){
				System.out.println(metalStock);
		}
		
		System.out.println("RealEstate Stocks :");
		for(String realEstateStock : realEstateStocks){
				System.out.println(realEstateStock);
		}
		
		System.out.println("Telecom Stocks :");
		for(String telecomStock : telecomStocks){
				System.out.println(telecomStock);
		}
		
		System.out.println("Aviation Stocks :");
		for(String aviationStock : aviationStocks){
				System.out.println(aviationStock);
		}
		

        /*System.out.println("Tech Stocks: " + techStocks[0] + ", " + techStocks[1] + ", " + techStocks[2] + ", " + techStocks[3] + ", " + techStocks[4] + ", " + techStocks[5] + ", " + techStocks[6] + ", " + techStocks[7] + ", " + techStocks[8] + ", " + techStocks[9]);

        System.out.println("Banking Stocks: " + bankingStocks[0] + ", " + bankingStocks[1] + ", " + bankingStocks[2] + ", " + bankingStocks[3] + ", " + bankingStocks[4] + ", " + bankingStocks[5] + ", " + bankingStocks[6] + ", " + bankingStocks[7] + ", " + bankingStocks[8] + ", " + bankingStocks[9]);
        
		System.out.println("Pharma Stocks: " + pharmaStocks[0] + ", " + pharmaStocks[1] + ", " + pharmaStocks[2] + ", " + pharmaStocks[3] + ", " + pharmaStocks[4] + ", " + pharmaStocks[5] + ", " + pharmaStocks[6] + ", " + pharmaStocks[7] + ", " + pharmaStocks[8] + ", " + pharmaStocks[9]);

        System.out.println("Auto Stocks: " + autoStocks[0] + ", " + autoStocks[1] + ", " + autoStocks[2] + ", " + autoStocks[3] + ", " + autoStocks[4] + ", " + autoStocks[5] + ", " + autoStocks[6] + ", " + autoStocks[7] + ", " + autoStocks[8] + ", " + autoStocks[9]);

        System.out.println("Energy Stocks: " + energyStocks[0] + ", " + energyStocks[1] + ", " + energyStocks[2] + ", " + energyStocks[3] + ", " + energyStocks[4] + ", " + energyStocks[5] + ", " + energyStocks[6] + ", " + energyStocks[7] + ", " + energyStocks[8] + ", " + energyStocks[9]);

        System.out.println("FMCG Stocks: " + fmcgStocks[0] + ", " + fmcgStocks[1] + ", " + fmcgStocks[2] + ", " + fmcgStocks[3] + ", " + fmcgStocks[4] + ", " + fmcgStocks[5] + ", " + fmcgStocks[6] + ", " + fmcgStocks[7] + ", " + fmcgStocks[8] + ", " + fmcgStocks[9]);

        System.out.println("Metal Stocks: " + metalStocks[0] + ", " + metalStocks[1] + ", " + metalStocks[2] + ", " + metalStocks[3] + ", " + metalStocks[4] + ", " + metalStocks[5] + ", " + metalStocks[6] + ", " + metalStocks[7] + ", " + metalStocks[8] + ", " + metalStocks[9]);

        System.out.println("Real Estate Stocks: " + realEstateStocks[0] + ", " + realEstateStocks[1] + ", " + realEstateStocks[2] + ", " + realEstateStocks[3] + ", " + realEstateStocks[4] + ", " + realEstateStocks[5] + ", " + realEstateStocks[6] + ", " + realEstateStocks[7] + ", " + realEstateStocks[8] + ", " + realEstateStocks[9]);

        System.out.println("Telecom Stocks: " + telecomStocks[0] + ", " + telecomStocks[1] + ", " + telecomStocks[2] + ", " + telecomStocks[3] + ", " + telecomStocks[4] + ", " + telecomStocks[5] + ", " + telecomStocks[6] + ", " + telecomStocks[7] + ", " + telecomStocks[8] + ", " + telecomStocks[9]);

        System.out.println("Aviation Stocks: " + aviationStocks[0] + ", " + aviationStocks[1] + ", " + aviationStocks[2] + ", " + aviationStocks[3] + ", " + aviationStocks[4] + ", " + aviationStocks[5] + ", " + aviationStocks[6] + ", " + aviationStocks[7] + ", " + aviationStocks[8] + ", " + aviationStocks[9]);
		*/
	}
}
