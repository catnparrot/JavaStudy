package train01.sec17.t08;

class Dog extends Animal {
	private String type;

	public Dog(String name, String type) {
		super(name);	this.type = type;
	}
	public void bark() {System.out.println("멍멍!");}
}
