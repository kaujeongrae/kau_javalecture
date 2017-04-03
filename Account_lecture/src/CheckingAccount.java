
public class CheckingAccount extends Account {
		private double creditlimit;
		private double interest;
		private double loaninterest;
		
		public CheckingAccount(double balance, double limit, double interest, double loanInterest){
			super(balance);
			this.creditlimit=limit;
			this.interest=interest;
			this.loaninterest=loanInterest;
		}
		
		public void Nextmonth(){
			if(balance>0){
				balance=balance*(1+interest);
			}else{
				balance=balance*(1+loaninterest);
			}
		}
		
		@Override
		public void debit(double money){
			if(balance-money>=creditlimit){
				balance=balance-money;
			}else{
				System.out.println("오류가 발생하였습니다");
			}
		}
		
		@Override
		public double getWithdrawableAccount(){
			if(isBankrupted())
				return 0;
			else
				return balance+creditlimit;
		}
		
		public double passTime(int time){
			return balance*Math.pow((1+interest), time)-balance;
		}
		//Math.pow((1+interest), month)
		public boolean isBankrupted(){
			return balance <-creditlimit;
			
		
		}
		
		public String toString(){
			return String.format("CheckingAccount_Balance: %f",balance);
		}
		
		public double estimateValue(int month){
			return balance+balance*Math.pow((1+interest), month);
		}
		//Math.pow((1+interest), month)
	}

