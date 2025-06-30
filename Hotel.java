class Hotel {

	
	public static void main(String[] menu){
		
	String startersVeg[] = { "Paneer Tikka","Veg Spring Rolls","Hara Bhara Kebab","Stuffed Mushrooms","Corn Cheese Balls","Crispy Baby Corn","Tandoori Aloo"};
	String startersNonVeg[] = {"Chicken Lollipop","Fish Fingers","Mutton Seekh Kebab","Chicken Pakora","Prawns Koliwada","Chicken Tikka",",Kalmi Kebab"};
	String mainCourseVeg[] = {"Paneer Butter Masala","Dal Makhani","Mali Kofta","Mix Veg Curry","Veg Kolhapuri","Bhindi Masala","Chole Masala"};
	String mainCourseNonVeg[] = {"Butter Chicken","Mutton Rogan Josh","Egg Curry","Curry Handi","Fish Curry","Mutton Kheema","Chicken Do Pyaza"};
	String riceandBiryani[] = {"Veg Biryani","Chicken Biryani","Mutton Biryani","Jeera Rice","Steam Rice","Egg Fried Rice","Peas Pulao"};
	String indianBreads[] = {"Butter Naan","Garlic Naan","Tandoori Roti","Lachha Paratha","Missi Roti","Plain Roti","Kulcha"};
	String southIndian[] = {"Masala Dosa","Plain Dosa","Onion Uttapam","Idli Vada Combo","Medu Vada","Rava Dosa","Pongal"};
	String chineseVeg[] = {"Veg Hakka Noodles","Veg Fried Rice","Chilli Paneer","Manchurian Gravy","Schezwan Noodles","Mushroom Chilli","Paneer 65"};
	String chineseNonVeg[] = {"Chicken Fried Rice","Chilli Chicken","Schezwan Chicken Noodles","Garlic Chicken","Chicken Manchurian","Egg Noodles","Prawns Fried Rice"};
	String tandooriSpecials[] = {"Tandoori Chicken","Tandoori Paneer Platter","Afghani Chicken","Reshmi Kebab","Tangdi Kebab","Tandoori Mushroom","Chicken Malai Tikka"};
	String soups[] = {"Tomato Soup","Sweet Corn Veg Soup","Hot & Sour Veg Soup","Chicken Clear Soup","Manchow Soup","Cream of Mushroom Soup","Lemon Coriander Soup"};
	String salads[]= {"Green Salad","Russian Salad","Caesar Salad","Sprout Salad","Fruit Salad","Coleslaw","Cucumber Yogurt Salad"};
	String beveragesHot[] = {"Masala Tea","Filter Coffee","Hot Chocolate","Black Tea","Green Tea","Cappuccino","Espresso"};
	String beveragesCold[] = {"Cold Coffee","Fresh Lime Soda","Mango Shake","Iced Tea","Watermelon Juice","Buttermilk","Soft Drinks"};
	String mocktails[] = {"Virgin Mojito","Blue Lagoon","Green Apple Cooler","Fruit Punch","Orange Blossom","Strawberry Mint","Kiwi Cooler"};
	String dessertsIndian[] = {"Gulab Jamun","Rasmalai","Kheer","Gajar Halwa","Moong Dal Halwa","Jalebi","Malpua"};
	String dessertsWestern[] = {"Chocolate Brownie","Vanilla Ice Cream","Tiramisu","Apple Pie","Chocolate Mousse","Cheesecake","Doughnut"};
	String kidsMenu[] = {"Mini Cheese Pizza","French Fries","Chocolate Milkshake","Nuggets","Mac & Cheese","Mini Burger","Smiley Fries"};
	String comboMeals[] = {"Veg Thali","Chicken Thali","Burger + Fries + Drink","Chinese Combo","South Indian Combo","Biryani Combo","Wrap + Cold Drink"};
	String chefsSpecial[] = {"Bhuna Ghost with Paratha","Stuffed Mushroom Masala","Seafood Platter","Butter Garlic Prawns","Chicken Dum Biryani","Royal Veg Handi","Pomfret"};
	String regionalIndianCuisine[] = { "Rajasthani Dal Baati Churma","Bengali Fish Curry","Hyderabadi Haleem","Goan Prawn Curry","Kashmiri Dum Aloo","Punjabi Chole Bhature","Kerala Appam with Stew"};
	String continentalDishes[] = { "Grilled Chicken Steak","Baked Lasagna","Creamy Alfredo Pasta","Garlic Bread with Cheese","French Fries","Roasted Veg Platter","Béchamel Sauce Veg Gratin"};
	String mexicanSpecials[] = {"Tacos (Veg/Chicken)","Nachos with Cheese","Mexican Rice","Quesadilla","Bean Burrito","Tortilla Chips","Chicken Enchiladas"};
	String thaiAndAsianCuisine[] = {"Thai Green Curry","Thai Red Curry","Jasmine Rice","Pad Thai Noodles","Chicken Satay","Spring Rolls","Tom Yum Soup"};
	String bakedDesserts[] = {"Chocolate Lava Cake","Blueberry Cheesecake","Apple Pie","Red Velvet Cupcake","Cinnamon Roll","Chocolate Éclair","Baked Alaska"};

	
	System.out.println("Starters (Veg) : "	);
	for(String startersVegs : startersVeg){
		System.out.println(startersVegs);
		
	}
	
	System.out.println("Starters (Non Veg) : "	);
	for(String startersNonVegs : startersNonVeg){
		System.out.println(startersNonVegs);
		
	}
	
	System.out.println("Main Course Veg : " );
	for(String mainCourseVegs : mainCourseVeg){
		System.out.println(mainCourseVegs);
		
	}
	
	System.out.println("Main Course Non-Veg : " );
	for(String mainCourseNonVegs : mainCourseNonVeg){
		System.out.println(mainCourseNonVegs);
		
	}
	
	System.out.println("Rice and Biryanis : ");
	for(String riceandBiryanis : riceandBiryani){
		System.out.println(riceandBiryanis);
		
	}
	
	System.out.println("Indian Breads: " );
	for(String indianBread : indianBreads){
		System.out.println(indianBread);
		
	}
	
	System.out.println("South Indians : ");
	for(String southIndians : southIndian){
		System.out.println(southIndians);
		
	}
	
	System.out.println("Chinese Vegs: " );
	for(String chineseVegs : chineseVeg){
		System.out.println(chineseVegs);
		
	}
	
	System.out.println("Chinese Non Vegs : ");
	for(String chineseNonVegs : chineseNonVeg){
		System.out.println(chineseNonVegs);
		
	}
	
	System.out.println("Tandoori Specials : ");
	for(String tandooriSpecial : tandooriSpecials){
		System.out.println(tandooriSpecial);
		
	}
	
	System.out.println("Soups: " );
	for(String soup : soups){
		System.out.println(soup);
		
	}
	
	System.out.println("Salads: ");
	for(String salad : salads){
		System.out.println(salad);
		
	}
	
	System.out.println("Beverages Hots : ");
	for(String beveragesHots : beveragesHot){
		System.out.println(beveragesHots);
		
	}
	
	System.out.println("Beverages Colds : ");
	for(String beveragesColds : beveragesCold){
		System.out.println(beveragesColds);
		
	}
	
	System.out.println("Mocktails : ");
	for(String mocktail : mocktails){
		System.out.println(mocktail);
		
	}
	
	System.out.println("Desserts Indians : " );
	for(String dessertsIndians : dessertsIndian){
		System.out.println(dessertsIndians);
		
	}
	
	System.out.println("Desserts Westerns : " );
	for(String dessertsWesterns : dessertsWestern){
		System.out.println(dessertsWesterns);
		
	}
	
	System.out.println("Kids Menus : ");
	for(String kidsMenus : kidsMenu){
		System.out.println(kidsMenus);
		
	}
	
	System.out.println("Combo Meals : ");
	for(String comboMeal : comboMeals){
		System.out.println(comboMeal);
		
	}
	
	System.out.println("Chefs Specials : " );
	for(String chefsSpecials : chefsSpecial){
		System.out.println(chefsSpecials);
		
	}
	
	System.out.println("Regional Indian Cuisines : ");
	for(String regionalIndianCuisines : regionalIndianCuisine){
		System.out.println(regionalIndianCuisines);
		
	}
	
	System.out.println("Continental Dishes : " );
	for(String continentalDish : continentalDishes){
		System.out.println(continentalDish);
		
	}
	
	System.out.println("Mexican Specials : " );
	for(String mexicanSpecial : mexicanSpecials){
		System.out.println(mexicanSpecial);
		
	}
	
	System.out.println("Thai And Asian Cuisines : " );
	for(String thaiAndAsianCuisines : thaiAndAsianCuisine){
		System.out.println(thaiAndAsianCuisines);
		
	}
	
	System.out.println("Baked Dessert : ");
	for(String bakedDessert : bakedDesserts){
		System.out.println(bakedDessert);
		
	}
	
	
	
	/*System.out.println("Starters (Veg) : " +startersVeg[0]+ " " +startersVeg[1] + " " + startersVeg[2]+ " " +startersVeg[3] + " " + startersVeg[4]+ " " +startersVeg[5]);
	System.out.println("Starters (Non Veg) : " +startersNonVeg[0] + " " +startersNonVeg[1] + " " +startersNonVeg[2] + " " +startersNonVeg[3] + " " +startersNonVeg[4] + " " +startersNonVeg[5]);
	System.out.println("Main course (Veg) : " + mainCourseVeg[0] + " " +mainCourseVeg[1] + " " +mainCourseVeg[2] + " " +mainCourseVeg[3] + " " +mainCourseVeg[4] + " " +mainCourseVeg[5]);
	System.out.println("Main course (Non Veg) : " + mainCourseNonVeg[0] + " " + mainCourseNonVeg[1] + " " +mainCourseNonVeg[2] + " " +mainCourseNonVeg[3] + " " +mainCourseNonVeg[4] + " " +mainCourseNonVeg[5]);
	System.out.println("Rice and Biryani : " + riceandBiryani[0] + " " + riceandBiryani[1] + " " +riceandBiryani[2] + " " +riceandBiryani[3] + " " +riceandBiryani[4] + " " +riceandBiryani[5]);
	System.out.println("Indian Breads : " + indianBreads[0]+ " " +indianBreads[1]+ " " +indianBreads[2]+ " " +indianBreads[3]+ " " +indianBreads[4]+ " " +indianBreads[5]);
	System.out.println("South Indian : " + southIndian[0] + " " + southIndian[1] + " " +southIndian[2] + " " +southIndian[3] + " " +southIndian[4] + " " +southIndian[5]);
	System.out.println("Chinese (Veg) : " + chineseVeg[0]+ " " +chineseVeg[1]+ " " +chineseVeg[2]+ " " +chineseVeg[3]+ " " +chineseVeg[4]+ " " +chineseVeg[5]);
	System.out.println("Chinese (Non Veg) : " + chineseNonVeg[0]+ " " +chineseNonVeg[1]+ " " +chineseNonVeg[2]+ " " +chineseNonVeg[3]+ " " +chineseNonVeg[4]+ " " +chineseNonVeg[5]);
	System.out.println("Tandoori Specials : " + tandooriSpecials[0]+ " " +tandooriSpecials[1]+ " " +tandooriSpecials[2]+ " " +tandooriSpecials[3]+ " " +tandooriSpecials[4]+ " " +tandooriSpecials[5]);
	System.out.println("Soups : " + soups[0]+ " " +soups[1]+ " " +soups[2]+ " " +soups[3]+ " " +soups[4]+ " " +soups[5]);
	System.out.println("Salads : " +salads[0]+ " " +salads[1]+ " " +salads[2]+ " " +salads[3]+ " " +salads[4]+ " " +salads[5]);
	System.out.println("Hot Beverages : " + beveragesHot[0]+ " " +beveragesHot[1]+ " " +beveragesHot[2]+ " " +beveragesHot[3]+ " " +beveragesHot[4]+ " " +beveragesHot[5]);
	System.out.println("Cold Beverages : " + beveragesCold[0]+ " " +beveragesCold[1]+ " " +beveragesCold[2]+ " " +beveragesCold[3]+ " " +beveragesCold[4]+ " " +beveragesCold[5]);
	System.out.println("Mocktails : " + mocktails[0]+ " " +mocktails[1]+ " " +mocktails[2]+ " " +mocktails[3]+ " " +mocktails[4]+ " " +mocktails[5]);
	System.out.println("Indian Desserts : "  + dessertsIndian[0]+ " " +dessertsIndian[1]+ " " +dessertsIndian[2]+ " " +dessertsIndian[3]+ " " +dessertsIndian[4]+ " " +dessertsIndian[5]);
	System.out.println("Western Desserts : " +dessertsWestern[0]+ " " +dessertsWestern[1]+ " " +dessertsWestern[2]+ " " +dessertsWestern[3]+ " " +dessertsWestern[4]+ " " +dessertsWestern[5]);
	System.out.println("Kids Menu : " + kidsMenu[0]+ " " +kidsMenu[1]+ " " +kidsMenu[2]+ " " +kidsMenu[3]+ " " +kidsMenu[4]+ " " +kidsMenu[5] );
	System.out.println("Combo Meals : " + comboMeals[0]+ " " +comboMeals[1]+ " " +comboMeals[2]+ " " +comboMeals[3]+ " " +comboMeals[4]+ " " +comboMeals[5]);
	System.out.println("Chef Specials : " + chefsSpecial[0]+ " " +chefsSpecial[1]+ " " +chefsSpecial[2]+ " " +chefsSpecial[3]+ " " +chefsSpecial[4]+ " " +chefsSpecial[5]);
	System.out.println("Regional Indian Cuisine : " + regionalIndianCuisine[0]+ " " +regionalIndianCuisine[1]+ " " +regionalIndianCuisine[2]+ " " +regionalIndianCuisine[3]+ " " +regionalIndianCuisine[4]+ " " +regionalIndianCuisine[5]);
	System.out.println("Continental Dishes : " + continentalDishes[0]+ " " +continentalDishes[1]+ " " +continentalDishes[2]+ " " +continentalDishes[3]+ " " +continentalDishes[4]+ " " +continentalDishes[5]);
	System.out.println("Mexican Specials : " + mexicanSpecials[0]+ " " +mexicanSpecials[1]+ " " +mexicanSpecials[2]+ " " +mexicanSpecials[3]+ " " +mexicanSpecials[4]+ " " +mexicanSpecials[5]);
	System.out.println("Thai and Asian Cuisine : " + thaiAndAsianCuisine[0]+ " " +thaiAndAsianCuisine[1]+ " " +thaiAndAsianCuisine[2]+ " " +thaiAndAsianCuisine[3]+ " " +thaiAndAsianCuisine[4]+ " " +thaiAndAsianCuisine[5]);
	System.out.println("Baked Desserts : " + bakedDesserts[0]+ " " +bakedDesserts[1]+ " " +bakedDesserts[2]+ " " +bakedDesserts[3]+ " " +bakedDesserts[4]+ " " +bakedDesserts[5]);
	*/
	}
}
