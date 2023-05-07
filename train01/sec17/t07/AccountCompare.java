package train01.sec17.t07;

class AccountCompare {
	static int compBalance(Account a, Account b) {
		long totalBalanceA = a instanceof TimeAccount
				? ((TimeAccount)a).getBalance() + ((TimeAccount)a).getTimeBalance()
						: a.getBalance();
		long totalBalanceB = b instanceof TimeAccount
				? ((TimeAccount)b).getBalance() + ((TimeAccount)b).getTimeBalance()
						: b.getBalance();
		if (totalBalanceA > totalBalanceB)
			return 1;
		else if (totalBalanceA<totalBalanceB)
			return -1;
		return 0;
	}
}
