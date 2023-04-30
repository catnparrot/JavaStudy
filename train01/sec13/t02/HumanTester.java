package train01.sec13.t02;

public class HumanTester {
	public static void main(String[] args) {
		Human yeichan = new Human("예찬", 170, 66);
		Human gilsu = new Human("길수", 181, 73);
		
		yeichan.gainWeight(3);
		gilsu.reduceWeight(5);
		
		System.out.println("이름: " + yeichan.getName());
		System.out.println("신장: " + yeichan.getHeight() + "kg");
		System.out.println("체중: " + yeichan.getWeight() + "cm");
		System.out.println();
		
		System.out.println("이름: " + gilsu.getName());
		System.out.println("신장: " + gilsu.getHeight() + "kg");
		System.out.println("체중: " + gilsu.getWeight() + "cm");
	}
}
