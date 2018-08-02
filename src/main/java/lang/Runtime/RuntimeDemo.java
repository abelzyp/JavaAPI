package lang.Runtime;

import java.io.IOException;

/*
 * Runtime:每个 Java 应用程序都有一个 Runtime 类实例，使应用程序能够与其运行的环境相连接。
 * 		可以通过 getRuntime()方法获取当前运行时。
 *		应用程序不能创建自己的 Runtime类实例。 
 * 		
 * 		public Process exec(String command):在单独的进程中执行指定的字符串命令。
 * 
 * 单例模式的典型应用。
 */
public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		r.exec("calc");
	}
}
