package Task;

public class Account {
	private int sum;

	public Account(int sum) {
		super();
		this.sum = sum;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) throws Throwable {
		if (sum < 0) {
			throw new NegativeMoneyException();
		} else {
			this.sum = sum;
		}
	}

	public void check() throws Throwable {
		Object a = new Object();
		if (a instanceof Account) {
			System.out.print("This object is Ancestor of Account");
		} else
			throw new InvalidAccountException(null);
	}
}
