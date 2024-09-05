//QUESTION 11 MIN AND MAX OF ARRAY

public class maxmin{

	//max
    public static int maxMethod(int[] mark) {
        // Initialize max with the first element of the array
        int max = mark[0];

        // Loop through the array to find the maximum value
        for (int i = 1; i < mark.length; i++) {
            if (mark[i] > max) {
                max = mark[i];
            }
        }

        return max; // Return the maximum value
    }
    
    //min
    public static int minMethod(int[] mark) {
        // Initialize max with the first element of the array
        int min = mark[0];

        // Loop through the array to find the maximum value
        for (int i = 1; i< mark.length; i++) {
            if (mark[i] <min) {
                min = mark[i];
            }
        }

        return min; // Return the maximum value
    }

    public static void main(String[] args) {
        // Array of marks
        int[] mark = {10, 20, 30, 89, 90};

        // Call the maxMethod to get the maximum value
        int max = maxMethod(mark);
        int min = minMethod(mark);
        // Print the maximum value
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The maximum value in the array is: " + min);
    }
}
