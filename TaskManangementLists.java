import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Task
{
	String title;
	String description;
	boolean isCompleted;
	
	public Task(String title, String description, boolean isCompleted) {
		super();
		this.title = title;
		this.description = description;
		this.isCompleted = isCompleted;
	}
	
	public String toString() {
		return "title:"+title + "  description:"+description+"  isCompleted:"+isCompleted;
	}
	
//	 public int compareTo(Task other) {
//	        return Boolean.compare(this.isCompleted, other.isCompleted);
//	    }
}


public class TaskManangementLists {

	public static void main(String[] args) {
		
		Stack<Task> st = new Stack<>();
		System.out.println("stacks");
		st.push(new Task("wings","self",false));
		st.push(new Task("love","lovely",true));
		st.push(new Task("freedom","enjoy",false));
		
		for(Task t :st) {
			System.out.println(t);
		}
		//pop it the completed 
		System.out.println("popping");
		
			if( st.pop().isCompleted =true) {
				Task t = st.pop();
				System.out.println(t);
			}
			System.out.println("peek");
			if( st.peek().isCompleted==false) {
				Task t = st.pop();
				System.out.println(t);
			}
			
			System.out.println();
			System.out.println("queues");	
//			//cant use priority queue
		Queue<Task> pq = new LinkedList<>();
	
		pq.add(new Task("java","working on queue",true));
		pq.add(new Task("react","components",false));
		pq.add(new Task("spring","started",true));
		
		for(Task t : pq) {
			System.out.println(t);
		}  // poll and display tasks from the queue
		
	System.out.println("working");
	if( pq.poll().isCompleted) {
		Task t = pq.poll();
		System.out.println(t);
	}
	
	System.out.println("View the next task in line without removing it."
);
	for(Task t : pq) {
		System.out.println(t);
	}  
	
		
		System.out.println();
		
	//Linked list
		System.out.println("linked list");
		LinkedList<Task> ll = new LinkedList<>();
		ll.add(new Task("os","work",true));
		ll.add(new Task("new","home",false));
		ll.add(new Task("sos","office",true));
		ll.add(new Task("www","wifi",false));
		
		for(Task t : ll) {
			System.out.println(t);
		}
		System.out.println();
		System.out.println("remove ll ele");
		ll.remove(2);
		
		for(Task t : ll) {
			System.out.println(t);
		}
		
		//display
		System.out.println();
		System.out.println("completion status");
		for(Task t : ll) {
			System.out.println(t);
		}
		
		
		
		
		
		
		
	        }
			
			
		
		}

	


