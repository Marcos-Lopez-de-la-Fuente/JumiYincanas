package buffet.code.model;

public class Range {
    private int min;
    private int max;

    public Range(int min, int max) {
        this.setMin(min);
        this.setMax(max);
    }





    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(int max) {
        this.max = max;
    }
}
