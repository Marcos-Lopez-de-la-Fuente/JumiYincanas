package threads.clasesjuntas;

public class ProgramaMain {
    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
        (new Thread(new ByeRunnable())).start();
        System.out.println("He terminado");
    }
}
