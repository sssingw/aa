package pr;

public class outputClass {

	//������ ȭ�� ����� ��
	public void outputResultUSD(int dollar) {
		
		System.out.println("<�޷��� ȯ�� ��� : "+(int)dollar+"�޷�>");
		int [] returnDollar_unit = {100, 50, 20, 10, 1};
			for (int i = 0; i< returnDollar_unit.length; i++) {					
				System.out.println(returnDollar_unit[i]+"�޷� : "+(int)dollar/returnDollar_unit[i]+"��");
				dollar = dollar%returnDollar_unit[i];
			}
	}

	public void outputResultEuro(int euro) {
	
		System.out.println("<���η� ȯ�� ��� : "+(int)euro+"����>");
		int [] returnEuro_unit = {500, 200, 100, 50, 20, 10, 1};
			for (int i = 0; i< returnEuro_unit.length; i++) {					
				System.out.println(returnEuro_unit[i]+"���� : "+(int)euro/returnEuro_unit[i]+"��");
				euro = euro%returnEuro_unit[i];
			}	
}

	public void outputResultJPY(int jpy) {
		
		System.out.println("<��ȭ�� ȯ�� ��� : "+(int)jpy+"��>");
		int [] returnJpy_unit = {500, 100, 50, 10, 5, 1};
			for (int i = 0; i< returnJpy_unit.length; i++) {					
				System.out.println(returnJpy_unit[i]+"�� : "+(int)jpy/returnJpy_unit[i]+"��");
				jpy = jpy%returnJpy_unit[i];
			}	
	}
	
	public void outputResultWON(int charge) {
		
		System.out.println();					
		System.out.println("<�Ž����� : "+(int)+charge+"��>");
		int [] changeKor_unit = {500, 100, 10};
			for (int i = 0; i< changeKor_unit.length; i++) {
				System.out.println(changeKor_unit[i]+"�� : "+(int)charge/changeKor_unit[i]+"��");
				charge = charge%changeKor_unit[i];
			}					
	}
	}
	