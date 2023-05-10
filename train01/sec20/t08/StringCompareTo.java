package train01.sec20.t08;

import java.util.Scanner;

class StringCompareTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 s1: "); String s1 = sc.next();
		System.out.print("문자열 s2: "); String s2 = sc.next();

		int balance = s1.compareTo(s2);
		if(balance < 0)
			System.out.println("s1이 작다.");
		else if(balance > 0)
			System.out.println("s2가 작다.");
		else
			System.out.println("크기가 서로 같다");
	}
}
