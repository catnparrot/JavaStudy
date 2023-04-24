package train01.sec09;

import java.util.Scanner;

public class T06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = 6;
		int[][] point = new int[n][2];
		int[] sumStudent = new int[n];	//반? 점수 합계
		int[] sumSubject = new int[2];	//과목 점수 합계
		
		System.out.printf("%d명의 국, 수 점수 아래에 입력", n);

		//따로 코딩(입력)되어 있지 않지만 0=국, 1=수 
		
		for (int i = 0; i<n ; i++) {
			point[i][0]=sc.nextInt();
			point[i][1]=sc.nextInt();

			sumStudent[i]=point[i][0]+point[i][1];
			sumSubject[0]+=point[i][0];
			sumSubject[1]+=point[i][1];
		}
		
		//표 출력을 위한 for문
		for(int i=0; i<n; i++)
			System.out.printf("%3d%8d%8d%8.1f\n", i+1, point[i][0], point[i][1], (double)sumStudent[i]/2);
		
		System.out.printf("반평균%8.1f%8.1f\n", (double)sumSubject[0]/n, (double)sumSubject[1]/n);
	}
}
