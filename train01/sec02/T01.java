package train01.sec02;

//2개의 실수값 중 큰 값을 표시하는 프로그램을 작성하자.
import java.util.Scanner;

public class T01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수값 a: ");		double a = sc.nextDouble();
		System.out.print("실수값 b: ");		double b = sc.nextDouble();
		double x;	//double max;
		if(a>b)
			x = a;	//max=a;
		else
			x = b;	//max=b;
		////a - x(교환소 역할) - b
		System.out.println(x); //x->max
	}

}
