package train01.sec02;

//키보드에서 입력한 3개의 정숫값 중 중앙값을 구해서 표시하는 프로그램을 작성하자.
//예를 들어 2, 3, 1의 중앙값은 2이고 1, 2, 1의 중앙값은 1이고, 3, 3, 3의 중앙값은 3이다.
import java.util.Scanner;
import java.util.Arrays;

public class T05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정숫값 a: ");    int a = scanner.nextInt();
        System.out.print("정숫값 b: ");    int b = scanner.nextInt();
        System.out.print("정숫값 c: ");    int c = scanner.nextInt();

        int med;
        if(a>=b)				//a>=b
        	if(b>=c)				//a>=b>=c
        		med=b;
        	else if(a<=c)			//c>=a>=b
        		med=a;
        	else					//a>c>=b
        		med=c;
        else if(a>c)			//b>a, a>c -> b>a>c
        	med=a;
        else if(b>c)			//c>a, b>c -> b>c>a
        	med=c;
        else					//c>b, b>a -> c>b>a
        	med=b;
        	System.out.println("중간값: " + med);
        		
			
	}
}
