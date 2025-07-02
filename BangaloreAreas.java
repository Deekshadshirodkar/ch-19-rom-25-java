class BangaloreAreas {

		/*static String hebbal = "Hebbal";
		static String yelahanka = "Yelahanka";
		static String rtNagar = "RT Nagar";
		static String sanjayNagar = "Sanjay Nagar";
		static String kodigehalli = "Kodigehalli";
		
		static String northBangalore[] = {hebbal,yelahanka,rtNagar,sanjayNagar,kodigehalli};


		static String jayanagar = "Jayanagar";
		static String jpNagar = "JP Nagar";
		static String banashankari = "Banashankari";
		static String basavanagudi = "Basavanagudi";
		static String btmLayout = "BTM Layout";
		
		static String southBangalore[] = {jayanagar,jpNagar,banashankari,basavanagudi,btmLayout};
		*/
    
    public static void main(String[] areanames) {
		
		String hebbal = "Hebbal";
		String yelahanka = "Yelahanka";
		String rtNagar = "RT Nagar";
		String sanjayNagar = "Sanjay Nagar";
		String kodigehalli = "Kodigehalli";
		
		String northBangalore[] = {hebbal,yelahanka,rtNagar,sanjayNagar,kodigehalli};


		String jayanagar = "Jayanagar";
		String jpNagar = "JP Nagar";
		String banashankari = "Banashankari";
		String basavanagudi = "Basavanagudi";
		String btmLayout = "BTM Layout";
		
		String southBangalore[] = {jayanagar,jpNagar,banashankari,basavanagudi,btmLayout};
		
		System.out.println("Main Started");

		System.out.println("North Bangalore Areas: " );
		for(String northBangalores : northBangalore){
				System.out.println(northBangalores);
		}
		
		System.out.println("South Bangalore Areas: " );
		for(String southBangalores : southBangalore){
				System.out.println(southBangalores);
		}

      	System.out.println("Main Ended");

        /*System.out.println("North Bangalore Areas: " + northBangalore[0] + ", " + northBangalore[1] + ", " + northBangalore[2] + ", " + northBangalore[3] + ", " + northBangalore[4]);

        System.out.println("South Bangalore Areas: " + southBangalore[0] + ", " + southBangalore[1] + ", " + southBangalore[2] + ", " + southBangalore[3] + ", " + southBangalore[4]);
		*/
	}
}
