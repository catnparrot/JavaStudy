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

	/*
	public Account(String name, String no, long balance, Day openDay) {
		super();
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = openDay;
	}
	*/
	
	
}
