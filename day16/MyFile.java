package day16;

import baitap.student.Student;

import java.io.*;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\FirstProject\\src\\data\\demo");
        //trả về tên file
        System.out.println(file.getName());
        //trả về đường dẫn file
        System.out.println(file.getAbsolutePath());

        //ghi file
        writeFile(file);
        readFile(file);
    }

    public static void writeFile(File file) {
        try {
            //tạo đối tượng để ghi dữ liệu vào file: FileWriter
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //lấy dữ liệu từ bàn phím
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập gì đó: ");
            String text = scanner.nextLine();
            //ghi dữ liệu vào file và đóng luồng
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //đọc ký tự đầu tiên của file
//            int text = fileReader.read();
//            System.out.println((char) text);
            //đọc tất cả ký tự
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                System.out.println(text);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
