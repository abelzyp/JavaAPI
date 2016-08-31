package net.Socket.TCP_demo07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) throws IOException {
		// 创建服务器端Socket对象
		ServerSocket ss = new ServerSocket(8888);
		// 监听客户端连接
		Socket s = ss.accept();
		// 封装通道内的流
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		// 封装图片文件
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("b.jpg"));
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}
		// 给客户端发送反馈信息
		OutputStream os = s.getOutputStream();
		os.write("图片上传成功".getBytes());

		// 释放资源
		bos.close();
		s.close();
	}
}
