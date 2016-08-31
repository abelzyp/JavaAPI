package util.Calendar;

import java.util.Calendar;

/*
 * public void add(int field,int amount):根据给定的日历字段和对应的时间，来对当前的日历进行操作。
 * public final void set(int year,int month,int date):设置当前日历的年月日
 */
public class Calendar_add_set {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, -2);
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		c.set(1992, 03, 1);
		year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		System.out.println(year+"-"+month+"-"+day);
	}
}
