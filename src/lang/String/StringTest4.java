package lang.String;

/*
 * 需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
 * 举例：
 * 		helloWORLD
 * 结果：
 * 		Helloworld
 * 
 * 分析：
 * 		A:先获取第一个字符
 * 		B:获取除了第一个字符以外的字符
 * 		C:把A转成大写
 * 		D:把B转成小写
 * 		E:C拼接D
 */
public class StringTest4 {

	public static void main(String[] args) {
		String str = "helloWORLD";

		// 方法一
		String f = str.substring(0, 1);
		String o = str.substring(1);
		String ff = f.toUpperCase();
		String oo = o.toLowerCase();
		String result = ff + oo;
		System.out.println(result);

		// 方法二
		System.out.println(str.substring(0, 1).toUpperCase().concat(str.substring(1).toLowerCase()));
	}
}
