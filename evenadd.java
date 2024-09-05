//QUESTION 2  SUM OF EVEN
import java.util.Scanner;

public class evenadd {
	
	public static void evenadd(int x) {
		// TODO Auto-generated constructor stub
		int sum =0;;
		for(int i =0;i<=x;i++)
		{
			if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number :");
		int a = sc.nextInt();
		evenadd(a);
		

	}

}
