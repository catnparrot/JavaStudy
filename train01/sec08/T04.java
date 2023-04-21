package train01.sec08;

import java.util.Scanner;

public class T04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] a = new double[n];
		
		for(int i = 0; i<n; i++) {
			a[i]=sc.nextDouble();
		}
		double sum = 0;
		for(double i : a)			//확장 for문
			sum +=i;
		
		System.out.println(sum);
		System.out.println(sum/n);
	}

}
