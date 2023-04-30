package train01.sec12;

import java.util.Scanner;

public class T04 {
	static int[] arrayInsOf(int[] a, int idx, int x) {
		if(idx<0 || idx>a.length)
			return a.clone();
		else {
			int[] c = new int[a.length+1];
			int i = 0;
			for(; i<idx; i++)
				c[i]=a[i];
			for(; i<a.length; i++)
				c[i+1] = a[i];
			c[idx] = x;
			return c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++)
			x[i] = sc.nextInt();
		
		int idx = sc.nextInt();
		int n = sc.nextInt();
		
		int[] y = arrayInsOf(x, idx, n);
		
		for(int i = 0; i<y.length; i++)
			/*배열 y 출력*/;
	}
}
