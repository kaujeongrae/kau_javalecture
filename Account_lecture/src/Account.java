
public class Account {
	private double balance;
	public Account(double initialbalance){
		balance=initialbalance;
	}
	public void credit(double money){
		balance+=money;
	}
	public void debit(double money){
		if(balance>money){
			balance-=money;
		}
		else{
			System.out.println("Debit amount exceeded account balance.");
		}
	}
}
