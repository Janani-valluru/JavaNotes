
//QUESTION 13 Find Unique element

import java.util.Scanner;

public class UniqueElement {

    private static void UniqueElement(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = s.nextInt();
        
        int[] a = new int[n];//arrays
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        
        UniqueElement(a, n);
    }
}
