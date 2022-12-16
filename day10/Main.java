package day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //<>: đại diện cho khái niệm Generic
        //Generic là khả năng cung cấp kiểu dữ liệu
        // làm tham số đầu vào chi việc khởi tạo 1 lớp
        //lớp Wrapper: là đại diện dạng Object của các kiểu dữ liệu nguyên thủy (primitive)
        //boolean => Boolean
        //char => Character
        //int => Integer
        //float => Float
        //long => Long
        //double => Double
        //byte => Byte
        //short => Short

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers1.add(11);
        integers1.add(22);
        integers1.add(33);
        integers.addAll(1,integers1);
        for (Integer i : integers) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (Integer i : integers1) {
            System.out.print(i + ", ");
        }

//        ArrayList<Long> integers1 = new ArrayList<>();
//        ArrayList<Byte> integers2 = new ArrayList<>();
//        ArrayList<Short> integers3 = new ArrayList<>();
//        ArrayList<Float> integers4 = new ArrayList<>();
//        ArrayList<Double> integers5 = new ArrayList<>();
//        ArrayList<Character> integers6 = new ArrayList<>();
//        ArrayList<Boolean> integers7 = new ArrayList<>();

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(10);
        integerLinkedList.add(100);
        integerLinkedList.add(1000);
        integerLinkedList.add(1, 5555);

        List<Integer> a = new LinkedList<>();
    }
}
