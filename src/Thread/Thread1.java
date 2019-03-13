package Thread;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("thread1 running");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep((long) (Math.random() * 4000));//��������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
