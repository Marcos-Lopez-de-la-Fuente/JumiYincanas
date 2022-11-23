package buffet.newcode.model;

public class Rellotge implements Runnable { // ! Diría que está acabado

    // ! Atributos
    private static Rellotge rellotge;

    private int minutActual;
    private int multiplicadorTemps;

    // ! Constructor
    private Rellotge(int multiplicadorTemps) {
        this.setMinutActual(0);
        this.setMultiplicadorTemps(multiplicadorTemps);
    }

    public static synchronized Rellotge getInstance(int multiplicadorTemps) {
        if (Rellotge.getRellotge() == null) {
            Rellotge.setRellotge(new Rellotge(multiplicadorTemps));
        }
        return Rellotge.getRellotge();
    }

    // ! Métodos
    public int minutsEnMilisegons(int minuts) {
        return minuts * 60000 / this.getMultiplicadorTemps();
    }

    public int getIntervalEnMinuts(int minut) {
        return this.getMinutActual() - minut;
    }

    // ! Run
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(60000 / this.getMultiplicadorTemps());
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.setMinutActual(this.getMinutActual() + 1);
        }
    }

    // ! Getters y Setters
    /**
     * @return the rellotge
     */
    public static Rellotge getRellotge() {
        return rellotge;
    }

    /**
     * @param rellotge the rellotge to set
     */
    public static void setRellotge(Rellotge rellotge) {
        Rellotge.rellotge = rellotge;
    }

    /**
     * @return the minutActual
     */
    public int getMinutActual() {
        return minutActual;
    }

    /**
     * @param minutActual the minutActual to set
     */
    public void setMinutActual(int minutActual) {
        this.minutActual = minutActual;
    }

    /**
     * @return the multiplicadorTemps
     */
    public int getMultiplicadorTemps() {
        return multiplicadorTemps;
    }

    /**
     * @param multiplicadorTemps the multiplicadorTemps to set
     */
    public void setMultiplicadorTemps(int multiplicadorTemps) {
        this.multiplicadorTemps = multiplicadorTemps;
    }

}
