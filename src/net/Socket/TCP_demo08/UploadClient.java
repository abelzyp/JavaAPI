package net.Socket.TCP_demo08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class UploadClient {
	public static void main(String[] args) throws IOException {
		// 创建客户端Socket对象
		Socket s = new Socket("222.27.254.77", 8888);
		// 封装要上传的文件
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"a.txt"));
		// 封装要发送到服务器的数据流
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		// 发送数据
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}
		// 通知服务器发送数据结束
		s.shutdownOutput();
		// 接收服务器反馈信息
		BufferedReader br = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		System.out.println(br.readLine());

		// 释放资源
		bis.close();
		s.close();
	}
}
