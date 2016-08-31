package util.Vector;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector的特有功能：
 * 1：添加功能
 * 		public void addElement(Object obj)		--	add()
 * 2：获取功能
 * 		public Object elementAt(int index)		--  get()
 * 		public Enumeration elements()			--	Iterator iterator()
 * 		boolean hasMoreElements()				hasNext()
 * 		Object nextElement()					next()
 * 
 * JDK升级的原因：
 * 		A:安全
 * 		B:效率
 * 		C:简化书写
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("hello");
		v.add("world");
		v.add("java");

		for (int i = 0; i < v.size(); i++) {
			String s = v.get(i);
			System.out.println(s);
		}
		System.out.println("-----");
		v.addElement("hi");
		v.addElement("abel");
		Enumeration<String> e = v.elements();// 返回的是实现类的对象
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}
}
