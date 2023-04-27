package train01.sec10;

import java.util.Random;
import java.util.Scanner;

//4개의 계산 문제 중 하나를 무작위로 출제하는 암산 훈련 프로그램
//(특징: x, y, z가 세자리 수)
//x+y+z x+y-z x-y+z x-y-z


public class T08 {
	static Scanner sc = new Scanner(System.in);
	
	//리트라이 버튼
	static boolean confirmRetry() {
		int cont; do {
			System.out.print("다시 한 번? <yes..1/no..0>");
			cont = sc.nextInt();
		}while(cont != 0 && cont != 1);
		return cont ==1;
	}
	
	//암산 시작
	public static void main(String[] args) {
		Random rand = new Random();
		
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			int pattern = rand.nextInt(4);
			
			int answer;
			switch (pattern) {
			case 0 : answer = x+y+z; break;
			case 1 : answer = x+y-z; break;
			case 2 : answer = x-y+z; break;
			default : answer = x-y-z; break;
			}
			while(true) {
				System.out.print(
						x+((pattern<2) ? "+" : "-")
						+y+((pattern%2==0) ? "+" : "-")+z+"=");
			int k = sc.nextInt();
			if(k==answer)	break;
			System.out.println("틀렸습니다.");
			}
		}while (confirmRetry());
	}
}
