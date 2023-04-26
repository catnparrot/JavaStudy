package train01.sec11;

//int minOf(int[] a) 구하기

import java.util.Scanner;

public class T04 {
	static int minOf(int[] a) {
		int min = a[0];
		for(int i = 1; i<a.length; i++)
			if(a[i]<min)
				min = a[i];
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		//사람 수
		
		int[] h = new int[n];			//신장용 배열 생성
		int[] w = new int[n];			//체중용 배열 생성
		
		/*n명의 신장과 체중을 입력*/
		for(int i =0; i<n; i++) {
			h[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		
		System.out.println(minOf(h)); //cm
		System.out.println(minOf(w)); //kg
	}
}
