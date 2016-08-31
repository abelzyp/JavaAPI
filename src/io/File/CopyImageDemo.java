package io.File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制图片
 * 
 * 分析：
 * 		复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
 * 		通过该原理，我们知道我们应该采用字节流。
 * 		而字节流有4种方式，所以做这个题目我们有4种方式。推荐掌握第4种。
 * 
 * 数据源：
 * 		a.jpg -- FileInputStream -- BufferedInputStream
 * 目的地：
 * 		b.jpg -- FileOutputStream -- BufferedOutputStream
 */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		String src = "a.jpg";
		String des = "b.jpg";
		// method1(src, des);
		// method2(src, des);
		// method3(src, des);
		method4(src, des);
	}

	private static void method3(String src, String des) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				src));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(des));
		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}
		bos.close();
		bis.close();
	}

	private static void method2(String src, String des) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(des);
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
			fos.flush();
		}
		fos.close();
		fis.close();
	}

	private static void method1(String src, String des) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(des);
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
		fos.close();
		fis.close();
	}

	private static void method4(String src, String des) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				src));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(des));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}
		bos.close();
		bis.close();
	}
}
