package train01.sec05;

import java.util.Scanner;

public class T09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//정수의 개수

		
		
		int sum=0;		//합계
		int i;

		for(i=0;i<n;i++)
		{
			int t = sc.nextInt();
			
			if(sum+t>1000) {/*"마지막값 무시" 출력*/	break;}
			sum +=t;
															}
		
		
		/*sum 출력*/
		
		
		if(i != 0) /*sum/i 출력*/	;
	
	
	}

}
