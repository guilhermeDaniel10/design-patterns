public class MyThread extends Thread {

    public MyThread(String name) {
        this.setName(name);
    }

    public void run() {
        System.out.println(String.format("Thread %s is running", this.getName()));

        while (true) {
            try {
                System.out.println(String.format("Thread %s still running", this.getName()));
                System.out.println(Singleton.getInstance().information);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(String.format("Thread %s interrupted", this.getName()));
            }
        }
    }
}

