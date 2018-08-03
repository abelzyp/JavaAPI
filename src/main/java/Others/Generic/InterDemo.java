package Others.Generic;

public class InterDemo {
	public static void main(String[] args) {
		InterImpl<String> i = new InterImpl<String>();
		i.show("hello");
		
		InterImpl<Integer> ii = new InterImpl<Integer>();
		ii.show(1000);
	}
}
