package io.SequenceInputStream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * 以前的操作：
 * a.txt -- b.txt
 * c.txt -- d.txt
 * e.txt -- f.txt
 * 
 * 现在想要：
 * a.txt+b.txt+c.txt -- d.txt
 */
public class SequenceInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// 需求：把下面的三个文件的内容复制到Copy.java中
		// ByteArrayStreamDemo.java,CopyFileDemo.java,DataStreamDemo.java

		// SequenceInputStream(Enumeration e)
		// 通过简单的回顾我们知道了Enumeration是Vector中的一个方法的返回值类型。
		// Enumeration<E> elements()
		Vector<InputStream> e = new Vector<InputStream>();
		InputStream s1 = new FileInputStream("a.txt");
		InputStream s2 = new FileInputStream("b.txt");
		InputStream s3 = new FileInputStream("c.txt");
		e.add(s1);
		e.add(s2);
		e.add(s3);
		Enumeration<InputStream> ee = e.elements();

		SequenceInputStream sis = new SequenceInputStream(ee);
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("d.txt"));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		sis.close();
	}
}
