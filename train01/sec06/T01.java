package train01.sec06;

import java.util.Scanner;

public class T01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*"정수를 더합니다."*/

		int total = 0;			//전체 그룹의 합계
		
	Outer:
		for(int i =1;i<=10;i++)
		{
			/*i그룹 출력*/
			for(int j = 0; j < 5; j++)
			{	int t = sc.nextInt();
					
				if(t==99999)	break Outer;		//break Outer -> 1
				else if(t==88888) continue Outer;

				total += t;							};
															};
			
		System.out.println(total); 					//1의 영향?
															
	
		
															
	}

}
