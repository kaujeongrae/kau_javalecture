import java.util.ArrayList;

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
	
	public static double sumForAccount(ArrayList<? extends Account> list){
		double sum=0;
		for(Account account : list){
			sum+=account.getBalance();
		}
		return sum;
	}
	
	public static void passTimeForList(ArrayList<? extends Account> list, int month){
		for(Account account : list){
			account.passTime(month);
		}
	}
}
