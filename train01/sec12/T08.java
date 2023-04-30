package train01.sec12;

import java.util.Scanner;

public class T08 {
	static int absolute(int x) {
		return x >= 0? x : -x;
	}
	
	static long absolute(long x) {
		return x >= 0 ? x : -x;
	}
	
	static float absolute(float x) {
		return x >= 0 ? x : -x;
	}
	
	static double absolute(double x) {
		return x >= 0 ? x : -x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long b = sc.nextLong();
		float c = sc.nextFloat();
		double d = sc.nextDouble();

		System.out.println(absolute(a));
		System.out.println(absolute(c));
		System.out.println(absolute(c));
		System.out.println(absolute(d));
		
	}
}
