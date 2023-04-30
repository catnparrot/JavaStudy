package train01.sec12;

import java.util.Scanner;

/* a[idx]로 부터 n개의 요소를 삭제하되
 * train01.sec11.T07과 다르게 삭제한 배열을 반환하는 arrayRmvOfN 메소드를 작성
 * => 요소는 그대로 냅둔 T07과 다르게 요소까지 정리 */
public class T03 {
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		if(n<0 || idx<0 || idx>a.length)
			return a.clone();
		else {
			if(idx+n>a.length)		//idx+n이 배열 a 전체 요소 수보다 크면 삭제할 요소 수보다 남아있는 요소 수보다 큼 
				n=a.length-idx;
			int[] c = new int[a.length-n];
			int i=0;
			for(;i<idx;i++)
				c[i]=a[i];
			for(;i<a.length;i++)
				c[i]=a[i+n];
			return c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++)
			x[i]=sc.nextInt();
		
		int idx = sc.nextInt();
		int n = sc.nextInt();
		
		int[] y = arrayRmvOfN(x, idx, n);
		
		for(int i = 0; i<y.length; i++)
			/*배열y 출력*/;
	}
}
