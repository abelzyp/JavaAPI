package util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import utils.Person;

/*
 * 需求：存储自定义对象并遍历Student(name,age)
 *
 * 分析：
 * 		A:创建学生类
 * 		B:创建集合对象
 * 		C:创建学生对象
 * 		D:把学生对象添加到集合对象中
 * 		E:遍历集合
 */
public class CollectionTest3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Person p1 = new Person("a",1);
		Person p2 = new Person("b",2);
		Person p3 = new Person("c",3);
		c.add(p1);
		c.add(p2);
		c.add(p3);
		Iterator it = c.iterator();
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p.getName()+"==="+p.getAge());
		}
	}
}
