package util.LinkedList;

import java.util.LinkedList;

/**
 * 自定义的栈集合
 * 
 * @version V1.0
 * @param <T>
 */
public class MyStack<T> {
	private LinkedList<T> link;

	public MyStack() {
		link = new LinkedList<T>();
	}

	public void add(T t) {
		link.addFirst(t);
	}

	public T get() {
		return link.removeFirst();
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}
}
