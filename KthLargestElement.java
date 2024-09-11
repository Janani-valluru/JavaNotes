import java.util.PriorityQueue;

public class KthLargestElement {

  public static Integer LargestElement(int arr[],  int k) {
    PriorityQueue<Integer> q = new PriorityQueue<Integer>(); // creating min-heap
    int i;
    for (i = 0; i < arr.length;i++) {
      q.add(arr[i]); // push every element into the heap
      if (q.size() > k) q.remove(); // if the size of the heap becomes greater than k, pop the element
    }
    return q.remove();
  }

  public static void main(String[] args) {
    int arr[] = { 2, 1, 4, 6, 3, 9, 7 };
   
    int k = 3;
    int x = LargestElement(arr, k);
    System.out.print("Kth largest element is " + x);
  }
}
