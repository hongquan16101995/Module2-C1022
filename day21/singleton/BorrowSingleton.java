package day21.singleton;

public class BorrowSingleton {
    private Singleton borrowSingleton;
    private boolean haveSingleton;

    public void borrowSingleton() {
        borrowSingleton = Singleton.borrowSingleton();
        if (borrowSingleton == null) {
            haveSingleton = false;
        } else {
            haveSingleton = true;
        }
    }

    public void displayNameSingleton() {
        if (haveSingleton) {
            System.out.println("Name Singleton: " + borrowSingleton.getName());
        } else {
            System.out.println("Don't borrow Singleton!");
        }
    }

    public void borrowedSingleton() {
        borrowSingleton.returnSingleton();
        System.out.println("Done borrowed Singleton!");
    }
}
