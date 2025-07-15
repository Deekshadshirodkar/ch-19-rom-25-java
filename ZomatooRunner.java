public class ZomatooRunner {

    public static void main(String[] args) {
	
        double price = Zomatoo.takeOrder("Cheesecake");
        System.out.println("Total Bill from Zomato: Rs" + price);
    }
}
