package train01.sec02;

import java.util.Scanner;

public class T03_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 a: ");		int a = sc.nextInt();
		System.out.print("정수값 b: ");		int b = sc.nextInt();
		if(a>b)
			if(10>=(a-b))
				System.out.println("두 값의 차는 10 이하입니다.");
			else
				System.out.println("두 값의 차는 11 이상입니다.");
		else
			if(10>=(b-a))
				System.out.println("두 값의 차는 10 이하입니다.");
			else
				System.out.println("두 값의 차는 11 이상입니다.");
		
	}
}
