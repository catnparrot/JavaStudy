package train01.sec03;

import java.util.Scanner;

public class T05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;
		do {
			System.out.print("카운트: ");
			x=sc.nextInt();
		} while(x<=0); //do문 종료시 x>0, 즉 반드시 양의 값이 된다. 
		
		while(x>=0)
			System.out.println(x--);
			System.out.println("x의 값이 " + x + "이 됐습니다.");
	}

}
