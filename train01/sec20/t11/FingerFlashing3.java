package train01.sec20.t11;

import java.util.Scanner;

import train01.sec18.t02.*;

class FingerFlashing3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp1 = new ComputerPlayer();
		ComputerPlayer cp2 = new ComputerPlayer();
		
		String[] hands = {"가위", "바위", "보"};
		int retry;
		
		do {
			int comp1 = cp1.nextHand();
			int comp2 = cp2.nextHand();
			
			int user = hp.nextHand();
			
			System.out.println("컴퓨터1은 " + hands[comp1] + "이고, " + 
							"컴퓨터2는 " + hands[comp2] + "이며, " +
							"당신은 " + hands[user] + "입니다.");
			
			int r1 = (user - comp1 + 3)%3;
			int r2 = (user - comp1 + 3)%3;
			
			if (r1==2 && r2 == 2)
				System.out.println("당신이 이겼습니다.");
			else if (r1==1 && r2 == 0)
				System.out.println("컴퓨터1이 이겼습니다.");
			else if (r1==0 && r2 == 1)
				System.out.println("컴퓨터2가 이겼습니다.");
			else if (r1==0 && r2 == 2)
				System.out.println("당신과 컴퓨터1이 이겼습니다.");
			else if (r1==2 && r2 == 0)
				System.out.println("당신과 컴퓨터2가 이겼습니다.");
			else if (r1==1 && r2 == 1)
				System.out.println("컴퓨터1과 컴퓨터2가 이겼습니다.");
			else
				System.out.println("비겼습니다.");
			do {
				System.out.print("한번 더? 0..아뇨;; 1..넹");
				retry = sc.nextInt();
			} while (retry != 0&&retry != 1);
		} while (retry == 1);
	}
}
