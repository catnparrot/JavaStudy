package train01.sec05;

import java.util.Scanner;

public class T10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*"정수를 더합니다"*/
		/*"몇 개를 더할까요?"*/
		int n = sc.nextInt();		//정수의 개수
		int sum = 0;				//합계
		int count = 0;				//음수의 개수
		int i;
		
		for(i=0;i<n;i++)
		{
			int t = sc.nextInt();
			if(t<0) { /*"음수를 더하지 않습니다."*/ continue; }
			
			sum +=t;
			count++;
															}

		/*sum 출력*/						//합계
		if(i !=0) /*sum/count 출력*/;		//평균
	
		
		
		
	}

}
