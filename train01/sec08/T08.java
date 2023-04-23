package train01.sec08;

import java.util.Random;
import java.util.Scanner;

public class T08 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i<n; i++) {			//a[0~i] 변수값 할당
			/*a[i]*/
			a[i]=sc.nextInt();
		}
		
		for (int i = 0; i<2*n ; i++) {		//할당된 값을 랜덤으로 섞기
			int idx1 = rd.nextInt(n);		//임의로 변수 idx1(0~n-1난수)
			int idx2 = rd.nextInt(n);		//임의로 변수 idx2(0~n-1난수)
			//a[idx1] <-> a[idx2]하기 위한 선언
			
			/*
			System.out.println('*');
			System.out.println(a[idx1]);
			System.out.println(a[idx2]);			
			*/
			
			int t;							//교환소 역할
			
			t = a[idx1];					//변수 t에 a배열idx1 대입
			a[idx1] = a[idx2];				//a배열idx1에 a배열idx2 대입
			a[idx2] = t;					//a배열idx2에 변수 t 대입
		} 
		;
		for (int i = 0; i<n; i++)
			/*a[0~i] 값*/;
	}

}
