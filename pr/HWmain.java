package pr;

import java.util.Scanner;

public class HWmain {

public static void main123(String[] args) {
				
	RunExchangeClass runClass = new RunExchangeClass();
	
	while(true) {
		System.out.print("��ȭ�� �Է��ϼ���\n"
						 + "�����ϰڽ��ϴ�, press : 00\n");					
		Scanner sc = new Scanner (System.in);				
		int input_korMoney = sc.nextInt();	
		if (input_korMoney == 00) {
			break;
		}
					
		System.out.println("� ������ ȯ���Ͻðڽ��ϱ�??\n"
							+ "1. USD\n" 
							+ "2. EUR\n"
							+ "3. JPY\n"
							+ "4. Exit\n"
							+ "0. input money again");	
				
		int inputnum = sc.nextInt(); 		
		if (constvalue.AGAIN) {
			continue;
		}
		if (inputnum == constvalue.CHANGE_TYPE_USD) {	
			System.out.println();
			runClass.changeToUSD(input_korMoney);
			
		} else if (inputnum == constvalue.CHANGE_TYPE_EUR) {
			System.out.println();
			runClass.changeToEUR(input_korMoney);
		
		} else if (inputnum == constvalue.CHANGE_TYPE_JPY) {
			System.out.println();
			runClass.changeToJPY(input_korMoney);
		
		} else if (constvalue.EXIT) {
			System.out.println("����");
			break;
			
		} 
		
		System.out.println("-----------------------------------");			
		
	} if (constvalue.EXIT) {
		
	}
	} 
}			
		









