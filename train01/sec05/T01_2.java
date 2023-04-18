package train01.sec05;

import java.util.Scanner;

public class T01_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값: ");
		int n = sc.nextInt();
		for(int i =1, j=1; i <= n ; i++, j=i*i)		//뭔가 j가 아름답지 못하다. 부자연스럽게 끼어넣은 느낌.
			System.out.println(i+"의 제곱은 "+j);
	}
}
