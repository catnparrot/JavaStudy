package train01.sec17.t08;

abstract class Animal {
	private String name;
	public Animal(String name) { this.name = name;}
	public abstract void bark();
	public String getName() {return name;}
}
