package others.Generic;

import java.util.ArrayList;
import java.util.Iterator;

import utils.Person;

/*
 * 需求：存储自定义对象并遍历。
 * 
 * A:创建学生类
 * B:创建集合对象
 * C:创建元素对象
 * D:把元素添加到集合
 * E:遍历集合
 */
public class GenericDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("zhangSan",1);
		Person p2 = new Person("liSi",2);
		Person p3 = new Person("wangWu",3);
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		//迭代器
		Iterator<Person> it = list.iterator();
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p.getName()+"--"+p.getAge());
		}
		//普通for
		for(int i =0;i<list.size();i++){
			Person p = list.get(i);
			System.out.println(p.getName());
		}
		//增强for
		for(Person p : list){
			System.out.println(p.getAge());
		}
	}
}
