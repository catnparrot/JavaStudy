package train01.sec14.t05t06t07;

class Account {
	private String name;
	private String no;
	private long balance;
	private Day openDay;

	public Account(String n, String num, long z, Day d) {
		name = n;
		no = num;
		balance = z;
		openDay = new Day(d);
	}
	
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public Day getOpenDay() {
		return new Day(openDay);
	}
	
	//k원 출금
	void withdraw(long k) {
		balance -= k;
	}
	//--문자열 표현에 의한 계좌 기본 정보 반환--//
	public String toString() {
		return "{" + name + ", " +no+ ", "+balance+"}";
	}
}
