
abstract class PaymentMethod{
	public abstract void  processPayment(double amount);
}

 class CreditCard extends PaymentMethod{
	public  void  processPayment(double amount) {
		System.out.println("payments of credit card:"+amount);
	}
}

class PayPal extends PaymentMethod{
	public  void  processPayment(double amount) {
		System.out.println("payments of credit card:"+amount);
	}
}
public class PaymentAbstarction {

	public static void main(String[] args) {
		CreditCard cc = new CreditCard();
		cc.processPayment(555555.69);
		PayPal p = new PayPal();
		p.processPayment(3000);
	}

}
