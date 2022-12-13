package day7.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(15, "red");
        Circle circle2 = new Circle(10, "black");
        Circle circle3 = new Circle(20, "purple");

        Circle[] circles = new Circle[]{circle1, circle2, circle3};

        //sử dụng Comparator đã impl
//        Arrays.sort(circles, new CircleComparator());
        //sử dụng Comparable
//        Arrays.sort(circles);

        //sử dụng trực tiếp Comparator
        Arrays.sort(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return (int) (o2.getRadius() - o1.getRadius());
            }
        });

        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
