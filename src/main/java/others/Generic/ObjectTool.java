package others.Generic;
/*
 * 泛型类：把泛型定义在类上
 */
public class ObjectTool<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	/*
	 * 泛型方法：把泛型定义在方法上
	 */
	public void show(T t){
		System.out.println(t);
	}
}
