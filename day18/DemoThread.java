package day18;

public class DemoThread extends Thread {
    public Test test;

    public DemoThread(Test test) {
        this.test = test;
    }

    @Override
    public void run() {
        this.test.m1();
    }
}
