package train01.sec01;

//정숫값을 읽어 부호(양수/음수/0)를 판정하는 프로그램을 작성하자.

import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("정숫값: ");
		int n = x.nextInt();
		
		if(n>0)
			System.out.println("양수");
		else if(n<0)
			System.out.println("음수");
		else
			System.out.println("0");
	}

}
