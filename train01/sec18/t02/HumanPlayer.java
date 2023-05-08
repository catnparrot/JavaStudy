package train01.sec18.t02;

import java.util.Scanner;

public class HumanPlayer extends Player {
	private static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}
	
	//--손 결정(키보드를 통해 입력)--//
	public int nextHand() {
		do {
			System.out.print("가위바위보!!!0..가위/1..바위/2..보:");
			hand = sc.nextInt();
		} while (hand < 0 || hand > 2);
		return hand;
	}
}