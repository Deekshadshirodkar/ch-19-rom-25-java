public class UberEatsRunner {

    public static void main(String[] args) {
	
		String foodName = "Onion Rings";
		double price = UberEats.takeOrder(foodName);
		System.out.println("The price of "+ foodName + "is : Rs " + price);
		
		int quantity = 2;
		
		double priceWithQuantity = UberEats.takeOrder(foodName, quantity);
        System.out.println("The price of "+ foodName + " with Quantity " + quantity + " is : Rs " + priceWithQuantity);
    }
}