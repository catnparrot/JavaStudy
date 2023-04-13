package train01.sec01;

//입력한 정숫값이 10의 배수이면 '이 값은 10의 배수입니다.'라고 표시하고,
//그렇지 않으면 '이 값은 10의 배수가 아닙니다.'라고 표시하는 프로그램을 작성하라
//(음수를 읽은 경우 '음의 정숫값을 입력했습니다."라고 표시할 것)
import java.util.Scanner;

public class T8 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("정숫값: ");
		int a = x.nextInt();
		if(a>0)
			if(a%10==0)
				System.out.println("이 값은 10의 배수입니다.");
			else
				System.out.println("이 값은 10의 배수가 아닙니다.");
		else if(a<0)
			System.out.println("음의 정숫값을 입력했습니다.");
		else
			System.out.println("잘못 입력하셨습니다.");
	}

}
