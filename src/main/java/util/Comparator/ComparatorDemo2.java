package util.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 需求：请按照姓名的长度排序
 * 
 * TreeSet集合保证元素排序和唯一性的原理
 * 唯一性：是根据比较的返回是否是0来决定。
 * 排序：
 * 		A:自然排序(元素具备比较性)
 * 			让元素所属的类实现自然排序接口 Comparable
 * 		B:比较器排序(集合具备比较性)
 * 			让集合的构造方法接收一个比较器接口的子类对象 Comparator
 * 
 * 本类演示比较器排序。
 */
public class ComparatorDemo2 {
	public static void main(String[] args) {
		// 创建集合对象
		TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());

		// 创建元素
		Student s1 = new Student("linqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("linqingxia", 27);
		Student s5 = new Student("liushishi", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingy", 22);
		Student s8 = new Student("linqingxia", 29);

		// 添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		// 遍历
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
