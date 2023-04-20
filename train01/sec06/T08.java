package train01.sec06;

import java.util.Scanner;

public class T08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		double ave = (x+y+z)/3;	//3을 나눈 후 소수점은 버려짐
		System.out.printf("x, y, z 평균: %.3f\n",ave);
		
		//x=7, y=8, z=10 -> 실제 평균: 8.33333... / 출력값: 8.000
	}

}
