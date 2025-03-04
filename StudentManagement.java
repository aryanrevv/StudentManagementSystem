/**
 * StudentManagement.java
 * Handles operations on Student objects using ArrayList.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add a student
    public void addStudent() {
        System.out.println("Enter PRN: ");
        String prn = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter DoB (dd-mm-yyyy): ");
        String dob = scanner.nextLine();
        System.out.println("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {
        for (Student s : students) {
            System.out.println("PRN: " + s.getPrn() + ", Name: " + s.getName() +
                    ", DoB: " + s.getDob() + ", Marks: " + s.getMarks());
        }
    }

    // Search by PRN
    public void searchByPrn(String prn) {
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                System.out.println("Found: " + s.getName());
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Update student details
    public void updateStudent(String prn) {
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                System.out.println("Enter new name: ");
                s.setName(scanner.nextLine());
                System.out.println("Enter new DoB: ");
                s.setDob(scanner.nextLine());
                System.out.println("Enter new marks: ");
                s.setMarks(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Delete a student
    public void deleteStudent(String prn) {
        students.removeIf(s -> s.getPrn().equals(prn));
        System.out.println("Student deleted!");
    }
}