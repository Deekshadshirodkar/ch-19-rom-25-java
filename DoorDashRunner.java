public class DoorDashRunner {

    public static void main(String[] args) {
	
		String foodName = "Egg Roll";
		double price = DoorDash.takeOrder(foodName);
		System.out.println("The price of "+ foodName + "is : Rs " + price);
		
		int quantity = 3;
		
		double priceWithQuantity = DoorDash.takeOrder(foodName, quantity);
        System.out.println("The price of "+ foodName + " with Quantity " + quantity + " is : Rs " + priceWithQuantity);
    }
}