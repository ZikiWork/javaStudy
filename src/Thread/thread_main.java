package Thread;

public class thread_main {

	public static void main(String[] args) {

//		System.out.println(Thread.currentThread().getName());
//
//		// 方式1： 将实例作为构造方法的参数传给Thread 再调用start方法开启线程！
//		Thread thread1 = new Thread(new Thread1());
//		thread1.start();
//
//		// 方式2： 直接实例化调用start方法开启线程！
//		Thread thread2 = new Thread2();
//		thread2.start();

//		System.out.println(thread1.getName());
//		System.out.println(thread2.getName());

		/** 线程创建方式3 start */
		Thread thread3 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread3:" + i);
			}
		});
		thread3.start();
		/** 线程创建方式3 end */

		// 或者
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread());
				System.out.println("Thread4:" + i);
			}
		}).start();
	}
}
