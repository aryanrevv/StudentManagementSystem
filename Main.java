/**
 * Main.java
 * Author: John Doe
 * PRN: 123456
 * Batch: 2023
 * Menu-driven program for Student Management.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Search by PRN\n" +
                    "4. Update Student\n5. Delete Student\n6. Exit\nEnter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.displayStudents();
                    break;
                case 3:
                    System.out.println("Enter PRN to search: ");
                    sm.searchByPrn(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Enter PRN to update: ");
                    sm.updateStudent(scanner.nextLine());
                    break;
                case 5:
                    System.out.println("Enter PRN to delete: ");
                    sm.deleteStudent(scanner.nextLine());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }
}