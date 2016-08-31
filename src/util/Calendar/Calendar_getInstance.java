package util.Calendar;

import java.util.Calendar;

/*
 * Calendar:它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
 * 
 * public int get(int field):返回给定日历字段的值。日历类中的每个日历字段都是静态的成员变量，并且是int类型。
 */
public class Calendar_getInstance {
	public static void main(String[] args) {
		// 其日历字段已由当前日期和时间初始化：
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		//Calendar cc = new Calendar();//错误的
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		System.out.println(year + "年" + (month + 1) + "月" + day + "日");
	}
}
