package pr;

import java.util.Scanner;

public class practicemain {

	public static void main(String[] args) {
					
			RunExchangeClass runClass = new RunExchangeClass();
			INputclass inputclass = new INputclass();
			constt ct = new constt();
			
			while(true) {
				
				int kor = inputclass.inputFromConsolewon();																		
				int type = inputclass.inputFromConsoletype();
													
				if (type == constvalue.AGAIN) {
					continue;
				}
				
				if (type == constvalue.CHANGE_TYPE_USD) {	
					System.out.println();
					runClass.changeToUSD(kor);    
					
				} else if (type == constvalue.CHANGE_TYPE_EUR) {
					System.out.println();
					runClass.changeToEUR(kor);
				
				} else if (type == constvalue.CHANGE_TYPE_JPY) {
					System.out.println();
					runClass.changeToJPY(kor);
				
				} else if (type == constvalue.EXIT)
					break;
					
				System.out.println();
				System.out.println("-----------------------------------");	
			} 					
	} 				
}							