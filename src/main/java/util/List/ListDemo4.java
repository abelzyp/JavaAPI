package util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import utils.Person;

/*
 * 存储自定义对象并遍历,用普通for循环。(size()和get()结合)
 */
public class ListDemo4 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建学生对象
		Person p1 = new Person("zhangSan", 11);
		Person p2 = new Person("liSi", 22);
		Person p3 = new Person("wangWu", 33);

		// 把学生添加到集合中
		list.add(p1);
		list.add(p2);
		list.add(p3);

		// 遍历
		// 普通for循环
		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);
			System.out.println(p.getName() + "=" + p.getAge());
		}
		System.out.println("------------");

		// 迭代器遍历
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName() + "=" + p.getAge());
		}
	}
}
