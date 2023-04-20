package train01.sec05;

import java.util.Scanner;

public class T03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int x=1 ; x<=n ; x++) {		
			for(int y=1 ; y<=n ; y++)
			/*x초기식
			  -> y초기식 -> y조건식을 만족할 때까지 y증감식 ->
			  x증감식
			  -> y초기식 -> ...이하 x조건식을 만족할떄까지 반복 */

			/*<이미지>
			 x=a	 :	y=b, b[*]1, b[*]2, b[*]3...; y=(y조건)
			 x=a[*]1 :	y=b, b[*]1, b[*]2, b[*]3...; y=(y조건)
			 x=a[*]2 :	y=b, b[*]1, b[*]2, b[*]3...; y=(y조건)
			 x=a[*]3 :	y=b, b[*]1, b[*]2, b[*]3...; y=(y조건)

				.....
				
			 x=(x조건) :	y=b, b[*]1, b[*]2, b[*]3...; y=(y조건)
		 
			 			*/
				System.out.print('*');
			System.out.println();
		}
	}
}
