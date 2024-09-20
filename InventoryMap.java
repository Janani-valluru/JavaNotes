import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Inventory{
	String name;
	int quantity;
	double price;
	public Inventory(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public  String toString() {
		return "name:"+ name+"  quantity :"+quantity+"   price:"+price;
	}

}

class InventoryManagement{
	static HashMap<Integer ,Inventory > hm = new HashMap<>();

	static void additems() {
		hm.put(101, new Inventory("surf", 2 , 499));
		hm.put(102,new Inventory("vim", 5 , 199));
		hm.put(103, new Inventory("soap", 6 , 99));
		hm.put(104, new Inventory("shampoo", 10 , 90));
		hm.put(105, new Inventory("Widget", 50, 19.99));

		for(Map.Entry<Integer ,Inventory> h :hm.entrySet()) {
			System.out.println(h.getKey()+ "" + h.getValue());
		}

	}

	static void update(int id , int quant) {
		if(hm.containsKey(id)) {
			Inventory item = hm.get(id);
			item.quantity = quant;
			System.out.println(item);
		}
		System.out.println("update inventory");
		for(Map.Entry<Integer ,Inventory> h :hm.entrySet()) {
			System.out.println(h.getKey()+ "" + h.getValue());
			System.out.println();
		}

	}




	static void retrivedetails() {


		System.out.println("Retrieve the details of an item based on its ID.");
		System.out.println("Enter the name");
		Scanner scc = new Scanner(System.in);

		String k = scc.next();
		int key=0;

		for(Map.Entry<Integer ,Inventory> h :hm.entrySet()) {
			Inventory obj = h.getValue();
			if(obj.name.equals(k)) {
				key = h.getKey();
				System.out.println(h.getValue());

			}
		}
	}



	static void removeitem() {
		System.out.println("remove an key");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		hm.remove(k);

		System.out.println("removed the key");
		//for loop prints all elements in map
		for(Entry<Integer, Inventory> h : hm.entrySet()) {
			System.out.println(h.getKey() + " "+ h.getValue());
		}
	}
	static void display() {
		for(Entry<Integer, Inventory> h : hm.entrySet()) {
			System.out.println(h.getKey() + " "+ h.getValue());
		}
	}


}
public class InventoryMap {

	public static void main(String[] args) {
		HashMap<Integer ,Inventory > hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("enter choice");
			int ch=sc.nextInt();
			switch(ch) {

			case 1:
				InventoryManagement.additems();
				System.out.println();
				break;
			case 2:

				System.out.println("enter id");
				int a = sc.nextInt();
				System.out.println("enter quantity");
				int b =sc.nextInt();
				InventoryManagement.update(a,b);
				System.out.println();
				break;
			case 3:

				InventoryManagement.retrivedetails();
				System.out.println();
				break;

			case 4:
				InventoryManagement.removeitem();
				break;



			}

		}
	}
}










