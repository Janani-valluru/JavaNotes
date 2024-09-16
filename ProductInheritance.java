import java.util.ArrayList;
import java.util.List;

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
       
    	 List<Electronics> electronicsList = new ArrayList<>();
         electronicsList.add(new Electronics(101, "Laptop", 2));
         electronicsList.add(new Electronics(102, "Smartphone", 1));
         electronicsList.add(new Electronics(103, "Television", 3));

     
         List<Clothing> clothingList = new ArrayList<>();
         clothingList.add(new Clothing(201, "T-Shirt", "Medium"));
         clothingList.add(new Clothing(202, "Jeans", "Large"));
         clothingList.add(new Clothing(203, "Jacket", "Small"));

        
     
         System.out.println("Electronics Products:");
         for (int i = 0; i < electronicsList.size(); i++) {
             Electronics electronics = electronicsList.get(i); 
             electronics.displayProductInfo();
             System.out.println();
         }

         System.out.println("Clothing Products:");
         for (int i = 0; i < clothingList.size(); i++) {
        	 Clothing  clothing = clothingList.get(i); 
        	 clothing.displayProductInfo();
             System.out.println(); 
         }
        
    }
}
