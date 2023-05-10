package train01.sec20.t07;

import java.util.Scanner;

class CompareString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 s1: "); String s1 = sc.next();
		System.out.print("문자열 s2: "); String s2 = sc.next();

		if (s1==s2)
			System.out.println("s1==s2");
		else
			System.out.println("s1!=s2");
		
		if(s1.equals(s2))
			System.out.println("s1과 s2는 내용이 같다.");
		else
			System.out.println("이거 왜 비교함? 뭘 하려는지 모르겠다 휴먼");
	}
}
