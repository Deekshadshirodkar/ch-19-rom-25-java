class Swiggy {

    public static double takeOrder(String foodName) {

        double price = 0.0;

        if (foodName == "Burger"){
            price = 78.00;
			return price;
			
		}else if (foodName == "Pizza"){
            price = 99.99;
			return price;
			
		}else if (foodName == "Biryani"){
            price = 180.00;
			return price;
			
		}else if (foodName == "Pasta"){
            price = 120.50;
			return price;
			
		}else if (foodName == "Fried Rice"){
            price = 140.75;
			return price;
			
		}else if (foodName == "Chicken Wings"){
            price = 160.00;
			return price;
			
		}else if (foodName == "Momos"){
            price = 90.00;
			return price;
			
		}else if (foodName == "Noodles"){
            price = 130.00;
			return price;
			
		}else if (foodName == "Sandwich"){
            price = 70.50;
			return price;
			
		}else if (foodName == "Salad"){
            price = 60.00;
			return price;
			
		}else if (foodName == "Paneer Tikka"){
            price = 150.00;
			return price;
			
		}else if (foodName == "Dosa"){
            price = 80.00;
			return price;
			
		}else if (foodName == "Idli"){
            price = 50.00;
			return price;
			
		}else if (foodName == "Vada Pav"){
            price = 30.00;
			return price;
			
		}else if (foodName == "Samosa"){
            price = 25.00;
			return price;
			
		}else if (foodName == "Kathi Roll"){
            price = 100.00;
			return price;
			
		}else if (foodName == "Tandoori Chicken"){
            price = 200.00;
			return price;
			
		}else if (foodName == "Chole Bhature"){
            price = 90.00;
			return price;
			
		}else if (foodName == "Aloo Paratha"){
            price = 60.00;
			return price;
			
		}else if (foodName == "Pav Bhaji"){
            price = 85.00;
			return price;
			
		}else if (foodName == "Thali"){
            price = 180.00;
			return price;
			
		}else if (foodName == "Manchurian"){
            price = 110.00;
			return price;
			
		}else if (foodName == "Soup"){
            price = 70.00;
			return price;
			
		}else if (foodName == "Kebabs"){
            price = 190.00;
			return price;
			
		}else if (foodName == "Spring Roll"){
            price = 95.00;
			return price;
			
		}else if (foodName == "Masala Dosa"){
            price = 90.00;
			return price;
			
		}else if (foodName == "Fish Curry"){
            price = 210.00;
			return price;
			
		}else if (foodName == "Paneer Butter Masala"){
            price = 160.00;
			return price;
			
		}else if (foodName == "Butter Naan"){
            price = 40.00;
			return price;
			
		}else if (foodName == "Ice Cream"){
            price = 50.00;
			return price;
			
		}
		
        return price;
    }
	
	
	
	
	 public static double takeOrder(String foodName, int quantity) {

        double price = 0.0;

        if (foodName == "Burger"){
            price = 78.00 * quantity;
			return price;
			
		}else if (foodName == "Pizza"){
            price = 99.99 * quantity;
			return price;
			
		}else if (foodName == "Biryani"){
            price = 180.00 * quantity;
			return price;
			
		}else if (foodName == "Pasta"){
            price = 120.50 * quantity;
			return price;
			
		}else if (foodName == "Fried Rice"){
            price = 140.75 * quantity;
			return price;
			
		}else if (foodName == "Chicken Wings"){
            price = 160.00 * quantity;
			return price;
			
		}else if (foodName == "Momos"){
            price = 90.00 * quantity;
			return price;
			
		}else if (foodName == "Noodles"){
            price = 130.00 * quantity;
			return price;
			
		}else if (foodName == "Sandwich"){
            price = 70.50 * quantity;
			return price;
			
		}else if (foodName == "Salad"){
            price = 60.00 * quantity;
			return price;
			
		}else if (foodName == "Paneer Tikka"){
            price = 150.00 * quantity;
			return price;
			
		}else if (foodName == "Dosa"){
            price = 80.00 * quantity;
			return price;
			
		}else if (foodName == "Idli"){
            price = 50.00 * quantity;
			return price;
			
		}else if (foodName == "Vada Pav"){
            price = 30.00 * quantity;
			return price;
			
		}else if (foodName == "Samosa"){
            price = 25.00 * quantity;
			return price;
			
		}else if (foodName == "Kathi Roll"){
            price = 100.00 * quantity;
			return price;
			
		}else if (foodName == "Tandoori Chicken"){
            price = 200.00 * quantity;
			return price;
			
		}else if (foodName == "Chole Bhature"){
            price = 90.00 * quantity;
			return price;
			
		}else if (foodName == "Aloo Paratha"){
            price = 60.00 * quantity;
			return price;
			
		}else if (foodName == "Pav Bhaji"){
            price = 85.00 * quantity;
			return price;
			
		}else if (foodName == "Thali"){
            price = 180.00 * quantity * quantity;
			return price;
			
		}else if (foodName == "Manchurian"){
            price = 110.00 * quantity;
			return price;
			
		}else if (foodName == "Soup"){
            price = 70.00 * quantity;
			return price;
			
		}else if (foodName == "Kebabs"){
            price = 190.00 * quantity;
			return price;
			
		}else if (foodName == "Spring Roll"){
            price = 95.00 * quantity;
			return price;
			
		}else if (foodName == "Masala Dosa"){
            price = 90.00 * quantity;
			return price;
			
		}else if (foodName == "Fish Curry"){
            price = 210.00 * quantity;
			return price;
			
		}else if (foodName == "Paneer Butter Masala"){
            price = 160.00 * quantity;
			return price;
			
		}else if (foodName == "Butter Naan"){
            price = 40.00 * quantity;
			return price;
			
		}else if (foodName == "Ice Cream"){
            price = 50.00 * quantity;
			return price;
			
		}
		
        return price;
    }
}
