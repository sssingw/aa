
public class threadd {

	public static void main(String[] args) {

		Thread thread1 = new MutiThreadTest("[ Thread " + 1 + " ]");
		thread1.start();
		Thread thread2 = new MutiThreadTest("[ Thread " + 2 + " ]");
		thread2.start();
	}
}
	class MutiThreadtest extends Thread {
		public MutiThreadTest(String threadName) {
			this.setName(threadName);
		}
	}

