package lang.reflect.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * InvocationHandler接口中invoke方法的三个参数：
 * 		proxy:代表动态代理对象
 * 		method:代表正在执行的方法
 * 		args:代表调用目标方法时传入的实参
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object target; // 目标对象

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("权限校验");
		Object result = method.invoke(target, args);
		System.out.println("日志记录");
		return result; // 返回的是代理对象
	}

}
