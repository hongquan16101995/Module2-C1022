package day3;

import java.util.Scanner;

public class StackHeap {
    //ints1: gọi là biến toàn cục; khai báo trong 1 lớp; chính là thuộc tính của lớp
    //biến này tồn tại trong toàn bộ phạm vi lớp
    //biến toàn cục có giá trị mặc định tương ứng của kiểu dữ liệu mà nó đang mang
    //giá trị mặc định cơ bản của biến: int = 0; double = 0.0; boolean = false; Object = null
    // Array chính là 1 Object
    static int[] ints1;

    public static void main(String[] args) {
        //ints: gọi là biến cục bộ; khai báo trong 1 phương thức của lớp
        //biến cục bộ chỉ tồn tại và được sử dụng trong phạm vi của phương thức đó
        //biến cục bộ không có giá trị mặc định
//        int [] ints = {1};
//        System.out.println(ints[0]);
        ints1 = new int[]{1};
        System.out.println(ints1[0]);
        main();
    }

    public static void main() {
        ints1 = new int[]{100};
        System.out.println(ints1[0]);
    }
}
