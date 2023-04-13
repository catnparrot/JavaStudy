package train01.sec01;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("정숫값: ");
		int a = x.nextInt();
		
		if(a<0)
			System.out.println("이 값은 음의 값입니다.");
	}
}

