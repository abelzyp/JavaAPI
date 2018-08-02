package util.regex.Pattern;

/*
 * 替换功能
 *  	String类的public String replaceAll(String regex,String replacement)
 *  	使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 
 */
public class RegexDemo3 {
	public static void main(String[] args) {
		// 定义一个字符串
		String s = "helloqq12345worldkh622112345678java";
		// 我要去除所有的数字,用*给替换掉
		String regex = "\\d+";
		String replacement = "*";
		System.out.println(s.replaceAll(regex, replacement));
	}
}
