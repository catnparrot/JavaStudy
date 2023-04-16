package train01.sec03;

import java.util.Scanner;

public class T04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A: ");	int a = sc.nextInt();
		System.out.print("정수 B: ");	int b = sc.nextInt();
		if(a>b) {
			int t =a;
			a=b;
			b=t;
		}
		
		do {
			System.out.print(a + " ");
			a = a+1;
			//a++; 은 쓰면 안되나?
		}while(a<=b);
		System.out.println(); //이건 왜 있는 거지?
	}
}
