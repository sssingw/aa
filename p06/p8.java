package p06;

import java.util.ArrayList;
import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		String word = sc.next();
		char [] word_unit = word.toCharArray(); 
		
		int achii_first = 0;
		int achii_second = 0;
		int diff = 0;
		
		char [] alphabet = {'a','b','c','d'};
		for (int i = 0; i < alphabet.length; i++) {
			achii_first = (int)alphabet[i];   //�ٲ� ���
			achii_second = (int)alphabet[i + (alphabet.length - i)];   //�ٲ��� ���
			diff = achii_first - achii_second;  //�� ���� ����
			
			if (word_unit[i] == (alphabet[i]))  {
				System.out.println(achii_second);
			}
		}
		
				
	} 	
}
