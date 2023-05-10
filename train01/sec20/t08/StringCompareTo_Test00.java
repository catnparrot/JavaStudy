package train01.sec20.t08;

import java.util.Scanner;

class StringCompareTo_Test00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 s1: "); String s1 = sc.next();
		System.out.print("문자열 s2: "); String s2 = sc.next();

		int balance = s1.compareTo(s2);
		
		System.out.println(balance);		
	}
}

