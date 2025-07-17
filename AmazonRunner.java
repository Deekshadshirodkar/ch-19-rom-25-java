class AmazonRunner {
	
    public static void main(String[] args) {
		
        boolean isSellerCreated = Amazon.createSeller("MegaMart", "Home & Kitchen", "Mumbai", "9845671234", 4.6);
        System.out.println("Is Seller Created: " + isSellerCreated);

        if (isSellerCreated) {
            Amazon.getSellerInfo();
        }
    }
}
