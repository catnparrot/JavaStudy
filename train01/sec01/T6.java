package train01.sec01;

//2개의 변수 a, b의 값을 읽어서 a, b의 대소관계를 다음과 같이 표시하는 프로그램을 작성하자.
//"a가 크다.", "b가 크다.", "a와 b가 같다."

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("a의 값: ");		int a = x.nextInt();
		System.out.print("b의 값: ");		int b = x.nextInt();
		if(a>b) 
			System.out.println("a가 크다.");
		else if(a<b)
			System.out.println("b가 크다.");
		else
			System.out.println("a와 b가 같다.");
		

	}

}
