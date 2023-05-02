package train01.sec15.t01;

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id();			//id = ++counter >> 식별번호 1번
		Id b = new Id();			//id = ++counter >> 식별번호 2번
		
		System.out.println(a.getId());			//식별번호 출력
		System.out.println(b.getId());
		
		System.out.println(Id.counter);		//클래스 IdTester에 부여한 식별 머릿 수(counter)?
		System.out.println(a.counter);
		System.out.println(b.counter);
	}
}
