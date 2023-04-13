package train01.sec02;

import java.util.Scanner;

public class T01_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수값 a: ");		double a = sc.nextDouble();
		System.out.print("실수값 b: ");		double b = sc.nextDouble();
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
		

	}

}