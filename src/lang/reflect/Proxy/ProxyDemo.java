package lang.reflect.Proxy;

import java.lang.reflect.Proxy;

/*
 * 使用动态代理需要创建一个动态代理对象
 * Proxy类中的newProxyInstance()方法可以创建动态代理对象
 * 		public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
 * 		:返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序。
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
		MyInvocationHandler handler = new MyInvocationHandler(ud);
		UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(),
				handler);
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.find();
	}
}
