package train01.sec04;

import java.util.Scanner;

public class T01_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int a = sc.nextInt();

		int b = 0;
		int c = 1;
		while(c<=a) {			//c>a가 될때까지 while문이 종료되지 않음
			b += c;				//c(피연산자)의 값을 b(변수)의 값과 '+(연산(자))'한 후 변수에 저장
			c++;				//c증가
			//c>a 될 때까지 (1)b+=c, (2)c++을 반복하는 구조
			//층탑을 쌓는 이미지를 생각하자. a는 입력되고 고정된 비교 대상이고 c는 a의 높이에 맞춰 한계단씩 쌓는 생산자다. 
			//쌓으면서 복제되는 느낌을 상상하자. b는 그렇게 생산된 층수를 받아 기하급수적으로 높아지는 탑이다.
		}
		System.out.println("1~"+a+" 합은" + b + "입니다.");
	}
}
