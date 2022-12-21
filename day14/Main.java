package day14;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(12);
//        integers.add(2);
//        integers.add(1);
//        integers.add(8);
//        integers.add(5);
//        integers.add(4);
//        integers.add(6);
//        integers.add(15);
//        integers.add(11);
        integers.add(1);
        integers.add(4);
        integers.add(3);
        integers.add(5);
        integers.add(2);
        Sort.display(integers);
        System.out.println();

//        Sort.bubbleSort(integers);
//        Sort.enhanceBubbleSort(integers);
//        Sort.insertSort(integers);
//        Sort.selectSort(integers);
        Sort.display(integers);
        System.out.println();
    }
}
