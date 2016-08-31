package lang.Character;

/*
 * Character 类在对象中包装一个基本类型 char 的值
 * 此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），并将字符从大写转换成小写，反之亦然
 * 
 * 构造方法： Character(char value)
 */
public class Character_Constructor {

	public static void main(String[] args) {
		Character ch = new Character('a');
		System.out.println("ch:" + ch);
	}

}
