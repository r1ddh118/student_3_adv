// Main.java
// Name: Riddhi Poddar
//PRN:23070126105
//Batch: B2

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            // Display menu options
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student (By PRN)");
            System.out.println("4. Search Student (By Name)");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            // Perform selected operation
            switch (choice) {
                case 1:
                    operations.addStudent(scan);
                    break;
                case 2:
                    operations.displayStudents();
                    break;
                case 3:
                    operations.searchByPRN(scan);
                    break;
                case 4:
                    operations.searchByName(scan);
                    break;
                case 5:
                    operations.updateStudent(scan);
                    break;
                case 6:
                    operations.deleteStudent(scan);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);
    }
}

