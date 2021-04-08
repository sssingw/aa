package p06;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		while (true) {
			
			String inputnum1 = sc.nextLine();
			String inputnum2 = sc.nextLine();
			charat(inputnum1,inputnum2);
		}
	}
	
	public static void charat(String a, String b) {
		char [] inputnum2 = new char[b.length()];
		char [] inputnum1 = new char[a.length()];
		for (int i = 0; i < b.length(); i++) {
			inputnum2 [i] = b.charAt(i);
		}
		
		for (int i = 0; i < a.charAt(i); i++) {
			inputnum1 [i] = a.charAt(i);
		}
		
		int min = Integer.MAX_VALUE;
		int cnt = 0;
		int cnt2 = 0;
		for (int i = 0; i < b.length(); i++) {
			cnt = 0;
			for (int j = 0; j < a.length(); j++) {
				if (inputnum2[i] == inputnum1[j]) {
					cnt++;
				}
				cnt2 = 0;
				for (int k = 0; k < b.length(); k++) {
					if (inputnum2[i] == inputnum2[k]) {
						cnt2++;
					}
				}
			} if (cnt2 != 0) {
				cnt = (int) (cnt/cnt2);
			}
			if(cnt < min) {
				min = cnt;
			}
		} System.out.printf("you can make %s outof sentence %d times ",b,min);
	}

}
