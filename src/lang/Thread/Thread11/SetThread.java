package lang.Thread.Thread11;

public class SetThread implements Runnable {

	private Student s;

	public SetThread(Student s) {
		this.s = s;
	}

	private int i = 0;

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				// 生产者 判断有没有 如果有就等待 如果没有生产
				if (s.flag) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (i % 2 == 0) {
					s.name = "abel";
					s.age = 24;
				} else {
					s.name = "zhang";
					s.age = 23;
				}
				i++;
				// 修改标记
				s.flag = true;
				// 唤醒线程
				s.notify(); // 唤醒t2,唤醒并不表示你立马可以执行，必须还得抢CPU的执行权。
			}
		}
	}

}
