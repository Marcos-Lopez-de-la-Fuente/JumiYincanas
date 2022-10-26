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
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import layouts.tests.GridBagLayoutDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ! Aplicar los ejes al programa base
public class GridBagLayout4 extends JFrame implements ActionListener {

    // ! Atributos

    // ! Atributos
    // Atributos del programa principal
    private JTextArea jTextArea;
    private JScrollPane jScrollPaneDeJTextArea;
    private JTextField jTextFieldInputs;
    private JButton jButtonUpdateJTextArea;

    // Atributos del panel lateral
    private JPanel jPanelBotonesLateral;
    private JScrollPane jScrollPaneBotonesLateral;
    private JButton jButtonLateral1;
    private JButton jButtonLateral2;
    private JButton jButtonLateral3;
    private JButton jButtonLateral4;

    // Longitudes de atributos anteriormente declarados
    // jPanelBotonesLateral
    private final int WIDTHJPANELBOTONESLATERAL = 100;
    private final int HEIGHTJPANELBOTONESLATERAL = 180;
    // jScrollPaneBotonesLateral
    private final int WIDTHJSCROLLPANELLATERAL = 160;
    private final int HEIGHTJSCROLLPANELLATERAL = 1080;
    // jButtonLateral(1-2-3-4)
    private final int WIDTHJBOTONESLATERAL = 100;
    private final int HEIGHTJBOTONESLATERAL = 40;

    ///////////////////////////////////////////////// 7

    private JLabel jLabelTopBottom0;

    private ArrayList<JLabel> jLabelsTop = new ArrayList<JLabel>();
    private ArrayList<JLabel> jLabelsBottom = new ArrayList<JLabel>();

    // ! Constructor
    public GridBagLayout4() {
        // Llamada al constructor heredado indicando el título de la ventana
        super("GridBagLayout4");

        // Asignar los valores principales de los atributos
        propiedadesJFrame();

        // Se crea un objeto Constraints para posteriormente indicar las restricciones
        // de los elementos mediante el método addElementsWithConstraints()
        this.addElementsWithConstraints();

        this.setVisible(true); // Se cambia la visibilidad del objeto para mostrar por pantalla


        //////////////////////////////////////////////////////////

        // Se añaden Listeners en los elementos necesarios
        this.addListeners();

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



        //////////////////////////////////////////////////////

        // Atributos del programa principal
        this.jTextArea = new JTextArea();
        this.jScrollPaneDeJTextArea = new JScrollPane(this.jTextArea);
        this.jTextFieldInputs = new JTextField();
        this.jButtonUpdateJTextArea = new JButton("Enviar");



        // Atributo panel lateral donde se introducirán los botones y su tamaño
        this.jPanelBotonesLateral = new JPanel(new GridBagLayout());
        this.jPanelBotonesLateral.setPreferredSize(new Dimension(this.WIDTHJPANELBOTONESLATERAL, this.HEIGHTJPANELBOTONESLATERAL));

        // Atributo Scroll del panel lateral donde se introduce el panel de botones creado anteriormente y su tamaño
        this.jScrollPaneBotonesLateral = new JScrollPane(jPanelBotonesLateral, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.jScrollPaneBotonesLateral.setMinimumSize(new Dimension(this.WIDTHJSCROLLPANELLATERAL, this.HEIGHTJSCROLLPANELLATERAL));
        this.jScrollPaneBotonesLateral.setPreferredSize(new Dimension(this.WIDTHJSCROLLPANELLATERAL, this.HEIGHTJSCROLLPANELLATERAL));


        this.jButtonLateral1 = new JButton("Boton 1");
        this.jButtonLateral2 = new JButton("Boton 2");
        this.jButtonLateral3 = new JButton("Boton 3");
        this.jButtonLateral4 = new JButton("Boton 4");

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


        ///////////////////////////////////////////////////////

        // Add Atributo jScrollPaneDeJTextArea con sus Constraints
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        this.add(this.jScrollPaneDeJTextArea, gridBagConstraints);



        // Add Atributo jTextFieldInputs con sus Constraints
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.jTextFieldInputs, gridBagConstraints);



        // Add Atributo jButtonUpdateJTextArea con sus Constraints
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        this.add(this.jButtonUpdateJTextArea, gridBagConstraints);



        // Add botones laterales al atributo jPanelBotonesLateral con sus Constraints
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(3,3,3,3);
        jPanelBotonesLateral.add(jButtonLateral1, gridBagConstraints);

        gridBagConstraints.gridy = 2;
        jPanelBotonesLateral.add(jButtonLateral2, gridBagConstraints);
        gridBagConstraints.gridy = 3;
        jPanelBotonesLateral.add(jButtonLateral3, gridBagConstraints);
        gridBagConstraints.gridy = 4;
        jPanelBotonesLateral.add(jButtonLateral4, gridBagConstraints);

        // Vuelvo a dejar el valor en "default"
        gridBagConstraints.insets = new Insets(0,0,0,0);



        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;

        this.add(jPanelBotonesLateral, gridBagConstraints);

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










    /**
     * ! Añade Listeners a los elemenos necesarios del panel
     */
    public void addListeners() {

        // Botón de "Enviar" e imprimir el texto
        this.jButtonUpdateJTextArea.addActionListener(this);
    }

    /**
     * ! Se ejecutará cuando se detecte un Evento, se tendrá que identificar el elemento mediante condiciones
     * 
     * @param e The event that occurred.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        // Botón de "Enviar" e imprimir el texto
        if (e.getSource() == this.jButtonUpdateJTextArea) {
            this.jTextArea.append(this.jTextFieldInputs.getText() + "\n");
            this.jTextFieldInputs.setText("");
        }
    }


    public static void main(String[] args) {
        GridBagLayout4 gridBagLayout4 = new GridBagLayout4();
        System.out.println(gridBagLayout4.toString());

    }

}
