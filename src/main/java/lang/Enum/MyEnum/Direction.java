package lang.Enum.MyEnum;

/*
 * 自己实现枚举类(第一版)
 * 		最简单版本
 */
public class Direction {
	// 创建几个实例
	public static final Direction FRONT = new Direction();
	public static final Direction BEHIND = new Direction();
	public static final Direction LEFT = new Direction();
	public static final Direction RIGHT = new Direction();

	// 构造私有，别人就不能无限的创建了
	private Direction() {
	}
}
