package train01.sec02;

//2개의 정숫값을 읽어서 두 값의 차를 표시하는 프로그램을 작성하자

import java.util.Scanner;

public class T02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 a: ");		int a = sc.nextInt();
		System.out.print("정수값 b: ");		int b = sc.nextInt();
		int dif;
		if(a>b)
			dif=a-b;
		else
			dif=b-a;
		System.out.println(dif);
	}

}
