package train01.sec02;

//키보드에서 입력한 2개의 정숫값 중 작은 값과 큰 값을 표시하는 프로그램을 작성하자.
//두 정숫값이 같으면 "두 값이 같습니다."라고 표시한다.
import java.util.Scanner;
public class T06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 a: "); int a = sc.nextInt();
		System.out.print("정수값 b: "); int b = sc.nextInt();
		if(a==b)
			System.out.println("두 값이 같습니다");
		else {
			int m, x;
			/*
			int m;
			int x;
			*/
			if(a<b) {
				m=a;
				x=b;
			} else {
				m=b;
				x=a;
			}
			System.out.println("작은 값: " + m);
			System.out.println("큰 값: " + x);	
		}
	}

}
