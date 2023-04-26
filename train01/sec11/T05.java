package train01.sec11;

import java.util.Scanner;

public class T05 {
	// 배열 a의 요소로부터 key와 일치하는 가장 앞에 있는 요소를 탐색
	static int t05linearSearch(int[] a, int key) {
		for (int i = 0; i<a.length; i++)
			if (a[i]==key)
				return i;		//탐색 성공(인덱스 반환)
		return -1;				//탐색 실패(-1 반환)
	}
	
	//배열 a의 요소로부터 key와 일치하는 가장 뒤에 있는 요소를 선형 탐색
	static int t05linearSearchR(int[] a, int key) {
		for (int i = a.length-1; i>=0; i++)
			if (a[i] == key)
				return i;		//탐색 성공(인덱스 반환)
		return -1;				//탐색 실패(-1 반환)
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i<n; i++) {
			/*x[i]: */
			x[i] = sc.nextInt();
		}
		int k = sc.nextInt();	//찾는 값, 키 값
		
		int idxTop = t05linearSearch(x, k);		//배열x에서 k 탐색
		int idxBtm = t05linearSearch(x, k);		//배열x에서 k 탐색
		
		if(idxTop == -1)
			System.out.println("해당값은 존재하지 않습니다");
		else if(idxTop == idxBtm)
			System.out.println(idxTop);			//x[idxTop=idxBtm] -> 값이 하나
		else {
			System.out.println("");
			System.out.println(idxTop);
			System.out.println(idxBtm);
		}
	}
}
