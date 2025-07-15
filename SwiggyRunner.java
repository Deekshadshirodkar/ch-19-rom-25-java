public class SwiggyRunner {
    public static void main(String[] args) {
        
		double price = Swiggy.takeOrder("Pizza");
		
        System.out.println("Total Bill: Rs" + price);
    }
}
