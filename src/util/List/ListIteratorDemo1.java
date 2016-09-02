package util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import utils.Person;

/*
 * 列表迭代器：
 * 		ListIterator listIterator()：List集合特有的迭代器
 * 		该迭代器继承了Iterator迭代器，所以，就可以直接使用hasNext()和next()方法。
 * 
 * 特有功能：
 * 		Object previous():获取上一个元素
 * 		boolean hasPrevious():判断是否有元素
 * 
 * 		注意：ListIterator可以实现逆向遍历，但是必须先正向遍历，才能逆向遍历，所以一般无意义，不使用。
 */
public class ListIteratorDemo1 {
	public static void main(String[] args) {
		// 创建List集合对象并添加元素
		List list = new ArrayList();
		Person p1 = new Person("zhangSan", 11);
		Person p2 = new Person("liSi", 22);
		Person p3 = new Person("wangWu", 33);
		list.add(p1);
		list.add(p2);
		list.add(p3);

		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			Person p = (Person) lit.next();
			System.out.println(p.getAge());
		}
		while (lit.hasPrevious()) {
			Person p = (Person) lit.previous();
			System.out.println(p.getName());
		}
	}
}
