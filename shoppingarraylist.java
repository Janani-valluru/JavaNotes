



import java.util.ArrayList;
import java.util.Scanner;

class ShoppingProduct {
    int pid;
    String pname;
    float price;
    int quantity;

    public ShoppingProduct(int pid, String pname, float price, int quantity) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product ID: " + pid + ", Product Name: " + pname + ", Price: " + price + ", Quantity: " + quantity);
    }
}

class ProductManagement {
    ArrayList<ShoppingProduct> createProducts() {
        ArrayList<ShoppingProduct> products = new ArrayList<>();
        products.add(new ShoppingProduct(12, "Surf", 299, 2));
        products.add(new ShoppingProduct(132, "Vim", 29, 1));
        products.add(new ShoppingProduct(152, "Lux", 29, 5));
        products.add(new ShoppingProduct(172, "Medimix", 49, 7));
        products.add(new ShoppingProduct(102, "Nivea", 59, 6));

        for (ShoppingProduct product : products) {
            product.displayProduct();
        }

        return products;
    }

    void displayProducts(ArrayList<ShoppingProduct> products) {
        for (ShoppingProduct product : products) {
            product.displayProduct();
        }
    }

    void removeProduct(ArrayList<ShoppingProduct> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product ID to delete:");
        int id = scanner.nextInt();

        boolean found = false;
        for (ShoppingProduct product : products) {
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

    void calculateTotal(ArrayList<ShoppingProduct> products) {
        double total = 0;
        for (ShoppingProduct product : products) {
            total += product.price * product.quantity;
        }
        System.out.println("Total price: " + total);
    }
}

public class shoppingarraylist {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<ShoppingProduct> products = productManagement.createProducts();

			while (true) {
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