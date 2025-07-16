public class GrubhubRunner {

	public static void main(String[] args) {
	
		String foodName = "Kimchi";
		double price = Grubhub.takeOrder(foodName);
		System.out.println("The price of "+ foodName + "is : Rs " + price);
		
		int quantity = 3;
		
		double priceWithQuantity = Grubhub.takeOrder(foodName, quantity);
        System.out.println("The price of "+ foodName + " with Quantity " + quantity + " is : Rs " + priceWithQuantity);
    }
}
