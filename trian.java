import java.util.Scanner;

public class trian {

		
		final static String [] CHO = {"ぁ", "あ", "い", "ぇ", "え", "ぉ", "け", "げ", "こ", "さ",
				"ざ", "し", "じ", "す", "ず", "せ", "ぜ", "そ", "ぞ"};
		final static String [] Joong = {"た", "だ", "ち", "ぢ", "っ", "つ", "づ", "て", "で", "と",
				"ど", "な", "に", "ぬ", "ね", "の", "は", "ば", "ぱ", "ひ", "び"};
		final static String [] Jong = {"", "ぁ", "あ", "ぃ", "い", "ぅ", "う", "ぇ", "ぉ", "お",
				"か", "が", "き", "ぎ", "く", "ぐ", "け", "げ", "ご", "さ", "ざ", "し", "じ", "ず", "せ", "ぜ", "そ", "ぞ"};
		
	public static void main(String[] args) { String text = "照括馬室推";

		for (int i =0; i <text.length(); i++) {
			char unival = text.charAt(i);
			
					if(unival >= 0xAC00) {
						unival = (char)(unival - 0xAC00);
						
						char cho = (char)(unival/28/21);
						char joong = (char)((unival)/28%21);
						char jong = (char)(unival % 28);
						
						System.out.print(CHO[cho] + Joong[joong] + Jong[jong]);
						} else {
							System.out.print(unival);
						}
		}
	}

}
