package train01.sec01;

import java.util.Scanner;

public class T2_2 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("정숫값을 입력하시오: ");
		int n = x.nextInt();
		int a;
		
		if(n>=0)
			a=n;
		else
			a=-n;
		System.out.println("절댓값: " + a);
	}
}
