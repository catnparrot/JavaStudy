package train01.sec08;

import java.util.Scanner;

public class T09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] a = new int [n];
		int[] b = new int [n];
		
		for(int i = 0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i = 0; i<n; i++) {
			b[i]=a[n-i];
		}
		
		for(int i = 0; i<n; i++)
			/*b[0~i] 값*/ ;
	}

}
