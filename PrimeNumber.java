class PrimeNumber{

	public static void main(String[] args){
		
		int primeNumber = 29;
		boolean number = false;
		
		if( primeNumber == 0 || primeNumber == 1){
			number = true;
			
		}
		
		for( int i=2; i <= primeNumber/2; i++){
			
			if(primeNumber % i == 0){
				number = true;
				break;
			
			}
		
		}
		
		if( !number )
			System.out.println( primeNumber + " is a prime number");
		else
			System.out.println( primeNumber + " is not a prime number");
	}

}