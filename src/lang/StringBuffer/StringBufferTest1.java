package lang.StringBuffer;

/*
 * 把数组拼接成一个字符串
 */
public class StringBufferTest1 {

	public static void main(String[] args) {
		int[] arr = { 88, 66, 44, 22, 33, 55, 77 };
		System.out.println(arrayToString(arr));
	}

	public static String arrayToString(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]);
			} else {
				sb.append(arr[i]).append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
