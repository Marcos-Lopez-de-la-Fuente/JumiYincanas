package threads.formasDeHacerlo;

public class ConImplements implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new ConImplements())).start();
    }

}