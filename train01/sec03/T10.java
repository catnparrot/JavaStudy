package train01.sec03;

//양의 정수값을 읽어 자릿수를 표시하는 프로그램을 작성하자

import java.util.Scanner;

public class T10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수를 표시합니다.");
		int x;
		
		//솔직히 당황스럽다.
		//문제 푸는 중간중간 오입력시 이런 거(do-while) 필요하지 않을까 생각했는데
		//갑자기 여기에 이런 식으로 쓰일 줄은
		do {
			System.out.print("양의 정수값: ");
			x=sc.nextInt();
		}while(x<=0);
		
		int y=0;		//y=자릿수
		while(x>0) {
			y++; 		//자릿수 증가
			x /= 10;	//x를 10으로 나눔
		}
		System.out.println("입력한 숫자는 " + y + "자리입니다.");
	}

}
