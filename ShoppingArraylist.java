package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class Product{
    private int id;
    private String name;
    private int cost;
	
    public Product(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	void displayProduct(){
		System.out.println("Product ID: " + id + ", Product Name: " + name + ", Price: " +cost );
	}
	
    
    
}

//logic


class ProductManagement{
	
	public ArrayList<Product> products = new ArrayList<>();
	
	public ArrayList<Product> createProducts(){
		
		
		products.add(new Product(1,"lipstick",780) );
		products.add(new Product(2,"pen",70) );
		products.add(new Product(3,"bottle",700) );
		
	for(Product prod:products) {
			prod.displayProduct();		
	}
		return products;
		
	}
	
	
	
	void displayProducts() {
		for(Product prod:products) {
			prod.displayProduct();
		}
	}
	
	
	public void AddProduct(Product prod) {
        products.add(prod);
        System.out.println("Added: " +  prod);
    }
	
	public void removeProduct() {
		Scanner sc =new Scanner(System.in);
		System.out.println("id to delete");
		int id =sc.nextInt();
		
		boolean found =false;
		
		for(Product prod:products) {
			if(prod.getId() ==id) {
				products.remove(prod);
				
				System.out.println("Product with ID " + id + " has been removed.");
	            found = true;
	            break; 
			}
		}
		
		if (!found) {
	        System.out.println("Product with ID " + id + " not found.");
	    }
	}
// 	public void updateProduct() {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter ID of product to update:");
//     int id = sc.nextInt();

//     boolean found = false;

//     for (Product prod : products) {
//         if (prod.getId() == id) {
//             System.out.println("Enter new name:");
//             prod.setName(sc.next());
//             System.out.println("Enter new cost:");
//             prod.setCost(sc.nextInt());
//             System.out.println("Product updated successfully.");
//             found = true;
//             break;
//         }
//     }

//     if (!found) {
//         System.out.println("Product with ID " + id + " not found.");
//     }
// }

}

public class ShoppingArraylist {
	
	public static void main(String[] args) {
		ProductManagement prodmgmt = new ProductManagement();
		Scanner sc =new Scanner(System.in);
		
		 
	while(true) {
			System.out.println("choice");
			System.out.println("1.create 2.display 3. add 4 .remove" );
			int  choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("create");
				ArrayList<Product> prod =prodmgmt.createProducts();
				break;
			case 2: 
				System.out.println("display");
					prodmgmt.displayProducts();
            		break;
			case 3:
				System.out.println("add");
					System.out.println("ID");
					int id =sc.nextInt();
					
					System.out.print("Enter Product Name: ");
                    String name = sc.next();

                    System.out.print("Enter Product Price: ");
                    int cost = sc.nextInt();
                    
                    Product newproduct = new Product(id,name,cost);
                    prodmgmt.AddProduct(newproduct);
                    break;
                    
			case 4:
				System.out.println("delete");
				prodmgmt.removeProduct(); 
				// No need to pass 'products'
                break;
			  default:
                  System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
