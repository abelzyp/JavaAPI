package io.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 需求：把ArrayList集合中的字符串数据存储到文本文件
 * 
 * 分析：
 * 		通过题目的意思我们可以知道如下的一些内容，
 * 			ArrayList集合里存储的是字符串。
 * 			遍历ArrayList集合，把数据获取到。
 * 			然后存储到文本文件中。
 * 			文本文件说明使用字符流。
 * 
 * 数据源：
 * 		ArrayList<String> -- 遍历得到每一个字符串数据
 * 目的地：
 * 		c.txt -- FileWriter -- BufferedWriter
 */
public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		String des = "c.txt";
		method1(des);
		method2(des);
	}

	private static void method2(String des) throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		BufferedWriter bw = new BufferedWriter(new FileWriter(des));
		al.add("hello");
		al.add("abel");
		for (String s : al) {
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}

	private static void method1(String des) throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		FileWriter fw = new FileWriter(des);
		al.add("hello");
		al.add("world");
		al.add("java");
		for (String s : al) {
			fw.write(s);
			fw.write("\r\n");
		}
		fw.close();
	}
}
