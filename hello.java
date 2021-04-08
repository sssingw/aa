import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String inputsen = sc.next();
		
		String sen = "hello";
		
		if (inputsen.equalsIgnoreCase(sen)) {
			System.out.println("Correct!");
		} else { 
			System.out.println("Error!");
		}
		
		

	}

}
