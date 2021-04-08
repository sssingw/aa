
public class bb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text = "Hello? Byeon Seong won";
		char [] t = text.toCharArray();
		System.out.println(t[31]);
		
		int num = 0; 
		for (int i =0; i< text.length(); i++) {
			num = text.indexOf(i);	
			if(i == 5) {
			System.out.println(num);
			}
		}

}
}