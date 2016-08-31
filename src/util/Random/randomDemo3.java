package util.Random;

import java.util.Random;

public class randomDemo3 {
	public static void main(String[] args) {
		Random r = new Random();
		byte[] bys = new byte[20];
		for(int i=0;i<bys.length;i++){
			bys[i] = (byte) i;
		}
		r.nextBytes(bys);
		for(int i=0;i<bys.length;i++){
			System.out.println(bys[i]);
		}
	}
}
