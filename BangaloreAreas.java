class BangaloreAreas {

    
    public static void main(String[] areanames) {
		
		String northBangalore[] = {"Hebbal", "Yelahanka", "RT Nagar", "Sanjay Nagar", "Kodigehalli"};

		String southBangalore[] = {"Jayanagar", "JP Nagar", "Banashankari", "Basavanagudi", "BTM Layout"};

		System.out.println("North Bangalore Areas: " );
		for(String northBangalores : northBangalore){
				System.out.println(northBangalores);
		}
		
		System.out.println("South Bangalore Areas: " );
		for(String southBangalores : southBangalore){
				System.out.println(southBangalores);
		}

        /*System.out.println("North Bangalore Areas: " + northBangalore[0] + ", " + northBangalore[1] + ", " + northBangalore[2] + ", " + northBangalore[3] + ", " + northBangalore[4]);

        System.out.println("South Bangalore Areas: " + southBangalore[0] + ", " + southBangalore[1] + ", " + southBangalore[2] + ", " + southBangalore[3] + ", " + southBangalore[4]);
		*/
	}
}
