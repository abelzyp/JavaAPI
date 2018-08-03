package io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 需求：把a.txt内容复制到b.txt中
 * 
 * 数据源：
 * 		a.txt	--	读取数据	--	InputStreamReader
 * 目的地：
 * 		b.txt	--	写出数据	--	OutputStreamWriter
 */
public class CopyFileDemo3 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"a.txt"));
		OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream(
				"b.txt"));
		
		int ch = 0;
		while((ch=isr.read())!=-1){
			osr.write(ch);
			osr.flush();
		}
		osr.close();
		isr.close();
	}
}
