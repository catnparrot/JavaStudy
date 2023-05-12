package train01.sec21.t03;

import java.util.Scanner;

class ThrowAndCatch {
	static void check(int sw) throws Exception {
		switch (sw) {
			case 1: throw new Exception("검사 예외 발생!!");
			case 2: throw new RuntimeException("비검사 예외 발생!!");
		}
	}
	
	static void test(int sw) throws Exception {
		check(sw);		//이 호출은 검사 예외 Exception이 발생할 가능성 있음
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("sw: ");
		int sw = sc.nextInt();
		try {
			test(sw);
		}catch (RuntimeException e) {	//e: 예외 RuntimeException과 그 하위 클래스 포착
			System.out.println(e.getMessage());
		}catch (Exception e) {			//e: 예외 Exception과...
			System.out.println(e.getMessage());
		}
	}
}