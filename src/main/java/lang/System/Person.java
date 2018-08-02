package lang.System;

/*
 * 此类用来演示System.gc()功能
 * 
 * System.gc()可用于垃圾回收。
 * 当使用System.gc()回收某个对象所占用的内存之前，通过要求程序调用适当的方法来清理资源。
 * 在没有明确指定资源清理的情况下，Java提高了默认机制来清理该对象的资源，就是调用Object类的finalize()方法。
 * finalize()方法的作用是释放一个对象占用的内存空间时，会被JVM调用。
 * 而子类重写该方法，就可以清理对象占用的资源，该方法有没有链式调用，所以必须手动实现。
 * 从程序的运行结果可以发现，执行System.gc()前，系统会自动调用finalize()方法清除对象占有的资源，
 * 通过super.finalize()方式可以实现从下到上的finalize()方法的调用，即先释放自己的资源，再去释放父类的资源。
 * 但是，不要在程序中频繁的调用垃圾回收，因为每一次执行垃圾回收，jvm都会强制启动垃圾回收器运行，这会耗费更多的系统资源，
 * 会与正常的Java程序运行争抢资源，只有在执行大量的对象的释放，才调用垃圾回收最好。
 */
public class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("当前的对象被回收了" + this);
		super.finalize();
	}
}
