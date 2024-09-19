//import java.util.HashMap;
//import java.util.Map;
//
//public class basicHASH {
//
//	public static void main(String[] args) {
//		HashMap<Integer ,Integer> hm = new HashMap<>();
//		
//		hm.put(1, 10);
//		hm.put(2, 20);
//		hm.put(3, 30);
//		hm.put(4, 40);
//		
//		for(Map.Entry<Integer, Integer> h : hm.entrySet()) {
//			System.out.println(  h.getKey()+"  "+  h.getValue());
//		}
//		System.out.println("key 2");
//		Integer value = hm.get(2);
//		System.out.println(value);
//		System.out.println("removal of 1");
//		System.out.println("key 1");
//		hm.remove(1);
//		
//		for(Map.Entry<Integer, Integer> h : hm.entrySet()) {
//			System.out.println(  h.getKey()+"  "+  h.getValue());
//		}
//		
//		System.out.println("after insert");
//		hm.put(2, 200);
//		
//		for(Map.Entry<Integer, Integer> h : hm.entrySet()) {
//			System.out.println(  h.getKey()+"  "+  h.getValue());
//		}
//		
//		System.out.println("update");
//		hm.put(5, 500);
//		for(Map.Entry<Integer, Integer> h : hm.entrySet()) {
//			System.out.println(  h.getKey()+"  "+  h.getValue());
//		}
//	}
//
//}
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapStudentEx {

	public static void main(String[] args) 
	{
		HashMap<Integer, Student> hm = new HashMap<>();
		Student s1 = new Student(101,"AAA",21);
		Student s2 = new Student(102,"BBB",22);
		Student s3 = new Student(103,"CCC",23);
		
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		
		for(Entry<Integer, Student> h : hm.entrySet() )
		{
			System.out.println(h.getKey()+ " "+h.getValue());
		}
		
		System.out.println("Enter the key");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		hm.remove(k);
		System.out.println("Object removed");

		for(Entry<Integer, Student> h : hm.entrySet() )
		{
			System.out.println(h.getKey()+ " "+h.getValue());
		}
		
		
		
		System.out.println("Enter id:");
		k = sc.nextInt();
		int key = 0;
		for(Entry<Integer, Student> h : hm.entrySet() )
		{
			Student obj = h.getValue();
			if(obj.id==k)
			{
				key = h.getKey();
				
			}
			
		}
		hm.remove(key);
		System.out.println("Object removed");
		
		for(Entry<Integer, Student> h : hm.entrySet() )
		{
			System.out.println(h.getKey());
			System.out.println(h.getValue().toString());
		}

	}

}