package animacio.code.view;

public class StatisticsPanel {

    // ! Attributes
    private int numObjects;

    // ! Constructor
    public StatisticsPanel(int numObjects) {
        this.setNumObjects(numObjects);
    }

    // ! Getters and Setters
    /**
     * @return the numObjects
     */
    public int getNumObjects() {
        return numObjects;
    }

    /**
     * @param numObjects the numObjects to set
     */
    public void setNumObjects(int numObjects) {
        this.numObjects = numObjects;
    }
}
