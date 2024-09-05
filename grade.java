//QUESTION 7 TEPERATURE CONVERSION
import java.util.Scanner;

public class grade {

    public static void grades(int avgg) {
        if (avgg >= 90 && avgg <= 100) {
            System.out.println("Grade: A");
        } else if (avgg >= 80 && avgg < 90) {
            System.out.println("Grade: B");
        } else if (avgg >= 70 && avgg < 80) {
            System.out.println("Grade: C");
        } else if (avgg >= 60 && avgg < 70) {
            System.out.println("Grade: D");
        } else if (avgg >= 50 && avgg < 60) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.println("Enter the subject marks");

        System.out.print("Enter Math marks: ");
        int math = sc.nextInt();

        System.out.print("Enter Science marks: ");
        int science = sc.nextInt();

        System.out.print("Enter OS marks: ");
        int os = sc.nextInt();

        System.out.print("Enter Comp marks: ");
        int comp = sc.nextInt();

        int avg = (math + science + os + comp) / 4;

        
        grades(avg);

        sc.close();
    }
}
