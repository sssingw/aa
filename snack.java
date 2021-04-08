
public class snack {

	public static void main(String[] args) {
		
		String [] snack = {"오레오", "포카칩", "마이쮸", "초콜릿", "웨하스"};   
		int[] price = {1000,2000,3000,2500,1450};  //가격
		int[] count = { 10,2,1,3,5};  //개수
		double tax_rate=0.1;   //세금율을 저장할 변수
		int total_sum = 0;   //총 지불 금액을 저장할 변수
		
		System.out.printf("**************************************\n");
		System.out.println("항 목	  단 가		수 량	  합 계        \n");
		
		for (int i = 0; i < snack.length;i++) {   //과자의 갯수만큼 for문을 돌린다
			int sum = price[i]*count[i];     // 각각 과자의 지불금액 변수에 가격과 갯수를 곱한 값을 넣는다
			total_sum = total_sum+sum;		 // 총 과자의 지불금액을 구하기 위해 각가의 과자의 합계를 누적한다.
			System.out.printf("%.5s   %7d  	 %2d  %9d\n", snack[i], price[i],	count[i],sum);		
			}						// 각각의 배열을 for문으로 돌려 나온 값을 하나씩 출력하며 반복
		
		System.out.printf("**************************************\n");
		System.out.printf("지불금액 :    	  %20d\n", total_sum);   //총 지불금액을 출력
		
		int total_over_price = (int)(total_sum/(1+tax_rate));	// 과세금액을 구하기 : 세금율을 올림하기 위해 1을 더해준 후 총 지불 금액으로 나눈다. 
		System.out.printf("과세금액 :   	  %20d\n", total_over_price); //과세금액을 출력
		int tax=total_sum-total_over_price;   // 실제 세금은 전체 지불 금액에서 과세금액을 뺀 값을 tax 변수에 저장
		System.out.printf("세   금 :    	  %20d\n",tax);    //세금을 출력
		}
	
	
	}

