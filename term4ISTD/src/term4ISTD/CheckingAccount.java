package term4ISTD;

public class CheckingAccount extends Account {

	
	
	@Override
	
	public void withdraw(double withdrawAmount) {
		// TODO Auto-generated method stub
		
		
		if((super.getBalance()-withdrawAmount) < -5000) {
			System.out.println("over limit");
		}
		else {
			super.withdraw(withdrawAmount);
		}
	}

	public CheckingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(int id, double balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}
	


	
	

}
