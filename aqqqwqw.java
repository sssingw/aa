import java.util.Scanner;

public class aqqqwqw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int inputnum = sc.nextInt();
		
		Process(inputnum);							
	}
	
	private static void Process(int inputnum) {
				
		for (int number = 2; number < 10; number++) {			
			System.out.println(inputnum+"X" +number+ "=" + inputnum * number);
		}
	}
}