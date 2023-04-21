package train01.sec08;

import java.util.Scanner;

public class T01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			//사람 수
		int[] points = new int[n];		//점수
		
		int sum = 0;
		for(int i=0;i<n;i++) {
			points[i]=sc.nextInt();		//i의 점수
			sum += points[i];
		}
		int mx = points[0];
		int mi = points[0];
		for(int i =1; i<n;i++) {
			if (points[i] > mx) mx=points[i];
			if (points[i] < mi) mi=points[i];
		}
	
		System.out.println(sum);
		System.out.println(sum/n);
		System.out.println(mx);
		System.out.println(mi);
	}
	
}
