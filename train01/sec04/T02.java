package train01.sec04;

import java.util.Scanner;

public class T02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개의 *을 표시할까요?: ");
		int a = sc.nextInt();
		int i;
		for(i=1;i<=a;i++)
		{System.out.println('*');}
	}
}
