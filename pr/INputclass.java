package pr;

import java.util.Scanner;

public class INputclass {

	
	
	public int inputFromConsolewon() {   //��ȭ �Է¹��� ��
			
		Scanner sc = new Scanner (System.in);  //������ ��ĳ�ʰ� ���� ������ ����, Ŭ������ Ŭ������ �Ҹ�Ǹ� ���� ������
		System.out.print("��ȭ�� �Է��ϼ���\n"
				 + "�����ϰڽ��ϴ�, press : 00\n");	
						
		int input_korMoney = sc.nextInt();								
		return input_korMoney;
	}
	
	
	public int inputFromConsoletype() {
			
		Scanner sc = new Scanner (System.in);	
		System.out.println("� ������ ȯ���Ͻðڽ��ϱ�??\n"
				+ "1. USD\n" 
				+ "2. EUR\n"
				+ "3. JPY\n"
				+ "4. Exit\n"
				+ "0. input money again");	
		
		int inputnum = sc.nextInt(); 		//�Է°��� �ٲ� Ÿ�� ���� ��
		return inputnum;
	}				
}
