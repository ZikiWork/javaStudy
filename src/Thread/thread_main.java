package Thread;

public class thread_main {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());

		//将实例作为构造方法的参数传给Thread 再调用start方法开启线程！
		Thread thread1 = new Thread(new Thread1());
		thread1.start();

		//直接实例化调用start方法开启线程！
		Thread thread2 = new Thread2();
		thread2.start();

		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
	}
}
