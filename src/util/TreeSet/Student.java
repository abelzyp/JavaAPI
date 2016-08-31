package util.TreeSet;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student s) {
		// 按照年龄排序
		/*
		 * int num = this.age - s.age; int num2 = num == 0 ?
		 * this.name.compareTo(s.name) : num; return num2;
		 */
		// 主要条件 姓名的长度
		int num = this.name.length() - s.name.length();
		// 姓名的长度相同，不代表姓名的内容相同
		int num2 = num == 0 ? this.name.compareTo(s.name) : num;
		// 姓名的长度和内容相同，不代表年龄相同，所以还得继续判断年龄
		int num3 = num2 == 0 ? this.age - s.age : num2;
		return num3;
	}
}
