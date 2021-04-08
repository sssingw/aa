package pr;


public class RunExchangeClass {
	
	       
	public outputClass oc = new outputClass ();	
		
	public void changeToUSD(int won) {
		
		double dollar = won/constvalue.USD_rate;	
		int realReturnUSD = (int)dollar;
		
		if(this.checkBalanceUSD(realReturnUSD) == true) {
			
			double r = Math.round((dollar-(int)dollar)*constvalue.USD_rate);
			int change_dollar_Kor = ((int)r/10)*10;			
			int USDcharge = (int)change_dollar_Kor;
					
			oc.outputResultUSD(realReturnUSD); 
			oc.outputResultWON(USDcharge);	
			
			constvalue.BALANCE_USD-=dollar;	
		} else {
			this.Errormessage(constvalue.USDError);
			
		} 
		}										
		

	public void changeToEUR(int won) {
		
		double euro = won/constvalue.EURO_rate;
		int realReturnEUR = (int)euro;
		
		if (euro <= constvalue.BALANCE_EUR) {	
			double r1 = Math.round((euro-(int)euro)*constvalue.EURO_rate);
			int change_euro_Kor = ((int)r1/10)*10;
			int EURcharge = (int)change_euro_Kor;
							
			oc.outputResultEuro(realReturnEUR);		
			oc.outputResultWON(EURcharge);
			
			constvalue.BALANCE_USD-=euro;				
		} else {
			this.Errormessage(constvalue.EURError);
		}
		}									
	
	
	public void changeToJPY(int won) {
		double jpy = won/constvalue.JPY_rate;
		int realReturnJPY = (int)jpy;
		
		if (jpy <= constvalue.BALANCE_EUR) {		
			double r2 = Math.round((jpy-(int)jpy)*constvalue.JPY_rate);
			int change_jpy_Kor = ((int)r2/10)*10;	
			int JPYcharge = (int)change_jpy_Kor;
		
			oc.outputResultJPY(realReturnJPY);			
			oc.outputResultWON(JPYcharge);
		
			constvalue.BALANCE_USD-=jpy;			
		} else { 
			this.Errormessage(constvalue.JPYError);
		}
	}
	
	public boolean checkBalanceUSD(int requestUSD) {
		
		if (requestUSD <= constvalue.BALANCE_USD) {						
			return true;		
		} else {
			return false;
		}
	}
	
	public boolean checkBalanceEUR(int requestEUR) {
			
			if (requestEUR <= constvalue.BALANCE_EUR) {						
				return true;		
			} else {
				return false;
			}		
	}
			
	public boolean checkBalanceJPY(int requestJPY) {
		
			if (requestJPY <= constvalue.BALANCE_JPY) {						
			return true;		
			} else {
			return false;
			}
	}
	
	public void Errormessage(int errorcode) {	
		switch(errorcode) {
			case (constvalue.USDError):
				System.out.println("보유 달러가 부족합니다.");
				break;
			case (constvalue.EURError):
				System.out.println("보유 유로가 부족합니다.");
				break;
			case (constvalue.JPYError):
				System.out.println("보유 엔화가 부족합니다.");
				break;
		} 
}	
	
}
