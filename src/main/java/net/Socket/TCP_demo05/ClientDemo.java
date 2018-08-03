package net.Socket.TCP_demo05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 客户端文本文件，服务器输出到控制台
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建Socket对象
		Socket s = new Socket("222.27.254.77", 8888);
		// 封装文本文件
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		// 封装通道内的流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		s.close();
	}
}
