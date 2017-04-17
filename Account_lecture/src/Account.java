
public abstract class Account implements Valuable {
	protected double balance;
	
	public double getBalance(){
		return this.balance;
	}
	public Account(double initialbalance){
		balance=initialbalance;
	}
	public void credit(double money){
		balance+=money;
	}
	public void debit(double money) throws Exception{
			balance-=money;
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract double passTime();
	public abstract double passTime(int time);
}
