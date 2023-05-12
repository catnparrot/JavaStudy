package train01.sec21.t06;

import java.util.Scanner;

class ReverseArray1 {
	static void swap(int[] a, int idx1, int idx2) {
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
	}
	//--배열a의 요소를 반대로 나열(오류)--//
	static void reverse(int[] a) {
		try {
			for (int i = 0; i < a.length/2; i++)
				swap(a, i, a.length-1);
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(1);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
	
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}

		reverse(x);
		
		System.out.println("요소를 반대로 나열했습니다.");
		for (int i = 0; i < num; i++) 
			System.out.println("x[" + i +"] = "+x[i]);
	}	
}