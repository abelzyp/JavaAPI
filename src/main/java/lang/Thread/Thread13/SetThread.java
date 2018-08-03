package lang.Thread.Thread13;

public class SetThread implements Runnable {

	private Student s;

	public SetThread(Student s) {
		this.s = s;
	}

	private int i = 0;

	@Override
	public void run() {
		while (true) {
			if (i % 2 == 0) {
				s.set("abel", 24);
			} else {
				s.set("zhang", 23);
			}
			i++;
		}
	}

}
