package lang.StringBuffer;

import java.util.Scanner;

/*
 * 把字符串反转
 */
public class StringBufferTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		System.out.println("反转后的字符串是：" + sb.reverse().toString());
	}

}
