package train01.sec13.t01;

public class HumanTester {
	public static void main(String[] args) {
		Human yeichan = new Human();
		Human gilsu = new Human();
		
		yeichan.name = "예찬";
		yeichan.height = 170;
		yeichan.weight = 66;
		
		gilsu.name = "길수";
		gilsu.height = 181;
		gilsu.weight = 75;
		
		System.out.println("이름: " + yeichan.name);
		System.out.println("신장: " + yeichan.height + "kg");
		System.out.println("체중: " + yeichan.weight + "cm");
		System.out.println();
		
		System.out.println("이름: " + gilsu.name);
		System.out.println("신장: " + gilsu.height + "kg");
		System.out.println("체중: " + gilsu.weight + "cm");
	}
	
}
