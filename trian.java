import java.util.Scanner;

public class trian {

		
		final static String [] CHO = {"��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��"};
		final static String [] Joong = {"��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"};
		final static String [] Jong = {"", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"};
		
	public static void main(String[] args) { String text = "�ȳ��ϼ���";

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
