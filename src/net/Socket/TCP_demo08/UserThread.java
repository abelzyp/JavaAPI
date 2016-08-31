package net.Socket.TCP_demo08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class UserThread implements Runnable {

	private Socket s;

	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			// 封装从客户端发送过来数据的流
			BufferedInputStream bis = new BufferedInputStream(
					s.getInputStream());
			// 封装要存储到服务器的文件
			// 为了防止名称冲突
			String time = System.currentTimeMillis() + ".txt";
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream(time));
			// 服务器存储数据过程
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
				bos.flush();
			}
			// 服务器向客户端反馈信息
			OutputStream os = s.getOutputStream();
			os.write("文件上传成功".getBytes());
			// 释放资源
			bos.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
