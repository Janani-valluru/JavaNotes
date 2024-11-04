package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreferredExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Junnu@2404");
        System.out.println("Got JDBC connection");

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Display employees ");
            System.out.println("2. Update employee's basic pay");
            System.out.println("3. Insert new employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                	 displayAllEmployees(con);  // Call method to display all employees
                     break;
                case 2:
                    updateEmployeePay(con, sc);
                    break;
                case 3:
                    insertEmployee(con, sc);
                    break;
                case 4:
                    deleteEmployee(con, sc);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        con.close();
        sc.close();
        System.out.println("Connection closed. Program exited.");
    }

    private static void displayAllEmployees(Connection con) throws SQLException {
        String query = "SELECT * FROM employee";
        try (PreparedStatement pmt = con.prepareStatement(query);
             ResultSet rs = pmt.executeQuery()) {

            System.out.println("All Employees:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("empcode") +
                                   ", Name: " + rs.getString("name") +
                                   ", Dept Code: " + rs.getString("deptcode") +
                                   ", Basic Pay: " + rs.getInt("basicpay"));
            }
        }
    }


    // Update employee's basic pay
    private static void updateEmployeePay(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter employee code: ");
        int empcode = sc.nextInt();
        System.out.print("Enter new basic pay: ");
        int sal = sc.nextInt();

        String query = "UPDATE employee SET basicpay = ? WHERE empcode = ?";
        PreparedStatement pmt = con.prepareStatement(query);
        pmt.setInt(1, sal);
        pmt.setInt(2, empcode);
        
        int rowsUpdated = pmt.executeUpdate();
        System.out.println(rowsUpdated + " record(s) updated.");
        pmt.close();
    }

    // Insert new employee
    private static void insertEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter employee code: ");
        int empcode = sc.nextInt();
        System.out.print("Enter employee name: ");
        String name = sc.next();
        System.out.print("Enter department code: ");
        String deptcode = sc.next();
        System.out.print("Enter basic pay: ");
        int basicpay = sc.nextInt();

        String query = "INSERT INTO employee (empcode, name, deptcode, basicpay) VALUES (?, ?, ?, ?)";
        PreparedStatement pmt = con.prepareStatement(query);
        pmt.setInt(1, empcode);
        pmt.setString(2, name);
        pmt.setString(3, deptcode);
        pmt.setInt(4, basicpay);

        int rowsInserted = pmt.executeUpdate();
        System.out.println(rowsInserted + " record(s) inserted.");
        pmt.close();
    }

    // Delete employee
    private static void deleteEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter employee code to delete: ");
        int empcode = sc.nextInt();

        String query = "DELETE FROM employee WHERE empcode = ?";
        PreparedStatement pmt = con.prepareStatement(query);
        pmt.setInt(1, empcode);

        int rowsDeleted = pmt.executeUpdate();
        System.out.println(rowsDeleted + " record(s) deleted.");
        pmt.close();
    }
}
