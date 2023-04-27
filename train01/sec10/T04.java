package train01.sec10;

import java.util.Scanner;

public class T04 {
	//m월의 계절 표시
	static String seasonOf(int m) {
		switch (m) {
			case 3:	case 4: case 5: return "봄";
			case 6:	case 7: case 8: return "봄";
			case 9:	case 10: case 11: return "봄";
			case 1:	case 2: case 12: return "봄";
		}
		return ""; 	//m이 1~12가 아니면 공백 문자열을 반환
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month;
		do {
			month=sc.nextInt();		//월
		}while(month<1||month>12);
		
		System.out.println(seasonOf(month));
	}
}
