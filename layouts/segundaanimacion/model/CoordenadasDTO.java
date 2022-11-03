package layouts.segundaanimacion.model;

public class CoordenadasDTO {

    // ! Atributos
    private int x;
    private int y;

    // ! Constructores
    /**
     * @param x
     * @param y
     */
    public CoordenadasDTO(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    // ! Getters y Setters
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

}
