//QUESTION 3 CHARACTER COUNT IN A STRING

import java.util.Scanner;

public class charcount {

	public static void countchar(String s, char k) {
		
		int count = 0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==k) {
        		count++;
        	}
        }
        System.out.println("Reversed number: " + count);
	}
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String str = sc.nextLine();
        System.out.print("Enter a char to count: ");
       char key = sc.next().charAt(0);
       countchar(str , key);
        sc.close();
    }
}