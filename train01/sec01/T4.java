package train01.sec01;

//논리 부정 연산자(!)를 사용해서 수정하자

import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("양의 정숫값 A: ");		int a = x.nextInt();
		System.out.print("양의 정숫값 B: ");		int b = x.nextInt();
		
		if(!(a%b==0))
			System.out.println("B는 A의 약수가 아닙니다.");
		else
			System.out.println("B는 A의 약수입니다.");
	}

}
