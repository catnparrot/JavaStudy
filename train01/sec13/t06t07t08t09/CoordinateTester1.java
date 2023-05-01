package train01.sec13.t06t07t08t09;

import java.util.Scanner;

public class CoordinateTester1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		Coordinate p = new Coordinate(x, y);
		System.out.println("p= (" + p.getX() + ", " + p.getY() + ")");
		
		Coordinate q = p;
		q.set(9.9, 9.9);
		System.out.println("p= (" + p.getX() + ", " + p.getY() + ")");
		System.out.println("q= (" + q.getX() + ", " + q.getY() + ")");
	}
}
