package animacio.code.extras;

public class Coordinates {

    // ! Attributes
    public int x;
    public int y;

    // ! Constructor
    public Coordinates(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    // ! Getters and Setters
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
