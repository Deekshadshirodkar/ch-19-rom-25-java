class Palindrome {
	
	public static void main(String[] args){
		
		int number = 35853, reverse = 0, remainder;
		
		int originalNum = number;
		
		while(number != 0){
			
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
			
		}
		
		if(originalNum == reverse){
			
			System.out.println(originalNum + " is a Palindrome.");
		}
		else{
			
			System.out.println(originalNum + " is not a Palindrome.");
		}
	}
}
