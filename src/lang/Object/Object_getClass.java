package lang.Object;

import utils.Person;

/*
 * public final Class getClass():返回此 Object 的运行时类                    
 * 返回对象的字节码文件对象，反射讲解	
 *			Class类的方法：
 *				public String getName()：以 String 的形式返回此 Class 对象所表示的实体
 */
public class Object_getClass {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getClass());// class utils.Person
		System.out.println(p.getClass().getName());// utils.Person
	}

}
