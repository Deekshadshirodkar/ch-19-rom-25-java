public class GrubhubRunner {

    public static void main(String[] args) {
	
        double price = Grubhub.takeOrder("Buffalo Wings");
        System.out.println("Total Bill from GrubHub: Rs" + price);
    }
}
