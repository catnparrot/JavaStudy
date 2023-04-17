package train01.sec04;

import java.util.Scanner;

public class T07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hMin = sc.nextInt();
		int hMax = sc.nextInt();
		int step = sc.nextInt();
		
		for(int i = hMin;i<=hMax; i+=step)
			System.out.println(i+ " " + 0.9*(i-100));
	}

}
