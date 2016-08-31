package util.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import utils.Person;

/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历。
 * 
 * 注意：
 * 		A:自己的类名不要和我们学习的要使用的API中的类名相同。
 * 		B:复制代码的时候，很容易把那个类所在的包也导入过来，容易出现不能理解的问题。
 */
public class IteratorTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Person p1 = new Person("zhangSan", 11);
		Person p2 = new Person("liSi", 22);
		Person p3 = new Person("wangWu", 33);
		c.add(p1);
		c.add(p2);
		c.add(p3);
		Iterator it = c.iterator();
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p.getName());
		}
	}
}
