package train01.sec17.t04;

class Cartester1 {
	public static void main(String[] args) {
		Car car1 = new Car("W140", 1885, 1490, 5220,
						95.0,
						new Day(2018, 10, 13));
		
		ExCar car2 = new ExCar("W221", 1845, 1490, 5205,
					90.0,
					new Day(2015, 12, 24));
		
		Car x;			//클래스형 변수는
		x = car1;		//자기자신의 형 인스턴스를 참조할 수 있는 건 당연하며
		x = car2;		//'하위' 클래스형 인스턴스도 참조할 수 있다.
		
		System.out.println(x.getPurchaseDay());		//x구입일
		
		ExCar y;		//그런데 클래스형 변수는
//		y = car1;		//'상위' 클래스형의 인스턴스는 참조할 수 없다.
		y = car2;
		
		System.out.println(y.getPurchaseDay());		//y구입일
		System.out.println(y.getTotalMileage());	//y의 총 주행 거리
	}
}