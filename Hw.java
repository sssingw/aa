import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int inputnum = sc.nextInt();
		
		for (int i = 0; i < inputnum; i++) {
			System.out.println(Fibonacci(i));
		}
		
		
	}	
		public static int Fibonacci (int number) {
						
			if(number <= 1) {
				return number;				
			} else {
				return Fibonacci(number - 2) + Fibonacci(number -1);
			}
			
		}
}


