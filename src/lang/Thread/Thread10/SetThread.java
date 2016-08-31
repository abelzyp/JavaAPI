package lang.Thread.Thread10;

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
				if (i % 2 == 0) {
					s.name = "abel";
					s.age = 24;
				} else {
					s.name = "zhang";
					s.age = 23;
				}
				i++;
			}
		}
	}

}
