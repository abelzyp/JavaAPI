package Others.Generic;
/*
 * 泛型类测试
 */
public class ToopDem {
	public static void main(String[] args) {
		Tool<String, Integer> too = new Tool<String, Integer>();
		too.setT("abel");
		too.setE(24);
		
		System.out.println(too);
		System.out.println(too.getT());
		System.out.println(too.getE());
	}
}
