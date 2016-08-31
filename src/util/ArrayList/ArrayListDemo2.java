package util.ArrayList;

import utils.Person;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：ArrayList存储自定义对象并遍历。要求加入泛型，并用增强for遍历。
 * A:迭代器
 * B:普通for
 * C:增强for
 * 
 * 增强for是用来替迭代器。
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("a",1);
		Person p2 = new Person("b",2);
		Person p3 = new Person("c",3);
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p.getAge());
		}
		System.out.println("-----");
		for(int i =0;i<list.size();i++){
			Person p = list.get(i);
			System.out.println(p.getName());
		}
		System.out.println("-----");
		for(Person p :list){
			System.out.println(p.getName()+"-"+p.getAge());
		}
	}
}
