import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int change = input1 - input2;
		
		int [] unit = {10000, 5000, 1000, 500, 100, 50, 10};
		System.out.println(change);
		for (int i = 0; i<unit.length-1; i++) {
			System.out.println(unit[i]+":"+change/unit[i]+"Àå");
			change = change%unit[i];
		}
	}

}
