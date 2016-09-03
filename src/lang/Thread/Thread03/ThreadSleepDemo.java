package lang.Thread.Thread03;

/*
 * public static void sleep(long millis)
 * 		在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）
 */
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();

		ts1.setName("林青霞");
		ts2.setName("林志玲");
		ts3.setName("林志颖");

		ts1.start();
		ts2.start();
		ts3.start();
	}
}
