package lang.String;

/*
 * 统计大串中小串出现的次数 举例：在字符串”
 * woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun
 * ”中java出现了5次
 * 结果：
 * 		java出现了5次
 * 分析：
 * 		前提：是已经知道了大串和小串。
 * 
 * 		A:定义一个统计变量，初始化值是0
 * 		B:先在大串中查找一次小串第一次出现的位置int indexOf(String str)
 * 			a:索引是-1，说明不存在了，就返回统计变量
 * 			b:索引不是-1，说明存在，统计变量++
 * 		C:把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
 * 		D:回到B
 */
public class StringTest5 {

	public static void main(String[] args) {
		String bstr = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String lstr = "java";
		int count = getCount(bstr, lstr);
		System.out.println("大串中有" + count + "个小串。");
	}

	public static int getCount(String maxString, String minString) {
		int count = 0;
		int index = maxString.indexOf(minString);
		while (index != -1) {
			count++;
			maxString = maxString.substring(index + minString.length());
			index = maxString.indexOf(minString);
		}
		return count;
	}

}
