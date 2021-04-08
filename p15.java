import java.util.Scanner;

public class p15 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		String formula = sc.next();
			
		if(formula.contains("+")) {		
			int cal_num = formula.indexOf("+");
			String first_num = formula.substring(0, cal_num);
			String second_num = formula.substring(cal_num + 1,formula.length());			
			System.out.println((Double.parseDouble(first_num)) + (Double.parseDouble(second_num)));
			
		} else if(formula.contains("-")) {		
			int cal_subnum = formula.indexOf("-");
			String first_subnum = formula.substring(0, cal_subnum);
			String second_subnum = formula.substring(cal_subnum + 1,formula.length());			
			System.out.println((Double.parseDouble(first_subnum)) - (Double.parseDouble(second_subnum)));
			
		} else if(formula.contains("*")) {		
			int cal_mulnum = formula.indexOf("*");
			String first_mulnum = formula.substring(0, cal_mulnum);
			String second_mulnum = formula.substring(cal_mulnum + 1,formula.length());			
			System.out.println((Double.parseDouble(first_mulnum)) * (Double.parseDouble(second_mulnum)));
			
		} else if(formula.contains("/")) {		
			int cal_divnum = formula.indexOf("/");
			String first_divnum = formula.substring(0, cal_divnum);
			String second_divnum = formula.substring(cal_divnum + 1,formula.length());			
			System.out.println((Double.parseDouble(first_divnum)) / (Double.parseDouble(second_divnum)));		
		}
	}		
}	
	

