package train01.sec17.t03;

public class ExCarTester2 {
	public static void main(String[] args) {
		ExCar myCar = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015,12,24));
		
		myCar.putSpec();
	}
}
