package day21.singleton;

public class Singleton {
    private String name;
    private static Singleton singleton;
    private static boolean isLoanedOut;

    private Singleton() {
        this.name = "DemoSingleton";
        singleton = null;
        isLoanedOut = false;
    }

    public static Singleton borrowSingleton() {
        if (!isLoanedOut) {
            if (singleton == null) {
                singleton = new Singleton();
            }
            isLoanedOut = true;
            return singleton;
        }
        return null;
    }

    public void returnSingleton() {
        isLoanedOut = false;
    }

    public String getName() {
        return name;
    }
}
