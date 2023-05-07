package train01.sec16.t04;

class Account {
	private static int counter = 0;		//몇번까지 식별 번호를 부여했는가
	
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	private int id;
	
	//인스턴스 초기화 블록
	{
		id = ++counter;
		System.out.println("은행계좌를 개설해주셔서 감사합니다.");
	}

	//--생성자(예금액은 0이고 계좌 개설일은 오늘)--//
	public Account(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}

	
	public Account(String name, String no, long balance, Day openDay) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = new Day(openDay);
	}

	//계좌 명의 확인
	public String getName() {
		return name;
	}

	//계좌 번호 확인
	public String getNo() {
		return no;
	}

	//예금 잔고 확인
	public long getBalance() {
		return balance;
	}

	//식별 번호 가져오기
	public Day getOpenDay() {
		return openDay;
	}

	//계좌 개설일 확인
	public int getId() {
		return id;
	}

	//k원 입금
	void deposit(long k) {
		balance += k;
	}
	
	//k원 출금
	void withdraw(long k) {
		balance -= k;
	}


	//문자열 표현에 의한 계좌 기본 정보 반환
	public String toString() {
		return "{" + name + ", " + no + ", " + balance + "}";
	}
}
