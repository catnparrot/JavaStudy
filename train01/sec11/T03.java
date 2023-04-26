package train01.sec11;

import java.util.Scanner;

public class T03 {
	//배열 a의 모든 요소의 합
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++)
			sum+=a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		//요소 수
		int[] x = new int[n];		//n개의 요소를 가지는 배열
		
		for(int i =0; i<n; i++) {
			/*x[i]: */
			x[i] = sc.nextInt();
		}
		System.out.println(sumOf(x));	//모든 요소의 합
	}
}
