package train01.sec01;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("정숫값: ");
		int n = x.nextInt();
		
		if(n>0) 
			System.out.println("절댓값: " + n);
		else
			System.out.println("절댓값: " + -n);
		
	}

}
