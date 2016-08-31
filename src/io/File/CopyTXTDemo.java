package io.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制文本文件
 * 
 * 分析：
 * 		复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
 * 		通过该原理，我们知道我们应该采用字符流更方便一些。
 * 		而字符流有5种方式，所以做这个题目我们有5种方式。推荐掌握第5种。
 * 数据源：
 * 		a.txt -- FileReader -- BufferdReader
 * 目的地：
 * 		b.txt -- FileWriter -- BufferedWriter
 */
public class CopyTXTDemo {
	public static void main(String[] args) throws IOException {
		String src = "a.txt";
		String des = "b.txt";
		// method1(src, des);
		// method2(src, des);
		// method3(src, des);
		// method4(src, des);
		method5(src, des);
	}

	private static void method5(String src, String des) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(src));
		BufferedWriter bw = new BufferedWriter(new FileWriter(des));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}

	private static void method4(String src, String des) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(src));
		BufferedWriter bw = new BufferedWriter(new FileWriter(des));
		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
			bw.flush();
		}
		bw.close();
		br.close();
	}

	private static void method3(String src, String des) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(src));
		BufferedWriter bw = new BufferedWriter(new FileWriter(des));
		int ch = 0;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		}
		bw.close();
		br.close();
	}

	private static void method2(String src, String des) throws IOException {
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(des);
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}
		fw.close();
		fr.close();
	}

	private static void method1(String src, String des) throws IOException {
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(des);
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}
}
