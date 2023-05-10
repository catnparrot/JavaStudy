package train01.sec20.t05;

import java.util.Scanner;

class StringCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열: ");
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i++) 
			System.out.printf("s[%d] = %c %4x \n",
						i, s.charAt(i), (int)s.charAt(i));
		
	}
}