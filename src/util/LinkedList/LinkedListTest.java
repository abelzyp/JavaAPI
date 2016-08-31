package util.LinkedList;

import java.util.LinkedList;

/*
 * 请用LinkedList模拟栈数据结构的集合，并测试
 * 题目的意思是：
 *		你自己的定义一个集合类，在这个集合类内部可以使用LinkedList模拟。
 */
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.addFirst("hello");
		link.addFirst("world");
		link.addFirst("java");
		for (String s : link) {
			System.out.println(s);
		}
	}
}
