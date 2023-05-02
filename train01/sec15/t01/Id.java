package train01.sec15.t01;

class Id {
	static int counter = 0;			//몇 번까지 식별 부여를 부여했는가
	private int id;					//식별 번호 (변수 선언)
	
	public Id() {
		id = ++counter;				//식별 번호 부여(변수값 부여) 
	}
	
	//--식별 번호 가져오기--//
	public int getId() {
		return id;
	}
	
}
