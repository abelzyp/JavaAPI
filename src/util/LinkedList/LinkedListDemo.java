package util.LinkedList;

import java.util.LinkedList;

/*
 * LinkedList的特有功能：
 * 		A:添加功能
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		B:获取功能
 * 			public Object getFirst()
 * 			public Obejct getLast()
 * 		C:删除功能
 * 			public Object removeFirst()
 * 			public Object removeLast()
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedList link = new LinkedList();

		// 添加元素
		link.add("hello");
		link.add("world");
		link.add("java");

		link.addFirst("javaee");
		link.addLast("android");

		System.out.println("getFirst:" + link.getFirst());
		System.out.println("getLast:" + link.getLast());

		System.out.println("removeFirst:" + link.removeFirst());
		System.out.println("removeLast:" + link.removeLast());

		// 输出对象名
		System.out.println("link:" + link);
	}
}
