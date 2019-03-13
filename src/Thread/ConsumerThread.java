package Thread;

public class ConsumerThread implements Runnable {
	private Resource resource;

	public ConsumerThread(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "µÚ" + i + "´Î");
			resource.decrease();
		}
	}
}
