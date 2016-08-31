package util.TreeSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
 * 
 * 分析：
 * 		A:定义学生类
 * 		B:创建一个TreeSet集合
 * 		C:总分从高到底如何实现呢?		
 * 		D:键盘录入5个学生信息
 * 		E:遍历TreeSet集合
 */
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Stu> ts = new TreeSet<Stu>(new Comparator<Stu>() {

			@Override
			public int compare(Stu s1, Stu s2) {
				int num = s2.getSum() - s1.getSum();
				// 总分一样 按语文成绩排序
				int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				// 总分和语文一样 按数学成绩
				int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
				// 总分 语文 数学都一样 按英语成绩
				int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
				// 总分 语文 数学 英语都一样 按姓名
				int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName()) : num4;
				return num5;
			}
		});
		Scanner sc = new Scanner(System.in);
		System.out.println("开始录入学生信息：");
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入第" + i + "个学生的姓名：");
			String name = sc.nextLine();
			System.out.println("请输入第" + i + "个学生的语文成绩：");
			String chinese = sc.nextLine();
			System.out.println("请输入第" + i + "个学生的数学成绩：");
			String math = sc.nextLine();
			System.out.println("请输入第" + i + "个学生的英语成绩：");
			String english = sc.nextLine();
			Stu s = new Stu();
			s.setName(name);
			s.setChinese(Integer.parseInt(chinese));
			s.setMath(Integer.parseInt(math));
			s.setEnglish(Integer.parseInt(english));
			ts.add(s);
		}
		System.out.println("学生信息录入完毕");
		System.out.println("--------------");
		System.out.println("学习成绩从高到低排序如下：");
		System.out.println("姓名\t语文成绩\t数学成绩\t英语成绩\t总分");
		for (Stu s : ts) {
			System.out.println(s.getName() + "\t" + s.getChinese() + "\t" + s.getMath() + "\t" + s.getEnglish() + "\t"
					+ s.getSum());
		}
	}
}
