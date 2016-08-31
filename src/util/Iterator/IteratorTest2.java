package util.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import utils.Person;

/*
 * 问题1:能用while循环写这个程序，我能不能用for循环呢?
 * 问题2:不要多次使用it.next()方法，因为每次使用都是访问一个对象。
 */
public class IteratorTest2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Person p1 = new Person("zhangSan", 11);
		Person p2 = new Person("liSi", 22);
		Person p3 = new Person("wangWu", 33);
		c.add(p1);
		c.add(p2);
		c.add(p3);
		for(Iterator it = c.iterator();it.hasNext();){
			Person p = (Person)it.next();
			System.out.println(p.getAge());
		}
	}
}
