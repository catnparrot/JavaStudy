package train01.sec09;

import java.util.Random;
import java.util.Scanner;

public class T01 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		String[] dayKor	= {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		String[] dayEng = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday"};
		
		int retry;
		int last=0; //어떤 숫자든 상관없음
					//do-while 안에 넣으면 last=day가 꼬일 수도 있다?

		do {
			int day;	//난'수' 이므로 sc.next() 이런 거 없다. -> 난수 설정할 int Variable 선언 필수			
			

			do {		//day중복시(last=day -> day==last) do-while에 갇힘
				day=rd.nextInt(7);		//0~6 설정
			}while(day==last);
			last=day;
			
			while(true) {
				System.out.println(dayKor[day]);
				String s = sc.next();
				
				if(s.equals(dayEng[day])) break;
				/*틀렸습니다*/
			}
			retry = sc.nextInt();
		}while(retry==1);
	}

}
