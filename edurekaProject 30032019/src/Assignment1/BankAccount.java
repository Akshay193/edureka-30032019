package Assignment1;

public class BankAccount {
	
     int account;
     int balance;
     int phone;
     int deposits;
     int withdrawns;
     
     void depositFunds() {
    	 int totalBalance= balance+deposits;
    	 System.out.println("Total Balance Akshay :"+ totalBalance);
     }

	void withdrawFunds() {
		
		int totalBalance2=balance-withdrawns;
		System.out.println("Total Balance Namita :"+totalBalance2);
	
			}
	
	int accountBalance() {
		
		int totalBalance3;
		
		totalBalance3=balance+deposits;
		return totalBalance3;
		
	}
	}


