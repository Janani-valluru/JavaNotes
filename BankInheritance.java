import java.util.Scanner;

class BankAccount{
	int accno;
	String name;
	int balance;
	static int interestRate=2;
	
	public BankAccount(int accno, String name) {
		super();
		this.accno = accno;
		this.name = name;
	}

	void diplayDeatils(){
		System.out.println("Account number="+accno);
		System.out.println("account name=" +name);
	}
}

class SavingsAccount extends BankAccount{
	
	
	int amt;
	
	public SavingsAccount(int accno, String name,int amt ) {/// parameters are passed from saving in main
		super(accno, name);
		this.balance=amt;
		
	}
	
	
	void deposit(int amt) {
		
		balance = balance+amt;
		System.out.println("deposited:"+amt);
		System.out.println("balanace="+ balance);
		
		
	}
	

	
	float calInterestRate() {
		return interestRate * balance/100;
		
	}
	void interestnew() {
		 float interest = calInterestRate();
	        balance += interest;
	        System.out.println("Interest added: " + interest);
	        System.out.println("New balance: " + balance);
	}
	
	

	public void displayDetails() {
		// TODO Auto-generated method stub
		super.diplayDeatils();  // Call base class method
        System.out.println("Interest Rate: " + interestRate + "%");
 
        
        System.out.println("balanace: "+balance);
		
	}

	
}

class CheckingAccount extends BankAccount{

	private int overdraftlimit;

	public CheckingAccount(int accno, String name) {
		super(accno, name);
		this.overdraftlimit=500;
	}
	
	void findoverdraft(int amt) {
	    if (balance < amt) {
	        if (balance + overdraftlimit >= amt) {
	            balance -= amt;
	            System.out.println("Amount withdrawn with overdraft. New balance: " + balance);
	        } else {
	            System.out.println("Overdraft limit exceeded. Cannot withdraw.");
	        }
	    } else {
	        balance -= amt;
	        System.out.println("Amount withdrawn. New balance: " + balance);
	    }
	}

	 
	


public void displayDetails() {
	// TODO Auto-generated method stub
	
	System.out.println(balance);
	 System.out.println("Overdraft Limit: " + overdraftlimit);
}

	
}


public class BankInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s = new Scanner(System.in);
		
		System.out.println("ENTER KARNATAKA BANK DETAILS");
		System.out.println("1. Savings 2.Checking ACCOUNT");
		System.out.println("enter choice 1 or 2");
		int ch = s.nextInt();
		
		switch(ch) {
		
		case 1: 
					System.out.println("SavingsAccount details:::");
					System.out.println("enter ACCNO");
					int Saccno = s.nextInt();
					System.out.println("enter name");
					String Sname = s.next();
					System.out.println("deposit");
					int samt = s.nextInt();
					
					SavingsAccount save = new SavingsAccount(Saccno, Sname,samt);
					System.out.println("SavingsAccount Details:");
					save.displayDetails();
					save.interestnew();
					break;
		
		case 2: 
				System.out.println("checking account details:::");
				System.out.println("enter ACCNO");
				int Caccno = s.nextInt();
				System.out.println("enter name");
				String Cname = s.next();
				
				CheckingAccount pte = new CheckingAccount(Caccno, Cname);
				pte.displayDetails();
				System.out.println("Enter withdrawal amount:");
                int withdrawAmt = s.nextInt();
                pte.findoverdraft(withdrawAmt);
				
				break;
		default :
			System.out.println("invalid choice");
			break;
				
		}
s.close();
	}

}
