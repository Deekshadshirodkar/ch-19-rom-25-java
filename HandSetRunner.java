class HandSetRunner{

	public static void main(String handset[]){
	
		String name  = "Ganapati";
		long contactNo = HandSet.getContactNoByName(name);
		System.out.println("The Contact No of " + name + " is " + contactNo);
		
	}
}