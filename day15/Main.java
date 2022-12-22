package day15;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//
//        try {
//            int number = Integer.parseInt(scanner.nextLine());
//            System.out.println(number);
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
////            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(1000);

//        try {
//            m1();
//        } catch (IOException  e) {
//            System.out.println("HelloWorld");
//        }

        //chấm tròn đỏ: break point, nơi mà luồng sẽ dừng để hiển thị pử debugger
        //F8: để next giữa các dòng lệnh
        //shift + F8: để next giữa các break point
        //mute break point: tạm thời xóa bỏ các điểm break point
        int choice = -1;
        boolean check = true;
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                check = false;
                System.out.println("Demo");
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Sai định dạng, nhập lại!");
            } finally {
                System.out.println("Mời bạn quay về menu!");
            }
        }while (check);

        System.out.println(choice);
    }

    public static void m1() throws IOException,NumberFormatException {
//        try {
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
            throw new IOException();
//        } catch (IOException e) {
//            System.out.println("HelloWorld");
//        }
    }

    public static void m2() {
//        m1();
    }
}
