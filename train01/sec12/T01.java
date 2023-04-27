package train01.sec12;

import java.util.Scanner;

public class T01 {
	//배열 a에서 x와 일치하는 모든 요소의 인덱스를 추출한 배열 반환
	static int[] arraySrchIdx(int[] a, int x) {
		int count = 0;
		for (int i=0; i<a.length; i++)
			if(a[i] == x)	count++;		//count: 배열a에서 x의 갯수 카운트 
		
		int[] c = new int[count--];
		for(int i =a.length-1; count>=0; i--)
			if(a[i] == x)
				c[count--]=i;				//배열c: 배열a에서 x의 위치?
											//c[3]=6 -> a[6]=x
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt(); 			//요소 수 n입력
		int[] x = new int[n];			//n 크기의 배열x 생성	
		for(int i = 0; i<n; i++) {
			x[i] = sc.nextInt();		//배열x의 요소값 설정
		}
		
		int m=sc.nextInt();				//찾는 숫자(중복되는 숫자) m
		int[] b=arraySrchIdx(x,m);		//배열b=배열x에서 m의 위치 
		
		if(b.length == 0)
			System.out.println("일치하는 요소가 없습니다.");
		else {
			System.out.println("일치하는 요소의 인덱스");
			for (int i = 0; i<b.length; i++)
				System.out.println(b[i]);
		}
	}
	
}
