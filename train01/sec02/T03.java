package train01.sec02;

//두 정숫값의 차가 10 이하인 경우 "두 값의 차는 10 이하입니다."라고 표시하고
//그렇지 않으면 "두 값의 차는 11 이상입니다."라고 표시하는 프로그램을 작성하자.
import java.util.Scanner;
public class T03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 a: ");		int a = sc.nextInt();
		System.out.print("정수값 b: ");		int b = sc.nextInt();
		int dif = a>=b ? a-b : b-a;
		if(dif<=10)
			System.out.println("두 값의 차는 10 이하입니다.");
		else
			System.out.println("두 값의 차는 11 이상입니다.");
		
	}
}
