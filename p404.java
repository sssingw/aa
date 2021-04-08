import java.util.Scanner;

public class p404 {

  public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	String formula = sc.next();
	char b = getOperator(formula);
		
	if(b == '+') {		
		int cal_num = formula.indexOf("+");
		String first_num = formula.substring(0, cal_num);
		String second_num = formula.substring(cal_num + 1,formula.length());	
		addition(Double.parseDouble(first_num),Double.parseDouble(second_num));
		
	} else if(b == '-') {		
		int cal_subnum = formula.indexOf("-");
		String first_subnum = formula.substring(0, cal_subnum);
		String second_subnum = formula.substring(cal_subnum + 1,formula.length());			
		subtraction(Double.parseDouble(first_subnum),Double.parseDouble(second_subnum));
		
	} else if(b == '*') {		
		int cal_mulnum = formula.indexOf("*");
		String first_mulnum = formula.substring(0, cal_mulnum);
		String second_mulnum = formula.substring(cal_mulnum + 1,formula.length());			
		multiplication(Double.parseDouble(first_mulnum),Double.parseDouble(second_mulnum));
		
	} else if(b == '/') {		
		int cal_divnum = formula.indexOf("/");
		String first_divnum = formula.substring(0, cal_divnum);
		String second_divnum = formula.substring(cal_divnum + 1,formula.length());			
		division(Double.parseDouble(first_divnum),Double.parseDouble(second_divnum));
	}						
  }	
		
	public static double addition (double num1, double num2) {
		
		double add = num1 + num2;
		System.out.println(add);
		return add;
	}
		
	public static double subtraction (double num1, double num2) {
		
		double sub = num1 - num2;
		System.out.println(sub);
		return sub;
	}
	
	public static double multiplication (double num1, double num2) {

		double multi = num1 * num2;
		System.out.println(multi);
		return multi;
	}
	
	public static double division (double num1, double num2) {
	
		double divi = num1 / num2;
		System.out.println(divi);
		return divi;
	}
	
	public static char getOperator(String inputcal) {
		char a = 0;
		
		if (inputcal.contains("+")) {
			a = '+';					
		} else if (inputcal.contains("-")) {
			a = '-';					
		} else if (inputcal.contains("*")) {
			a = '*';
		} else if (inputcal.contains("/")) {
			a = '/';
		} return a;		
	}
}