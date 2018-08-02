package lang.Thread.Thread13;

/*
 *   最终版代码中：
 * 		把Student的成员变量给私有了。
 * 		把设置和获取的操作给封装成了功能，并加了同步。
 * 		设置或者获取的线程里面只需要调用方法即可。
 */
public class StudentDemo {
	public static void main(String[] args) {
		// 创建资源
		Student s = new Student();

		// 设置和获取的类
		GetThread gt = new GetThread(s);
		SetThread st = new SetThread(s);

		// 线程类
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		// 启动线程
		t1.start();
		t2.start();
	}
}
