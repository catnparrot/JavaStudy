package train01.sec17.t09;

class Cat extends Animal {
	private int age;

	public Cat(String name, int age) {
		super(name);		this.age = age;
	}
	public void bark() {System.out.println("냐옹!");}
	public String toString() {
		return age + "살의 " + getName();
	}	
}