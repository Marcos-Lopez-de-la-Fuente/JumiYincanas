package layouts.explicacionaddimagenes;

import java.awt.GridBagLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame {

    // ! Atributos
    private Viewer viewer;

    // ! Constructor
    public MyWindow() {
        super("EjercicioDeHoy");

        this.createFrame();


    }

    public void createFrame() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        //////////////////////////////////////////////////

        Container panel = this.getContentPane();



        this.viewer = new Viewer();



        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        panel.add(this.viewer, gridBagConstraints);


        this.setVisible(true);
        this.viewer.paintBackground();

    }

    public void addElementsWithConstraints() {

        /////////////////////////////////////////////

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        this.add(this.viewer, gridBagConstraints);

    }

    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow();

    }
}
