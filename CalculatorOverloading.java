import java.util.Scanner;


	class Calculator1{
		
		public  void calculate(int i , int j) {
			System.out.println(i+j);
		}
		public  void calculate(double i , double j) {
			System.out.println(i-j);
		}
		public  void calculate(long i , long j) {
			System.out.println(i*j);
		}
		public  void calculate(float i , float j) {
			System.out.println(i/j);
		}
	}
	public class CalculatorOverloading{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator1 co = new Calculator1();
		System.out.println("addition");
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		co.calculate(a,b);
		
		System.out.println("sub");
		double a1  = sc.nextInt();
		double b1  = sc.nextInt();
		co.calculate(a1,b1);
		
		System.out.println("mul");
		long a2  = sc.nextInt();
		long b2  = sc.nextInt();
		co.calculate(a2,b2);
		
		System.out.println("div");
		float a3  = sc.nextInt();
		float b3  = sc.nextInt();
		co.calculate(a3,b3);
		sc.close();
		
		
	
		
		
	}

		

	}