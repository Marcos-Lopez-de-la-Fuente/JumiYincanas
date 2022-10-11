package threads.ejercicio;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Contador contador = new Contador();
        Productor productor = new Productor(contador);
        Consumidor consumidor = new Consumidor(contador);

        productor.start();
        consumidor.start();

        try {
            productor.join();
            consumidor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(contador.mostrar());
        System.out.println(contador.mostrar());
        System.out.println(contador.mostrar());
        System.out.println(contador.mostrar());
    }

}
