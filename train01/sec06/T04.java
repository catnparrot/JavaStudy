package train01.sec06;

import java.util.Scanner;

public class T04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.printf("8진수는 %o입니다.\n", x);
		System.out.printf("16진수는 %x입니다.\n", x);
	}

}