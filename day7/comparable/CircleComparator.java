package day7.comparable;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        return (int) (o1.getRadius() - o2.getRadius());
    }
}
