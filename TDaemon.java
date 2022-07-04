class T1 extends Thread {
    public void run() {
        System.out.println("Hello run method");
    }
}

public class TDaemon {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        T1 t = new T1();
        Thread.sleep(1000);
        t.setDaemon(true);
        t.start();

    }
}