package others.Generic;

/*
 * 早期的时候，我们使用Object来代表任意的类型。
 * 向上转型是没有任何问题的，但是在向下转型的时候其实隐含了类型转换的问题。
 * 也就是说这样的程序其实并不是安全的。所以Java在JDK5后引入了泛型，提高程序的安全性。
 *
 * 泛型类的测试
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool<String> ot = new ObjectTool<String>();
		ot.setObj("string");
		ot.setObj(new String("string2"));
		String s = ot.getObj();
		System.out.println(s);

		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		ot2.setObj(new Integer(100));
		Integer ii = ot2.getObj();
		System.out.println(ii);

		System.out.println("-----------");

		ot.show("hello");
		ot2.show(100);
	}
}
