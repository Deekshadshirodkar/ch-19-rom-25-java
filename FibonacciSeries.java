import java.util.Scanner;

class FibonacciSeries{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of terms (n) for the Fibonacci series: ");
		int n = input.nextInt();
		
		if(n <= 0){
			System.out.println("Please enter a positive integer for the number of terms: ");
		
		}else if(n == 1){
			System.out.println("Fibonacci series upto 1 term is: 0");
			
		}else {
			
			int a = 0;
			int b = 1;
			
			System.out.println("Fibonacci series upto " +n + " terms:\n " + a + "\n " + b);
			
			for (int i = 2; i < n; i++){
				int nextTerm = a + b;
				System.out.println(" " + nextTerm);
				a = b;
				b = nextTerm;
			
			}
			
			System.out.println();
			
		}
		input.close();
		
	}
}
