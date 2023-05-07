package train01.sec17.t08;

public class AnimalTester1 {
	public static void main(String[] args) {
		//Animal x = new Animal();//---추상클래스는 인스턴스화할 수 없다.
		
		Animal[] a = new Animal[2];
		a[0] = new Dog("뭉치", "치와와");
		a[1] = new Cat("마이클", 7);
		
		for(Animal s : a) {
			System.out.print(s.getName() + " ");
			s.bark();
			System.out.println();
		}
	}
}
