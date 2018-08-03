package util.LinkedList;

/*
 * MyStack的测试
 */
public class MyStackDemo {
	public static void main(String[] args) {
		MyStack<String> ms = new MyStack<String>();
		ms.add("hello");
		ms.add("world");
		ms.add("java");

		while (!ms.isEmpty()) {
			System.out.println(ms.get());
		}
	}
}
