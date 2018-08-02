package io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：把a.txt内容复制到b.txt中
 * 
 * 数据源：
 * 		a.txt	--	读取数据	--	InputStreamReader -- FileReader
 * 目的地：
 * 		b.txt	--	写出数据	--	OutputStreamWriter -- FileWriter
 */
public class CopyFileDemo4 {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("b.txt");
		
		char[] chs = new char[1024];
		int len = 0;
		while((len=fr.read(chs))!=-1){
			fw.write(chs,0,len);
			fw.flush();
		}
		fw.close();
		fr.close();
	}
}
