package animacio.code.view;

import javax.swing.JButton;

public class ControlPanel {

    // ! Attributes
    private JButton bPlay;
    private JButton bPause;

    // ! Constructor
    public ControlPanel() {
        this.setBPlay();
        this.setBPause();
    }

    // ! Getters and Setters
    /**
     * @return the bPlay
     */
    public JButton getBPlay() {
        return bPlay;
    }

    /**
     * @param bPlay the bPlay to set
     */
    public void setBPlay() {
        this.bPlay = new JButton();
    }

    /**
     * @return the bPause
     */
    public JButton getBPause() {
        return bPause;
    }

    /**
     * @param bPause the bPause to set
     */
    public void setBPause() {
        this.bPause = new JButton();
    }

}
