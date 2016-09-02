package util.regex.Pattern;

import java.util.Arrays;

/*
 * 我有如下一个字符串:"91 27 46 38 50"
 * 请写代码实现最终输出结果是："27 38 46 50 91"
 * 
 * 分析：
 * 		A:定义一个字符串
 * 		B:把字符串进行分割，得到一个字符串数组
 * 		C:把字符串数组变换成int数组
 * 		D:对int数组排序
 * 		E:把排序后的int数组在组装成一个字符串
 * 		F:输出字符串
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		String[] strArray = s.split(" ");
		int[] arr = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
