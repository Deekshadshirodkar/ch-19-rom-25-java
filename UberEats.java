class UberEats {

    public static double takeOrder(String foodName) {

        double price = 0.0;

        if (foodName == "Beef Steak"){
            price = 240.00;
			return price;
			
        }else if (foodName == "Tuna Sushi"){
            price = 260.00;
			return price;
			
        }else if (foodName == "Avocado Toast"){
            price = 130.00;
			return price;
			
        }else if (foodName == "Chocolate Mousse"){
            price = 150.00;
			return price;
			
		}else if (foodName == "Greek Salad"){
            price = 120.00;
			return price;
			
		}else if (foodName == "Egg Benedict"){
            price = 145.00;
			return price;
			
		}else if (foodName == "Pad Thai"){
            price = 170.00;
			return price;

		}else if (foodName == "Waffles"){
            price = 100.00;
			return price;
			
		}else if (foodName == "Veg Lasagna"){
            price = 180.00;
			return price;
			
		}else if (foodName == "Focaccia"){
            price = 90.00;
			return price;
			
		}else if (foodName == "Tempura"){
            price = 160.00;
			return price;
			
		}else if (foodName == "Pulled Pork"){
            price = 220.00;
			return price;
			
		}else if (foodName == "Lamb Chops"){
            price = 250.00;
			return price;
			
		}else if (foodName == "Mutton Curry"){
            price = 210.00;
			return price;
			
		}else if (foodName == "Stuffed Peppers"){
            price = 140.00;
			return price;
			
		}else if (foodName == "Crispy Tofu"){
			price = 110.00;
			return price;
			
		}else if (foodName == "Prawn Curry"){
            price = 230.00;
			return price;
			
		}else if (foodName == "Turkey Sandwich"){
            price = 130.00;
			return price;
			
		}else if (foodName == "Banana Split"){
            price = 80.00;
			return price;
			
		}else if (foodName == "Gnocchi"){
            price = 170.00;
			return price;
			
		}else if (foodName == "Bruschetta"){
            price = 90.00;
			return price;
			
		}else if (foodName == "Quesadilla"){
			price = 135.00;
			return price;
			
		}else if (foodName == "Pho"){
            price = 155.00;
			return price;
			
		}else if (foodName == "Enchiladas"){
            price = 160.00;
			return price;
			
		}else if (foodName == "Clam Chowder"){
            price = 175.00;
			return price;
			
		}else if (foodName == "Ratatouille"){
            price = 145.00;
			return price;
			
		}else if (foodName == "Tiramisu"){
            price = 150.00;
			return price;
			
		}else if (foodName == "Onion Rings"){
            price = 70.00;
			return price;
		}
		
		return price;
		
	}
	
	
	public static double takeOrder(String foodName, int quantity) {

        double price = 0.0;

        if (foodName == "Beef Steak"){
            price = 240.00 * quantity;
			return price;
			
        }else if (foodName == "Tuna Sushi"){
            price = 260.00 * quantity;
			return price;
			
        }else if (foodName == "Avocado Toast"){
            price = 130.00 * quantity;
			return price;
			
        }else if (foodName == "Chocolate Mousse"){
            price = 150.00 * quantity;
			return price;
			
		}else if (foodName == "Greek Salad"){
            price = 120.00 * quantity;
			return price;
			
		}else if (foodName == "Egg Benedict"){
            price = 145.00 * quantity;
			return price;
			
		}else if (foodName == "Pad Thai"){
            price = 170.00 * quantity;
			return price;

		}else if (foodName == "Waffles"){
            price = 100.00 * quantity;
			return price;
			
		}else if (foodName == "Veg Lasagna"){
            price = 180.00 * quantity;
			return price;
			
		}else if (foodName == "Focaccia"){
            price = 90.00 * quantity;
			return price;
			
		}else if (foodName == "Tempura"){
            price = 160.00 * quantity;
			return price;
			
		}else if (foodName == "Pulled Pork"){
            price = 220.00 * quantity;
			return price;
			
		}else if (foodName == "Lamb Chops"){
            price = 250.00 * quantity;
			return price;
			
		}else if (foodName == "Mutton Curry"){
            price = 210.00 * quantity * quantity;
			return price;
			
		}else if (foodName == "Stuffed Peppers"){
            price = 140.00 * quantity;
			return price;
			
		}else if (foodName == "Crispy Tofu"){
			price = 110.00 * quantity;
			return price;
			
		}else if (foodName == "Prawn Curry"){
            price = 230.00 * quantity;
			return price;
			
		}else if (foodName == "Turkey Sandwich"){
            price = 130.00 * quantity;
			return price;
			
		}else if (foodName == "Banana Split"){
            price = 80.00 * quantity;
			return price;
			
		}else if (foodName == "Gnocchi"){
            price = 170.00 * quantity;
			return price;
			
		}else if (foodName == "Bruschetta"){
            price = 90.00 * quantity;
			return price;
			
		}else if (foodName == "Quesadilla"){
			price = 135.00 * quantity;
			return price;
			
		}else if (foodName == "Pho"){
            price = 155.00 * quantity;
			return price;
			
		}else if (foodName == "Enchiladas"){
            price = 160.00 * quantity;
			return price;
			
		}else if (foodName == "Clam Chowder"){
            price = 175.00 * quantity;
			return price;
			
		}else if (foodName == "Ratatouille"){
            price = 145.00 * quantity;
			return price;
			
		}else if (foodName == "Tiramisu"){
            price = 150.00 * quantity;
			return price;
			
		}else if (foodName == "Onion Rings"){
            price = 70.00 * quantity;
			return price * quantity;
		}
		
		return price;
		
	}
}