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
class StackManagement{
	Stack<Task> st = new Stack<>();

	void workingonit() {
		System.out.println("stacks");
		st.push(new Task("wings","self",false));
		st.push(new Task("love","lovely",true));
		st.push(new Task("freedom","enjoy",false));

		for(Task t :st) {
			System.out.println(t);
		}
	}
	//pop it the completed 


	//	void completeIt() {
	//		System.out.println("completed");
	//		if( st.pop().isCompleted = true) {
	//			Task t = st.pop();
	//			System.out.println(t);
	//		}
	//	}
	void completeIt() {
		System.out.println("completed");
		if (!st.isEmpty() && st.peek().isCompleted) {
			Task t = st.pop();
			System.out.println(t);
		}
	}
	void peekIt() {
		System.out.println("peek");
		if( st.peek().isCompleted==false) {
			Task t = st.pop();
			System.out.println(t);
		}

		System.out.println();
	}
}

class QueueManagement{
	Queue<Task> pq = new LinkedList<>();
	void waitinglist() {
		pq.add(new Task("java","working on queue",false));
		pq.add(new Task("react","components",false));
		pq.add(new Task("spring","started",true));

		for(Task t : pq) {
			System.out.println(t);
		}  // poll and display tasks from the queue
	}
	//	void inProgress() {
	//		System.out.println("working");
	//		if( pq.poll().isCompleted) {
	//			Task t = pq.poll();
	//			System.out.println(t);
	//}
	//	}
	void inProgress() {
		System.out.println("working");
		if (!pq.isEmpty()) {
			Task t = pq.poll();
			System.out.println(t);
		}
	}

	void view() {
		System.out.println("View the next task in line without removing it."
				);
		for(Task t : pq) {
			System.out.println(t);
		}  
	}
}
class LinkedlistManangement{

	LinkedList<Task> ll = new LinkedList<>();
	//		void addtask() {
	//			System.out.println("linked list");
	//			LinkedList<Task> ll = new LinkedList<>();
	//			ll.add(new Task("os","work",true));
	//			ll.add(new Task("new","home",false));
	//			ll.add(new Task("sos","office",true));
	//			ll.add(new Task("www","wifi",false));
	//			
	//			for(Task t : ll) {
	//				System.out.println(t);
	//			}
	//		}
	void addtask() {
		System.out.println("linked list");
		ll.add(new Task("os","work",true));
		ll.add(new Task("new","home",false));
		ll.add(new Task("sos","office",true));
		ll.add(new Task("www","wifi",false));
		for(Task t : ll) {
			System.out.println(t);
		}
	}

	void remove() {
		System.out.println();
		System.out.println("remove ll ele");
		ll.remove(1);

		for(Task t : ll) {
			System.out.println(t);
		}
	}

	void completion() {
		System.out.println();
		System.out.println("completion status");
		for(Task t : ll) {
			System.out.println(t);
		}
	}
}


public class TaskManangementLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice");
		while(true) {
			int ch=sc.nextInt();
			switch(ch) {


			case 1:
				StackManagement st = new StackManagement();
				st.workingonit();
				System.out.println();
				st.completeIt();
				System.out.println();
				st.peekIt();
				break;

			case 2:		
				QueueManagement pq = new QueueManagement();
				pq.waitinglist();
				System.out.println();
				pq.inProgress();
				System.out.println();
				pq.view();
				break;


			case 3:		
				LinkedlistManangement ll = new LinkedlistManangement();
				ll.addtask();
				ll.remove();
				ll.completion();
				break;
			default : System.out.println("invalid");


			}
		}

	}



}




