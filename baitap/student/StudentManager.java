package baitap.student;

import java.util.Scanner;

public class StudentManager {
    private Student[] students;

    public StudentManager() {
        students = new Student[0];
    }

    private Student createStudent(Scanner scanner, int choice) {
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student age (18-60): ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter student gender: ");
        String gender = choiceGender(scanner);
        System.out.println("Enter student address: ");
        String address = scanner.nextLine();
        if (choice == 1) {
            System.out.println("Enter student average point: ");
            double avgPoint = Double.parseDouble(scanner.nextLine());
            return new Student(name, age, gender, address, avgPoint);
        } else {
            return new Student(name, age, gender, address, -1);
        }
    }

    private String choiceGender(Scanner scanner) {
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return "Male";
            case 2:
                return "Female";
            default:
                return "Other";
        }
    }

    public void addStudent(Scanner scanner) {
        System.out.println("1. Enter average point now");
        System.out.println("2. Enter average point then");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        Student student = createStudent(scanner, choice);
        Student[] newStudent = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudent, 0, students.length);
        newStudent[students.length] = student;
        students = newStudent;
    }

    public void updateAvgPointByName(Scanner scanner) {
        if (checkEmptyStudents()) {
            System.out.println("Enter student name you have update avg point: ");
            String name = scanner.nextLine();
            boolean flag = false;
            for (Student s : students) {
                if (s.getName().equals(name)) {
                    System.out.printf("%-20s%-10s%-10s%-20s%s",
                            "NAME", "AGE", "GENDER", "ADDRESS", "AVG_POINT\n");
                    s.display();
                    System.out.println("Enter student average point: ");
                    double avgPoint = Double.parseDouble(scanner.nextLine());
                    s.setAvgPoint(avgPoint);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Not exist student have this name!");
            }
        } else {
            System.out.println("Student's list haven't element!");
        }
    }

    public void deleteStudentByName(Scanner scanner) {
        if (checkEmptyStudents()) {
            System.out.println("Enter student name you want delete: ");
            String name = scanner.nextLine();
            int deleteIndex = -1;
            for (int i = 0; i < students.length; i++) {
                if (students[i].getName().equals(name)) {
                    deleteIndex = i;
                }
            }
            if (deleteIndex != -1) {
                Student[] newStudent = new Student[students.length - 1];
                System.arraycopy(students, 0, newStudent, 0, deleteIndex);
                System.arraycopy(students, deleteIndex+1, newStudent, deleteIndex, students.length - 1 - deleteIndex);
                students = newStudent;
            } else {
                System.out.println("Not exist student have this name!");
            }
        } else {
            System.out.println("Student's list haven't element!");
        }
    }

    public void displayAllStudent() {
        System.out.printf("%-20s%-10s%-10s%-20s%s",
                "NAME", "AGE", "GENDER", "ADDRESS", "AVG_POINT\n");
        for (Student s : students) {
            s.display();
        }
    }

    public boolean checkEmptyStudents() {
        return students.length > 0;
    }

    public void displayStudentMaxPoint() {
        boolean flag = false;
        if (checkEmptyStudents()) {
            double maxPoint = students[0].getAvgPoint();
            for (Student s : students) {
                if (s.getAvgPoint() >= maxPoint && s.getAvgPoint() != -1) {
                    maxPoint = s.getAvgPoint();
                    flag = true;
                }
            }
            displayByAvgPoint(flag, maxPoint);
        } else {
            System.out.println("Student's list haven't element!");
        }
    }

    public void displayStudentMinPoint() {
        boolean flag = false;
        if (checkEmptyStudents()) {
            double minPoint = students[0].getAvgPoint();
            for (Student s : students) {
                if (s.getAvgPoint() <= minPoint && s.getAvgPoint() != -1) {
                    minPoint = s.getAvgPoint();
                    flag = true;
                }
            }
            displayByAvgPoint(flag, minPoint);
        } else {
            System.out.println("Student's list haven't element!");
        }
    }

    private void displayByAvgPoint(boolean flag, double avgPoint) {
        if (!flag) {
            System.out.println("Not exist student have avg point!");
        } else {
            System.out.printf("%-20s%-10s%-10s%-20s%s",
                    "NAME", "AGE", "GENDER", "ADDRESS", "AVG_POINT\n");
            for (Student s : students) {
                if (s.getAvgPoint() == avgPoint) {
                    s.display();
                }
            }
        }
    }

    public void displayStudentByGender(Scanner scanner) {
        if (checkEmptyStudents()) {
            String gender = choiceGender(scanner);
            System.out.printf("%-20s%-10s%-10s%-20s%s",
                    "NAME", "AGE", "GENDER", "ADDRESS", "AVG_POINT\n");
            for (Student s : students) {
                if (s.getGender().equals(gender)) {
                    s.display();
                }
            }
        } else {
            System.out.println("Student's list haven't element!");
        }
    }

    public void searchStudentByName(Scanner scanner) {
        if (checkEmptyStudents()) {
            boolean flag = false;
            System.out.println("Enter student name you want search: ");
            String nameSearch = scanner.nextLine();
            System.out.printf("%-20s%-10s%-10s%-20s%s",
                    "NAME", "AGE", "GENDER", "ADDRESS", "AVG_POINT\n");
            for (Student s : students) {
                if (s.getName().toLowerCase().contains(nameSearch.toLowerCase())) {
                    s.display();
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Not exist student have this name!");
            }
        } else {
            System.out.println("Student's list haven't element!");
        }
    }
}
