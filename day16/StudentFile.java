package day16;

import baitap.student.Student;

import java.io.*;
import java.util.Scanner;

public class StudentFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\FirstProject\\src\\data\\student.txt");

        Student student = new Student("Sơn", 18, "Male", "HN", 1.0);
//        writeFile(file, student);
        Student studentRead = readFile(file);
        if (studentRead != null) {
//            System.out.println(studentRead);
        }
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
}
