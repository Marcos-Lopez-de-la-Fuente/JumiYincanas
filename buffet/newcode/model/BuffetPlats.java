package buffet.newcode.model;

public class BuffetPlats {

    // ! Atributos
    private int capacitatMaxima;
    private int quantitatActual;

    // ! Constructor
    public BuffetPlats(int capacitatMaxima) {
        this.setCapacitatMaxima(capacitatMaxima);
        this.setQuantitatActual(0);
    }

    // ! Métodos
    public synchronized void afegirPlat() {
        while (this.getCapacitatMaxima() == this.getQuantitatActual()) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.setQuantitatActual(this.getQuantitatActual() + 1);
    }

    public synchronized void retirarPlat() {
        this.setQuantitatActual(this.getQuantitatActual() - 1);

        this.notifyAll();
    }

    // ! Getters y Setters
    /**
     * @return the capacitatMaxima
     */
    public int getCapacitatMaxima() {
        return capacitatMaxima;
    }

    /**
     * @param capacitatMaxima the capacitatMaxima to set
     */
    public void setCapacitatMaxima(int capacitatMaxima) {
        this.capacitatMaxima = capacitatMaxima;
    }

    /**
     * @return the quantitatActual
     */
    public int getQuantitatActual() {
        return quantitatActual;
    }

    /**
     * @param quantitatActual the quantitatActual to set
     */
    public void setQuantitatActual(int quantitatActual) {
        this.quantitatActual = quantitatActual;
    }

}
