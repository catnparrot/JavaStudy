package train01.sec21.t05;

import java.util.Scanner;

public class RangeErrorTester {
	static boolean isValid(int n) {
		return n >=0 && n <=9;
	}
	
	static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
		if (!isValid(a)) throw new ParameterRangeError(a);
		if (!isValid(b)) throw new ParameterRangeError(b);
		int result = a + b;
		if (!isValid(result)) throw new ResultRangeError(result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a: "); int a = sc.nextInt();
		System.out.print("정수 b: "); int b = sc.nextInt();
		
		try {
			
		} catch (RangeError e) {
			System.out.println("범위 밖 예외가 발생했습니다.");
		}
	}
}