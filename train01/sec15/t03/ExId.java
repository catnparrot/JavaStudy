package train01.sec15.t03;

class ExId {
	static int counter = 0;
	private static int step=1;
	private int id;

	public ExId() {
		id = counter += step;
	}
	
	//--식별 번호 가져오기--//
	public int getId() {return id;}

	//--중가치 가져오기--//
	public static int getStep() {
		return step;
	}

	//--증가치 설정--//
	public static int setStep(int s) {
		step = (s>=1) ? s: 1;
		return step;
	}
	
	//--마지막에 부여한 식별 번호 가져오기--//
	public static int getMaxId() {
		return counter;
	}
}
