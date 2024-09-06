//QUESTION 2 BANK MANAGEMENT
import java.util.Scanner;

class Bank {
    int accno;
    String accname;
    int deposit;
    int balance;
    int withdraw;

    // Method to read bank account details
    void readBank() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accno = s.nextInt();
        System.out.print("Enter Account Name: ");
        accname = s.next();
        System.out.print("Enter Deposit Amount: ");
        deposit = s.nextInt();
        System.out.print("Enter Withdraw Amount: ");
        withdraw = s.nextInt();
        System.out.println(" ");
        s.close();
    }
    void displayBalance() {
    	
    	
    	balance = deposit - withdraw;
    	System.out.println("BALANCE AMOUNT: " + balance);

    	}
    

    // Method to display bank account details
    void display() {
        System.out.println("ACCOUNT NUMBER: " + accno);
        System.out.println("ACCOUNT NAME: " + accname);
        System.out.println("DEPOSIT AMOUNT: " + deposit);
        System.out.println("WITHDRAW AMOUNT: " + withdraw);
        
    }
}

public class BankManagement {
    public static void main(String[] args) {
        // Creating a new Bank object
        Bank b1 = new Bank();
        b1.readBank();
        b1.display();
        b1.displayBalance();
    }
}
