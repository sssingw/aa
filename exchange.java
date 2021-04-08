
public class exchange {

	public static void main(String[] args) {


		int K15kormon = 1000000;     //환전할 금액을 저장할 변수 선언과 초기화
		double K15moneyEx = 1238.21;   // 달러 환율을 저장할 변수 선언과 초기화
		double K15commission = 0.003;    // 환전 수수료를 저장할 변수 선언과 초기화
		double K15Comperone = K15moneyEx * K15commission; // 1달러당 수수료를 저장할 변수 선언
		int K15usd = (int)(K15kormon/K15moneyEx);
		//달러 저장할 변수: 달러로 환전하기 위해 환전할 금액을 환율로 나눠준 후 정수형으로 만들기 위해 int타입 변환
		
		double K15totalcom = K15usd * K15Comperone; // 총 수수료를 저장할 변수(달러*1달러당 수수료)
		int K15remain = (int)(K15kormon-K15usd*K15moneyEx);
		//남은 금액 저장할 변수 : 남은 금액의 결과 역시 정수 타입으로 나와야 하므로 int타입으로 변환 후 달러와 환율을 곱한 뒤 전체 한화금액에서 빼줌 
		
		System.out.printf("*****************************************************************\n");
		System.out.printf("*                         수수료 계산                              *\n");
		System.out.printf("총 한화환전금액: %f원=> 미화: %d달러, 잔돈: %f원\n", K15totalcom, K15usd, K15Comperone );
		// 각각의 변수에 저장 된 값들을 출력한다.
		System.out.printf("*****************************************************************\n");
	}

}
