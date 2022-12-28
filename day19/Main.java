package day19;

public class Main {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        String c = new String("a");
        String d = new String("a");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(c == d);
        System.out.println(c.equals(d));

        String a1 = "a";
        String a2 = "b";
        String a3 = a1 + a2;
        a1 += "d";
        System.out.println(a3);
        System.out.println(a1);

        StringBuilder demo = new StringBuilder("abc");
        demo.insert(2,"d");
        System.out.println(demo);
    }
}
