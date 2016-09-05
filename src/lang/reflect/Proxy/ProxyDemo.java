package lang.reflect.Proxy;

import java.lang.reflect.Proxy;

/*
 * 动态代理
 * 		代理：本来应该自己做的事情，却请了别人来做，被请的人就是代理对象。
 * 		举例：春季回家买票让人代买
 * 		动态代理：在程序运行过程中产生的这个对象
 * 		而程序运行过程中产生对象其实就是我们刚才反射讲解的内容，所以，动态代理其实就是通过反射来生成一个代理
 * 
 * 在Java中java.lang.reflect包下提供了一个Proxy类和一个InvocationHandler接口，
 * 通过使用这个类和接口就可以生成动态代理对象。
 * JDK提供的代理只能针对接口做代理。我们有更强大的代理cglib
 * 
 * Proxy类中创建动态代理对象的方法的三个参数；
 * 		ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
 * 		Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
 * 		InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
 * 
 * 每一个动态代理类都必须要实现InvocationHandler这个接口，
 * 并且每个代理类的实例都关联到了一个handler，
 * 当我们通过代理对象调用一个方法的时候，
 * 这个方法的调用就会被转发为由InvocationHandler这个接口的invoke方法来进行调用。
 * 
 * 使用动态代理需要创建一个动态代理对象
 * Proxy类中的newProxyInstance()方法可以创建动态代理对象
 * 		public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
 * 		:返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序。
 * Proxy.newProxyInstance
 * 		创建的代理对象是在jvm运行时动态生成的一个对象，它并不是我们的InvocationHandler类型，
 * 		也不是我们定义的那组接口的类型，而是在运行时动态生成的一个对象，并且命名方式都是这样的形式，
 * 		以$开头，proxy为中，最后一个数字表示对象的标号。
 * 		System.out.println(u.getClass().getName());
 */
public class ProxyDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		System.out.println("-----------");
		// 创建动态代理对象，对ud对象做一个代理对象
		// 要对哪个对象做代理，就把哪个对象传进去，这里对对象ud做代理
		MyInvocationHandler handler = new MyInvocationHandler(ud);
		UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(),
				handler);
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.find();
	}
}
