package util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储字符串并遍历。
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:创建字符串对象
 * 		C:把字符串对象添加到集合中
 * 		D:遍历集合
 */
public class CollectionTest2 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建字符串对象，并把字符串对象添加到集合中
		c.add("hello");
		c.add("abel");

		// 遍历集合
		// 通过集合对象获取迭代器对象
		Iterator it = c.iterator();
		// 通过迭代器对象的hasNext()方法判断有没有元素
		while (it.hasNext()) {
			// 通过迭代器对象的next()方法获取元素
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
