package lang.Thread.Thread08;

/*
 * 虽然我们可以理解同步代码块和同步方法的锁对象问题，但是我们并没有直接看到在哪里加上了锁，在哪里释放了锁，
 * 为了更清晰的表达如何加锁和释放锁,JDK5以后提供了一个新的锁对象Lock。
 * 
 * Lock：
 * 		void lock()： 获取锁。
 * 		void unlock():释放锁。  
 * ReentrantLock是Lock的实现类.
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();

		Thread t1 = new Thread(st, "窗口一");
		Thread t2 = new Thread(st, "窗口二");
		Thread t3 = new Thread(st, "窗口三");

		t1.start();
		t2.start();
		t3.start();
	}
}
