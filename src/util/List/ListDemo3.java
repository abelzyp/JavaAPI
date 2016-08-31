package util.List;

import java.util.ArrayList;
import java.util.List;

/*
 * List集合的特有遍历功能：
 * 		size()和get()方法结合使用
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("abel");

		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}
	}
}
