package train01.sec03;

import java.util.Scanner;

public class T09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개를 표시할까요?: ");
		int n = sc.nextInt();
		if (n>0) {
			int i = 0;
			while(i<n/2) {
				
			//Java에서 int 나눗셈 연산을 할 경우 소수점은 버린다는 점을 이용
			//물론 정확한 설명은 아님(아마도)
				
				System.out.print("*+");
				i++;
			}
			if (n%2==1)			//n이 홀수일 경우 인자를 얻는 함수
				System.out.print('*');

			System.out.println();
		}
	}

}
