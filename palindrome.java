//QUESTION 8 PALINDROME

import java.util.*;
public class palindrome {

	public static boolean palindrome(String str) {
		// TODO Auto-generated constructor stub
		int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false; 
	}
        }
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Asking the user to enter a sentence
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        // Check if the input string is a palindrome
        boolean result = palindrome(str);
System.out.println(result);
	}

}
