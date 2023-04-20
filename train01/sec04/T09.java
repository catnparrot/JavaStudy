package train01.sec04;

import java.util.Scanner;

public class T09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int n = sc.nextInt();
		if(n>0) {
			for(int i=0; i<n/5 ; i++)
				System.out.println("*****");
			int r = n%5;
			if(r>0) {
				for(int i=0;i<r;i++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
}
