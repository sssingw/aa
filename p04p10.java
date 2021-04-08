import java.util.Scanner;

public class p04p10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int inputnum = sc.nextInt();
		int num = 0;
		int sum = 0;
		
		for (int i = 2; i < 10; i++) {	
			sum += Process(i);
			
			if (i == 2) {
				i = Process(i);
			} else {
				i = sum - i;
			}
			System.out.println(inputnum+"X" +i+ "=" + inputnum * i);					
		}
	}

	private static int Process(int number) {
		
		
		if (number == 2) {
			return number;			
		} else {
			return number + Process(--number);
		}
		}
	}

