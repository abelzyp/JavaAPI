package util.Collection;

import java.util.ArrayList;
import java.util.Collection;

import utils.Person;

/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。
 * 
 * 分析：
 * A:创建学生类
 * B:创建集合对象
 * C:创建学生对象
 * D:把学生添加到集合
 * E:把集合转成数组
 * F:遍历数组
 */
public class CollectionTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Person p1 = new Person("zhangSan", 11);
		Person p2 = new Person("liSi", 22);
		Person p3 = new Person("wangWu", 33);
		
		c.add(p1);
		c.add(p2);
		c.add(p3);
		
		Object[] objs = c.toArray();
		for(int i =0;i<objs.length;i++){
			Person p = (Person) objs[i];
			System.out.println(p.getName()+"-"+p.getAge());
		}
	}
}
