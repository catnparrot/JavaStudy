package train01.sec15.t06;

import java.util.Scanner;

public class MinMaxTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int num = sc.nextInt();			//배열a 요소 수
		int[] a = new int[num];
		for (int i = 0; i < num; i++) 
			a[i]=sc.nextInt();
		
		System.out.printf("x, y의 최솟값은 %d입니다.\n", MinMax.min(x,y));
		System.out.printf("x, y의 최댓값은 %d입니다.\n", MinMax.min(x,y));
		System.out.printf("x, y, z의 최솟값은 %d입니다.\n", MinMax.min(x,y,z));
		System.out.printf("x, y, z의 최댓값은 %d입니다.\n", MinMax.min(x,y,z));
		System.out.printf("배열 a의 최솟값은 %d입니다.\n", MinMax.min(a));
		
		int xmin[] = MinMax.minIndexArray(a);
		for (int i = 0; i < xmin.length; i++)
			System.err.print(xmin[i] + " ");		//최솟값의 인덱스
		System.out.printf("배열 a의 최댓값은 %d입니다.\n", MinMax.max(a));

		int xmax[] = MinMax.maxIndexArray(a);
		for (int i = 0; i < xmax.length; i++)
			System.out.print(xmax[i] + " ");				//최댓값의 인덱스
	}
}
