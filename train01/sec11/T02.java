package train01.sec11;

import java.util.Scanner;

public class T02 {
	//int형 비트구성
	static void printBits(int x) {
		for(int i = 31; i>=0; i--) 
			System.out.println(((x>>>i&1)==1)?'1':'0');
	}
	
	//x의 pos 위치에 있는 비트를 1로 변경한 갑 반환
	static int set(int x, int pos, int n) {
		return x| (~(~0 << n)<<pos);
	}
	
	//x의 pos 위치에 있는 비트를 0으로 변경한 값 반환
	static int reset(int x, int pos, int n) {
		return x & ~(~(~0 << n)<<pos);
	}
	
	static int inverse(int x, int pos, int n) {
		return x ^ (~(~0 << n)<<pos);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*정수x의 pos번째 비트를 변경합니다*/
		int x = sc.nextInt();
		int pos = sc.nextInt();
		int n = sc.nextInt();
		
		printBits(x);
		printBits(set(x, pos, n));
		printBits(reset(x, pos, n));
		printBits(inverse(x, pos, n));
	}
}
