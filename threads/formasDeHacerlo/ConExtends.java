package threads.formasDeHacerlo;

public class ConExtends extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new ConExtends()).start();
    }

}