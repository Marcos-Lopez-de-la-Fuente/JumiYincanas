package layouts.animacion.conparpadeo;

import java.awt.GridBagLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;

public class MyWindow extends JFrame {

    // ! Atributos
    private Viewer viewer;



    // ! Constructor
    public MyWindow() {
        super("Animaciones");

        this.createFrame();

    }



    public void createFrame() {
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());


        this.addElements();

        this.setVisible(true);

        new Thread(this.viewer).start();

    }



    public void addElements() {

        this.setViewer();
    }



    public void setViewer() {
        Container panel = this.getContentPane();

        this.viewer = new Viewer();

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        panel.add(this.viewer, gridBagConstraints);
    }
}
