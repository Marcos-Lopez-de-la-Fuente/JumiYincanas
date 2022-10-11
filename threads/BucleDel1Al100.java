package threads;

public class BucleDel1Al100 implements Runnable {

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello from a thread " + i);
        }
    }

    public static void main(String args[]) {
        (new Thread(new BucleDel1Al100())).start();
    }
}
