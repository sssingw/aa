package p06;

import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		String inputsen = sc.next();
		String [] inputsen_group = inputsen.split(",");
						
		for (int i = 0; i < inputsen_group.length; i++) {
			System.out.println(inputsen_group[i]);
		}
	}

}
