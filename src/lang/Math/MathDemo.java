package lang.Math;

import java.util.Scanner;

/*
 * 需求：请设计一个方法，可以实现获取任意范围内的随机数。
 * 
 * 分析：
 * 		A:键盘录入两个数据。
 * 			int strat;
 * 			int end;
 * 		B:想办法获取在start到end之间的随机数
 * 			我写一个功能实现这个效果，得到一个随机数。(int)
 * 		C:输出这个随机数
 */
public class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入起始数据：");
		int start = sc.nextInt();
		System.out.println("输入结束数据:");
		int end = sc.nextInt();
		int randonNum = (int) (Math.random() * (end - start + 1)) + start;
		System.out.println(randonNum);
	}
}
