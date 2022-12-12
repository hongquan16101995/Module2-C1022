package day7;

import day7.interface_.Bird;
import day7.interface_.Plane;
import day7.interface_.Resize;

public class MainTest {
    public static void main(String[] args) {
        Resize resize1 = new Bird(10, 10, "red");
        Resize resize2 = new Plane();
        resize1.canFly();
        resize2.canFly();

        Bird bird = ((Bird) resize1).clone();

        Resize[] resizes = new Resize[10];
        resizes[0] = resize1;
        resizes[1] = resize2;

        for (Resize r : resizes) {
            r.canFly();
            if (r instanceof Bird) {
                System.out.println(((Bird)r).color);
            }
        }
    }
}
