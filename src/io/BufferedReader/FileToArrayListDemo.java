package io.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 需求：从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
 * 
 * 分析：
 * 		通过题目的意思我们可以知道如下的一些内容，
 * 			数据源是一个文本文件。
 * 			目的地是一个集合。
 * 			而且元素是字符串。
 * 
 * 数据源：
 * 		c.txt -- FileReader -- BufferedReader
 * 目的地：
 * 		ArrayList<String>
 */
public class FileToArrayListDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c.txt"));
		ArrayList<String> al = new ArrayList<String>();
		String line = null;
		while((line=br.readLine())!=null){
			al.add(line);
		}
		br.close();
		for(String s : al){
			System.out.println(s);
		}
	}
}
