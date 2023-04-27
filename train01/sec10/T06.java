package train01.sec10;

import java.util.Random;
import java.util.Scanner;

public class T06 {
	static int r(int a, int b) {
		if(b<=a)
		return a;
		else {
			Random rand = new Random();
			return a + rand.nextInt(b-a + 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		System.out.println(r(min, max));
	}
}
