package train01.sec01;

//입력한 정숫값이 5로 나누어떨어지면 "이 값은 5로 나누어집니다."라고 표시하고
//그러지 않으면 "이 값은 5로 나누어지지 않습니다."라고 표시하는 프로그램을 작성하자.
import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("정수값: ");
		int a = x.nextInt();
		if (a>0)
			if (a%5==0)
				System.out.println("이 값은 5로 나누어집니다.");
			else
				System.out.println("이 값은 5로 나누어지지 않습니다.");
		else
			System.out.println("잘못입력하셨습니다");
	}

}
