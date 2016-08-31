package lang.String;

/*
 * String concat(String str):把字符串拼接。
 */
public class String_concat {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println("s3:" + s3);
		System.out.println("s4:" + s4);
	}

}
