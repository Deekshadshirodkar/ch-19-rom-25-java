class ZomatoRunner {
	
    public static void main(String[] args) 
	
        boolean isRestaurantRegistered = Zomato.registerRestaurant("Tandoori Nights", "Hyderabad", 4.3, "Mr. Reddy", "ZMT890765");
        System.out.println("Is Restaurant Registered: " + isRestaurantRegistered);

        if (isRestaurantRegistered) {
            Zomato.getRestaurantInfo();
        }
    }
}
