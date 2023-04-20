package train01.sec05;

import java.util.Scanner;

public class T05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++)
				System.out.print(' ');
			for(int j = 1; j <= 2*i-1; j++ /*<-i++:무한루프에 빠짐*/) 
				System.out.print('*');
			System.out.println();
		}
	}
}
