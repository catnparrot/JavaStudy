package train01.sec12;

import java.util.Scanner;

/* 2차원 배열 a와 완전히 동일한 배열을 생성해서 반환하는 arryClone2를 작성하자 */


public class T06 {
	static int[][] arryClone2(int[][] a) {
		int[][] c = new int[a.length][];
		for(int i = 0; i<a.length; i++) {
			c[i] = new int[a[i].length];
			for(int j = 0; j<a[i].length; j++)
				c[i][j] = a[i][j];
		}
		return c;
	}
	
	static void printMatrix(int[][] m) {
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++)
				System.out.print(m[i][j]+ " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] a = new int[h][w];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++)
				/*"a[%d][%d]: ", i, j 출력*/
				a[i][j] = sc.nextInt();
		}
		int[][] ca = arryClone2(a);
		printMatrix(a);
		printMatrix(ca);
	}

}
