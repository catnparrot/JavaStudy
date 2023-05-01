package train01.sec13.t06t07t08t09;

import java.util.Scanner;

public class CoordinateTester3Correct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Coordinate[] a = new Coordinate[n];
		
		for(int i = 0; i<a.length; i++)
			a[i] = new Coordinate(5.5, 7.7);
		
		for(int i = 0; i<a.length; i++)
			System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());
	}
}
