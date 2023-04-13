package train01.sec02;

//키보드에서 입력한 3개의 정수 중 최솟값을 구하는 프로그램을 작성하자.
import java.util.Scanner;

public class T04_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 a: ");	int a = sc.nextInt();
		System.out.print("정수값 b: ");	int b = sc.nextInt();
		System.out.print("정수값 c: ");	int c = sc.nextInt();
		if(a>b)
			if(b>c)
				System.out.println("최솟값: " + c);
			else
				System.out.println("최솟값: " + b);
		else if(a<c)
				System.out.println("최솟값: " + a);
			
	}
}