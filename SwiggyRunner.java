public class SwiggyRunner {
    public static void main(String[] args) {
        
		String foodName = "Pizza";
		double price = Swiggy.takeOrder(foodName);
		System.out.println("The price of "+ foodName + "is : Rs " + price);
		
		int quantity = 3;
		
		double priceWithQuantity = Swiggy.takeOrder(foodName, quantity);
        System.out.println("The price of "+ foodName + " with Quantity " + quantity + " is : Rs " + priceWithQuantity);
    }
}
