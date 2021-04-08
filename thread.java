import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class thread extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		thread thread = new thread();		
		Scanner sc = new Scanner (System.in);	
		System.out.println("Start");
		int inputtime = sc.nextInt();
		thread.start();
		
		System.out.println("check 1 : " + getCurrentTime()+ thread.isAlive());
		Thread.sleep(1000 * inputtime);
		System.out.println("check 2 : " + getCurrentTime()+ thread.isAlive());
		
	}
		public static String getCurrentTime() {
			SimpleDateFormat sd = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
			Date time = new Date();
			String dateAndTime = sd.format(time);
			return dateAndTime;		
		}
		
		public void run(int inputtime) {			
		
		try {
			Thread.sleep(1000*inputtime);			
		}catch (InterruptedException e) {			
			e.printStackTrace();
		}
		}
}
		
		
		
		
	


