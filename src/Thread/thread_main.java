package Thread;

public class thread_main {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());

		//��ʵ����Ϊ���췽���Ĳ�������Thread �ٵ���start���������̣߳�
		Thread thread1 = new Thread(new Thread1());
		thread1.start();

		//ֱ��ʵ��������start���������̣߳�
		Thread thread2 = new Thread2();
		thread2.start();

		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
	}
}
