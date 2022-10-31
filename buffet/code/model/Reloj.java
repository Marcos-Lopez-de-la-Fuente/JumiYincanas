package buffet.code.model;


// ! LA ZONA CRITICA ES CUANDO SE LEE Y ESCRIBE A LA VEZ EL MINUTO ACTUAL (CREAR 2 MÉTODOS DIFERENTES PARA ESO)
public class Reloj implements Runnable {

    private static Reloj reloj_instance;
    private int minutoActual;
    private int multiplicadorDeTiempo;

    public Reloj(int multiplicadorDeTiempo) {
        this.setMinutoActual(0);
        this.setMultiplicadorDeTiempo(multiplicadorDeTiempo);
    }

    public static synchronized Reloj getInstance(int multiplicadorDeTiempo) {
        if (Reloj.getReloj_instance() == null) {
            Reloj.setReloj_instance(new Reloj(multiplicadorDeTiempo));
        }
        return Reloj.getReloj_instance();
    }

    public int minutosEnMilisegundos(int minutos) {
        return minutos * 60000 / this.getMultiplicadorDeTiempo();
    }

    public int getIntervaloEnMinutos(int minuto) {
        return this.getMinutoActual() - minuto;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(60000 / this.getMultiplicadorDeTiempo());
                this.setMinutoActual(this.getMinutoActual() + 1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // ! Getters y Setters
    /**
     * @return the reloj_instance
     */
    public static Reloj getReloj_instance() {
        return reloj_instance;
    }

    /**
     * @param reloj_instance the reloj_instance to set
     */
    public static void setReloj_instance(Reloj reloj_instance) {
        Reloj.reloj_instance = reloj_instance;
    }

    /**
     * @return the minutoActual
     */
    public int getMinutoActual() {
        return minutoActual;
    }

    /**
     * @param minutoActual the minutoActual to set
     */
    public void setMinutoActual(int minutoActual) {
        this.minutoActual = minutoActual;
    }

    /**
     * @return the multiplicadorDeTiempo
     */
    public synchronized int getMultiplicadorDeTiempo() {
        return multiplicadorDeTiempo;
    }

    /**
     * @param multiplicadorDeTiempo the multiplicadorDeTiempo to set
     */
    public synchronized void setMultiplicadorDeTiempo(int multiplicadorDeTiempo) {
        this.multiplicadorDeTiempo = multiplicadorDeTiempo;
    }

}
