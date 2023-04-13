package train01.sec01;

//입력한 점수에 따라 수/우/미/양/가를 판정하는 프로그램을 작성하자.
import java.util.Scanner;

public class T0 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("점수: ");
		int n = x.nextInt();
		int a = 60;
		int b = 70;
		int c = 80;
		int d = 90;
		if(100>=n && n>=0)
			if(n>=0 && n<a)
			System.out.println("가");
			else if(n>=a && n<b)
				System.out.println("양");
			else if(n>=b && n<c)
				System.out.println("미");			
			else if(n>=c && n<d)
				System.out.println("우");			
			else
				System.out.println("수");
		else
			System.out.println("점수를 잘못 입력하셨습니다.");

	}
}
