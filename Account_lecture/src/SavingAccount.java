
public class SavingAccount extends Account {
	protected int month;
	private double interest;
	
	public SavingAccount(double money,double interest){
		super(money);
		this.interest=interest;
	}
	
	@Override
	public void debit(double money) throws Exception{
		if(month<=12){
			System.out.println("아직 1년이 지나지 안았습니다.");
		} else if(money<=balance){
			debit(money);
		}
	}
	
	public double passTime(){
		balance=balance*Math.pow((1+interest), 1);
		return balance;
	}
	
	@Override
	public double passTime(int month){
		if(month<=0)
			return balance;
		if(month<12&&this.month+month>=12){
			balance=balance*Math.pow((1+interest), 12);
		}
		this.month=month;
		return balance;
	}
	
	public double getWithdrawableAccount(){
		return (month<12)?0:balance;
	}
	
	@Override
	public void credit(double money){
		
	}
	public String toString(){
		return String.format("SavingsAccount_Balance: %f",balance);
	}
	
	public double estimateValue(){
		return balance*Math.pow((1+interest), 1);
	}
	
	public double estimateValue(int month){
		return balance*Math.pow((1+interest), month);
	}
		
}

