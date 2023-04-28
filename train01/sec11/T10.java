package train01.sec11;

import java.util.Scanner;

/* 배열 a와 완전히 같은 배열을 생성해서 반환하는 arrayClone 메소드를 작성   */


public class T10 {
	static int[] arrayClone(int[] a) {
		int[] c = new int[a.length];
		for(int i = 0; i<c.length; i++)
			c[i] = a[i];
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++)
			x[i] = sc.nextInt();
		
		int[] y = arrayClone(x);
		for(int i = 0; i<num; i++)
			/*y[num] 출력 -> arrayClone 메소드의 배열 c=a 출력*/;
	}
}
