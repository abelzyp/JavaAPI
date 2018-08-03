package lang.Thread.Thread11;

public class GetThread implements Runnable {

	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				// 消费者 判断有没有 如果有就消费 如果没有就等待
				if (!s.flag) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(s.name + "--" + s.age);
				s.flag = false;
				s.notify();
			}
		}
	}

}
