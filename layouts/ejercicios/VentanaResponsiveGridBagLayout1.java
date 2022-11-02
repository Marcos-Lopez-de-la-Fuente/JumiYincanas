package layouts.ejercicios;

import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaResponsiveGridBagLayout1 extends JFrame implements ActionListener {

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





    // ! Constructor
    public VentanaResponsiveGridBagLayout1 () {

        // Llamada al constructor heredado indicando el título de la ventana
        super("VentanaResponsiveGridBagLayout");

        // Asignar los valores principales de los atributos
        propiedadesJFrame();

        // Se crea un objeto Constraints para posteriormente indicar las restricciones de los elementos mediante el método addElementsWithConstraints()
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        this.addElementsWithConstraints(gridBagConstraints);

        // Se añaden Listeners en los elementos necesarios
        this.addListeners();


        this.setVisible(true); // Se cambia la visibilidad del objeto para mostrar por pantalla
    }





    /**
     * ! Crea los valores de los atributos del objeto y de los heredados por JFrame
     */
    public void propiedadesJFrame() {

        // Atributos heredados por JFrame
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());



        // Atributos del programa principal
        this.jTextArea = new JTextArea();
        this.jScrollPaneDeJTextArea = new JScrollPane(this.jTextArea);
        this.jTextFieldInputs = new JTextField();
        this.jButtonUpdateJTextArea = new JButton("Enviar");



        // Atributo panel lateral donde se introducirán los botones y su tamaño
        this.jPanelBotonesLateral = new JPanel();
        this.jPanelBotonesLateral.setPreferredSize(new Dimension(this.WIDTHJPANELBOTONESLATERAL, this.HEIGHTJPANELBOTONESLATERAL));

        // Atributo Scroll del panel lateral donde se introduce el panel de botones creado anteriormente y su tamaño
        this.jScrollPaneBotonesLateral = new JScrollPane(jPanelBotonesLateral, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.jScrollPaneBotonesLateral.setMinimumSize(new Dimension(this.WIDTHJSCROLLPANELLATERAL, this.HEIGHTJSCROLLPANELLATERAL));
        this.jScrollPaneBotonesLateral.setPreferredSize(new Dimension(this.WIDTHJSCROLLPANELLATERAL, this.HEIGHTJSCROLLPANELLATERAL));


        this.jButtonLateral1 = new JButton("Boton 1");
        jButtonLateral1.setPreferredSize(new Dimension(this.WIDTHJBOTONESLATERAL,this.HEIGHTJBOTONESLATERAL));
        this.jButtonLateral2 = new JButton("Boton 2");
        jButtonLateral2.setPreferredSize(new Dimension(this.WIDTHJBOTONESLATERAL,this.HEIGHTJBOTONESLATERAL));
        this.jButtonLateral3 = new JButton("Boton 3");
        jButtonLateral3.setPreferredSize(new Dimension(this.WIDTHJBOTONESLATERAL,this.HEIGHTJBOTONESLATERAL));
        this.jButtonLateral4 = new JButton("Boton 4");
        jButtonLateral4.setPreferredSize(new Dimension(this.WIDTHJBOTONESLATERAL,this.HEIGHTJBOTONESLATERAL));


    }





    /**
     * ! Añade los Atributos / Elementos al objeto utilizando Constraints
     * 
     * @param gridBagConstraints The GridBagConstraints object that will be used to add the elements.
     */
    public void addElementsWithConstraints(GridBagConstraints gridBagConstraints) {

        // Add Atributo jScrollPaneDeJTextArea con sus Constraints
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        this.add(this.jScrollPaneDeJTextArea, gridBagConstraints);



        // Add Atributo jTextFieldInputs con sus Constraints
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.jTextFieldInputs, gridBagConstraints);



        // Add Atributo jButtonUpdateJTextArea con sus Constraints
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        this.add(this.jButtonUpdateJTextArea, gridBagConstraints);



        // Add botones laterales al atributo jPanelBotonesLateral con sus Constraints
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        jPanelBotonesLateral.add(jButtonLateral1, gridBagConstraints);

        gridBagConstraints.gridy = 1;
        jPanelBotonesLateral.add(jButtonLateral2, gridBagConstraints);
        gridBagConstraints.gridy = 2;
        jPanelBotonesLateral.add(jButtonLateral3, gridBagConstraints);
        gridBagConstraints.gridy = 3;
        jPanelBotonesLateral.add(jButtonLateral4, gridBagConstraints);



        // Add Atributo jScrollPaneBotonesLateral con sus Constraints
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        this.add(this.jScrollPaneBotonesLateral, gridBagConstraints);


    }





    /**
     * ! Añade Listeners a los elementos necesarios del panel
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
        VentanaResponsiveGridBagLayout1 ventanaResponsiveGridBagLayout = new VentanaResponsiveGridBagLayout1();
        System.out.println(ventanaResponsiveGridBagLayout.toString());

    }

}
