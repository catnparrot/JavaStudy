package train01.sec11;

import java.util.Scanner;

/* 배열 a와 배열 b의 전체 요소 값을 교환하는 aryExchng 메소드를 작성하자.
 * void aryExchng(int[] a, int[] b)
 * 두 배열의 요소 값이 같지 않다면 작은 쪽의 배열 수에 맞춰 교환할 것.
 * ex> 배열 a의 요소가 {1, 2, 3, 4, 5, 6, 7}이고
 * 배열 b의 요소가 {5, 4, 3, 2, 1}일 때
 * aryExchng(a, b)를 호출하면
 * 배열 a는 {5, 4, 3, 2, 1, 6, 7}
 * 배열 b는 {1, 2, 3, 4, 5} */


public class T09 {
	
	//배열 a, b의 요소 값을 교환하는 메소드
	static void aryExchng(int[] a, int [] b) {
		int n = a.length < b.length ? a.length : b.length;
		for(int i = 0; i<n; i++) {
			int t = a[i];
			a[i] = b[i];
			b[i] = t;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int na = sc.nextInt();
		int[] a = new int[na];
		for(int i = 0; i<na; i++)
			a[i] = sc.nextInt();
		
		int nb = sc.nextInt();
		int[] b = new int[nb];
		for(int i = 0; i <nb; i++)
			b[i]=sc.nextInt();
		
		aryExchng(a, b);
		for(int i = 0; i <na; i++)
			/*a[na] 출력*/;
		
		for(int i = 0; i<nb; i++)
			/*b[nb] 출력*/;
	}	
}
