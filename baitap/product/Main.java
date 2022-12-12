package baitap.product;

public class Main {
    public static void main(String[] args) {
        int[] ints1 = {1,2,3,4,5,6,7};
        int[] ints2 = new int[10];

        System.arraycopy(ints1, 0, ints2, 0, ints1.length);
        for (int i : ints2) {
            System.out.print(i + ", ");
        }
    }
}
