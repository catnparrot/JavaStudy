package train01.sec13.t06t07t08t09;

import java.util.Scanner;

public class CoordinateTester2 {
	static boolean compCoordinate(Coordinate c1, Coordinate c2) {
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		//--좌표 p 입력--//
		x = sc.nextDouble();
		y = sc.nextDouble();
		Coordinate p = new Coordinate(x, y);
		
		//--좌표 q 입력--//
		x = sc.nextDouble();
		y = sc.nextDouble();
		Coordinate q = new Coordinate(x, y);
		
		System.out.println((p == q)
							? "p==q입니다"
							: "p != q 입니다");
		
		System.out.println(	p.getX() == q.getX() &&
							p.getY() == q.getY()
							? "p와 q가 같습니다"
							: "p와 q가 다릅니다.");
		
		System.out.println(compCoordinate(p, q)
							? "p와 q가 같습니다"
							: "p와 q가 다릅니다.");
	}
}