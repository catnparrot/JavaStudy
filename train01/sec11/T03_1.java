package train01.sec11;

public class T03_1 {
	
	static int sumOf(int[] a) {
		int sum = 0;
		//확장 for문
		for (int i : a)
			sum += i;
		return sum;
	}
}
