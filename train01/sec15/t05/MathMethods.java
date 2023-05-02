package train01.sec15.t05;

import java.util.Scanner;

public class MathMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();				//실수값
		
		System.out.println(Math.abs(x));
		System.out.println(Math.sqrt(x));
		System.out.println(Math.PI*x*x);
	}
}
