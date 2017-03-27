
public class CheckingAccount {
	public class CheckingAccount extends Account{
		private double credit_limit;
		private double interest;
		private double loan_interest;
		
		CheckingAccount(double balance, double limit, double interest, double loanInterest){
			super(balance);
			credit_limit=limit;
			this.interest=interest;
			this.loan_interest=loanInterest;
		}
		
		public void Nextmonth(){
			if(balance>0){
				balance=balance*(1+interest);
			}else{
				balance=balance*(1+loanInterest);
			}
		}
		
		@Override
		public void debit(double money){
			if(balance-money>=credit_Limit){
				balance=balance-money;
			}else{
				System.out.println("������ �߻��Ͽ����ϴ�");
			}
		}
	}