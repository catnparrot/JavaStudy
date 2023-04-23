package train01.sec08;

import java.util.Random;
import java.util.Scanner;

public class T05 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			//요소 수 읽기
		int[] a = new int[n];			//배열 생성
		
		for (int i = 0; i<n; i++)
			a[i] = 1+rd.nextInt(10);	//0+1 ~ 9+1 난수
		
		for(int i = 0; i<n; i++)
			/*a[o]....a[i]의 값*/;
	}

}
