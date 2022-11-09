package animacio.code.view;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationView extends JFrame implements ActionListener, Runnable {

    // ! Attributes
    private int refreshMillis;
    private StatisticsPanel statisticsPanel;
    private ControlPanel controlPanel;
    private Viewer viewer;

    // ! Constructor
    public AnimationView(int refreshMillis, int numObjects) {
        this.setRefreshMillis(refreshMillis);
        this.setStatisticsPanel(numObjects);
        this.setControlPanel();
        this.setViewer();
    }

    // ! Methods
    public void refresh(AnimatedObjectList animatedObjectList) {
    }

    public void play() {
    }

    public void pause() {
    }

    // ! Overrides
    @Override
    public void run() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    // ! Getters and Setters
    /**
     * @return the refreshMillis
     */
    public int getRefreshMillis() {
        return refreshMillis;
    }

    /**
     * @param refreshMillis the refreshMillis to set
     */
    public void setRefreshMillis(int refreshMillis) {
        this.refreshMillis = refreshMillis;
    }

    /**
     * @return the statisticsPanel
     */
    public StatisticsPanel getStatisticsPanel() {
        return statisticsPanel;
    }

    /**
     * @param statisticsPanel the statisticsPanel to set
     */
    public void setStatisticsPanel(int numObjects) {
        this.statisticsPanel = new StatisticsPanel(numObjects);
    }

    /**
     * @return the controlPanel
     */
    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    /**
     * @param controlPanel the controlPanel to set
     */
    public void setControlPanel() {
        this.controlPanel = new ControlPanel();
    }

    /**
     * @return the viewer
     */
    public Viewer getViewer() {
        return viewer;
    }

    /**
     * @param viewer the viewer to set
     */
    public void setViewer() {
        this.viewer = new Viewer();
    }

}
