// QUESTION 5 CAR RENTAL MANAGEMENT 

import java.util.Scanner;

class Car {
    String carModel;
    int regno;
    int carCost;
    int rent;
    int availability; 

    void readDetails(String model, int reg, int cost, int avail) {
        carModel = model;
        regno = reg;
        carCost = cost;
        availability = avail;
    }

    void display() {
        System.out.println("carModel: " + carModel);
        System.out.println("regno: " + regno);
        System.out.println("carCost: " + carCost);
    }

    
    void displayRent() {
        if (carCost >= 800000) {
            rent = 10000;
        } else {
            rent = 5000;
        }
        System.out.println("Per day rent: " + rent);
    }

  
    void returnCar(int days) {
        if (days >= 5) {
            int totalCost = days * rent;
            System.out.println("Total rental cost for " + days + " days: " + totalCost);
        } else {
            System.out.println("Rental period is less than the minimum required days.");
        }
    }
}

public class carRentalManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car b1 = new Car();
        b1.readDetails("BMW", 999, 1000000, 15);
        b1.display();
        b1.displayRent();
        System.out.print("Enter the number of days to rent BMW: ");
        int days1 = scanner.nextInt();
        b1.returnCar(days1);

        System.out.println(); 
        
        Car b2 = new Car();
        b2.readDetails("Audi", 799, 700000, 12);
        b2.display();
        b2.displayRent();
        System.out.print("Enter the number of days to rent Audi: ");
        int days2 = scanner.nextInt();
        b2.returnCar(days2);

        System.out.println();


        Car b3 = new Car();
        b3.readDetails("Benz", 699, 500000, 10);
        b3.display();
        b3.displayRent();
        System.out.print("Enter the number of days to rent Benz: ");
        int days3 = scanner.nextInt();
        b3.returnCar(days3);

        System.out.println(); 

        Car b4 = new Car();
        b4.readDetails("Tesla", 799, 80000, 20);
        b4.display();
        b4.displayRent();
        System.out.print("Enter the number of days to rent TESLA: ");
        int days4 = scanner.nextInt();
        b4.returnCar(days4);

        scanner.close();
    }
}
