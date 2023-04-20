package train01.sec04;

import java.util.Scanner;

public class T03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("카운트다운을 시작합니다. 시간을 입력하세오. : ");
		int s;
		do {
			s = sc.nextInt();
			System.out.println("잘못입력하셨습니다. 다시 입력하세요. : ");
		}while (s<=0);
		
		for(;s>=0;s--)
			System.out.println(s);
	}

}
