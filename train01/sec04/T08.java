package train01.sec04;

import java.util.Scanner;

public class T08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?: ");
		int n = sc.nextInt();
		if(n>0) {
			for(int i=0;i<n;i++) {
				System.out.print('*');
				if(i%5==4)
					System.out.println();
			}
			if(n%5!=0)
				System.out.println();
		}
	}

}
