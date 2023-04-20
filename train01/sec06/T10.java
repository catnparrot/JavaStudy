package train01.sec06;

import java.util.Scanner;

public class T10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		double ave = (double) (x+y+z)/3;
		System.out.printf("x, y, z 평균: %.3f\n", ave);
	}

}
