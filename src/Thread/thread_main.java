package Thread;

public class thread_main {

	public static void main(String[] args) {

//		System.out.println(Thread.currentThread().getName());
//
//		// ��ʽ1�� ��ʵ����Ϊ���췽���Ĳ�������Thread �ٵ���start���������̣߳�
//		Thread thread1 = new Thread(new Thread1());
//		thread1.start();
//
//		// ��ʽ2�� ֱ��ʵ��������start���������̣߳�
//		Thread thread2 = new Thread2();
//		thread2.start();

//		System.out.println(thread1.getName());
//		System.out.println(thread2.getName());

		/** �̴߳�����ʽ3 start */
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
		/** �̴߳�����ʽ3 end */

		// ����
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread());
				System.out.println("Thread4:" + i);
			}
		}).start();
	}
}
