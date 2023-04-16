package train01.sec03;

import java.util.Scanner;

public class T07_2 {
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
			System.out.println();	//이건 진짜 왜 있는 걸까
		}
	}

}
//??? 뭐가 다른거야?