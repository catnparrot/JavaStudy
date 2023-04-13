package train01.sec02;

import java.util.Scanner;

public class T01_1{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수값 a: ");		double a = sc.nextDouble();
		System.out.print("실수값 b: ");		double b = sc.nextDouble();
		double max = a>b ? a : b;
		/*(조건식) ? 식1 : 식2;
		 * 조건식이 true일 경우 식1을 반환하고 false인 경우 식2를 반환한다. */
			System.out.println(max);
	}

}