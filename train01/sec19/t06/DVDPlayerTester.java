package train01.sec19.t06;

public class DVDPlayerTester {
	public static void main(String[] args) {
		DVDPlayer a = new DVDPlayer();
		Player b = new DVDPlayer();
		Explayer c = new DVDPlayer();
		
		System.out.println("DVDPlayer형 변수a");
		a.play();
		a.stop();
		a.slow();
		
		System.out.println("Player형 변수b");
		b.play();
		b.stop();
		
		System.out.println("ExPlayer형 변수c");
		c.play();
		c.stop();
		c.slow();
	}
}
