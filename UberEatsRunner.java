public class UberEatsRunner {

    public static void main(String[] args) {
	
        double cost = UberEats.takeOrder("Tiramisu");
        System.out.println("Total Bill from Uber Eats: Rs" + cost);
    }
}
