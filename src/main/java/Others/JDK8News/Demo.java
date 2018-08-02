package Others.JDK8News;

/*
 * jdk8新特性
 * 		接口中可以有default默认方法和static静态方法
 * 		静态方法可以直接通过 接口名.方法名()调用。
 * 		默认方法可以通过实现子类调用。
 */
public class Demo {
	public static void main(String[] args) {
		// Inter.defaultPrint(); //非静态方法不能直接使用
		Inter.staticPrint();

		Inter i = new InterImpl();
		i.defaultPrint();
		i.show();
	}
}

interface Inter {
	// 抽象方法
	public abstract void show();

	// default方法
	public default void defaultPrint() {
		System.out.println("defaultPrint 我爱林青霞");
	}

	// static方法
	public static void staticPrint() {
		System.out.println("staticPrint 我爱林青霞");
	}
}

// 实现类
class InterImpl implements Inter {
	public void show() {
		System.out.println("重写接口中的方法");
	}
}