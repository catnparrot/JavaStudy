package train01.sec12;

import java.util.Scanner;

public class T07 {
	static int min(int a, int b) {
		return a<b ? a : b;
	}
	
	static int min(int a, int b, int c) {
		int mn;
					mn=a;
		if(b<a)		mn=b;
		if(c<mn)	mn=c;
		return mn;
	}
	
	static int min(int[] a) {
		int mn = a[0];					//a[0] 값을 기준 삼는다는 의미로 mn에 대입하여
		for(int i = 1; i<a.length; i++)	//1~a.length까지의 값을 
			if(a[i]<mn)					//배열 a의 인덱스로 대입하여 mn보다 작으면
				mn = a[i];				//배열 a의 해당 요소값을 mn에 새롭게 대입 
		return mn;	//for문이 끝날때까지 if문으로 넘어가지 않으면 할당받은 mn값이 제일 작다는 의미이므로 mn 반환
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int num = sc.nextInt();
		int[] xa = new int[num];
		for(int i = 0; i<num; i++)
			xa[i] = sc.nextInt();
	
		System.out.printf("x, y의 최솟값은 %d입니다.\n", min(x, y));
		System.out.printf("x, y, z의 최솟값은 %d입니다.\n", min(x, y, z));
		System.out.printf("배열 a의 최솟값은 %d입니다.", min(x, y, z));
	}
}
