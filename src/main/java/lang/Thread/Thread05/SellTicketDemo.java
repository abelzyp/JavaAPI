package lang.Thread.Thread05;

/*
 * 继承Thread类来实现。
 * 某电影院目前正在上映贺岁大片，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
 * 
 * 注：这个买票程序是有问题的，但只是一个小问题，不是每次都会出现的。
 * 问题的思考，但是本代码没解决：电影院售票程序，从表面上看不出什么问题，但是在真实生活中，售票时网络是不能实时传输的，总是存在延迟的情况，所以，在出售一张票以后，需要一点时间的延迟
 * 比如：每次卖票延迟100毫秒
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// 创建三个线程对象
		SellTicket st1 = new SellTicket();
		SellTicket st2 = new SellTicket();
		SellTicket st3 = new SellTicket();

		// 给线程对象起名字
		st1.setName("窗口1");
		st2.setName("窗口2");
		st3.setName("窗口3");

		// 启动线程
		st1.start();
		st2.start();
		st3.start();
	}
}
