package util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 * 
 * 分析：
 * 		A:创建键盘录入数据对象
 * 		B:键盘录入多个数据,我们不知道多少个，所以用集合存储
 * 		C:以0结束,这个简单，只要键盘录入的数据是0，我就不继续录入数据了
 * 		D:把集合转成数组
 * 		E:对数组排序
 * 		F:获取该数组中的最大索引的值
 */
public class ArrayListTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.println("请输入数字，以0结束：");
		while (true) {
			int n = sc.nextInt();
			if (n != 0) {
				array.add(n);
			} else {
				break;
			}
		}
		sc.close();
		Object[] oo = array.toArray();
		Arrays.sort(oo);
		System.out.println(oo[oo.length - 1]);
	}
}
