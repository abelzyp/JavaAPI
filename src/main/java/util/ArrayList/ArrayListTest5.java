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
public class ArrayListTest5 {
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
		Integer[] i = new Integer[array.size()];
		array.toArray(i);
		Arrays.sort(i);
		System.out.println(i[i.length - 1]);
		printArray(i);
	}

	public static void printArray(Integer[] a) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				sb.append(a[i]);
			} else {
				sb.append(a[i]);
				sb.append(", ");
			}
		}
		sb.append("]");
		System.out.println("数组是：" + sb.toString());
	}
}
