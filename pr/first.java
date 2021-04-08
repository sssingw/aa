package pr;

import java.util.Scanner;

public class first {

	public static void main123(String[] args) {
		
		int kor = 0;
		int inputnum;
		
	while(true) {
			System.out.print("원화를 입력하세요\n"
							 + "종료하겠습니다, press : 00\n");					
			Scanner sc = new Scanner (System.in);				
			kor = sc.nextInt();	
			if (kor == 00) {
				break;
			}
						
			System.out.println("어떤 돈으로 환전하시겠습니까??\n"
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
				System.out.println("종료");
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
			
			System.out.println("<달러로 환전 결과 : "+(int)dollar+"달러>");
			int [] returndollar = {100, 50, 20, 10, 1};
				for (int i = 0; i< returndollar.length; i++) {					
					System.out.println(returndollar[i]+"달러 : "+(int)dollar/returndollar[i]+"개");
					dollar = dollar%returndollar[i];
				}	
			System.out.println();					
			System.out.println("<거스름돈 : "+(int)+realreturn+"원>");
			int [] returnkor = {500, 100, 10};
				for (int i = 0; i< returnkor.length; i++) {
					System.out.println(returnkor[i]+"원 : "+(int)realreturn/returnkor[i]+"개");
					realreturn = realreturn%returnkor[i];
				}		
		}
				
		public static void getEuro(int won) {	
			double euro = won/1333.23;
			double r1 = Math.round((euro-(int)euro)*1333.23);
			int realreturn1 = ((int)r1/10)*10;
						
			System.out.println("<유로로 환전 결과 : "+(int)euro+"유로>");
			int [] returneuro = {500, 200, 100, 50, 20, 10, 1};
				for (int i = 0; i< returneuro.length; i++) {					
					System.out.println(returneuro[i]+"유로 : "+(int)euro/returneuro[i]+"개");
					euro = euro%returneuro[i];
				}	
			System.out.println();
			System.out.println("<거스름돈 : "+(int)+realreturn1+"원>");
			int [] returnkor = {500, 100, 10};
				for (int i = 0; i< returnkor.length; i++) {
					System.out.println(returnkor[i]+"원 : "+(int)realreturn1/returnkor[i]+"개");
					realreturn1 = realreturn1%returnkor[i];
				}
		}
				
		public static void getJpy(int won) {
			double jpy = won/1030.59;
			double r2 = Math.round((jpy-(int)jpy)*1030.59);
			int realreturn2 = ((int)r2/10)*10;
			
			System.out.println("<엔화로 환전 결과 : "+(int)jpy+"엔>");
			int [] returnjpy = {500, 100, 50, 10, 5, 1};
				for (int i = 0; i< returnjpy.length; i++) {					
					System.out.println(returnjpy[i]+"엔 : "+(int)jpy/returnjpy[i]+"개");
					jpy = jpy%returnjpy[i];
				}	
			System.out.println();
			System.out.println("<거스름돈 : "+(int)+realreturn2+"원>");
			int [] returnkor = {500, 100, 10};
				for (int i = 0; i< returnkor.length; i++) {
					System.out.println(returnkor[i]+"원 : "+(int)realreturn2/returnkor[i]+"개");
					realreturn2 = realreturn2%returnkor[i];
				}
		}		
}					
	
 
 






