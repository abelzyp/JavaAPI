package util.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import utils.Person;

/*
 * 需求：去除集合中自定义对象的重复值(对象的成员变量值都相同)
 * 
 * 我们按照和字符串一样的操作，发现出问题了。
 * 为什么呢?
 * 		我们必须思考哪里会出问题?
 * 		通过简单的分析，我们知道问题出现在了判断上。
 * 		而这个判断功能是集合自己提供的，所以我们如果想很清楚的知道它是如何判断的，就应该去看源码。
 * contains()方法的底层依赖的是equals()方法。
 * 而我们的学生类中没有equals()方法，这个时候，默认使用的是它父亲Object的equals()方法
 * Object()的equals()默认比较的是地址值，所以，它们进去了。因为new的东西，地址值都不同。
 * 按照我们自己的需求，比较成员变量的值，重写equals()即可。
 * 自动生成即可。
 */
public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList<Person> array = new ArrayList<Person>();
		Person s1 = new Person("林青霞", 27);
		Person s2 = new Person("林志玲", 40);
		Person s3 = new Person("凤姐", 35);
		Person s4 = new Person("芙蓉姐姐", 18);
		Person s5 = new Person("翠花", 16);
		Person s6 = new Person("林青霞", 27);
		Person s7 = new Person("林青霞", 18);

		// 添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		// 创建新集合
		ArrayList<Person> newArray = new ArrayList<Person>();
		// 遍历旧集合,获取得到每一个元素
		Iterator<Person> it = array.iterator();
		while(it.hasNext()){
			Person p = it.next();
			// 拿这个元素到新集合去找，看有没有
			if(!newArray.contains(p)){
				newArray.add(p);
			}
		}
		// 遍历新集合
		for(Person p : newArray){
			System.out.println(p.getName()+"-"+p.getAge());
		}
	}
}
