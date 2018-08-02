package io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把c:\\a.txt内容复制到d:\\b.txt中
 * 
 * 数据源：
 * 		c:\\a.txt	--	读取数据	--	FileInputStream
 * 目的地：
 * 		d:\\b.txt	--	写出数据	--	FileOutputStream
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		byte[] bys = new byte[1024];
		int len = 0;
		if((len=fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}
		
		fos.close();
		fis.close();
	}
}
