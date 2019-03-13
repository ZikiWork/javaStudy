package Thread;

public class Test {
	public static void main(String[] args) {

		Resource resource = new Resource();

		Thread pthread = new Thread(new ProducerThread(resource));
		pthread.start();
		Thread pthread1 = new Thread(new ProducerThread(resource));
		pthread1.start();
		Thread pthread2 = new Thread(new ProducerThread(resource));
		pthread2.start();
		Thread pthread3 = new Thread(new ProducerThread(resource));
		pthread3.start();

		Thread cthread = new Thread(new ConsumerThread(resource));
		cthread.start();
		Thread cthread1 = new Thread(new ConsumerThread(resource));
		cthread1.start();

	}
}
