import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "Student id :"+id +"   name:"+name;
	}
	
}

public class StudetHash {

	public static void main(String[] args) 
	{
		HashMap<Integer, Student> hm = new HashMap<>();
		Student s1 = new Student(101,"AAA");
		Student s2 = new Student(102,"BBB");
		Student s3 = new Student(103,"CCC");
		
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
		
		
		System.out.println("adding new object");
		Student s4 = new Student(104,"ddd");
		hm.put(4, s4);
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
		
	