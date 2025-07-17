class FlipkartRunner {
	
    public static void main(String[] args) {
		
        boolean isSellerRegistered = Flipkart.registerSeller("SELL999", "Electronics", "Whitefield", "Bangalore", 4.5);
        System.out.println("Is Seller Registered: " + isSellerRegistered);

        if (isSellerRegistered) {
            Flipkart.getSellerInfo();
        }
    }
}
