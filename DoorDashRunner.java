public class DoorDashRunner {

    public static void main(String[] args) {
	
        double price = DoorDash.takeOrder("Corn Dog");
        System.out.println("Total Bill from DoorDash: Rs" + price);
    }
}
