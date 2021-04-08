
public class snack {

	public static void main(String[] args) {
		
		String [] snack = {"������", "��īĨ", "������", "���ݸ�", "���Ͻ�"};   
		int[] price = {1000,2000,3000,2500,1450};  //����
		int[] count = { 10,2,1,3,5};  //����
		double tax_rate=0.1;   //�������� ������ ����
		int total_sum = 0;   //�� ���� �ݾ��� ������ ����
		
		System.out.printf("**************************************\n");
		System.out.println("�� ��	  �� ��		�� ��	  �� ��        \n");
		
		for (int i = 0; i < snack.length;i++) {   //������ ������ŭ for���� ������
			int sum = price[i]*count[i];     // ���� ������ ���ұݾ� ������ ���ݰ� ������ ���� ���� �ִ´�
			total_sum = total_sum+sum;		 // �� ������ ���ұݾ��� ���ϱ� ���� ������ ������ �հ踦 �����Ѵ�.
			System.out.printf("%.5s   %7d  	 %2d  %9d\n", snack[i], price[i],	count[i],sum);		
			}						// ������ �迭�� for������ ���� ���� ���� �ϳ��� ����ϸ� �ݺ�
		
		System.out.printf("**************************************\n");
		System.out.printf("���ұݾ� :    	  %20d\n", total_sum);   //�� ���ұݾ��� ���
		
		int total_over_price = (int)(total_sum/(1+tax_rate));	// �����ݾ��� ���ϱ� : �������� �ø��ϱ� ���� 1�� ������ �� �� ���� �ݾ����� ������. 
		System.out.printf("�����ݾ� :   	  %20d\n", total_over_price); //�����ݾ��� ���
		int tax=total_sum-total_over_price;   // ���� ������ ��ü ���� �ݾ׿��� �����ݾ��� �� ���� tax ������ ����
		System.out.printf("��   �� :    	  %20d\n",tax);    //������ ���
		}
	
	
	}

