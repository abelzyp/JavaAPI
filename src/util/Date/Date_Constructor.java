package util.Date;

import java.util.Date;

/*
 * Date:表示特定的瞬间，精确到毫秒。 
 * 
 * 构造方法：
 * 		Date():根据当前的默认毫秒值创建日期对象
 * 		Date(long date)：根据给定的毫秒值创建日期对象
 */
public class Date_Constructor {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		long time = 1000*60*60;
		Date dd = new Date(time);
		System.out.println(dd);
		
		Date ddd = new Date(0);
		System.out.println(ddd);
	}
}
