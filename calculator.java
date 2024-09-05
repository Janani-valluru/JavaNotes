//QUESTION 1 CALCULATOR

import java.util.Scanner;

public class calculator {
	
	public void cal(int x, int y) {
		  
		
		int res=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter your choice:");
		System.out.println("1. add 2. sub 3.mul 4. div");
		int ch = s.nextInt();
		switch(ch)
		{
		case 1: 
			res = x+y;
			System.out.println("the sum is : "+res);
			break;
		case 2:
			res = x-y;
			System.out.println("the sub is : "+res);
			break;
		case 3:
			res = x*y;
			System.out.println("the mul is : "+res);
			break;
		default :
			System.out.println("invalid");
		
		}
		
	}

		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			calculator c = new calculator();
			
			Scanner sc  = new Scanner(System.in);
			
			System.out.print("enter 1st number :");
			int a = sc.nextInt();
			
			System.out.print("enter 2nd number :");
			int b = sc.nextInt();
			c.cal(a,b);
			
		
	}

}
