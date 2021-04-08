package pr;

public class outputClass {

	//각각의 화폐를 출력할 곳
	public void outputResultUSD(int dollar) {
		
		System.out.println("<달러로 환전 결과 : "+(int)dollar+"달러>");
		int [] returnDollar_unit = {100, 50, 20, 10, 1};
			for (int i = 0; i< returnDollar_unit.length; i++) {					
				System.out.println(returnDollar_unit[i]+"달러 : "+(int)dollar/returnDollar_unit[i]+"개");
				dollar = dollar%returnDollar_unit[i];
			}
	}

	public void outputResultEuro(int euro) {
	
		System.out.println("<유로로 환전 결과 : "+(int)euro+"유로>");
		int [] returnEuro_unit = {500, 200, 100, 50, 20, 10, 1};
			for (int i = 0; i< returnEuro_unit.length; i++) {					
				System.out.println(returnEuro_unit[i]+"유로 : "+(int)euro/returnEuro_unit[i]+"개");
				euro = euro%returnEuro_unit[i];
			}	
}

	public void outputResultJPY(int jpy) {
		
		System.out.println("<엔화로 환전 결과 : "+(int)jpy+"엔>");
		int [] returnJpy_unit = {500, 100, 50, 10, 5, 1};
			for (int i = 0; i< returnJpy_unit.length; i++) {					
				System.out.println(returnJpy_unit[i]+"엔 : "+(int)jpy/returnJpy_unit[i]+"개");
				jpy = jpy%returnJpy_unit[i];
			}	
	}
	
	public void outputResultWON(int charge) {
		
		System.out.println();					
		System.out.println("<거스름돈 : "+(int)+charge+"원>");
		int [] changeKor_unit = {500, 100, 10};
			for (int i = 0; i< changeKor_unit.length; i++) {
				System.out.println(changeKor_unit[i]+"원 : "+(int)charge/changeKor_unit[i]+"개");
				charge = charge%changeKor_unit[i];
			}					
	}
	}
	