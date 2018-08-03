package util.ArrayList;

import java.util.ArrayList;

/*
 * ArrayList去除集合中字符串的重复值(字符串的内容相同)
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:添加多个字符串元素(包含内容相同的)
 * 		C:创建新集合
 * 		D:遍历旧集合,获取得到每一个元素
 * 		E:拿这个元素到新集合去找，看有没有
 * 			有：不搭理它
 * 			没有：就添加到新集合
 * 		F:遍历新集合
 */
public class ArrayListTest {
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
		
		ArrayList<String> newArray = new ArrayList<String>();
		for(String s :array){
			if(!newArray.contains(s)){
				newArray.add(s);
			}
		}
		
		for(String s:newArray){
			System.out.println(s);
		}
	}
}
