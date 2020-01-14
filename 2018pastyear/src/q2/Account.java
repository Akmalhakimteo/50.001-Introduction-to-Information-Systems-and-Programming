package q2;


import java.util.Date;

//starting code
public class Account implements Comparable<Account> {
	private String id;
	private double balance;
	private Date dateCreated;
	
	public Account(String id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "Account:"+this.id;
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		if(this.balance>o.balance) {
			return 1;
		}
		else if(this.balance == o.balance) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	

	
	
	
	
	
	

}

