package net.Socket.TCP_demo02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建服务器Socket对象
		ServerSocket ss = new ServerSocket(8888);
		// 监听客户端的连接
		Socket s = ss.accept();// 阻塞式方法

		// 获取输入流
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String server = new String(bys, 0, len);
		System.out.println("Server:" + server);

		// 获取输出流
		OutputStream os = s.getOutputStream();
		os.write("Data Received".getBytes());

		// 释放资源
		s.close();
	}
}
