package util.ArrayList;

import java.util.ArrayList;

import utils.Person;

/*
 * 集合的嵌套遍历
 * 需求：
 * 		我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
 * 		但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
 * 		而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
 * 		就是这个样子的：ArrayList<ArrayList<Student>>
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		// 创建大集合
		ArrayList<ArrayList<Person>> bigArrayList = new ArrayList<ArrayList<Person>>();

		// 创建第一个班级的学生集合
		ArrayList<Person> firstArrayList = new ArrayList<Person>();
		// 创建学生
		Person s1 = new Person("唐僧", 30);
		Person s2 = new Person("孙悟空", 29);
		Person s3 = new Person("猪八戒", 28);
		Person s4 = new Person("沙僧", 27);
		Person s5 = new Person("白龙马", 26);
		// 学生进班
		firstArrayList.add(s1);
		firstArrayList.add(s2);
		firstArrayList.add(s3);
		firstArrayList.add(s4);
		firstArrayList.add(s5);
		// 把第一个班级存储到学生系统中
		bigArrayList.add(firstArrayList);

		// 创建第二个班级的学生集合
		ArrayList<Person> secondArrayList = new ArrayList<Person>();
		// 创建学生
		Person s11 = new Person("诸葛亮", 30);
		Person s22 = new Person("司马懿", 28);
		Person s33 = new Person("周瑜", 26);
		// 学生进班
		secondArrayList.add(s11);
		secondArrayList.add(s22);
		secondArrayList.add(s33);
		// 把第二个班级存储到学生系统中
		bigArrayList.add(secondArrayList);
		// 创建第三个班级的学生集合
		ArrayList<Person> thirdArrayList = new ArrayList<Person>();
		// 创建学生
		Person s111 = new Person("宋江", 40);
		Person s222 = new Person("吴用", 35);
		Person s333 = new Person("高俅", 30);
		Person s444 = new Person("李师师", 22);
		// 学生进班
		thirdArrayList.add(s111);
		thirdArrayList.add(s222);
		thirdArrayList.add(s333);
		thirdArrayList.add(s444);
		// 把第三个班级存储到学生系统中
		bigArrayList.add(thirdArrayList);

		// 遍历集合
		for (ArrayList<Person> array : bigArrayList) {
			for (Person p : array) {
				System.out.println(p.getName() + "---" + p.getAge());
			}
		}
	}
}
