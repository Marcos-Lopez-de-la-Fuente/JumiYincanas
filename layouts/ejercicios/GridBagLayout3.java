package layouts.ejercicios;

import java.awt.Dimension;
import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ! Ejes X e Y básico
public class GridBagLayout3 extends JFrame {

    // ! Atributos

    ///////////////////////////////////////////////// 7

    private JLabel jLabelTopBottom0;

    private ArrayList<JLabel> jLabelsTop = new ArrayList<JLabel>();
    private ArrayList<JLabel> jLabelsBottom = new ArrayList<JLabel>();

    // ! Constructor
    public GridBagLayout3() {
        // Llamada al constructor heredado indicando el título de la ventana
        super("GridBagLayout3");

        // Asignar los valores principales de los atributos
        propiedadesJFrame();

        // Se crea un objeto Constraints para posteriormente indicar las restricciones
        // de los elementos mediante el método addElementsWithConstraints()
        this.addElementsWithConstraints();

        this.setVisible(true); // Se cambia la visibilidad del objeto para mostrar por pantalla
        System.out.println(this.jLabelsTop.size());
        System.out.println(this.jLabelsBottom.size());
    }

    /**
     * ! Crea los valores de los atributos del objeto y de los heredados por JFrame
     */
    public void propiedadesJFrame() {
        // Atributos heredados por JFrame
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        //////////////////////////////////////////////

        this.jLabelTopBottom0 = new JLabel("0");

        // jLabels

        this.addJLabel(this.jLabelsTop, 12);
        this.addJLabel(this.jLabelsBottom, 12);

    }

    /**
     * ! Añade los Atributos / Elementos al objeto utilizando Constraints
     * 
     * 
     */
    public void addElementsWithConstraints() {

        ///////////////
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        this.add(this.jLabelTopBottom0, gridBagConstraints);

        // jLabelsTop and Bottom
        for (int i = 1; i < 11; i++) {
            this.addJLabelWithConstraintsHorizontalOrVertical(this.jLabelsTop.get(i), i, 0);
            this.addJLabelWithConstraintsHorizontalOrVertical(this.jLabelsBottom.get(i), 0, i);
        }

    }

    public void addJLabel(ArrayList<JLabel> jLabels, int amount) {
        for (int i = 0; i < amount; i++) {
            jLabels.add(new JLabel(String.valueOf(i)));
        }
    }

    public void addJLabelWithConstraintsHorizontalOrVertical(JLabel jLabels, int positionX, int positionY) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = positionX;
        gridBagConstraints.gridy = positionY;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;

        this.add(jLabels, gridBagConstraints);
    }

    public static void main(String[] args) {
        GridBagLayout3 gridBagLayout3 = new GridBagLayout3();
        System.out.println(gridBagLayout3.toString());

    }

}
