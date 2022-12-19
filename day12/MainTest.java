package day12;

import baitap.student.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<Student> integers = new ArrayList<>();
        integers.add(new Student("a", 1, "b", "c", 1.0));
        integers.add(new Student("b", 1, "b", "c", 1.0));
        integers.add(new Student("c", 1, "b", "c", 1.0));

        Student student = null;
        for (Student i : integers) {
            if (i.getName().equals("a")) {
                student = i;
                integers.remove(i);
                break;
            }
        }
//        if (student != null) {
//            integers.remove(student);
//        }
//
//        for (Student i : integers) {
//            System.out.println(i);
//        }

//        System.out.println("-----");
//
        //lớp Iterator: là 1 lớp được triển khai từ interface Iterable
        //cung cấp 1 vài khả năng mạnh mẽ hơn của Collection
        //Mọi Collection đều là 1 Iterable, vì interface Collection được kế thừa từ Iterable
        Iterator<Student> iterator = integers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals("a")) {
                iterator.remove();
            }
        }

        for (Student i : integers) {
            System.out.println(i);
        }


//
//        Iterator<Student> iterator1 = integers.iterator();
//        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
//        }
    }
}
