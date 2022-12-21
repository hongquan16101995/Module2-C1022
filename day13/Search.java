package day13;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);

        searchLinear(integers, 0);
        searchBinary(integers, 0);
//        searchBinary1(0, integers.size(), 0, integers, 1);
    }

    public static void searchLinear(ArrayList<Integer> integers, int searchValue) {
        int count = 0;
        for (Integer i : integers) {
            count++;
            if (i.equals(searchValue)) {
                break;
            }
        }
        System.out.println(count);
    }

    public static void searchBinary(ArrayList<Integer> integers, int searchValue) {
        int count = 0;
        int first = 0;
        int last = integers.size();
        while (first < last) {
            count++;
            if (integers.get((first + last) / 2).equals(searchValue)) {
                break;
            } else if (integers.get((first + last) / 2) < searchValue) {
                first = (first + last) / 2 + 1;
            } else {
                last = (first + last) / 2;
            }
        }
        System.out.println(count);
    }

    public static void searchBinary1(int first, int last, int count,
                                     ArrayList<Integer> integers, int searchValue) {
        count++;
        if (integers.get((first + last) / 2).equals(searchValue)) {
            System.out.println(count);
        } else if (integers.get((first + last) / 2) < searchValue) {
            searchBinary1((first + last) / 2, last, count, integers, searchValue);
        } else {
            searchBinary1(first, (first + last) / 2, count, integers, searchValue);
        }
    }
}
