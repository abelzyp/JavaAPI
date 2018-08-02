package lang.Object;

import utils.Person;

/*
 * protected Object clone():创建并返回此对象的一个副本。
 * 
 * Cloneable:此类实现了 Cloneable 接口，以指示 Object.clone() 方法可以合法地对该类实例进行按字段复制。 
 *  	这个接口是标记接口，告诉我们实现该接口的类就可以实现对象的复制了。
 *	创建并返回此对象的一个副本，这种克隆机制十分高效，而且二者之间完全隔离。
 *	自定义类实现克隆步骤：
 *		A:自定义类实现Cloneable接口，这是一个标记性接口，实现这个接口的类的对象可以实现自我克隆。
 *		B:自定义类中重写Object类的clone()方法。
 *		C:重写clone()方法时通过super.clone()调用Object类的clone()方法来得到该对象的副本，并返回该副本。
 *
 *	注意：
 *		A:克隆和两个引用指向同一个对象的区别?
 *		B:Object类clone()方法虽然简单，易用，但仅仅是一种”浅克隆”,它只克隆该对象所有的Field值，不会
 *		  对引用类型的Field所引用的对象进行克隆。开发中，我们也可以实现对象的”深度克隆”。
 */
public class Object_clone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person("wangWu", 25);
		Object o = p.clone();
		Person p2 = (Person) o;

		System.out.println(p);
		System.out.println(p2);
		System.out.println("----------");
		p2.setName("zhaoLiu");
		p2.setAge(27);
		System.out.println(p);
		System.out.println(p2);
	}

}
