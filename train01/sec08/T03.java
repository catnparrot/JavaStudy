package train01.sec08;

import java.util.Scanner;

public class T03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		//요소 수
		int[] a = new int[n];
		
		for(int j =0; j<n; j++) {
			a[j]=sc.nextInt();		//=a[0], a[1], a[2]...a[j]
		}
		int key = sc.nextInt();		//찾을 숫자
		
		int i;
		for(i=n-1;i>=0;i--)
			if(a[i] == key)
				break;
		
		if(i<n)		//탐색성공
			/*"그 값은 a[i]에 있습니다."*/;
		else		//탐색 실패
			/*"해당 값은 존재하지 않습니다."*/;
		
		//역순으로 찾음
	}

}
