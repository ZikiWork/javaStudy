package Thread;

public class ProducerThread implements Runnable {
	private Resource resource;

	public ProducerThread(Resource resource) {
		// TODO Auto-generated constructor stub
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"µÚ"+i+"´Î");
			resource.increase();
		}
	}
	
}
