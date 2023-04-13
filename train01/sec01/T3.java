package train01.sec01;

import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("양의 정숫값 A: ");		int a = x.nextInt();
		System.out.print("양의 정숫값 B: ");		int b = x.nextInt();
		
		if(a%b==0)
			System.out.println("B는 A의 약수입니다.");
		else
			System.out.println("B는 A의 약수가 아닙니다.");
	}
}
