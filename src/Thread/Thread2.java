package Thread;

public class Thread2 extends Thread {

	public void run() {
		System.out.println("¿ªÆôÏß³Ì£º");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep((long) (Math.random() * 4000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
