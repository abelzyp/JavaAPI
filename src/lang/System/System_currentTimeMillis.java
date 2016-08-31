package lang.System;

/*
 * System类包含一些有用的类字段和方法。它不能被实例化。 
 * 
 * 方法：
 *		public static long currentTimeMillis():返回以毫秒为单位的当前时间
 */
public class System_currentTimeMillis {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());

		// 单独得到这样的实际目前对我们来说意义不大
		// 那么，它到底有什么作用呢?如，统计这段程序的运行时间
		long start = System.currentTimeMillis();
		for (int x = 0; x < 100000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("共耗时：" + (end - start) + "毫秒");
	}
}
