package net.Socket.TCP_demo06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
/*
 * 把文件上传到服务器
 */
public class UploadClient {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("222.27.254.77", 8888);
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
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
