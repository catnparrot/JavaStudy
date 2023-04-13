package train01.sec02;

//2개의 정숫값을 내림차순(큰 순)으로 정렬하는 프로그램을 작성하자.
//출제의도는 변수값 교환?
import java.util.Scanner;
public class T07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a: ");		int a=sc.nextInt();
		System.out.print("정수 b: ");		int b=sc.nextInt();
		if (a<b) {
			int x=a;
			a=b;
			b=x;
		}
		System.out.println("내림차순으로 정렬했습니다.");
		System.out.println(a);
		System.out.println(b);
	}

}
