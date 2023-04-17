package train01.sec04;

import java.util.Scanner;

public class T03_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;
		do {
			System.out.println("양의 정숫값: ");
			x=sc.nextInt();
		}while (x<=0);
		
		for (;x>=0; x--)
			System.out.println(x);
	}
}
