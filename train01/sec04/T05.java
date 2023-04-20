package train01.sec04;

import java.util.Scanner;

public class T05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 n까지의 합을 구합니다.");
		int n;
		do {
			System.out.print("n의 값: ");
			n=sc.nextInt();
		}while (n<=0);

		int sum=0;					//왜 for 이후 int sum 선언은 안되는가?
		for(int i = 0; i<=n; i++)
			sum +=i;
				System.out.print(sum);
	}
}
