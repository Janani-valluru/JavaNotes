



import java.util.ArrayList;
import java.util.Scanner;

class ProductInventory {
    int pid;
    String pname;
    float price;
    int quantity;

    public ProductInventory(int pid, String pname, float price, int quantity) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product ID: " + pid + ", Product Name: " + pname + ", Price: " + price + ", Quantity: " + quantity);
    }
}

class ProductManagements {
    ArrayList<ProductInventory> createProducts() {
        ArrayList<ProductInventory> products = new ArrayList<>();
        products.add(new ProductInventory(132, "SAMSUNG", 29, 1));
        products.add(new ProductInventory(152, "MOTO", 29, 5));
        products.add(new ProductInventory(172, "MAC", 49, 7));
        products.add(new ProductInventory(102, "DELL", 59, 6));

        for (ProductInventory product : products) {
            product.displayProduct();
        }

        return products;
    }

    void displayProducts(ArrayList<ProductInventory> products) {
        for (ProductInventory product : products) {
            product.displayProduct();
        }
    }

    void removeProduct(ArrayList<ProductInventory> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product ID to delete:");
        int id = scanner.nextInt();

        boolean found = false;
        for (ProductInventory product : products) {
            if (product.pid == id) {
                products.remove(product);
                System.out.println("Product removed");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found");
        }
    }

    void calculateTotal(ArrayList<ProductInventory> products) {
        double total = 0;
        for (ProductInventory product : products) {
            total += product.price * product.quantity;
        }
        System.out.println("Total price: " + total);
    }
}

public class InventoryArraylist {
    public static void main(String[] args) {
        ProductManagements productManagement = new ProductManagements();
        try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<ProductInventory> products = productManagement.createProducts();

			while (true) {
				System.out.println("1. add 2. remove 3. display 4. calculate");
			    System.out.println("Enter choice:");
			    int choice = scanner.nextInt();

			    switch (choice) {
			        case 1:
			            products = productManagement.createProducts();
			            break;
			        case 2:
			            productManagement.removeProduct(products);
			            break;
			        case 3:
			            productManagement.displayProducts(products);
			            break;
			        case 4:
			            productManagement.calculateTotal(products);
			            break;
			        default:
			            System.out.println("Invalid choice");
			    }
			}
		}
    }
}