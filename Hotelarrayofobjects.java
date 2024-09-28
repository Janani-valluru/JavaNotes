import java.util.ArrayList;
import java.util.Scanner;

class Hotel {
    int roomNumber;
    String roomType;
    double ratePerNight;
    boolean availabilityStatus;

    public Hotel(int roomNumber, String roomType, double ratePerNight, boolean availabilityStatus) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.ratePerNight = ratePerNight;
        this.availabilityStatus = availabilityStatus;
    }

    void display() {
        System.out.println(roomNumber + " " + roomType + " " + ratePerNight + " " + availabilityStatus);
    }

    void bookRoom() {
        if (availabilityStatus) {
            System.out.println("Room " + roomNumber + " is already booked.");
        } else {
            availabilityStatus = true;
            System.out.println("Room " + roomNumber + " is successfully booked.");
        }
    }

    void cancelBooking() {
        if (!availabilityStatus) {
            System.out.println("Room " + roomNumber + " is already available.");
        } else {
            availabilityStatus = false;
            System.out.println("Room " + roomNumber + " booking is cancelled.");
        }
    }
}

class hotelManagement {

    void displayhotel(ArrayList<Hotel> hm) {
        for (Hotel h : hm) {
            h.display();
        }
    }

    ArrayList<Hotel> CreateArray() {
        ArrayList<Hotel> hm = new ArrayList<>();
        Hotel h1 = new Hotel(101, "single", 3000, false);
        Hotel h2 = new Hotel(102, "double", 4000, false);
        Hotel h3 = new Hotel(103, "suite", 6000, false);
        hm.add(h3);
        hm.add(h2);
        hm.add(h1);

        return hm;
    }

    void totalAmount(int days, double scost) {
        double total = scost * days;
        System.out.println("Total: " + total);
    }
}

public class Hotelarrayofobjects {

    public static void main(String[] args) {
        hotelManagement hm = new hotelManagement();

        ArrayList<Hotel> h = hm.CreateArray();
        hm.displayhotel(h);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter choice: 1 for booking, 2 for cancelling, 3 for calculating total amount, 4 to display rooms, 0 to exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter room number to book:");
                    int roomNumToBook = sc.nextInt();
                    for (Hotel hotel : h) {
                        if (hotel.roomNumber == roomNumToBook) {
                            hotel.bookRoom();
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter room number to cancel booking:");
                    int roomNumToCancel = sc.nextInt();
                    for (Hotel hotel : h) {
                        if (hotel.roomNumber == roomNumToCancel) {
                            hotel.cancelBooking();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter room number for calculating total amount:");
                    int roomNumForTotal = sc.nextInt();
                    System.out.println("No of days:");
                    int days = sc.nextInt();
                    for (Hotel hotel : h) {
                        if (hotel.roomNumber == roomNumForTotal) {
                            hm.totalAmount(days, hotel.ratePerNight);
                            break;
                        }
                    }
                    break;
                case 4:
                    hm.displayhotel(h);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
