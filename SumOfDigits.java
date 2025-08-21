class SumOfDigits {
	
	public static void main(String[] sumofdigits){
		
		int number = 123456789;
		int sum = 0;
		
		while(number != 0){
			
			int digit = number % 10;
			sum += digit;
			number /= 10;
			
		}
		
		System.out.println("The sum of the digits : " + sum);
	
	}
}
