package lang.Enum;

import lang.Enum.JavaEnum.Direction2;

/*
 * 枚举类中的几个常见方法
 * 		int compareTo(E o):比较此枚举与指定对象的顺序。
 * 		String name():返回此枚举常量的名称，在其枚举声明中对其进行声明。
 * 		int ordinal():返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为零）。
 * 		String toString():返回枚举常量的名称，它包含在声明中。
 * 		<T> T valueOf(Class<T> type,String name):返回带指定名称的指定枚举类型的枚举常量。
 * 		values()
 * 			此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
 */
public class EnumMethodDemo {
	public static void main(String[] args) {
		// int compareTo(E o)
		Direction2 d21 = Direction2.FRONT;// 0
		Direction2 d22 = Direction2.BEHIND;// 1
		Direction2 d23 = Direction2.LEFT;// 2
		Direction2 d24 = Direction2.RIGHT;// 3
		System.out.println(d21.compareTo(d21));
		System.out.println(d21.compareTo(d24));
		System.out.println(d24.compareTo(d21));
		System.out.println("---------------");
		// String name()
		System.out.println(d21.name());
		System.out.println(d22.name());
		System.out.println(d23.name());
		System.out.println(d24.name());
		System.out.println("--------------");
		// int ordinal()
		System.out.println(d21.ordinal());
		System.out.println(d22.ordinal());
		System.out.println(d23.ordinal());
		System.out.println(d24.ordinal());
		System.out.println("--------------");
		// String toString()
		System.out.println(d21.toString());
		System.out.println(d22.toString());
		System.out.println(d23.toString());
		System.out.println(d24.toString());
		System.out.println("--------------");
		// <T> T valueOf(Class<T> type,String name)
		// 这个函数的意义表示：在type这样一个字节码文件中，拿出来一个叫FRONT的选项
		Direction2 d = Enum.valueOf(Direction2.class, "FRONT");
		System.out.println(d.getName());
		System.out.println("----------------");
		// values() 这说明它是静态方法
		Direction2[] dirs = Direction2.values();
		for (Direction2 d2 : dirs) {
			System.out.println(d2);
			System.out.println(d2.getName());
		}
	}
}
