package util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 需求：List集合存储字符串并遍历。
 * List集合的特点：
 * 		有序(存储和取出的元素一致)，可重复的。
 */
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("abel");
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("javaee");
		list.add("android");
		list.add("javaee");
		list.add("android");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
