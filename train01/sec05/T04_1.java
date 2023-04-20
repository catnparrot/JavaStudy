package train01.sec05;

import java.util.Scanner;

public class T04_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
