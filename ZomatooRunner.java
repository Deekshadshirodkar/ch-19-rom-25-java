public class ZomatooRunner {

    public static void main(String[] args) {
	
		String foodName = "Chili Paneer";
		double price = Zomatoo.takeOrder(foodName);
		System.out.println("The price of "+ foodName + "is : Rs " + price);
		
		int quantity = 4;
		
		double priceWithQuantity = Zomatoo.takeOrder(foodName, quantity);
        System.out.println("The price of "+ foodName + " with Quantity " + quantity + " is : Rs " + priceWithQuantity);
    }
}