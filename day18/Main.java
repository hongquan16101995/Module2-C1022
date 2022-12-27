package day18;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Thread thread = new DemoThread(test);
        Thread runnable = new Thread(new DemoRunnable(test));

        thread.start();
        runnable.start();
    }
}
