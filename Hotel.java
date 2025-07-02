class Hotel {

	/*static String paneerTikka = "Paneer Tikka";
    static String vegSpringRolls = "Veg Spring Rolls";
    static String haraBharaKebab = "Hara Bhara Kebab";
    static String stuffedMushrooms = "Stuffed Mushrooms";
    static String cornCheeseBalls = "Corn Cheese Balls";
    static String crispyBabyCorn = "Crispy Baby Corn";
    static String tandooriAloo = "Tandoori Aloo";
    static String[] startersVeg = {paneerTikka, vegSpringRolls, haraBharaKebab, stuffedMushrooms, cornCheeseBalls, crispyBabyCorn, tandooriAloo};

    static String chickenLollipop = "Chicken Lollipop";
    static String fishFingers = "Fish Fingers";
    static String muttonSeekhKebab = "Mutton Seekh Kebab";
    static String chickenPakora = "Chicken Pakora";
    static String prawnsKoliwada = "Prawns Koliwada";
    static String chickenTikka = "Chicken Tikka";
    static String kalmiKebab = "Kalmi Kebab";
    static String[] startersNonVeg = {chickenLollipop, fishFingers, muttonSeekhKebab, chickenPakora, prawnsKoliwada, chickenTikka, kalmiKebab};

    static String paneerButterMasala = "Paneer Butter Masala";
    static String dalMakhani = "Dal Makhani";
    static String maliKofta = "Mali Kofta";
    static String mixVegCurry = "Mix Veg Curry";
    static String vegKolhapuri = "Veg Kolhapuri";
    static String bhindiMasala = "Bhindi Masala";
    static String choleMasala = "Chole Masala";
    static String[] mainCourseVeg = {paneerButterMasala, dalMakhani, maliKofta, mixVegCurry, vegKolhapuri, bhindiMasala, choleMasala};

    static String butterChicken = "Butter Chicken";
    static String muttonRoganJosh = "Mutton Rogan Josh";
    static String eggCurry = "Egg Curry";
    static String curryHandi = "Curry Handi";
    static String fishCurry = "Fish Curry";
    static String muttonKheema = "Mutton Kheema";
    static String chickenDoPyaza = "Chicken Do Pyaza";
    static String[] mainCourseNonVeg = {butterChicken, muttonRoganJosh, eggCurry, curryHandi, fishCurry, muttonKheema, chickenDoPyaza};

    static String vegBiryani = "Veg Biryani";
    static String chickenBiryani = "Chicken Biryani";
    static String muttonBiryani = "Mutton Biryani";
    static String jeeraRice = "Jeera Rice";
    static String steamRice = "Steam Rice";
    static String eggFriedRice = "Egg Fried Rice";
    static String peasPulao = "Peas Pulao";
    static String riceandBiryani[] = {vegBiryani, chickenBiryani, muttonBiryani, jeeraRice, steamRice, eggFriedRice, peasPulao};

    static String butterNaan = "Butter Naan";
    static String garlicNaan = "Garlic Naan";
    static String tandooriRoti = "Tandoori Roti";
    static String lachhaParatha = "Lachha Paratha";
    static String missiRoti = "Missi Roti";
    static String plainRoti = "Plain Roti";
    static String kulcha = "Kulcha";
    static String[] indianBreads = {butterNaan, garlicNaan, tandooriRoti, lachhaParatha, missiRoti, plainRoti, kulcha};

    static String masalaDosa = "Masala Dosa";
    static String plainDosa = "Plain Dosa";
    static String onionUttapam = "Onion Uttapam";
    static String idliVadaCombo = "Idli Vada Combo";
    static String meduVada = "Medu Vada";
    static String ravaDosa = "Rava Dosa";
    static String pongal = "Pongal";
    static String[] southIndian = {masalaDosa, plainDosa, onionUttapam, idliVadaCombo, meduVada, ravaDosa, pongal};

	static String vegHakkaNoodles = "Veg Hakka Noodles";
    static String vegFriedRice = "Veg Fried Rice";
    static String chilliPaneer = "Chilli Paneer";
    static String manchurianGravy = "Manchurian Gravy";
    static String schezwanNoodles = "Schezwan Noodles";
    static String mushroomChilli = "Mushroom Chilli";
    static String paneer65 = "Paneer 65";
    static String chineseVeg[] = {vegHakkaNoodles, vegFriedRice, chilliPaneer, manchurianGravy, schezwanNoodles, mushroomChilli, paneer65};

    static String chickenFriedRice = "Chicken Fried Rice";
    static String chilliChicken = "Chilli Chicken";
    static String schezwanChickenNoodles = "Schezwan Chicken Noodles";
    static String garlicChicken = "Garlic Chicken";
    static String chickenManchurian = "Chicken Manchurian";
    static String eggNoodles = "Egg Noodles";
    static String prawnsFriedRice = "Prawns Fried Rice";
    static String chineseNonVeg[] = {chickenFriedRice, chilliChicken, schezwanChickenNoodles, garlicChicken, chickenManchurian, eggNoodles, prawnsFriedRice};

    static String tandooriChicken = "Tandoori Chicken";
    static String tandooriPaneerPlatter = "Tandoori Paneer Platter";
    static String afghaniChicken = "Afghani Chicken";
    static String reshmiKebab = "Reshmi Kebab";
    static String tangdiKebab = "Tangdi Kebab";
    static String tandooriMushroom = "Tandoori Mushroom";
    static String chickenMalaiTikka = "Chicken Malai Tikka";
    static String tandooriSpecials[] = {tandooriChicken, tandooriPaneerPlatter, afghaniChicken, reshmiKebab, tangdiKebab, tandooriMushroom, chickenMalaiTikka};

    static String tomatoSoup = "Tomato Soup";
    static String sweetCornVegSoup = "Sweet Corn Veg Soup";
    static String hotSourVegSoup = "Hot & Sour Veg Soup";
    static String chickenClearSoup = "Chicken Clear Soup";
    static String manchowSoup = "Manchow Soup";
    static String mushroomSoup = "Cream of Mushroom Soup";
    static String lemonCorianderSoup = "Lemon Coriander Soup";
    static String soups[] = {tomatoSoup, sweetCornVegSoup, hotSourVegSoup, chickenClearSoup, manchowSoup, mushroomSoup, lemonCorianderSoup};

    // Salads
    static String greenSalad = "Green Salad";
    static String russianSalad = "Russian Salad";
    static String caesarSalad = "Caesar Salad";
    static String sproutSalad = "Sprout Salad";
    static String fruitSalad = "Fruit Salad";
    static String coleslaw = "Coleslaw";
    static String cucumberYogurtSalad = "Cucumber Yogurt Salad";
    static String salads[] = {greenSalad, russianSalad, caesarSalad, sproutSalad, fruitSalad, coleslaw, cucumberYogurtSalad};

    static String masalaTea = "Masala Tea";
    static String filterCoffee = "Filter Coffee";
    static String hotChocolate = "Hot Chocolate";
    static String blackTea = "Black Tea";
    static String greenTea = "Green Tea";
    static String cappuccino = "Cappuccino";
    static String espresso = "Espresso";
    static String beveragesHot[] = {masalaTea, filterCoffee, hotChocolate, blackTea, greenTea, cappuccino, espresso};

    static String coldCoffee = "Cold Coffee";
    static String freshLimeSoda = "Fresh Lime Soda";
    static String mangoShake = "Mango Shake";
    static String icedTea = "Iced Tea";
    static String watermelonJuice = "Watermelon Juice";
    static String buttermilk = "Buttermilk";
    static String softDrinks = "Soft Drinks";
    static String beveragesCold[] = {coldCoffee, freshLimeSoda, mangoShake, icedTea, watermelonJuice, buttermilk, softDrinks};

    static String virginMojito = "Virgin Mojito";
    static String blueLagoon = "Blue Lagoon";
    static String greenAppleCooler = "Green Apple Cooler";
    static String fruitPunch = "Fruit Punch";
    static String orangeBlossom = "Orange Blossom";
    static String strawberryMint = "Strawberry Mint";
    static String kiwiCooler = "Kiwi Cooler";
    static String mocktails[] = {virginMojito, blueLagoon, greenAppleCooler, fruitPunch, orangeBlossom, strawberryMint, kiwiCooler};

    static String gulabJamun = "Gulab Jamun";
    static String rasmalai = "Rasmalai";
    static String kheer = "Kheer";
    static String gajarHalwa = "Gajar Halwa";
    static String moongDalHalwa = "Moong Dal Halwa";
    static String jalebi = "Jalebi";
    static String malpua = "Malpua";
    static String dessertsIndian[] = {gulabJamun, rasmalai, kheer, gajarHalwa, moongDalHalwa, jalebi, malpua};

    static String chocolateBrownie = "Chocolate Brownie";
    static String vanillaIceCream = "Vanilla Ice Cream";
    static String tiramisu = "Tiramisu";
    static String applePie = "Apple Pie";
    static String chocolateMousse = "Chocolate Mousse";
    static String cheesecake = "Cheesecake";
    static String doughnut = "Doughnut";
    static String dessertsWestern[] = {chocolateBrownie, vanillaIceCream, tiramisu, applePie, chocolateMousse, cheesecake, doughnut};

    static String miniCheesePizza = "Mini Cheese Pizza";
    static String frenchFries = "French Fries";
    static String chocolateMilkshake = "Chocolate Milkshake";
    static String nuggets = "Nuggets";
    static String macAndCheese = "Mac & Cheese";
    static String miniBurger = "Mini Burger";
    static String smileyFries = "Smiley Fries";
    static String kidsMenu[] = {miniCheesePizza, frenchFries, chocolateMilkshake, nuggets, macAndCheese, miniBurger, smileyFries};

    static String vegThali = "Veg Thali";
    static String chickenThali = "Chicken Thali";
    static String burgerCombo = "Burger + Fries + Drink";
    static String chineseCombo = "Chinese Combo";
    static String southIndianCombo = "South Indian Combo";
    static String biryaniCombo = "Biryani Combo";
    static String wrapColdDrinkCombo = "Wrap + Cold Drink";
    static String comboMeals[] = {vegThali, chickenThali, burgerCombo, chineseCombo, southIndianCombo, biryaniCombo, wrapColdDrinkCombo};

    static String bhunaGhost = "Bhuna Ghost with Paratha";
    static String stuffedMushroomMasala = "Stuffed Mushroom Masala";
    static String seafoodPlatter = "Seafood Platter";
    static String butterGarlicPrawns = "Butter Garlic Prawns";
    static String chickenDumBiryani = "Chicken Dum Biryani";
    static String royalVegHandi = "Royal Veg Handi";
    static String pomfret = "Pomfret";
    static String chefsSpecial[] = {bhunaGhost, stuffedMushroomMasala, seafoodPlatter, butterGarlicPrawns, chickenDumBiryani, royalVegHandi, pomfret};

    static String rajasthani = "Rajasthani Dal Baati Churma";
    static String bengali = "Bengali Fish Curry";
    static String hyderabadi = "Hyderabadi Haleem";
    static String goan = "Goan Prawn Curry";
    static String kashmiri = "Kashmiri Dum Aloo";
    static String punjabi = "Punjabi Chole Bhature";
    static String kerala = "Kerala Appam with Stew";
    static String regionalIndianCuisine[] = {rajasthani, bengali, hyderabadi, goan, kashmiri, punjabi, kerala};

    static String grilledChickenSteak = "Grilled Chicken Steak";
    static String bakedLasagna = "Baked Lasagna";
    static String alfredoPasta = "Creamy Alfredo Pasta";
    static String garlicBread = "Garlic Bread with Cheese";
    static String fries = "French Fries";
    static String roastedVegPlatter = "Roasted Veg Platter";
    static String gratin = "Béchamel Sauce Veg Gratin";
    static String continentalDishes[] = {grilledChickenSteak, bakedLasagna, alfredoPasta, garlicBread, fries, roastedVegPlatter, gratin};

    static String tacos = "Tacos (Veg/Chicken)";
    static String nachos = "Nachos with Cheese";
    static String mexicanRice = "Mexican Rice";
    static String quesadilla = "Quesadilla";
    static String beanBurrito = "Bean Burrito";
    static String tortillaChips = "Tortilla Chips";
    static String enchiladas = "Chicken Enchiladas";
    static String mexicanSpecials[] = {tacos, nachos, mexicanRice, quesadilla, beanBurrito, tortillaChips, enchiladas};

    static String thaiGreenCurry = "Thai Green Curry";
    static String thaiRedCurry = "Thai Red Curry";
    static String jasmineRice = "Jasmine Rice";
    static String padThai = "Pad Thai Noodles";
    static String chickenSatay = "Chicken Satay";
    static String springRolls = "Spring Rolls";
    static String tomYumSoup = "Tom Yum Soup";
    static String thaiAndAsianCuisine[] = {thaiGreenCurry, thaiRedCurry, jasmineRice, padThai, chickenSatay, springRolls, tomYumSoup};

    static String lavaCake = "Chocolate Lava Cake";
    static String blueberryCheesecake = "Blueberry Cheesecake";
    static String bakedApplePie = "Apple Pie";
    static String redVelvet = "Red Velvet Cupcake";
    static String cinnamonRoll = "Cinnamon Roll";
    static String eclair = "Chocolate Éclair";
    static String bakedAlaska = "Baked Alaska";
    static String bakedDesserts[] = {lavaCake, blueberryCheesecake, bakedApplePie, redVelvet, cinnamonRoll, eclair, bakedAlaska};

	*/


	public static void main(String[] menu){
	
		String paneerTikka = "Paneer Tikka";
        String vegSpringRolls = "Veg Spring Rolls";
        String haraBharaKebab = "Hara Bhara Kebab";
        String stuffedMushrooms = "Stuffed Mushrooms";
        String cornCheeseBalls = "Corn Cheese Balls";
        String crispyBabyCorn = "Crispy Baby Corn";
        String tandooriAloo = "Tandoori Aloo";
        String startersVeg[] = {paneerTikka, vegSpringRolls, haraBharaKebab, stuffedMushrooms, cornCheeseBalls, crispyBabyCorn, tandooriAloo};

        String chickenLollipop = "Chicken Lollipop";
        String fishFingers = "Fish Fingers";
        String muttonSeekhKebab = "Mutton Seekh Kebab";
        String chickenPakora = "Chicken Pakora";
        String prawnsKoliwada = "Prawns Koliwada";
        String chickenTikka = "Chicken Tikka";
        String kalmiKebab = "Kalmi Kebab";
        String startersNonVeg[] = {chickenLollipop, fishFingers, muttonSeekhKebab, chickenPakora, prawnsKoliwada, chickenTikka, kalmiKebab};

        String paneerButterMasala = "Paneer Butter Masala";
        String dalMakhani = "Dal Makhani";
        String malaiKofta = "Malai Kofta";
        String mixVegCurry = "Mix Veg Curry";
        String vegKolhapuri = "Veg Kolhapuri";
        String bhindiMasala = "Bhindi Masala";
        String choleMasala = "Chole Masala";
        String mainCourseVeg[] = {paneerButterMasala, dalMakhani, malaiKofta, mixVegCurry, vegKolhapuri, bhindiMasala, choleMasala};

        String butterChicken = "Butter Chicken";
        String muttonRoganJosh = "Mutton Rogan Josh";
        String eggCurry = "Egg Curry";
        String curryHandi = "Curry Handi";
        String fishCurry = "Fish Curry";
        String muttonKheema = "Mutton Kheema";
        String chickenDoPyaza = "Chicken Do Pyaza";
        String mainCourseNonVeg[] = {butterChicken, muttonRoganJosh, eggCurry, curryHandi, fishCurry, muttonKheema, chickenDoPyaza};

        String vegBiryani = "Veg Biryani";
        String chickenBiryani = "Chicken Biryani";
        String muttonBiryani = "Mutton Biryani";
        String jeeraRice = "Jeera Rice";
        String steamRice = "Steam Rice";
        String eggFriedRice = "Egg Fried Rice";
        String peasPulao = "Peas Pulao";
        String riceandBiryani[] = {vegBiryani, chickenBiryani, muttonBiryani, jeeraRice, steamRice, eggFriedRice, peasPulao};

        String butterNaan = "Butter Naan";
        String garlicNaan = "Garlic Naan";
        String tandooriRoti = "Tandoori Roti";
        String lachhaParatha = "Lachha Paratha";
        String missiRoti = "Missi Roti";
        String plainRoti = "Plain Roti";
        String kulcha = "Kulcha";
        String indianBreads[] = {butterNaan, garlicNaan, tandooriRoti, lachhaParatha, missiRoti, plainRoti, kulcha};

        String masalaDosa = "Masala Dosa";
        String plainDosa = "Plain Dosa";
        String onionUttapam = "Onion Uttapam";
        String idliVadaCombo = "Idli Vada Combo";
        String meduVada = "Medu Vada";
        String ravaDosa = "Rava Dosa";
        String pongal = "Pongal";
        String southIndian[] = {masalaDosa, plainDosa, onionUttapam, idliVadaCombo, meduVada, ravaDosa, pongal};
	
		String vegHakkaNoodles = "Veg Hakka Noodles";
        String vegFriedRice = "Veg Fried Rice";
        String chilliPaneer = "Chilli Paneer";
        String manchurianGravy = "Manchurian Gravy";
        String schezwanNoodles = "Schezwan Noodles";
        String mushroomChilli = "Mushroom Chilli";
        String paneer65 = "Paneer 65";
        String chineseVeg[] = {vegHakkaNoodles, vegFriedRice, chilliPaneer, manchurianGravy, schezwanNoodles, mushroomChilli, paneer65};

        String chickenFriedRice = "Chicken Fried Rice";
        String chilliChicken = "Chilli Chicken";
        String schezwanChickenNoodles = "Schezwan Chicken Noodles";
        String garlicChicken = "Garlic Chicken";
        String chickenManchurian = "Chicken Manchurian";
        String eggNoodles = "Egg Noodles";
        String prawnsFriedRice = "Prawns Fried Rice";
        String chineseNonVeg[] = {chickenFriedRice, chilliChicken, schezwanChickenNoodles, garlicChicken, chickenManchurian, eggNoodles, prawnsFriedRice};

        String tandooriChicken = "Tandoori Chicken";
        String tandooriPaneerPlatter = "Tandoori Paneer Platter";
        String afghaniChicken = "Afghani Chicken";
        String reshmiKebab = "Reshmi Kebab";
        String tangdiKebab = "Tangdi Kebab";
        String tandooriMushroom = "Tandoori Mushroom";
        String chickenMalaiTikka = "Chicken Malai Tikka";
        String tandooriSpecials[] = {tandooriChicken, tandooriPaneerPlatter, afghaniChicken, reshmiKebab, tangdiKebab, tandooriMushroom, chickenMalaiTikka};

        String tomatoSoup = "Tomato Soup";
        String sweetCornVegSoup = "Sweet Corn Veg Soup";
        String hotSourVegSoup = "Hot & Sour Veg Soup";
        String chickenClearSoup = "Chicken Clear Soup";
        String manchowSoup = "Manchow Soup";
        String creamOfMushroomSoup = "Cream of Mushroom Soup";
        String lemonCorianderSoup = "Lemon Coriander Soup";
        String soups[] = {tomatoSoup, sweetCornVegSoup, hotSourVegSoup, chickenClearSoup, manchowSoup, creamOfMushroomSoup, lemonCorianderSoup};

        String greenSalad = "Green Salad";
        String russianSalad = "Russian Salad";
        String caesarSalad = "Caesar Salad";
        String sproutSalad = "Sprout Salad";
        String fruitSalad = "Fruit Salad";
        String coleslaw = "Coleslaw";
        String cucumberYogurtSalad = "Cucumber Yogurt Salad";
        String salads[] = {greenSalad, russianSalad, caesarSalad, sproutSalad, fruitSalad, coleslaw, cucumberYogurtSalad};

        String masalaTea = "Masala Tea";
        String filterCoffee = "Filter Coffee";
        String hotChocolate = "Hot Chocolate";
        String blackTea = "Black Tea";
        String greenTea = "Green Tea";
        String cappuccino = "Cappuccino";
        String espresso = "Espresso";
        String beveragesHot[] = {masalaTea, filterCoffee, hotChocolate, blackTea, greenTea, cappuccino, espresso};

        String coldCoffee = "Cold Coffee";
        String freshLimeSoda = "Fresh Lime Soda";
        String mangoShake = "Mango Shake";
        String icedTea = "Iced Tea";
        String watermelonJuice = "Watermelon Juice";
        String buttermilk = "Buttermilk";
        String softDrinks = "Soft Drinks";
        String beveragesCold[] = {coldCoffee, freshLimeSoda, mangoShake, icedTea, watermelonJuice, buttermilk, softDrinks};

        String virginMojito = "Virgin Mojito";
        String blueLagoon = "Blue Lagoon";
        String greenAppleCooler = "Green Apple Cooler";
        String fruitPunch = "Fruit Punch";
        String orangeBlossom = "Orange Blossom";
        String strawberryMint = "Strawberry Mint";
        String kiwiCooler = "Kiwi Cooler";
        String mocktails[] = {virginMojito, blueLagoon, greenAppleCooler, fruitPunch, orangeBlossom, strawberryMint, kiwiCooler};

        String gulabJamun = "Gulab Jamun";
        String rasmalai = "Rasmalai";
        String kheer = "Kheer";
        String gajarHalwa = "Gajar Halwa";
        String moongDalHalwa = "Moong Dal Halwa";
        String jalebi = "Jalebi";
        String malpua = "Malpua";
        String dessertsIndian[] = {gulabJamun, rasmalai, kheer, gajarHalwa, moongDalHalwa, jalebi, malpua};

        String chocolateBrownie = "Chocolate Brownie";
        String vanillaIceCream = "Vanilla Ice Cream";
        String tiramisu = "Tiramisu";
        String applePie = "Apple Pie";
        String chocolateMousse = "Chocolate Mousse";
        String cheesecake = "Cheesecake";
        String doughnut = "Doughnut";
        String dessertsWestern[] = {chocolateBrownie, vanillaIceCream, tiramisu, applePie, chocolateMousse, cheesecake, doughnut};

        String miniCheesePizza = "Mini Cheese Pizza";
        String frenchFries = "French Fries";
        String chocolateMilkshake = "Chocolate Milkshake";
        String nuggets = "Nuggets";
        String macAndCheese = "Mac & Cheese";
        String miniBurger = "Mini Burger";
        String smileyFries = "Smiley Fries";
        String kidsMenu[] = {miniCheesePizza, frenchFries, chocolateMilkshake, nuggets, macAndCheese, miniBurger, smileyFries};

        String vegThali = "Veg Thali";
        String chickenThali = "Chicken Thali";
        String burgerCombo = "Burger + Fries + Drink";
        String chineseCombo = "Chinese Combo";
        String southIndianCombo = "South Indian Combo";
        String biryaniCombo = "Biryani Combo";
        String wrapColdDrink = "Wrap + Cold Drink";
        String comboMeals[] = {vegThali, chickenThali, burgerCombo, chineseCombo, southIndianCombo, biryaniCombo, wrapColdDrink};

        String bhunaGhostParatha = "Bhuna Ghost with Paratha";
        String stuffedMushroomMasala = "Stuffed Mushroom Masala";
        String seafoodPlatter = "Seafood Platter";
        String butterGarlicPrawns = "Butter Garlic Prawns";
        String chickenDumBiryani = "Chicken Dum Biryani";
        String royalVegHandi = "Royal Veg Handi";
        String pomfret = "Pomfret";
        String chefsSpecial[] = {bhunaGhostParatha, stuffedMushroomMasala, seafoodPlatter, butterGarlicPrawns, chickenDumBiryani, royalVegHandi, pomfret};

        String dalBaatiChurma = "Rajasthani Dal Baati Churma";
        String bengaliFishCurry = "Bengali Fish Curry";
        String hyderabadiHaleem = "Hyderabadi Haleem";
        String goanPrawnCurry = "Goan Prawn Curry";
        String kashmiriDumAloo = "Kashmiri Dum Aloo";
        String punjabiCholeBhature = "Punjabi Chole Bhature";
        String keralaAppamStew = "Kerala Appam with Stew";
        String regionalIndianCuisine[] = {dalBaatiChurma, bengaliFishCurry, hyderabadiHaleem, goanPrawnCurry, kashmiriDumAloo, punjabiCholeBhature, keralaAppamStew};

        String grilledChickenSteak = "Grilled Chicken Steak";
        String bakedLasagna = "Baked Lasagna";
        String alfredoPasta = "Creamy Alfredo Pasta";
        String garlicBreadCheese = "Garlic Bread with Cheese";
        String fries = "French Fries";
        String roastedVegPlatter = "Roasted Veg Platter";
        String bechamelGratin = "Béchamel Sauce Veg Gratin";
        String continentalDishes[] = {grilledChickenSteak, bakedLasagna, alfredoPasta, garlicBreadCheese, fries, roastedVegPlatter, bechamelGratin};

        String tacos = "Tacos (Veg/Chicken)";
        String nachos = "Nachos with Cheese";
        String mexicanRice = "Mexican Rice";
        String quesadilla = "Quesadilla";
        String beanBurrito = "Bean Burrito";
        String tortillaChips = "Tortilla Chips";
        String chickenEnchiladas = "Chicken Enchiladas";
        String mexicanSpecials[] = {tacos, nachos, mexicanRice, quesadilla, beanBurrito, tortillaChips, chickenEnchiladas};

        String thaiGreenCurry = "Thai Green Curry";
        String thaiRedCurry = "Thai Red Curry";
        String jasmineRice = "Jasmine Rice";
        String padThai = "Pad Thai Noodles";
        String chickenSatay = "Chicken Satay";
        String springRolls = "Spring Rolls";
        String tomYumSoup = "Tom Yum Soup";
        String thaiAndAsianCuisine[] = {thaiGreenCurry, thaiRedCurry, jasmineRice, padThai, chickenSatay, springRolls, tomYumSoup};

        String lavaCake = "Chocolate Lava Cake";
        String blueberryCheesecake = "Blueberry Cheesecake";
        String redVelvetCupcake = "Red Velvet Cupcake";
        String cinnamonRoll = "Cinnamon Roll";
        String chocolateEclair = "Chocolate Éclair";
        String bakedAlaska = "Baked Alaska";
        String applePieBaked = "Apple Pie";
        String bakedDesserts[] = {lavaCake, blueberryCheesecake, applePieBaked, redVelvetCupcake, cinnamonRoll, chocolateEclair, bakedAlaska};

	
	System.out.println("Main Started : ");
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
	
	System.out.println("Main Ended");
	
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
