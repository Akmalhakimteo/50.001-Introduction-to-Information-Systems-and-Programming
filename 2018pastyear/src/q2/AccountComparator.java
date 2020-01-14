package q2;


import java.util.Comparator;
//starting code
public class AccountComparator implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}

}

