package Thread;

public class Resource {
	private int num = 0;

	public synchronized void increase() {
		while (num != 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		num++;
		notifyAll();// ֪ͨ�ڴ��̵߳ĳ������ִ�У�
		System.out.println(num);
	}

	public synchronized void decrease() {
		while (num == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		num--;
		notifyAll();
		System.out.println(num);
	}

}
