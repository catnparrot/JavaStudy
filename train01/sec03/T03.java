package train01.sec03;

import java.util.Random;
import java.util.Scanner;

public class T03 {

	public static void main(String[] args) {
		Random r = new Random();	//r=랜덤
		Scanner sc = new Scanner(System.in);
		
		int n = 10 + r.nextInt(90);	//맞춰야하는 숫자: 10~99의 난수
		
		System.out.println("숫자 맞추기 게임 START");
		System.out.println("10부터 99 사이의 숫자를 맞추세요.");
		
		int x;	//읽는 값
			do {
				System.out.print("어떤 숫자일까요?: ");
				x=sc.nextInt();
				
				if (x>n)
					System.out.println("더 작은 숫자입니다.");
				else if (x<n)
					System.out.println("더 큰 숫자입니다.");
				//정답이 아니면 반복하게 만드는 if문
			} while(x != n);
			//while(x == n); 어떤 x값을 입력하든 x=n을 충족한다. 어째서?
			System.out.println("정답입니다.");
	}

}
