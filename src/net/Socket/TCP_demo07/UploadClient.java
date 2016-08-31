package net.Socket.TCP_demo07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/*
 * 把图片上传到服务器
 */
public class UploadClient {
	public static void main(String[] args) throws IOException {
		// 创建客户端Socket对象
		Socket s = new Socket("222.27.254.77", 8888);
		// 封装图片文件
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"a.jpg"));
		// 封装通道内的流
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}
		s.shutdownOutput();

		// 接收反馈信息
		InputStream is = s.getInputStream();
		byte[] bys2 = new byte[1024];
		int len2 = is.read(bys2);
		String client = new String(bys2, 0, len2);
		System.out.println("反馈信息是：" + client);

		// 释放资源
		bis.close();
		s.close();
	}
}
