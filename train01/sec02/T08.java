package train01.sec02;

//3개의 정숫값을 오름차순(작은순)으로 정렬하는 프로그램을 작성하자.
import java.util.Scanner;
public class T08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a: ");		int a = sc.nextInt();
		System.out.print("정수 b: ");		int b = sc.nextInt();
		System.out.print("정수 c: ");		int c = sc.nextInt();
		
		if(a>b) {
			int x = a;
				a = b;
				b = x;
		}
		if(b>c) {
			int x = b;
				b = c;
				c = x;
		}
		if(a>b) {		//if(b>c)에서 변수값을 바꿨을 때 a>b일 경우 다시 한번 바꿔줄 필요가 있음
			int x = a;
				a = b;
				b = x;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
