class Reverse{
	
	public static void main(String[] args){
		
		int number = 1234, reverse = 0;
		
		System.out.println("Original Number: " +number);
		
		while(number != 0){
			
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
			
		}
		System.out.println("Reverse of an integer is: " +reverse);

	}
}	