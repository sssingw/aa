
public class exchange {

	public static void main(String[] args) {


		int K15kormon = 1000000;     //ȯ���� �ݾ��� ������ ���� ����� �ʱ�ȭ
		double K15moneyEx = 1238.21;   // �޷� ȯ���� ������ ���� ����� �ʱ�ȭ
		double K15commission = 0.003;    // ȯ�� �����Ḧ ������ ���� ����� �ʱ�ȭ
		double K15Comperone = K15moneyEx * K15commission; // 1�޷��� �����Ḧ ������ ���� ����
		int K15usd = (int)(K15kormon/K15moneyEx);
		//�޷� ������ ����: �޷��� ȯ���ϱ� ���� ȯ���� �ݾ��� ȯ���� ������ �� ���������� ����� ���� intŸ�� ��ȯ
		
		double K15totalcom = K15usd * K15Comperone; // �� �����Ḧ ������ ����(�޷�*1�޷��� ������)
		int K15remain = (int)(K15kormon-K15usd*K15moneyEx);
		//���� �ݾ� ������ ���� : ���� �ݾ��� ��� ���� ���� Ÿ������ ���;� �ϹǷ� intŸ������ ��ȯ �� �޷��� ȯ���� ���� �� ��ü ��ȭ�ݾ׿��� ���� 
		
		System.out.printf("*****************************************************************\n");
		System.out.printf("*                         ������ ���                              *\n");
		System.out.printf("�� ��ȭȯ���ݾ�: %f��=> ��ȭ: %d�޷�, �ܵ�: %f��\n", K15totalcom, K15usd, K15Comperone );
		// ������ ������ ���� �� ������ ����Ѵ�.
		System.out.printf("*****************************************************************\n");
	}

}
