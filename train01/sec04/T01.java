package train01.sec04;

import java.util.Scanner;

public class T01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("숫자: ");
			n = sc.nextInt();
		} while (n<=0);
		
		int f = 1;
		int i = 1;
		
		while (i<=n) {
			f *= i;
			i++;
		}
		System.out.println("1부터 " + n + "까지의 곱은 " + f + "입니다.");
	}

}
