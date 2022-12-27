package day18;

public class DemoRunnable implements Runnable {
    public Test test;

    public DemoRunnable(Test test) {
        this.test = test;
    }

    @Override
    public void run() {
        this.test.m1();
    }
}
