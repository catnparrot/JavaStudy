package train01.sec09;

import java.util.Scanner;

public class T10 {
	static int min(int a, int b, int c) {
		int min = a;
		
		if (b<min)
			min = b;
		if (c<min)
			min = c;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 	//정수 a
		int b = sc.nextInt(); 	//정수 b
		int c = sc.nextInt(); 	//정수 c
		/*min(a, b, c)*/
	}
}
