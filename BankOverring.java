
 class BankAccount {
		
		public void calculateInterest() {
			int amt =10000;
			double interest=0.03;
			double total = (amt*interest);
			System.out.println("bank account total = "+total+amt);
			
			
		}
		
}
 class SavingsAccount extends BankAccount{
	 @Override
	public void calculateInterest() {
		int amt =20000;
		double interest=0.08;
		double total = (amt*interest);
		System.out.println("SavingsAccount= "+total+amt);
}
}	
 class CheckingAccount extends BankAccount{
	 @Override
	public void calculateInterest() {
		int amt =40000;
		int fees = 0;
		if(amt>15000) {
			fees=1000;
		}
		double interest=0.08;
		double total = (amt*interest);
		System.out.println("CheckingAccount ="+(total+amt-fees));
}
}
 class BusinessAccount extends BankAccount{
	 @Override
	public void calculateInterest() {
		int amt =60000;
		int fees = 0;
		if(amt>20000) {
			fees=1500;
		}
		double interest=0.08;
		double total = (amt*interest);
		System.out.println("BusinessAccount ="+(total+amt-fees));
}
 }



	public class BankOverring{

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.calculateInterest();
		
		SavingsAccount sa = new SavingsAccount();
		sa.calculateInterest();
		
		CheckingAccount ca = new CheckingAccount();
		ca.calculateInterest();
		
		BusinessAccount bu = new BusinessAccount();
		bu.calculateInterest();
	}

}
