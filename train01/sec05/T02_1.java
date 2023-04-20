package train01.sec05;

import java.util.Scanner;

public class T02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r;
		int month;
		System.out.println("계절을 찾습니다.");
		do {
			do {
				System.out.print("몇 월입니까?: ");
				month=sc.nextInt();
			}while(month<1 || month>12);

			if (month >=3 && month<=5)
				System.out.println("봄");
			else if (month >=6 && month<=8)
				System.out.println("여름");
			else if (month >=9 && month<=11)
				System.out.println("가을");
			else if (month == 12 || month == 1 || month == 2)
				System.out.println("겨울");
			
			System.out.println("다시 하시겠습니까? 1...yes/0...no");
			r=sc.nextInt();
		}while(r==1);
		System.out.println("종료");
	}
}
