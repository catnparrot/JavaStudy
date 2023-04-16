package train01.sec03;

import java.util.Scanner;

public class T07_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?: ");
		int n = sc.nextInt();
		if(n>0) {
			int i = 0;
			while(i<n) {
				System.out.println('*');
				i++;
			}
			System.out.println();	//아까부터 궁금한데
		}
	}

}
