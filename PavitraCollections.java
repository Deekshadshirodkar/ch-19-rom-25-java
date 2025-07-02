class PavitraCollections {

	
		/*static String fabIndia = "FabIndia";
		static String biba = "Biba";
		static String woman = "W for Woman";
		static String globalDesi = "Global Desi";
		static String aurelia = "Aurelia";
		static String soch = "Soch";
		static String melange = "Melange";
		static String rangriti = "Rangriti";
		static String indya = "Indya";
		static String libas = "Libas";

		static String brands[] = {fabIndia, biba, woman, globalDesi, aurelia, soch, melange, rangriti, indya, libas};
*/

    public static void main(String[] brandss) {
		
		String fabIndia = "FabIndia";
		String biba = "Biba";
		String woman = "W for Woman";
		String globalDesi = "Global Desi";
		String aurelia = "Aurelia";
		String soch = "Soch";
		String melange = "Melange";
		String rangriti = "Rangriti";
		String indya = "Indya";
		String libas = "Libas";

		String brands[] = {fabIndia, biba, woman, globalDesi, aurelia, soch, melange, rangriti, indya, libas};

		System.out.println("Main Started");

		System.out.println("Pavitra Collections Brands : " );
		
		for(String brand : brands){
				System.out.println(brand);
		}
		
		System.out.println("Main Ended");
		
        //System.out.println("Pavitra Collections Brands: " + brands[0]+ " " +brands[1]+ "  " +brands[2]+ " " +brands[3]+ " " +brands[4]+ " " +brands[5]+ " " +brands[6]+ " " +brands[7]+ " " +brands[8]+ " " +brands[9]);
    }
}
