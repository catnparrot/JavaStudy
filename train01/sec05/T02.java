package train01.sec05;

import java.util.Scanner;

public class T02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r;
		do {
			int month;
			do {
			month = sc.nextInt();
		
				switch (month) {
					case 3:
					case 4:
					case 5: System.out.println("봄");
						break;
					case 6:
					case 7:
					case 8:
						break;
					case 9:
					case 10:
					case 11:
						break;
					case 12:
					case 1:
					case 2:
						break;
				}
			}while(true);			
		}while(month>12 && month<1);
	}
}

//될거 같은데 왜 안되지