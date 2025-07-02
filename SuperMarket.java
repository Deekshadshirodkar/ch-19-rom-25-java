class SuperMarket { 
 
	
	/*static String fogg = "Fogg Scent";
    static String denver = "Denver Hamilton";
    static String engage = "Engage Man XX";
    static String axe = "AXE Signature";
    static String wildStone = "Wild Stone Code";
    static String parkAvenue = "Park Avenue Good Morning";
    static String bellaVita = "Bella Vita Organic";
    static String nivea = "Nivea Fresh Active";
    static String skinn = "Skinn by Titan";
    static String ustraa = "Ustraa Base Camp";
    static String perfumes[] = {fogg, denver, engage, axe, wildStone, parkAvenue, bellaVita, nivea, skinn, ustraa};

    static String rice = "Basmati Rice";
    static String toorDal = "Toor Dal";
    static String wheat = "Wheat Flour";
    static String sugar = "Refined Sugar";
    static String salt = "Salt";
    static String oil = "Mustard Oil";
    static String turmeric = "Turmeric Powder";
    static String chanaDal = "Chana Dal";
    static String soya = "Soya Chunks";
    static String besan = "Besan (Gram Flour)";
    static String groceries[] = {rice, toorDal, wheat, sugar, salt, oil, turmeric, chanaDal, soya, besan};

    static String amul = "Amul Vanilla";
    static String cornetto = "Cornetto Cone";
    static String magnum = "Magnum Classic";
    static String kwality = "Kwality Wall's Butterscotch";
    static String dairyMilk = "Dairy Chocolate";
    static String havmor = "Havmor Mango Scoop";
    static String baskin = "Baskin Robbins Belgian Bliss";
    static String rajbhog = "Amul Rajbhog";
    static String naturals = "Naturals Tender Coconut";
    static String gelato = "Gelato Italiano Pistachio";
    static String iceCreams[] = {amul, cornetto, magnum, kwality, dairyMilk, havmor, baskin, rajbhog, naturals, gelato};

    static String apple = "Apple";
    static String banana = "Banana";
    static String tomato = "Tomato";
    static String onion = "Onion";
    static String potato = "Potato";
    static String spinach = "Spinach";
    static String carrot = "Carrot";
    static String cabbage = "Cabbage";
    static String peas = "Green Peas";
    static String watermelon = "Watermelon";
    static String fruitsAndVegetables[] = {apple, banana, tomato, onion, potato, spinach, carrot, cabbage, peas, watermelon};

    static String fpTomatoes = "Tomatoes";
    static String fpPotatoes = "Potatoes";
    static String fpOnions = "Onions";
    static String fpCarrots = "Carrots";
    static String fpSpinach = "Spinach";
    static String fpCabbage = "Cabbage";
    static String fpCoriander = "Coriander Leaves";
    static String fpCauliflower = "Cauliflower";
    static String fpGreenPeas = "Green Peas";
    static String fpBeetroot = "Beetroot";
    static String freshProduce[] = {fpTomatoes, fpPotatoes, fpOnions, fpCarrots, fpSpinach, fpCabbage, fpCoriander, fpCauliflower, fpGreenPeas, fpBeetroot};

    static String milk = "Milk";
    static String butter = "Butter";
    static String cheese = "Cheese";
    static String paneer = "Paneer";
    static String yogurt = "Yogurt";
    static String cream = "Cream";
    static String condensedMilk = "Condensed Milk";
    static String buttermilk = "Buttermilk";
    static String flavoredMilk = "Flavored Milk";
    static String milkPowder = "Milk Powder";
    static String dairyProducts[] = {milk, butter, cheese, paneer, yogurt, cream, condensedMilk, buttermilk, flavoredMilk, milkPowder};

    static String chips = "Chips";
    static String biscuits = "Biscuits";
    static String softDrinks = "Soft Drinks";
    static String fruitJuices = "Fruit Juices";
    static String energyDrinks = "Energy Drinks";
    static String popcorn = "Popcorn";
    static String chocolates = "Chocolate Bars";
    static String noodles = "Instant Noodles";
    static String namkeen = "Namkeen";
    static String cookies = "Cookies";
    static String snacksAndBeverages[] = {chips, biscuits, softDrinks, fruitJuices, energyDrinks, popcorn, chocolates, noodles, namkeen, cookies};

    static String frozenPeas = "Frozen Peas";
    static String frozenCorn = "Frozen Corn";
    static String iceCream = "Ice Cream";
    static String frozenParatha = "Frozen Paratha";
    static String fries = "Frozen French Fries";
    static String nuggets = "Frozen Chicken Nuggets";
    static String frozenRoti = "Frozen Roti";
    static String vegMix = "Frozen Veg Mix";
    static String frozenPaneer = "Frozen Paneer";
    static String frozenPizza = "Frozen Pizza";
    static String frozenItems[] = {frozenPeas, frozenCorn, iceCream, frozenParatha, fries, nuggets, frozenRoti, vegMix, frozenPaneer, frozenPizza};

    static String floorCleaner = "Floor Cleaner";
    static String toiletCleaner = "Toilet Cleaner";
    static String detergent = "Detergent Powder";
    static String dishwash = "Dishwashing Liquid";
    static String glassCleaner = "Glass Cleaner";
    static String toiletBrush = "Toilet Brush";
    static String mop = "Mop";
    static String scrub = "Scrub Pad";
    static String freshener = "Room Freshener";
    static String garbageBags = "Garbage Bags";
    static String cleaningSupplies[] = {floorCleaner, toiletCleaner, detergent, dishwash, glassCleaner, toiletBrush, mop, scrub, freshener, garbageBags};

    static String toothpaste = "Toothpaste";
    static String shampoo = "Shampoo";
    static String soap = "Soap";
    static String faceWash = "Face Wash";
    static String lotion = "Body Lotion";
    static String hairOil = "Hair Oil";
    static String shavingCream = "Shaving Cream";
    static String toothbrush = "Toothbrush";
    static String deodorant = "Deodorant";
    static String sanitizer = "Hand Sanitizer";
    static String personalCare[] = {toothpaste, shampoo, soap, faceWash, lotion, hairOil, shavingCream, toothbrush, deodorant, sanitizer};

    static String diapers = "Diapers";
    static String babyPowder = "Baby Powder";
    static String babySoap = "Baby Soap";
    static String babyShampoo = "Baby Shampoo";
    static String babyLotion = "Baby Lotion";
    static String babyWipes = "Baby Wipes";
    static String babyFood = "Baby Food";
    static String babyOil = "Baby Oil";
    static String feedingBottle = "Feeding Bottle";
    static String pacifier = "Pacifier";
    static String babyCare[] = {diapers, babyPowder, babySoap, babyShampoo, babyLotion, babyWipes, babyFood, babyOil, feedingBottle, pacifier};

    static String containers = "Plastic Containers";
    static String boxes = "Storage Boxes";
    static String foil = "Aluminum Foil";
    static String cling = "Cling Film";
    static String plates = "Disposable Plates";
    static String napkins = "Napkins";
    static String basket = "Laundry Basket";
    static String buckets = "Buckets";
    static String gloves = "Cleaning Gloves";
    static String board = "Cutting Board";
    static String householdItems[] = {containers, boxes, foil, cling, plates, napkins, basket, buckets, gloves, board};

    static String spray = "Perfume Spray";
    static String lipstick = "Lipstick";
    static String foundation = "Foundation";
    static String compact = "Compact Powder";
    static String nailPolish = "Nail Polish";
    static String eyeliner = "Eyeliner";
    static String mascara = "Mascara";
    static String mist = "Body Mist";
    static String remover = "Makeup Remover";
    static String bbCream = "BB Cream";
    static String cosmetics[] = {spray, lipstick, foundation, compact, nailPolish, eyeliner, mascara, mist, remover, bbCream};
	*/
    
    public static void main(String[] items) {
	
        String fogg = "Fogg Scent";
        String denver = "Denver Hamilton";
        String engage = "Engage Man XX";
        String axe = "AXE Signature";
        String wildStone = "Wild Stone Code";
        String parkAvenue = "Park Avenue Good Morning";
        String bellaVita = "Bella Vita Organic";
        String nivea = "Nivea Fresh Active";
        String skinn = "Skinn by Titan";
        String ustraa = "Ustraa Base Camp";
        String perfumes[] = {fogg, denver, engage, axe, wildStone, parkAvenue, bellaVita, nivea, skinn, ustraa};

        String rice = "Basmati Rice";
        String toorDal = "Toor Dal";
        String wheat = "Wheat Flour";
        String sugar = "Refined Sugar";
        String salt = "Salt";
        String oil = "Mustard Oil";
        String turmeric = "Turmeric Powder";
        String chanaDal = "Chana Dal";
        String soya = "Soya Chunks";
        String besan = "Besan (Gram Flour)";
        String groceries[] = {rice, toorDal, wheat, sugar, salt, oil, turmeric, chanaDal, soya, besan};

        String amul = "Amul Vanilla";
        String cornetto = "Cornetto Cone";
        String magnum = "Magnum Classic";
        String kwality = "Kwality Wall's Butterscotch";
        String dairyMilk = "Dairy Chocolate";
        String havmor = "Havmor Mango Scoop";
        String baskin = "Baskin Robbins Belgian Bliss";
        String rajbhog = "Amul Rajbhog";
        String naturals = "Naturals Tender Coconut";
        String gelato = "Gelato Italiano Pistachio";
        String iceCreams[] = {amul, cornetto, magnum, kwality, dairyMilk, havmor, baskin, rajbhog, naturals, gelato};

        String apple = "Apple";
        String banana = "Banana";
        String tomato = "Tomato";
        String onion = "Onion";
        String potato = "Potato";
        String spinach = "Spinach";
        String carrot = "Carrot";
        String cabbage = "Cabbage";
        String peas = "Green Peas";
        String watermelon = "Watermelon";
        String fruitsAndVegetables[] = {apple, banana, tomato, onion, potato, spinach, carrot, cabbage, peas, watermelon};

        String fpTomatoes = "Tomatoes";
        String fpPotatoes = "Potatoes";
        String fpOnions = "Onions";
        String fpCarrots = "Carrots";
        String fpSpinach = "Spinach";
        String fpCabbage = "Cabbage";
        String fpCoriander = "Coriander Leaves";
        String fpCauliflower = "Cauliflower";
        String fpGreenPeas = "Green Peas";
        String fpBeetroot = "Beetroot";
        String freshProduce[] = {fpTomatoes, fpPotatoes, fpOnions, fpCarrots, fpSpinach, fpCabbage, fpCoriander, fpCauliflower, fpGreenPeas, fpBeetroot};

        String milk = "Milk";
        String butter = "Butter";
        String cheese = "Cheese";
        String paneer = "Paneer";
        String yogurt = "Yogurt";
        String cream = "Cream";
        String condensedMilk = "Condensed Milk";
        String buttermilk = "Buttermilk";
        String flavoredMilk = "Flavored Milk";
        String milkPowder = "Milk Powder";
        String dairyProducts[] = {milk, butter, cheese, paneer, yogurt, cream, condensedMilk, buttermilk, flavoredMilk, milkPowder};

        String chips = "Chips";
        String biscuits = "Biscuits";
        String softDrinks = "Soft Drinks";
        String fruitJuices = "Fruit Juices";
        String energyDrinks = "Energy Drinks";
        String popcorn = "Popcorn";
        String chocolates = "Chocolate Bars";
        String noodles = "Instant Noodles";
        String namkeen = "Namkeen";
        String cookies = "Cookies";
        String snacksAndBeverages[] = {chips, biscuits, softDrinks, fruitJuices, energyDrinks, popcorn, chocolates, noodles, namkeen, cookies};

        String frozenPeas = "Frozen Peas";
        String frozenCorn = "Frozen Corn";
        String iceCream = "Ice Cream";
        String frozenParatha = "Frozen Paratha";
        String fries = "Frozen French Fries";
        String nuggets = "Frozen Chicken Nuggets";
        String frozenRoti = "Frozen Roti";
        String vegMix = "Frozen Veg Mix";
        String frozenPaneer = "Frozen Paneer";
        String frozenPizza = "Frozen Pizza";
        String frozenItems[] = {frozenPeas, frozenCorn, iceCream, frozenParatha, fries, nuggets, frozenRoti, vegMix, frozenPaneer, frozenPizza};

        String floorCleaner = "Floor Cleaner";
        String toiletCleaner = "Toilet Cleaner";
        String detergent = "Detergent Powder";
        String dishwash = "Dishwashing Liquid";
        String glassCleaner = "Glass Cleaner";
        String toiletBrush = "Toilet Brush";
        String mop = "Mop";
        String scrub = "Scrub Pad";
        String freshener = "Room Freshener";
        String garbageBags = "Garbage Bags";
        String cleaningSupplies[] = {floorCleaner, toiletCleaner, detergent, dishwash, glassCleaner, toiletBrush, mop, scrub, freshener, garbageBags};

        String toothpaste = "Toothpaste";
        String shampoo = "Shampoo";
        String soap = "Soap";
        String faceWash = "Face Wash";
        String lotion = "Body Lotion";
        String hairOil = "Hair Oil";
        String shavingCream = "Shaving Cream";
        String toothbrush = "Toothbrush";
        String deodorant = "Deodorant";
        String sanitizer = "Hand Sanitizer";
        String personalCare[] = {toothpaste, shampoo, soap, faceWash, lotion, hairOil, shavingCream, toothbrush, deodorant, sanitizer};

        String diapers = "Diapers";
        String babyPowder = "Baby Powder";
        String babySoap = "Baby Soap";
        String babyShampoo = "Baby Shampoo";
        String babyLotion = "Baby Lotion";
        String babyWipes = "Baby Wipes";
        String babyFood = "Baby Food";
        String babyOil = "Baby Oil";
        String feedingBottle = "Feeding Bottle";
        String pacifier = "Pacifier";
        String babyCare[] = {diapers, babyPowder, babySoap, babyShampoo, babyLotion, babyWipes, babyFood, babyOil, feedingBottle, pacifier};

        String containers = "Plastic Containers";
        String boxes = "Storage Boxes";
        String foil = "Aluminum Foil";
        String cling = "Cling Film";
        String plates = "Disposable Plates";
        String napkins = "Napkins";
        String basket = "Laundry Basket";
        String buckets = "Buckets";
        String gloves = "Cleaning Gloves";
        String board = "Cutting Board";
        String householdItems[] = {containers, boxes, foil, cling, plates, napkins, basket, buckets, gloves, board};

        String spray = "Perfume Spray";
        String lipstick = "Lipstick";
        String foundation = "Foundation";
        String compact = "Compact Powder";
        String nailPolish = "Nail Polish";
        String eyeliner = "Eyeliner";
        String mascara = "Mascara";
        String mist = "Body Mist";
        String remover = "Makeup Remover";
        String bbCream = "BB Cream";
        String cosmetics[] = {spray, lipstick, foundation, compact, nailPolish, eyeliner, mascara, mist, remover, bbCream};

   
	
	System.out.println("Main Started");
	System.out.println("Perfumes : ");
	for(String perfume : perfumes){
		System.out.println(perfume);
		
	}
	
	System.out.println("Groceries : " );
	for(String grocery : groceries){
		System.out.println(grocery);
		
	}
	
	System.out.println("IceCreams : ");
	for(String iceCreamm : iceCreams){
		System.out.println(iceCreamm);
		
	}
	
	System.out.println("Fruits And Vegetables: ");
	for(String fruitsAndVegetable : fruitsAndVegetables){
		System.out.println(fruitsAndVegetable);
		
	}
	
	System.out.println("Fresh Produces :" );
	for(String freshProduces : freshProduce){
		System.out.println(freshProduces);
		
	}
	
	System.out.println("Dairy Products: ");
	for(String dairyProduct : dairyProducts){
		System.out.println(dairyProduct);
		
	}
	
	System.out.println("Snacks And Beverages: " );
	for(String snacksAndBeverage : snacksAndBeverages){
		System.out.println(snacksAndBeverage);
		
	}
	
	System.out.println("Frozen Items: ");
	for(String frozenItem : frozenItems){
		System.out.println(frozenItem);
		
	}
	
	System.out.println("Cleaning Supplies:" );
	for(String cleaningSupply : cleaningSupplies){
		System.out.println(cleaningSupply);
		
	}
	
	System.out.println("Personal Cares: ");
	for(String personalCares : personalCare){
		System.out.println(personalCares);
		
	}
	
	System.out.println("Baby Cares: " );
	for(String babyCares : babyCare){
		System.out.println(babyCares);
		
	}
	
	System.out.println("Household Items :" );
	for(String householdItem : householdItems){
		System.out.println(householdItem);
		
	}
	
	System.out.println("Cosmetics :" );
	for(String cosmetic : cosmetics){
		System.out.println(cosmetic);
		
	}
	System.out.println("Main Ended");
		
		/*System.out.println("Perfumes : " + perfumes[0] + " " + perfumes[1]+" " + perfumes[2] + " " + perfumes[3]+ " " + perfumes[4] + " " + perfumes[5]+ " " + perfumes[6] + " " + perfumes[7] + " " +perfumes[8] + " " + perfumes[9]);
        System.out.println("Groceries: " + groceries[0] + ", " + groceries[1] + ", " + groceries[2] + ", " + groceries[3] + ", " + groceries[4] + ", " + groceries[5] + ", " + groceries[6] + ", " + groceries[7] + ", " + groceries[8] + ", " + groceries[9]);
		System.out.println("IceCreams: " + iceCreams[0] + " " + iceCreams[1] + " " +iceCreams[2] + " " +iceCreams[3] + " " +iceCreams[4] + " " +iceCreams[5] + " " +iceCreams[6] + " " +iceCreams[7] + " " +iceCreams[8] + " " +iceCreams[9]);
        System.out.println("Fresh Produce: " + freshProduce[0] + ", " + freshProduce[1] + ", " + freshProduce[2] + ", " + freshProduce[3] + ", " + freshProduce[4] + ", " + freshProduce[5] + ", " + freshProduce[6] + ", " + freshProduce[7] + ", " + freshProduce[8] + ", " + freshProduce[9]);
		System.out.println("Fruits And Vegetables: " + fruitsAndVegetables[0] + " " + fruitsAndVegetables[1] + " " +fruitsAndVegetables[2] + " " +fruitsAndVegetables[3] + " " +fruitsAndVegetables[4] + " " +fruitsAndVegetables[5] + " " +fruitsAndVegetables[6] + " " +fruitsAndVegetables[7] + " " +fruitsAndVegetables[8] + " " +fruitsAndVegetables[9]);        
		System.out.println("Dairy Products: " + dairyProducts[0] + ", " + dairyProducts[1] + ", " + dairyProducts[2] + ", " + dairyProducts[3] + ", " + dairyProducts[4] + ", " + dairyProducts[5] + ", " + dairyProducts[6] + ", " + dairyProducts[7] + ", " + dairyProducts[8] + ", " + dairyProducts[9]);
        System.out.println("Snacks and Beverages: " + snacksAndBeverages[0] + ", " + snacksAndBeverages[1] + ", " + snacksAndBeverages[2] + ", " + snacksAndBeverages[3] + ", " + snacksAndBeverages[4] + ", " + snacksAndBeverages[5] + ", " + snacksAndBeverages[6] + ", " + snacksAndBeverages[7] + ", " + snacksAndBeverages[8] + ", " + snacksAndBeverages[9]);
        System.out.println("Frozen Items: " + frozenItems[0] + ", " + frozenItems[1] + ", " + frozenItems[2] + ", " + frozenItems[3] + ", " + frozenItems[4] + ", " + frozenItems[5] + ", " + frozenItems[6] + ", " + frozenItems[7] + ", " + frozenItems[8] + ", " + frozenItems[9]);
        System.out.println("Cleaning Supplies: " + cleaningSupplies[0] + ", " + cleaningSupplies[1] + ", " + cleaningSupplies[2] + ", " + cleaningSupplies[3] + ", " + cleaningSupplies[4] + ", " + cleaningSupplies[5] + ", " + cleaningSupplies[6] + ", " + cleaningSupplies[7] + ", " + cleaningSupplies[8] + ", " + cleaningSupplies[9]);
        System.out.println("Personal Care: " + personalCare[0] + ", " + personalCare[1] + ", " + personalCare[2] + ", " + personalCare[3] + ", " + personalCare[4] + ", " + personalCare[5] + ", " + personalCare[6] + ", " + personalCare[7] + ", " + personalCare[8] + ", " + personalCare[9]);
        System.out.println("Baby Care: " + babyCare[0] + ", " + babyCare[1] + ", " + babyCare[2] + ", " + babyCare[3] + ", " + babyCare[4] + ", " + babyCare[5] + ", " + babyCare[6] + ", " + babyCare[7] + ", " + babyCare[8] + ", " + babyCare[9]);
        System.out.println("Household Items: " + householdItems[0] + ", " + householdItems[1] + ", " + householdItems[2] + ", " + householdItems[3] + ", " + householdItems[4] + ", " + householdItems[5] + ", " + householdItems[6] + ", " + householdItems[7] + ", " + householdItems[8] + ", " + householdItems[9]);
        System.out.println("Cosmetics: " + cosmetics[0] + ", " + cosmetics[1] + ", " + cosmetics[2] + ", " + cosmetics[3] + ", " + cosmetics[4] + ", " + cosmetics[5] + ", " + cosmetics[6] + ", " + cosmetics[7] + ", " + cosmetics[8] + ", " + cosmetics[9]);
		*/
	
	}
}
