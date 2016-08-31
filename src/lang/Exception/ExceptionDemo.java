package lang.Exception;

/*
 * 异常：程序出现了不正常的情况。
 * 
 * 举例：今天天气很好，班长出去旅游。骑着自行车，去山里面呼吸新鲜空气。
 * 		问题1：山路塌陷了，班长及时停住了，但是过不去了。严重的问题。
 * 		问题2：班长出门推自行车，发现气没了，把气吹起来。出发前就应该检查的问题。
 * 		问题3:班长骑着车在山路上惬意的行驶着，山路两边是有小石子的，中间是平坦的水泥路。
 * 			一直在平坦的水泥路上行驶是没有任何问题的，但是呢，他偏偏喜欢骑到小石子上，结果爆胎了。旅游的过程中出现的问题。
 * 			no zuo no die。
 * 
 * 程序的异常：Throwable
 * 		严重问题：Error 我们不处理。这种问题一般都是很严重的，比如说内存溢出。
 * 		问题：Exception
 * 			编译期问题:不是RuntimeException的异常 必须进行处理的，因为你不处理，编译就不能通过。
 * 			运行期问题:RuntimeException	这种问题我们也不处理，因为是你的问题，而且这个问题出现肯定是我们的代码不够严谨，需要修正代码的。
 * 
 * 如果程序出现了问题，我们没有做任何处理，最终jvm会做出默认的处理。
 * 把异常的名称，原因及出现的问题等信息输出在控制台。
 * 同时会结束程序。
 * 
 * 我们自己如何处理异常呢?
 * A:try...catch...finally
 * B:throws 抛出
 * 
 * try...catch...finally的处理格式：
 * 		try {
 * 			可能出现问题的代码;
 * 		}catch(异常名 变量) {
 * 			针对问题的处理;
 * 		}finally {
 * 			释放资源;
 * 		}
 * 
 * 变形格式：
 * 		try {
 * 			可能出现问题的代码;
 * 		}catch(异常名 变量) {
 * 			针对问题的处理;
 * 		}
 * 
 * 注意：
 * 		A:try里面的代码越少越好
 * 		B:catch里面必须有内容，哪怕是给出一个简单的提示
 * 
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为零");
		}
		System.out.println("over");
	}
}
