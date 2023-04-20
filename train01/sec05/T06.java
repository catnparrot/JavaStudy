package train01.sec05;

import java.util.Scanner;

public class T06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x = 1; x <= n; x++) {
			for(int y = 1; y <= n-x; y++)
				System.out.print(' ');
			for(int y = 1; y <= 2*x-1; y++)
				System.out.print(x%10);
				System.out.println();
		}
	}
}
