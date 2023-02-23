package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		int bb = 100;
		String s1 = "10";
		int s2 = Integer.parseInt(s1);
		int a = 10;
		System.out.println(s2 + a);

		Random r = new Random();
		int rndNum = r.nextInt(45)+1;
		System.out.println(rndNum);
		

	}

}
