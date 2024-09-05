//QUESTION 12 REVERSE A NUMBER

import java.util.Scanner;

public class reversenumber {

	public static void reverse(int num) {
		// TODO Auto-generated constructor stub
		
	        int rev = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            rev = rev * 10 + digit;
	            num = num / 10;
	        }
	        System.out.println("Reversed number: " + rev);
	    }

	    public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number to reverse: ");
	        int a = sc.nextInt();
	        reverse(a);
	        sc.close();
	    }

}
