package Others.Generic;
/*
 * 泛型类
 */
public class Tool<T, E> {
	private T t;
	private E e;
	public Tool() {}
	public Tool(T t, E e) {
		this.t = t;
		this.e = e;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public E getE() {
		return e;
	}
	public void setE(E e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Tool [t=" + t + ", e=" + e + "]";
	}
}
