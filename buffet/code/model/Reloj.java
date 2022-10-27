package buffet.code.model;

public class Reloj implements Runnable {

    private int minutoActual;
    private int multiplicadorDeTiempo;



    public Reloj(int multiplicadorDeTiempo) {
        this.minutoActual = 0;
        this.multiplicadorDeTiempo = multiplicadorDeTiempo;
    }



    public int minutosEnMilisegundos(int minutos) {
        return minutos * 60000;
    }

    public int getTiempo() {
        return this.minutoActual;
    }

    public int getIntervaloEnMinutos(int minuto) {
        return this.minutoActual - minuto;
    }



    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

}
