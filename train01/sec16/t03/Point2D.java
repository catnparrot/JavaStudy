package train01.sec16.t03;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Point2D {
	private static int counter = 0;
	private static int day;
	
	private int x = 0;
	private int y = 0;
	
	//--클래스 초기화 블록--//
	static {
		GregorianCalendar today = new GregorianCalendar();
		day = today.get(DATE);
	}
	
	//--인스턴스 초기화 블록--//
	{
		if (++counter == day) {
			System.out.print("당첨!!!");
			System.out.printf("오늘은 %d개의 좌표가 생성됐습니다.\n", counter);
		}
	}

	public Point2D() {
		if (++counter == day) {
			System.out.print("당첨!!!");
			System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
		}
	}
	public Point2D(int x) {
		if (++counter == day) {
			System.out.print("당첨!!!");
			System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
		}
		this.x = x;
	}
	public Point2D(int x, int y) {
		if (++counter == day) {
			System.out.print("당첨!!!");
			System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
		}
		this.x = x;	this.y = y;
	}

	public int getX() {return x;}
	public int getY() {return y;}
	
	//마지막에 부여한 식별 번호
	public static int getCounter() {return counter;	}

	//--문자열 표현 "(x, y)"를 반환--//
	public String toString() {
		return "(" + x + ", " + y +")";
	}
}
