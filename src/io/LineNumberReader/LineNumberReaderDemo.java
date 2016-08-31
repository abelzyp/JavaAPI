package io.LineNumberReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * BufferedReader
 * 		|--LineNumberReader
 * 			public int getLineNumber()获得当前行号。 
 * 			public void setLineNumber(int lineNumber)
 */
public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException{
		LineNumberReader lnr = new LineNumberReader(new FileReader("a.txt"));
		String line = null;
		lnr.setLineNumber(101);
		while((line=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+line);
		}
		lnr.close();
	}
}
