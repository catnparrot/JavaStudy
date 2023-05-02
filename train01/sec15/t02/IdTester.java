package train01.sec15.t02;

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println(a.getId());
		System.out.println(b.getId());
				
		System.out.println(Id.getMaxId());
		System.out.println(a.getMaxId());
		System.out.println(b.getMaxId());
	}
}
