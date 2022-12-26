package day16;

import baitap.student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\FirstProject\\src\\data\\student");
        File file1 = new File("C:\\Users\\ADMIN\\Desktop\\FirstProject\\src\\data\\student.txt");

        Student student = new Student("Vũ", 18, "Male", "HN", 1.0);
        Student student1 = new Student("Vũ1", 181, "Male", "HN", 1.0);
        Student student2 = new Student("Vũ2", 182, "Male", "HN", 1.0);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        writeFile(file1, student);
        writeFileBinary(file, students);
//        Student studentRead = readFile(file);
        ArrayList<Student> studentRead = readFileBinary(file);
        for (Student s : studentRead) {
            System.out.println(s);
        }
//        if (studentRead != null) {
//            System.out.println(studentRead);
//        }
    }

    public static void writeFile(File file, Student student) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String write = student.getName() + "," + student.getAge() + ","
                    + student.getGender() + "," + student.getAddress() + ","
                    + student.getAvgPoint() + "\n";
            bufferedWriter.write(write);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileBinary(File file, ArrayList<Student> students) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student readFile(File file) {
        Student student = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                String[] strings = text.split(",");
                student = new Student(strings[0], Integer.parseInt(strings[1]),
                        strings[2], strings[3], Double.parseDouble(strings[4]));
                System.out.println(student);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }

    public static ArrayList<Student> readFileBinary(File file) {
        ArrayList<Student> students = new ArrayList<Student>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Object object = objectInputStream.readObject();
            students = (ArrayList<Student>) object;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
