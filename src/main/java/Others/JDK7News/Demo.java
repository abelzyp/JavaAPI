package Others.JDK7News;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		// 二进制字面量
		int x = 0b100101;
		System.out.println(x);

		// 数字字面量可以出现下划线
		int y = 1_1123_1000;
		System.out.println(y);
		// 不能出现在进制标识和数值之间
		int z = 0x111_222;
		System.out.println(z);
		// 不能出现在数值开头和结尾
		int a = 0x11_22;
		System.out.println(a);
		// 不能出现在小数点旁边
		double d = 12.3_4;
		System.out.println(d);

		// switch语句可以用字符串，略

		// 泛型简化，菱形泛型，泛型推断
		ArrayList<String> array = new ArrayList<>();

		// 异常的多个catch合并

		// try-with-resources语句
		method();
	}

	private static void method() {
		// try-with-resources 语句
		// try(必须是java.lang.AutoCloseable的子类对象){…}

		// 原先这样写
		try {
			FileReader fr = new FileReader("a.txt");
			FileWriter fw = new FileWriter("b.txt");
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
			fw.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 改进版的代码
		try (FileReader fr = new FileReader("a.txt"); FileWriter fw = new FileWriter("b.txt");) {
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
