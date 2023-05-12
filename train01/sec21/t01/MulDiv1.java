package train01.sec21.t01;

import java.util.Scanner;

class MulDiv1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값: "); int x = sc.nextInt();
		System.out.print("x값: "); int y = sc.nextInt();
		
		System.out.println("x * y = " + (x*y));
		System.out.println("x / y = " + (x/y));
	}
}