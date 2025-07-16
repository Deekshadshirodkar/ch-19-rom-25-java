class Grubhub {

    public static double takeOrder(String foodName) {

        double price = 0.0;

        if (foodName == "Kimchi"){
            price = 95.00;
			return price;
        
		}else if (foodName == "Sushi Burrito"){
            price = 210.00;
			return price;
        
		}else if (foodName == "Buffalo Wings"){
            price = 180.00;
			return price;
        
		}else if (foodName == "Paneer Bhurji"){
            price = 130.00;
			return price;
        
		}else if (foodName == "Tuna Melt"){
            price = 145.00;
			return price;
        
		}else if (foodName == "Matcha Latte"){
            price = 90.00;
			return price;
        
		}else if (foodName == "Bacon Mac"){
            price = 160.00;
			return price;
        
		}else if (foodName == "Chocolate Milkshake"){
            price = 100.00;
			return price;
        
		}else if (foodName == "Tofu Stir Fry"){
            price = 125.00;
			return price;
        
		}else if (foodName == "Banana Pancakes"){
            price = 105.00;
			return price;
        
		}else if (foodName == "Veggie Stir Fry"){
            price = 120.00;
			return price;
        
		}else if (foodName == "Churro Bites"){
            price = 80.00;
			return price;
        
		}else if (foodName == "Chicken Alfredo"){
            price = 190.00;
			return price;
        
		}else if (foodName == "Egg Fried Rice"){
            price = 140.00;
			return price;
        
		}else if (foodName == "Carrot Halwa"){
            price = 70.00;
			return price;
        
		}else if (foodName == "Berry Smoothie"){
            price = 85.00;
			return price;
        
		}else if (foodName == "Choco Chip Cookie"){
            price = 60.00;
			return price;
        
		}else if (foodName == "Beef Quesadilla"){
            price = 175.00;
			return price;
        
		}else if (foodName == "Greek Yogurt Parfait"){
            price = 95.00;
			return price;
        
		}else if (foodName == "Veggie Tostada"){
            price = 115.00;
			return price;
			
		}else if (foodName == "Lemon Iced Tea"){
            price = 65.00;
			return price;
        
		}else if (foodName == "Tofu Wrap"){
            price = 130.00;
			return price;
        
		}else if (foodName == "Veggie Bowl"){
            price = 150.00;
			return price;
        
		}else if (foodName == "Spinach Pasta"){
            price = 155.00;
			return price;
        
		}else if (foodName == "Keto Burger"){
            price = 165.00;
			return price;
        
		}else if (foodName == "Paneer Biryani"){
            price = 190.00;
			return price;
        
		}else if (foodName == "Vegan Curry"){
            price = 135.00;
			return price;
        
		}else if (foodName == "Bhel Puri"){
            price = 60.00;
			return price;
        
		}else if (foodName == "Aamras"){
            price = 70.00;
			return price;
        
		}else if (foodName == "Rice Kheer"){
            price = 75.00;
			return price;
		
		}
        return price;
    }
	
	public static double takeOrder(String foodName, int quantity) {

        double price = 0.0;

        if (foodName == "Kimchi"){
            price = 95.00 * quantity;
			return price;
        
		}else if (foodName == "Sushi Burrito"){
            price = 210.00 * quantity;
			return price;
        
		}else if (foodName == "Buffalo Wings"){
            price = 180.00 * quantity;
			return price;
        
		}else if (foodName == "Paneer Bhurji"){
            price = 130.00 * quantity;
			return price;
        
		}else if (foodName == "Tuna Melt"){
            price = 145.00 * quantity;
			return price;
        
		}else if (foodName == "Matcha Latte"){
            price = 90.00 * quantity;
			return price;
        
		}else if (foodName == "Bacon Mac"){
            price = 160.00 * quantity;
			return price;
        
		}else if (foodName == "Chocolate Milkshake"){
            price = 100.00 * quantity;
			return price;
        
		}else if (foodName == "Tofu Stir Fry"){
            price = 125.00 * quantity;
			return price;
        
		}else if (foodName == "Banana Pancakes"){
            price = 105.00 * quantity;
			return price;
        
		}else if (foodName == "Veggie Stir Fry"){
            price = 120.00 * quantity;
			return price;
        
		}else if (foodName == "Churro Bites"){
            price = 80.00 * quantity;
			return price;
        
		}else if (foodName == "Chicken Alfredo"){
            price = 190.00 * quantity;
			return price;
        
		}else if (foodName == "Egg Fried Rice"){
            price = 140.00 * quantity;
			return price;
        
		}else if (foodName == "Carrot Halwa"){
            price = 70.00 * quantity;
			return price;
        
		}else if (foodName == "Berry Smoothie"){
            price = 85.00 * quantity;
			return price;
        
		}else if (foodName == "Choco Chip Cookie"){
            price = 60.00 * quantity;
			return price;
        
		}else if (foodName == "Beef Quesadilla"){
            price = 175.00 * quantity;
			return price;
        
		}else if (foodName == "Greek Yogurt Parfait"){
            price = 95.00 * quantity;
			return price;
        
		}else if (foodName == "Veggie Tostada"){
            price = 115.00 * quantity;
			return price;
			
		}else if (foodName == "Lemon Iced Tea"){
            price = 65.00 * quantity;
			return price;
        
		}else if (foodName == "Tofu Wrap"){
            price = 130.00 * quantity;
			return price;
        
		}else if (foodName == "Veggie Bowl"){
            price = 150.00 * quantity;
			return price;
        
		}else if (foodName == "Spinach Pasta"){
            price = 155.00 * quantity;
			return price;
        
		}else if (foodName == "Keto Burger"){
            price = 165.00 * quantity;
			return price;
        
		}else if (foodName == "Paneer Biryani"){
            price = 190.00 * quantity;
			return price;
        
		}else if (foodName == "Vegan Curry"){
            price = 135.00 * quantity;
			return price;
        
		}else if (foodName == "Bhel Puri"){
            price = 60.00 * quantity;
			return price;
        
		}else if (foodName == "Aamras"){
            price = 70.00 * quantity * quantity;
			return price;
        
		}else if (foodName == "Rice Kheer"){
            price = 75.00 * quantity;
			return price;
		
		}
        return price;
    }
}
