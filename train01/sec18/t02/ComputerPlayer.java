package train01.sec18.t02;

import java.util.Random;

public class ComputerPlayer extends Player{
	private static Random rd;
	static {
		rd = new Random();
	}
	
	public int nextHand() {
		return rd.nextInt(3);
	}
}