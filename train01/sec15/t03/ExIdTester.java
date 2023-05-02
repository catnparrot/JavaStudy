package train01.sec15.t03;

public class ExIdTester {
	public static void main(String[] args) {
		ExId a = new ExId();
		ExId b = new ExId();
		ExId c = new ExId();
		ExId.setStep(4);
		ExId d = new ExId();
		ExId e = new ExId();
		ExId f = new ExId();
		
		System.out.println(a.getId());
		System.out.println(b.getId());
		System.out.println(c.getId());
		System.out.println(d.getId());
		System.out.println(e.getId());
		System.out.println(f.getId());
		
		int max = ExId.getMaxId();
		System.out.println(max);							//마지막에 부여한 식별번호
		System.out.println(max+ExId.getStep());				//다음에 부여할 식별번호
	}
}
