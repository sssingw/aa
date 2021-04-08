import java.util.Scanner;

public class p04p8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int P = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - r; j++) {
				for (int m = 1; m <= r; m++) {
			P = Processn(i) / (Processr(j) * Processr(m));
				}	
			}
		}
		 System.out.println(P);
	}
	
	private static int Processn(int number) {
		if (number == 1) {
			return 1; 
		} else {
			return number * Processn(--number);
		}
	}
	
	private static int Processr(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * Processr(--number);
		}
	}	
}
