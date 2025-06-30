class Bar {

    

    public static void main(String[] alcoholnames) {
		
		String whiskyBrands[] = {"Jack Daniel's", "Johnnie Walker", "Chivas Regal", "Blenders Pride", "Royal Stag", "Jameson"};

		String vodkaBrands[] = {"Absolut", "Smirnoff", "Magic Moments", "Grey Goose", "Belvedere", "Finlandia"};

		String rumBrands[] = {"Old Monk", "Captain Morgan", "Bacardi", "Havana Club", "McDowell's No.1", "Malibu"};

		String ginBrands[] = {"Bombay Sapphire", "Tanqueray", "Beefeater", "Hendrick's", "Greater Than", "Roku Gin"};

		String beerBrands[] = {"Kingfisher", "Budweiser", "Heineken", "Corona", "Bira 91", "Carlsberg"};
			
		String wineBrands[] = {"Sula", "Fratelli", "York", "Grover Zampa", "Jacob's Creek", "Big Banyan"};

		String tequilaBrands[] = {"Jose Cuervo", "Don Julio", "Patrón", "1800 Tequila", "El Jimador", "Camino Real"};

		String brandyBrands[] = {"Mansion House", "Honey Bee", "Old Admiral", "McDowell's Brandy", "Remy Martin", "Hennessy"};

		String liqueurBrands[] = {"Baileys Irish Cream", "Kahlua", "Amarula", "Jägermeister", "Cointreau", "Drambuie"};

		String cognacBrands[] = {"Remy Martin", "Hennessy", "Martell", "Courvoisier", "Camus", "Pierre Ferrand"};

		String champagneBrands[] = {"Moët & Chandon", "Veuve Clicquot", "Dom Pérignon", "Taittinger", "Laurent-Perrier", "Piper-Heidsieck"};

		String craftBeerBrands[] = {"White Owl", "Simba", "Gateway Brewing", "Arbor Brewing", "BrewDog", "Toit"};

		
		System.out.println("Whisky Brands: ");
		for(String whiskyBrand : whiskyBrands){
				System.out.println(whiskyBrand);
		}
		
		System.out.println("Vodka Brands : ");
		for(String vodkaBrand : vodkaBrands){
				System.out.println(vodkaBrand);
		}
		
		System.out.println("Rum Brands : " );
		for(String rumBrand : rumBrands){
				System.out.println(rumBrand);
		}
		
		System.out.println("Gin Brands : ");
		for(String ginBrand : ginBrands){
				System.out.println(ginBrand);
		}
		
		System.out.println("Beer Brands : ");
		for(String beerBrand : beerBrands){
				System.out.println(beerBrand);
		}
		
		System.out.println("Wine Brands : " );
		for(String wineBrand : wineBrands){
				System.out.println(wineBrand);
		}
		
		System.out.println("Tequila Brands : ");		
		for(String tequilaBrand : tequilaBrands){
				System.out.println(tequilaBrand);
		}
		
		System.out.println("Brandy Brands : ");
		for(String brandyBrand : brandyBrands){
				System.out.println(brandyBrand);
		}
		
		System.out.println("cognac Brands : " );
		for(String cognacBrand : cognacBrands){
				System.out.println(cognacBrand);
		}
		
		System.out.println("Liqueur Brands: " );
		for(String liqueurBrand : liqueurBrands){
				System.out.println(liqueurBrand);
		}
		
		System.out.println("Champagne Brands: " );
		for(String champagneBrand : champagneBrands){
				System.out.println(champagneBrand);
		}
		
		System.out.println("craft Beer Brands: ");
		for(String craftBeerBrand : craftBeerBrands){
				System.out.println(craftBeerBrand);
		}


        /*System.out.println("Whisky Brands: " + whiskyBrands[0] + ", " + whiskyBrands[1] + ", " + whiskyBrands[2] + ", " + whiskyBrands[3] + ", " + whiskyBrands[4] + ", " + whiskyBrands[5]);

        System.out.println("Vodka Brands: " + vodkaBrands[0] + ", " + vodkaBrands[1] + ", " + vodkaBrands[2] + ", " + vodkaBrands[3] + ", " + vodkaBrands[4] + ", " + vodkaBrands[5]);

        System.out.println("Rum Brands: " + rumBrands[0] + ", " + rumBrands[1] + ", " + rumBrands[2] + ", " + rumBrands[3] + ", " + rumBrands[4] + ", " + rumBrands[5]);

        System.out.println("Gin Brands: " + ginBrands[0] + ", " + ginBrands[1] + ", " + ginBrands[2] + ", " + ginBrands[3] + ", " + ginBrands[4] + ", " + ginBrands[5]);

        System.out.println("Beer Brands: " + beerBrands[0] + ", " + beerBrands[1] + ", " + beerBrands[2] + ", " + beerBrands[3] + ", " + beerBrands[4] + ", " + beerBrands[5]);

        System.out.println("Wine Brands: " + wineBrands[0] + ", " + wineBrands[1] + ", " + wineBrands[2] + ", " + wineBrands[3] + ", " + wineBrands[4] + ", " + wineBrands[5]);

        System.out.println("Tequila Brands: " + tequilaBrands[0] + ", " + tequilaBrands[1] + ", " + tequilaBrands[2] + ", " + tequilaBrands[3] + ", " + tequilaBrands[4] + ", " + tequilaBrands[5]);

        System.out.println("Brandy Brands: " + brandyBrands[0] + ", " + brandyBrands[1] + ", " + brandyBrands[2] + ", " + brandyBrands[3] + ", " + brandyBrands[4] + ", " + brandyBrands[5]);

        System.out.println("Liqueur Brands: " + liqueurBrands[0] + ", " + liqueurBrands[1] + ", " + liqueurBrands[2] + ", " + liqueurBrands[3] + ", " + liqueurBrands[4] + ", " + liqueurBrands[5]);

        System.out.println("Cognac Brands: " + cognacBrands[0] + ", " + cognacBrands[1] + ", " + cognacBrands[2] + ", " + cognacBrands[3] + ", " + cognacBrands[4] + ", " + cognacBrands[5]);

        System.out.println("Champagne Brands: " + champagneBrands[0] + ", " + champagneBrands[1] + ", " + champagneBrands[2] + ", " + champagneBrands[3] + ", " + champagneBrands[4] + ", " + champagneBrands[5]);

        System.out.println("Craft Beer Brands: " + craftBeerBrands[0] + ", " + craftBeerBrands[1] + ", " + craftBeerBrands[2] + ", " + craftBeerBrands[3] + ", " + craftBeerBrands[4] + ", " + craftBeerBrands[5]);
    
		*/
	}
}
