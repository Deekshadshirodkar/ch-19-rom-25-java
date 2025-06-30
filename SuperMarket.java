class SuperMarket { 
 
	
    public static void main(String[] items) {
		
	String perfumes[] = {"Fogg Scent","Denver Hamilton","Engage Man XX","AXE Signature","Wild Stone Code","Park Avenue Good Morning","Bella Vita Organic","Nivea Fresh Active","Skinn by Titan","Ustraa Base Camp"};
	String groceries[] = {"Basmati Rice","Toor Dal","Wheat Flour","Refined Sugar","Salt","Mustard Oil","Turmeric Powder","Chana Dal","Soya Chunks","Besan (Gram Flour)"};
	String iceCreams[] = {"Amul Vanilla","Cornetto Cone","Magnum Classic","Kwality Wall's Butterscotch","Dairy Chocolate","Havmor Mango Scoop","Baskin Robbins Belgian Bliss","Amul Rajbhog","Naturals Tender Coconut","Gelato Italiano Pistachio"};
	String fruitsAndVegetables[] = {"Apple","Banana","Tomato","Onion","Potato","Spinach","Carrot","Cabbage","Green Peas","Watermelon"};
    String freshProduce[] = { "Tomatoes", "Potatoes", "Onions", "Carrots", "Spinach", "Cabbage", "Coriander Leaves", "Cauliflower", "Green Peas", "Beetroot" };
    String dairyProducts[] = { "Milk", "Butter", "Cheese", "Paneer", "Yogurt", "Cream", "Condensed Milk", "Buttermilk", "Flavored Milk", "Milk Powder" };
    String snacksAndBeverages[] = { "Chips", "Biscuits", "Soft Drinks", "Fruit Juices", "Energy Drinks", "Popcorn", "Chocolate Bars", "Instant Noodles", "Namkeen", "Cookies" };
    String frozenItems[] = { "Frozen Peas", "Frozen Corn", "Ice Cream", "Frozen Paratha", "Frozen French Fries", "Frozen Chicken Nuggets", "Frozen Roti", "Frozen Veg Mix", "Frozen Paneer", "Frozen Pizza" };
    String cleaningSupplies[] = { "Floor Cleaner", "Toilet Cleaner", "Detergent Powder", "Dishwashing Liquid", "Glass Cleaner", "Toilet Brush", "Mop", "Scrub Pad", "Room Freshener", "Garbage Bags" };
    String personalCare[] = { "Toothpaste", "Shampoo", "Soap", "Face Wash", "Body Lotion", "Hair Oil", "Shaving Cream", "Toothbrush", "Deodorant", "Hand Sanitizer" };
    String babyCare[] = { "Diapers", "Baby Powder", "Baby Soap", "Baby Shampoo", "Baby Lotion", "Baby Wipes", "Baby Food", "Baby Oil", "Feeding Bottle", "Pacifier" };
    String householdItems[] = { "Plastic Containers", "Storage Boxes", "Aluminum Foil", "Cling Film", "Disposable Plates", "Napkins", "Laundry Basket", "Buckets", "Cleaning Gloves", "Cutting Board" };
    String cosmetics[] = { "Perfume Spray", "Lipstick", "Foundation", "Compact Powder", "Nail Polish", "Eyeliner", "Mascara", "Body Mist", "Makeup Remover", "BB Cream" };

	System.out.println("Perfumes : ");
	for(String perfume : perfumes){
		System.out.println(perfume);
		
	}
	
	System.out.println("Groceries : " );
	for(String grocery : groceries){
		System.out.println(grocery);
		
	}
	
	System.out.println("IceCreams : ");
	for(String iceCream : iceCreams){
		System.out.println(iceCream);
		
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
