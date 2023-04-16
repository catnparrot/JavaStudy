package train01.sec03;

import java.util.Scanner;

public class T08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개를 표시할까요?: ");
		int n=sc.nextInt();
		if(n>0) {
			int i=0;
			while(i<n) {
				if(i%2 == 0)	//i가 짝수면 '*'출력
					System.out.println('*');
				else			//i가 홀수면 '+'출력
					System.out.println('+');
				i++;
			}
			System.out.println();	//뭐 변수값 "프로그램이 종료되었습니다."를 입력하라는 건가?
		}
	}

}
