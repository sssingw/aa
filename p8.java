import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class p8 {

	public static void main(String[] args) throws ParseException { 
				
		Scanner sc = new Scanner (System.in);
		String date1 = sc.next();
		long input = sc.nextLong();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyymmdd");
		//date1�� parse()�� ���� Date�������� ��ȯ
		Date date1format = format.parse(date1);
		
		long calDate = date1format.getTime() + (input+1) * (24 * 60 * 60  *1000);
		//��ȯ�� ��¥�� ������ �ϰ� �и��� ������ �������� ���� �� �ֱ� ������ long������ ����
		String days = format.format(calDate);
		System.out.println(days);
	}

}
