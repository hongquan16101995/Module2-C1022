package day14;

import java.util.ArrayList;

public class Sort {
    public static void bubbleSort(ArrayList<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            for (int j = integers.size() - 1; j > i; j--) {
                if (integers.get(j) < integers.get(j - 1)) {
                    int temp = integers.get(j);
                    //int[j] = int[j - 1]
                    integers.set(j, integers.get(j - 1));
                    integers.set(j - 1, temp);
                }
            }
        }
    }

    public static void enhanceBubbleSort(ArrayList<Integer> integers) {
        boolean check = true;
        for (int i = 0; i < integers.size() && check; i++) {
            check = false;
            for (int j = integers.size() - 1; j > i; j--) {
                if (integers.get(j) < integers.get(j - 1)) {
                    int temp = integers.get(j);
                    //int[j] = int[j - 1]
                    integers.set(j, integers.get(j - 1));
                    integers.set(j - 1, temp);
                    check = true;
                }
            }
        }
    }

    public static void insertSort(ArrayList<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            int temp = integers.get(i);
            int pos = i;
            while (pos > 0 && temp < integers.get(pos - 1)) {
                integers.set(pos, integers.get(pos - 1));
                pos--;
            }
            integers.set(pos, temp);
        }
    }

    public static void selectSort(ArrayList<Integer> integers) {
        for (int i = 0; i < integers.size() - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < integers.size(); j++) {
                if (integers.get(j) < integers.get(indexMin)) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = integers.get(i);
                integers.set(i, integers.get(indexMin));
                integers.set(indexMin, temp);
            }
        }
    }

    public static void display(ArrayList<Integer> integers) {
        for (Integer i : integers) {
            System.out.print(i + "; ");
        }
    }
}
