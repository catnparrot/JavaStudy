package train01.sec04;

import java.util.Scanner;

public class T07_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 cm부터: ");
		int hMin = sc.nextInt();
		System.out.print("몇 cm까지: ");
		int hMax = sc.nextInt();	
		System.out.print("몇 cm 단위: ");
		int step = sc.nextInt();
		
		System.out.println("신장 표준 체중");
		System.out.println("--------------");
		
		for(int i = hMin;i<=hMax; i+=step)
			System.out.println(i+ " " + 0.9*(i-100));
	}

}
