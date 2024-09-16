
class Product {
    int productId;
    String productName;

   
    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
    }
}

class Electronics extends Product {
    int warrantyPeriod;


    public Electronics(int productId, String productName, int warrantyPeriod) {
        super(productId, productName);
        this.warrantyPeriod = warrantyPeriod;
    }

   
    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

class Clothing extends Product {
    String size;

    public Clothing(int productId, String productName, String size) {
        super(productId, productName); 
        this.size = size;
    }

  
    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Size: " + size);
    }
}


public class ProductInheritance {
    public static void main(String[] args) {
       
        Electronics electronics = new Electronics(101, "Laptop", 2);
        
     
        Clothing clothing = new Clothing(102, "T-Shirt", "Medium");

        
        System.out.println("Electronics Product Info:");
        electronics.displayProductInfo();

        System.out.println("\nClothing Product Info:");
        clothing.displayProductInfo();
    }
}
