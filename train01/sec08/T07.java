package train01.sec08;

import java.util.Random;
import java.util.Scanner;

public class T07 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			n=sc.nextInt();
		}while(n>10);
		
		int[] a=new int[n];
		
		for(int i=0; i<n; i++) {
			int j;
			do {
				j=0;
				a[i] = 1+rd.nextInt(10);
				for (;j<i;j++)
					if (a[j] == a[i]) break;
			}while(j<i);
		}
		
		for(int i = 0; i<n; i++)
			/*a[0]~a[i]의 값*/;
	}


}
