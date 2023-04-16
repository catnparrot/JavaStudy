package train01.sec03;

import java.util.Scanner;

public class T02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("세 자리 정수값");
			n=sc.nextInt();
		}while (n<100 || n>999);
		System.out.println("입력값: " + n);
	}

}
