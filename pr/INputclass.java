package pr;

import java.util.Scanner;

public class INputclass {

	
	
	public int inputFromConsolewon() {   //원화 입력받을 곳
			
		Scanner sc = new Scanner (System.in);  //메인은 스캐너가 절대 닫히지 않음, 클래스는 클래스가 소멸되면 같이 없어짐
		System.out.print("원화를 입력하세요\n"
				 + "종료하겠습니다, press : 00\n");	
						
		int input_korMoney = sc.nextInt();								
		return input_korMoney;
	}
	
	
	public int inputFromConsoletype() {
			
		Scanner sc = new Scanner (System.in);	
		System.out.println("어떤 돈으로 환전하시겠습니까??\n"
				+ "1. USD\n" 
				+ "2. EUR\n"
				+ "3. JPY\n"
				+ "4. Exit\n"
				+ "0. input money again");	
		
		int inputnum = sc.nextInt(); 		//입력값의 바꿀 타입 받을 곳
		return inputnum;
	}				
}
