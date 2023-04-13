package train01.sec02;

import java.util.Scanner;

public class T02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 a: ");		int a = sc.nextInt();
		System.out.print("정수값 b: ");		int b = sc.nextInt();
		int dif = a>=b ? a-b : b-a;
		System.out.println(dif);
	}

}
