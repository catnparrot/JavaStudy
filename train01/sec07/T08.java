package train01.sec07;

import java.util.Random;
import java.util.Scanner;

public class T08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print(" ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0;i<n;i++)
			a[i] = 1+rd.nextInt(10);
		
		for(int i = 10 ;i>=1;i--) {
			for(int j = 0;j<n;j++)
				if(a[j]>=i)
					System.out.print("* ");
				else
					System.out.print(" ");
			System.out.println();
		}
		
		for(int i = 0;i<2*n;i++)
			System.out.print('-');
			System.out.println();
			
		for(int i = 0;i<n;i++)
			System.out.print(i%10 + " ");
			System.out.println();
	}

}
