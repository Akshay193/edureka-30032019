package Assignment1;

public class BankDetails {

	public static void main(String[] args) {
		BankAccount akshay;
		
		akshay= new BankAccount();
		
		akshay.account=23456;
		akshay.balance=345677;
		akshay.deposits=34556;
		akshay.phone=9580;
		akshay.depositFunds();
		
		
		//---------------------------------
		
		BankAccount namita= new BankAccount();
		namita.account=45677;
		namita.balance=50000;
		namita.deposits=25000;
		namita.withdrawns=20000;
		namita.withdrawFunds();
		namita.depositFunds();
		
		//----------------------------------------------------
		
		BankAccount anjani= new BankAccount();
		anjani.balance=30000;
		anjani.deposits=25000;
		int anjaniSalary = anjani.accountBalance();
		
		System.out.println("Anjani Salary :" +anjaniSalary);
	
		

	}

}
