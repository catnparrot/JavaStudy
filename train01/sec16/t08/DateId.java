package train01.sec16.t08;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class DateId {
	private static int counter;
	private int id;
	
	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH);
		int d = today.get(DATE);
		
		System.out.printf("오늘은 %04d년 %02d월 %02d일입니다.\n", y, m, d);
		
		counter = y*1000000 + m*10000+d*100;
	}

	public DateId() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}
}
