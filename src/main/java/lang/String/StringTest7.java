package lang.String;

/*
 * 字符串的特点：一旦被赋值，就不能改变。
 */
public class StringTest7 {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";// 此时，s的地址已经改变
		System.out.println("s:" + s); // helloworld
	}
}
