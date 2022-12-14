package baitap.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        do {
            System.out.println("MENU");
            System.out.println("1. Add new student");
            System.out.println("2. Delete student by name");
            System.out.println("3. Add avg point by name");
            System.out.println("4. Display all student");
            System.out.println("5. Display student by avg point");
            System.out.println("6. Display student by gender");
            System.out.println("7. Display student by name");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManager.addStudent(scanner);
                    break;
                case 2:
                    studentManager.deleteStudentByName(scanner);
                    break;
                case 3:
                    studentManager.updateAvgPointByName(scanner);
                    break;
                case 4:
                    studentManager.displayAllStudent();
                    break;
                case 5:
                    subMenuAvgPoint(scanner, studentManager);
                    break;
                case 6:
                    studentManager.displayStudentByGender(scanner);
                    break;
                case 7:
                    studentManager.searchStudentByName(scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private static void subMenuAvgPoint(Scanner scanner, StudentManager studentManager) {
        if (studentManager.checkEmptyStudents()) {
            int choice;
            do {
                System.out.println("1. Max average point");
                System.out.println("2. Min average point");
                System.out.println("0. Back to menu");
                System.out.println("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        studentManager.displayStudentMaxPoint();
                        break;
                    case 2:
                        studentManager.displayStudentMinPoint();
                        break;
                }
            } while (choice != 0);
        } else {
            System.out.println("Student's list haven't element!");
        }
    }
}
