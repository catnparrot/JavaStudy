package train01.sec09;

import java.util.Scanner;

public class T07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//불규칙한 2차원 배열 생성
		int h = sc.nextInt();
		
		int[][] c = new int[h][];
		
		for (int i =0; i<c.length; i++) {
			System.out.println(i); 			//행째의 열 수
			int wid = sc.nextInt();
			c[i] = new int[wid];
		}
		
		for (int i = 0;i<c.length; i++) {
			for (int j=0; j<c[i].length; j++) {
			c[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0;i<c.length; i++) {
			for (int j=0; j<c[i].length; j++)
				System.out.printf("%3d", c[i][j]);
			System.out.println();
		}
	}

}
