package train01.sec10;

import java.util.Scanner;

public class T01 {
	static int sumUp(int n) {
		int sum = 0;
		for(int i = 0; i<=n; i++)
		sum +=i;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 x까지의 합을 구하자.");
		int x;
		do {
			System.out.print("x의 값: ");
			x=sc.nextInt();
		}while(x<=0);
		System.out.println(sumUp(x));
	}
}
