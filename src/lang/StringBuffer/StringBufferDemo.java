package lang.StringBuffer;

/*
 * 我们如果对字符串进行拼接操作，每次拼接，都会构建一个新的String对象，既耗时，又浪费空间。
 * 而StringBuffer就可以解决这个问题线程安全的可变字符序列
 * 
 * 构造函数：
 * 		public StringBuffer() 
 * 		public StringBuffer(int capacity)
 * 		public StringBuffer(String str)
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + "," + b);
	}

	public static void operate(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x;
	}
}
