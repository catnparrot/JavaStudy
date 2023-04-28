package train01.sec11;

import java.util.Scanner;

/* 배열 a의 특정한 요소에 x를 삽입하는 aryIns 메소드 작성
 * 삽입 시 a[idx]~a[a.length-2]를 하나씩 뒤로 이동시켜야 한다.
 * ex> a[6]={1, 3, 4, 7, 9, 11}일 때 aryIns(a, 2, 99)이면
 * 		a={1, 3, 99, 4, 7, 9} */

public class T08 {
	//배열 a의 특정 인덱스 값에 x 삽입 (뒤에 있는 요소 오른쪽으로 이동)
	static void aryIns(int[] a, int idx, int x) {
		if(idx>=0 && idx <a.length) {
			for(int i = a.length-1; i>idx; i--)
				a[i] = a[i-1];
			a[idx]=x;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i<num; i++)
			a[i] = sc.nextInt();		//a[num]의 모든 요소값
		
		int idx = sc.nextInt();			//삽입할 위치(요소 수)
		
		int n = sc.nextInt();			//삽입 값(x값)
		
		aryIns(a, idx, n);
		
		for(int i =0; i<num; i++)
			/*a[n] 출력*/;
	}
	
}
