package train01.sec17.t05;

class CarTester2 {
	public static void main(String[] args) {
		Car car1 = new ExCar("W221", 1845, 1490, 5205,
							90.0,
							new Day(2015, 12, 24));
		
		
		//사양표시
		car1.putSpec();
	}
}
