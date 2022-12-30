package day21.singleton;

public class Main {
    public static void main(String[] args) {
        BorrowSingleton borrowSingleton1 = new BorrowSingleton();
        BorrowSingleton borrowSingleton2 = new BorrowSingleton();
        BorrowSingleton borrowSingleton3 = new BorrowSingleton();
        BorrowSingleton borrowSingleton4 = new BorrowSingleton();

        borrowSingleton1.borrowSingleton();
        borrowSingleton1.displayNameSingleton();
        borrowSingleton2.borrowSingleton();
        borrowSingleton2.displayNameSingleton();
        borrowSingleton1.borrowedSingleton();
        borrowSingleton3.borrowSingleton();
        borrowSingleton3.displayNameSingleton();
        borrowSingleton4.borrowSingleton();
        borrowSingleton4.displayNameSingleton();
    }
}
