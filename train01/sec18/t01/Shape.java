package train01.sec18.t01;

public abstract class Shape {
	public abstract String toString();
	
	public abstract void draw();
	
	public void print() {
		System.out.println(toString());
		draw();
	}
}