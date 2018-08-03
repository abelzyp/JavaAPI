package io.SequenceInputStream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/*
 * 以前的操作：
 * a.txt -- b.txt
 * c.txt -- d.txt
 * 
 * 现在想要：
 * a.txt+b.txt -- c.txt
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		InputStream s1 = new FileInputStream("a.txt");
		InputStream s2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(s1, s2);
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("c.txt"));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		sis.close();
	}
}
