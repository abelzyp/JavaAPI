package lang.Object;

import utils.Person;

/*
 * Object:类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
 * 每个类都直接或者间接的继承自Object类。
 * 
 * public int hashCode():返回该对象的哈希码值。
 * 		注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值。
 * 		你可以理解为地址值。
 */
public class Object_hashCode {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.hashCode());// 22279806

		Person p2 = new Person();
		System.out.println(p2.hashCode());// 31275026

		Person p3 = p2;
		System.out.println(p3.hashCode());// p3和p2的hashCode一样的
	}
}
