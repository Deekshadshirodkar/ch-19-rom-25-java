class DoorDash {

    public static double takeOrder(String foodName) {

        double price = 0.0;

        if (foodName == "Egg Roll"){
            price = 75.00;
			return price;
			
		}else if (foodName == "Zinger Burger"){
            price = 140.00;
			return price;
		
        }else if (foodName == "Veggie Delight"){
            price = 110.00;
			return price;
		
        }else if (foodName == "Fried Chicken"){
            price = 165.00;
			return price;
			
        }else if (foodName == "Corn Dog"){
            price = 85.00;
			return price;
			
        }else if (foodName == "Butter Chicken"){
            price = 210.00;
			return price;
			
		}else if (foodName == "Beetroot Salad"){
            price = 100.00;
			return price;
			
        }else if (foodName == "Lemon Tart"){
            price = 95.00;
			return price;
			
        }else if (foodName == "Crab Cakes"){
            price = 240.00;
			return price;
			
        }else if (foodName == "Chicken Caesar Salad"){
            price = 145.00;
			return price;
			
        }else if (foodName == "Bacon Omelette"){
            price = 130.00;
			return price;
			
        }else if (foodName == "Veg Fried Wontons"){
            price = 115.00;
			return price;
			
        }else if (foodName == "Prawn Tempura"){
            price = 200.00;
			return price;
			
        }else if (foodName == "Stuffed Garlic Mushrooms"){
            price = 120.00;
			return price;
			
        }else if (foodName == "Meatball Sub"){
            price = 150.00;
			return price;
			
        }else if (foodName == "Choco Lava Cake"){
            price = 105.00;
			return price;
			
        }else if (foodName == "Chicken Popcorn"){
            price = 110.00;
			return price;
			
        }else if (foodName == "Cold Coffee"){
            price = 75.00;
			return price;
			
        }else if (foodName == "Peach Iced Tea"){
            price = 70.00;
			return price;
			
        }else if (foodName == "Chana Masala"){
            price = 140.00;
			return price;
			
        }else if (foodName == "Vegetable Soup"){
            price = 80.00;
			return price;
			
        }else if (foodName == "Fajitas"){
            price = 180.00;
			return price;
			
        }else if (foodName == "Shrimp Tostada"){
            price = 190.00;
			return price;
			
        }else if (foodName == "Cauliflower Wings"){
            price = 125.00;
			return price;
			
        }else if (foodName == "Paneer Roll"){
            price = 100.00;
			return price;
			
        }else if (foodName == "Coconut Ladoo"){
            price = 50.00;
			return price;
			
        }else if (foodName == "Egg Curry"){
            price = 160.00;
			return price;
			
        }else if (foodName == "Veggie Kathi Wrap"){
            price = 115.00;
			return price;
			
        }else if (foodName == "Spinach Cheese Balls"){
            price = 135.00;
			return price;

        }else if (foodName == "Strawberry Sundae"){
            price = 90.00;
			return price;
		}	

        return price;
    }
	
	
	public static double takeOrder(String foodName, int quantity) {

        double price = 0.0;

        if (foodName == "Egg Roll"){
            price = 75.00 * quantity;
			return price;
			
		}else if (foodName == "Zinger Burger"){
            price = 140.00 * quantity;
			return price;
		
        }else if (foodName == "Veggie Delight"){
            price = 110.00 * quantity;
			return price;
		
        }else if (foodName == "Fried Chicken"){
            price = 165.00 * quantity;
			return price;
			
        }else if (foodName == "Corn Dog"){
            price = 85.00 * quantity;
			return price;
			
        }else if (foodName == "Butter Chicken"){
            price = 210.00 * quantity;
			return price;
			
		}else if (foodName == "Beetroot Salad"){
            price = 100.00 * quantity;
			return price;
			
        }else if (foodName == "Lemon Tart"){
            price = 95.00 * quantity;
			return price;
			
        }else if (foodName == "Crab Cakes"){
            price = 240.00 * quantity;
			return price;
			
        }else if (foodName == "Chicken Caesar Salad"){
            price = 145.00 * quantity;
			return price;
			
        }else if (foodName == "Bacon Omelette"){
            price = 130.00 * quantity;
			return price;
			
        }else if (foodName == "Veg Fried Wontons"){
            price = 115.00 * quantity;
			return price;
			
        }else if (foodName == "Prawn Tempura"){
            price = 200.00 * quantity;
			return price;
			
        }else if (foodName == "Stuffed Garlic Mushrooms"){
            price = 120.00 * quantity;
			return price;
			
        }else if (foodName == "Meatball Sub"){
            price = 150.00 * quantity;
			return price;
			
        }else if (foodName == "Choco Lava Cake"){
            price = 105.00 * quantity;
			return price;
			
        }else if (foodName == "Chicken Popcorn"){
            price = 110.00 * quantity;
			return price;
			
        }else if (foodName == "Cold Coffee"){
            price = 75.00 * quantity;
			return price;
			
        }else if (foodName == "Peach Iced Tea"){
            price = 70.00 * quantity;
			return price;
			
        }else if (foodName == "Chana Masala"){
            price = 140.00 * quantity;
			return price;
			
        }else if (foodName == "Vegetable Soup"){
            price = 80.00 * quantity;
			return price;
			
        }else if (foodName == "Fajitas"){
            price = 180.00 * quantity;
			return price;
			
        }else if (foodName == "Shrimp Tostada"){
            price = 190.00 * quantity;
			return price;
			
        }else if (foodName == "Cauliflower Wings"){
            price = 125.00 * quantity;
			return price;
			
        }else if (foodName == "Paneer Roll"){
            price = 100.00 * quantity;
			return price;
			
        }else if (foodName == "Coconut Ladoo"){
            price = 50.00 * quantity;
			return price;
			
        }else if (foodName == "Egg Curry"){
            price = 160.00 * quantity;
			return price;
			
        }else if (foodName == "Veggie Kathi Wrap"){
            price = 115.00 * quantity;
			return price;
			
        }else if (foodName == "Spinach Cheese Balls"){
            price = 135.00 * quantity;
			return price;

        }else if (foodName == "Strawberry Sundae"){
            price = 90.00 * quantity;
			return price;
		}	

        return price;
    }
}
