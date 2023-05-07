package train01.sec17.t06;

class CarTester3 {
	public static void main(String[] args) {
		Car car1 = new ExCar("W221", 1845, 1490, 5205,
							90.0,
							new Day(2015, 12, 24));
		car1.move(10, 10);
//		System.out.println(car1.getTotalMileage());		//오류
		System.out.println(((ExCar)car1).getTotalMileage());
	}
}
