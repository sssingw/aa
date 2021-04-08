import java.util.Scanner;

public class p0305p14 {

	public static void main(String[] args) {    // 그다음 단어부터 쓰기 위해서는 해당 단어의 길이만큼 더해서 시작
		
		Scanner sc = new Scanner (System.in);
		String inputsen = sc.nextLine();
		String [] inputsen_group = inputsen.split(" ");
		
		char [] words = {'a', 'e', 'i', 'o', 'u'};
		String a = "a";
		String an = "an";
		int calculate_num1 = inputsen.indexOf(a);
		int calculate_num2 = inputsen.indexOf(an);
		
		for(int i = 0; i < inputsen_group.length; i++) {
			if (inputsen_group[i].equals(a)) {
			String first_sen_a = inputsen.substring(0, calculate_num1);    //a 기준으로 첫번째 문장 짜르기
			String second_sen_a = inputsen.substring(calculate_num1 + a.length(), inputsen.length()); //a 기준으로 두번째 문자 짜르기	
			String vowel1 = inputsen.substring(calculate_num1, calculate_num1 + a.length()); //a만 뽑아내기
			char second_sen_first1 = inputsen.substring(calculate_num1, calculate_num1 + a.length()).charAt(0);   //두번째 문장의 첫번째 문자
						
				for (int j = 0; j < words.length; j++) {
					if((second_sen_first1 == (words[j]))) {
					vowel1 = "an";
					} 
				}			
			System.out.println(first_sen_a+vowel1+second_sen_a);
			
			} else if (inputsen_group[i].equals(an)) {
			String first_sen_an = inputsen.substring(0, calculate_num2); //an 기준으로 첫번째 문장 짜르기
			String second_sen_an = inputsen.substring(calculate_num2 + an.length(), inputsen.length());	//an 기준으로 두번째 문자 짜르기		
			String vowel2 = inputsen.substring(calculate_num2, calculate_num2 + an.length()); //an만 뽑아내기
			char second_sen_first2 = inputsen.substring(calculate_num2, calculate_num2 + an.length()).charAt(0);   //두번째 문장의 첫번째 문자
			
				for (int j = 0; j < words.length; j++) {
					if((second_sen_first2 != (words[j]))) {
						vowel2 = "a";
					} 
				}
				System.out.println(first_sen_an+vowel2+second_sen_an);
			}
		}
  }
}
