package util.ArrayList;

import java.util.ArrayList;

/*
 * 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
 * 要求：不能创建新的集合，就在以前的集合上做。
 */
public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		// 添加多个字符串元素(包含内容相同的)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		// 由选择排序思想引入，我们就可以通过这种思想做这个题目
		// 拿0索引的依次和后面的比较，有就把后的干掉
		// 同理，拿1索引...
		for (int i = 0; i < array.size() - 1; i++) {
			for (int j = i + 1; j < array.size(); j++) {
				if (array.get(i).equals(array.get(j))) {
					array.remove(j);
					j--;
				}
			}
		}
		// 遍历集合
		for (String s : array) {
			System.out.println(s);
		}
	}
}
