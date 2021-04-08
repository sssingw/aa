import java.util.Scanner;

public class p04p11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		double[] subject = new double[num];
		String [] grade = new String[num];
		double [] score = new double[num];
		double sunm = 0; subsum = 0, GPA = 0;
		
		for (int i = 0; i < num; i++) {
			subject[i] = sc.nextDouble();			
		} 
			for (int i = 0; i < num; i++) {
				grade [i] = sc.next();
				
			if (grade[i].compareTo("A+") == 0) {
				score[i] = 4.5;
			} else if (grade[i].equals("A0") == true) {
				score [i] = 4.0;
			} else if (grade[i].equals("B+") == true) {
				score [i] = 3.5;
			} else if (grade[i].equals("B0") == true) {
				score [i] = 3.0;
			} else if (grade[i].equals("C+") == true) {
				score [i] = 2.5;
			} else if (grade[i].equals("C0") == true) {
				score [i] = 2.0;
			} else if (grade[i].equals("F") == true) {
				score [i] = 0;			
			} 
			sum += subject[i] * score [i] ;
			subsum += subject [i];
		}	
}