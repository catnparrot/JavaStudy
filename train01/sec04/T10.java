package train01.sec04;

import java.util.Scanner;

public class T10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정숫값: ");
		int n = sc.nextInt();
		int c = 0;
		for (int i = 1; i <= n; i++)
			if(n%i==0) {
				System.out.println(i+" ");
				c++;
			}
	}
}
