//QUESTION 5 SUM OF DIGITS

import java.util.Scanner;

public class sumofdigits {

	public static void sumofdigits(int num) {
		
		// TODO Auto-generated constructor stub
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number : ");
	        int a = sc.nextInt();
	        sumofdigits(a);
	        sc.close();

	}

}
