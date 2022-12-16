package day10;

import baitap.product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainSet {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(1);
        for (Integer i : a) {
            System.out.println(i);
        }

        System.out.println("-----------");

        //set là tập hợp các giá trị không trùng lặp
        //chú ý nếu kiểu dữ liệu của Set là 1 Object
        HashSet<Integer> b = new HashSet<>();
        b.add(1);
        b.add(2);
        b.add(1);
        for (Integer i : b) {
            System.out.println(i);
        }

        System.out.println("----------");
        test();
    }

    public static void test() {
        ArrayList<Customer> a = new ArrayList<>();
        Customer a1 = new Customer(1,"A");
        Customer b1 = new Customer(2,"B");
        Customer a2 = a1;
        a.add(a1);
        a.add(b1);
        a.add(a2);
        for (Customer i : a) {
            System.out.println(i);
        }

        System.out.println("-----------");

        HashSet<Customer> b = new HashSet<>();
        b.add(a1);
        b.add(b1);
        b.add(a2);
        for (Customer i : b) {
            System.out.println(i);
        }
    }
}
