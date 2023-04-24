package train01.sec09;

import java.util.Scanner;

public class T09 {
	static int signOf(int n) {
		int sign = 0;
		
		if (n>0)
			sign = 1;
		else if (n<0)
			sign = -1;
		
		return sign;
	}
	/*
 	static int signOf(int n) {
		int sign = 0;
		
		if (n>0)
			return 1;
		else if (n<0)
			return -1;
		return 0;
	}
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int s = signOf(a);
		/*"signOf(a)="s*/
	}

}
