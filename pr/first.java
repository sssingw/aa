package pr;

import java.util.Scanner;

public class first {

	public static void main123(String[] args) {
		
		int kor = 0;
		int inputnum;
		
	while(true) {
			System.out.print("��ȭ�� �Է��ϼ���\n"
							 + "�����ϰڽ��ϴ�, press : 00\n");					
			Scanner sc = new Scanner (System.in);				
			kor = sc.nextInt();	
			if (kor == 00) {
				break;
			}
						
			System.out.println("� ������ ȯ���Ͻðڽ��ϱ�??\n"
								+ "1. USD\n" 
								+ "2. EUR\n"
								+ "3. JPY\n"
								+ "4. Exit\n"
								+ "0. input money again");	
					
			inputnum = sc.nextInt(); 			
			if (inputnum ==1) {	
				System.out.println();
				getDollar(kor);
				
			} else if (inputnum ==2) {
				System.out.println();
				getEuro(kor);
			
			} else if (inputnum ==3) {
				System.out.println();
				getJpy(kor);
			
			} else if (inputnum ==4) {
				System.out.println("����");
				break;
				
			} else if (inputnum ==0) {
				continue;				
			}
			
			System.out.println("-----------------------------------");						
	} 
	}		

		public static void getDollar(int won) {		
			double dollar = won/1134.30;
			double r = Math.round((dollar-(int)dollar)*1134.30);
			int realreturn = ((int)r/10)*10;
			
			System.out.println("<�޷��� ȯ�� ��� : "+(int)dollar+"�޷�>");
			int [] returndollar = {100, 50, 20, 10, 1};
				for (int i = 0; i< returndollar.length; i++) {					
					System.out.println(returndollar[i]+"�޷� : "+(int)dollar/returndollar[i]+"��");
					dollar = dollar%returndollar[i];
				}	
			System.out.println();					
			System.out.println("<�Ž����� : "+(int)+realreturn+"��>");
			int [] returnkor = {500, 100, 10};
				for (int i = 0; i< returnkor.length; i++) {
					System.out.println(returnkor[i]+"�� : "+(int)realreturn/returnkor[i]+"��");
					realreturn = realreturn%returnkor[i];
				}		
		}
				
		public static void getEuro(int won) {	
			double euro = won/1333.23;
			double r1 = Math.round((euro-(int)euro)*1333.23);
			int realreturn1 = ((int)r1/10)*10;
						
			System.out.println("<���η� ȯ�� ��� : "+(int)euro+"����>");
			int [] returneuro = {500, 200, 100, 50, 20, 10, 1};
				for (int i = 0; i< returneuro.length; i++) {					
					System.out.println(returneuro[i]+"���� : "+(int)euro/returneuro[i]+"��");
					euro = euro%returneuro[i];
				}	
			System.out.println();
			System.out.println("<�Ž����� : "+(int)+realreturn1+"��>");
			int [] returnkor = {500, 100, 10};
				for (int i = 0; i< returnkor.length; i++) {
					System.out.println(returnkor[i]+"�� : "+(int)realreturn1/returnkor[i]+"��");
					realreturn1 = realreturn1%returnkor[i];
				}
		}
				
		public static void getJpy(int won) {
			double jpy = won/1030.59;
			double r2 = Math.round((jpy-(int)jpy)*1030.59);
			int realreturn2 = ((int)r2/10)*10;
			
			System.out.println("<��ȭ�� ȯ�� ��� : "+(int)jpy+"��>");
			int [] returnjpy = {500, 100, 50, 10, 5, 1};
				for (int i = 0; i< returnjpy.length; i++) {					
					System.out.println(returnjpy[i]+"�� : "+(int)jpy/returnjpy[i]+"��");
					jpy = jpy%returnjpy[i];
				}	
			System.out.println();
			System.out.println("<�Ž����� : "+(int)+realreturn2+"��>");
			int [] returnkor = {500, 100, 10};
				for (int i = 0; i< returnkor.length; i++) {
					System.out.println(returnkor[i]+"�� : "+(int)realreturn2/returnkor[i]+"��");
					realreturn2 = realreturn2%returnkor[i];
				}
		}		
}					
	
 
 






