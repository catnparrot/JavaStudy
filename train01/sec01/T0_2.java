package train01.sec01;

import java.util.Scanner;

public class T0_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수: ");
		int jumsu = sc.nextInt();
        int num = jumsu / 10;
        switch (num) {
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("F학점");
        }
	}

}
