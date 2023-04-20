package train01.sec05;

import java.util.Scanner;

public class T02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("계절을 알려주는 프로그램입니다.");
		
		int month;

		do {	
			System.out.print("몇 월인지 숫자를 입력해주세요.: ");
			month = sc.nextInt();
				switch (month) { 
					case 3:
					case 4:
					case 5: 	System.out.println("봄");
						break;
					case 6:
					case 7:
					case 8:		System.out.println("여름");
						break;
					case 9:
					case 10:
					case 11:	System.out.println("가을");
						break;
					case 12:
					case 1:
					case 2:		System.out.println("겨울");
						break;
					default:	System.out.println("잘못입력하셨습니다.");
						break;
					}
				
		}while(true);

	}
}

//2중 do 문이 아닌 코드
//문제점: 반복에 선택권이 없다.