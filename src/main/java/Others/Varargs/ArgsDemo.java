package Others.Varargs;

/*
 * 可变参数：定义方法的时候不知道该定义多少个参数
 * 格式：
 * 		修饰符 返回值类型 方法名(数据类型…  变量名){
 * 
 * 		}
 * 
 * 		注意：
 * 			这里的变量其实是一个数组
 * 			如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
 */
public class ArgsDemo {
	public static void main(String[] args) {
		int a = 1;
		int b = 2, c = 3;
		int d = 4;
		System.out.println(add(a));
		System.out.println(add(a, b));
		System.out.println(add(a, b, d));
	}

	public static int add(int... i) {
		int s = 0;
		for (int n : i) {
			s += n;
		}
		return s;
	}
}
