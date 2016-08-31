package lang.Object;

import utils.Person;

/*
 * public String toString():返回该对象的字符串表示。
 * 
 * Integer类下的一个静态方法：
 * 		public static String toHexString(int i)：把一个整数转成一个十六进制表示的字符串
 * 注意：
 * 	 直接输出一个对象的名称，其实就是调用该对象的toString()方法。
 * 
 */
public class Object_toString {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.toString());
		// toString()方法的值等价于getClass().getName() + '@' + Integer.toHexString(hashCode())
		// this.getClass().getName()+'@'+Integer.toHexString(this.hashCode())
		System.out.println(p.getClass().getName() + '@' + Integer.toHexString(p.hashCode()));
	}

}
