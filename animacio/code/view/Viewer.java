package animacio.code.view;

import java.awt.Canvas;
import java.awt.Image;

public class Viewer extends Canvas {

    // ! Attributes
    private Image background;

    // ! Constructor
    public Viewer() {
    }

    // ! Getters and Setters
    /**
     * @return the background
     */
    public Image getBackgroundViewer() {
        return background;
    }

    /**
     * @param background the background to set
     */
    public void setBackground(Image background) {
        this.background = background;
    }

}
