package train01.sec15.t02;

class Id {
	private static int counter = 0;
	private int id;
	
	public Id() {
		id = ++counter;
	}
	public int getId() { return id; }
	
	//--마지막에 부여한 식별 번호 가져오기--//
	public static int getMaxId() {
		return counter;
	}
}