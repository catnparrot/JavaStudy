package train01.sec02;

//월을 1~12의 정숫값으로 읽어서 해당하는 계절을 표시하는 프로그램을 작성하자.
import java.util.Scanner;
public class T10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 월인지 숫자로 입력하시오: ");	int m = sc.nextInt();
		
		switch(m) {
			case 3:
			case 4:
			case 5:		System.out.println("봄");	break;
			case 6:
			case 7:
			case 8:		System.out.println("여름");	break;
			case 9:
			case 10:
			case 11:	System.out.println("가을");	break;
			case 12:
			case 1:
			case 2:		System.out.println("겨울");	break;
		}
		
	}

}
