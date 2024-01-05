public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread("One");
        Thread t2 = new MyThread("Two");
        Thread t3 = new MyThread("Three");

        t1.start();
        t2.start();
        t3.start();
    }
}