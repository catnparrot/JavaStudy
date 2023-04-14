package train01.sec03;

import java.util.Scanner;

public class T01_G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;

        do {
            System.out.print("정수값: ");
            int n = sc.nextInt();

            if (n > 0)
                System.out.println("이 값은 양수입니다.");
            else if (n < 0)
                System.out.println("이 값은 음수입니다.");
            else
                System.out.println("이 값은 0입니다.");

            while (true) {
                System.out.println("다시 한번? 1-Yes / 0-No:");
                r = sc.nextInt();
                if (r == 1 || r == 0)
                    break;
                System.out.println("잘못입력하셨습니다. 다시 한번 입력해주세요.");
            }
            
            /*
             if (r == 0) {
             
                System.out.println("종료되었습니다.");
            }
			*/
        } while (r == 1);
    }
}