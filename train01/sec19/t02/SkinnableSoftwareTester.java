package train01.sec19.t02;

public class SkinnableSoftwareTester {
	public static void main(String[] args) {
		SkinnableSoftware x = new SkinnableSoftware();
		SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN);
		
		x.changeSkin(Skinnable.YELLOW);
		
		System.out.println("x의 스킨: "+ x.getSkinString());
		System.out.println("y의 스킨: "+ y.getSkinString());
	}
}
