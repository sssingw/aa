import java.util.Scanner;

public class pr10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = 0;
		int i = 1;
		
		while ((i <= n) && (i <= m)) {
			if((n % i ==0) && (m % i == 0)) {
				p = i;
			}
			i++;
		} System.out.println(p);
	}
}