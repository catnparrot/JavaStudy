//정수값의 부호를 판정해서 표시하는 Sign 프로그램인 [문제 3-5]를 원하는 만큼 반복해서
//입력 및 표시하도록 수정하자

package train01.sec03;

import java.util.Scanner;

public class T01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r;
		
		//do 문에 의하여 반복되는 루프 바디
		do {
			System.out.print("정수값: ");
			int n = sc.nextInt();
			
			if (n>0)
				System.out.println("이 값은 양수입니다.");
			else if (n<0)
				System.out.println("이 값은 음수입니다.");
			else
				System.out.println("이 값은 0입니다.");
			
			System.out.println("다시 한번? 1-Yes / 0-No:");
			r = sc.nextInt();
		} while (r==1);
		//디바 프루 는되복반 여하의 에문 od

	}

}
