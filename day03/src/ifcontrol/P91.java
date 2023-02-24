package ifcontrol;

public class P91 {

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		int c = 60;
		
		// 세수의 수의 최대값과 최소값을 구하시오
		int max = 0;
		int min = 0;
		
		if(a > b) {
			max = a;
			min = b;
			if(a < c) {
				max = c;
			}else {
				if(b > c) {
					min = c;
				}
			}
		}else {
			max = b;
			min = a;
			if(b < c) {
				max = c;
			}else {
				if(a > c) {
					min = c;
				}
			}
		}
		
		max = (a > b)? ((a > c)? a: c) : (b > c)? b : c;
		min = (a < b)? ((a < c)? a: c) : (b < c)? b : c;
		
		if(a > b) {
			max = Math.max(a, c);
			min = Math.min(b, c);
		}else {
			max = Math.max(b, c);
			min = Math.min(a, c);
		}
		
		System.out.printf("MAX: %d, MIN: %d",max,min);
	}

}





