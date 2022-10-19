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

import layouts.tests.GridBagLayoutDemo;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaResponsiveGridBagLayoutPruebas extends JFrame implements ActionListener {

    // ! Atributos
    // Atributos del programa principal
    private JTextArea jTextArea;
    private JScrollPane jScrollPaneDeJTextArea;
    private JTextField jTextFieldInputs;
    private JButton jButtonUpdateJTextArea;

    // Atributos del panel lateral
    private JPanel jPanelBotonesLateral;
    private JPanel jPanelBotonesLatera2;
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
    public VentanaResponsiveGridBagLayoutPruebas() {

        // Llamada al constructor heredado indicando el título de la ventana
        super("VentanaResponsiveGridBagLayoutPruebas");

        // Asignar los valores principales de los atributos
        propiedadesJFrame();

        // Se crea un objeto Constraints para posteriormente indicar las restricciones
        // de los elementos mediante el método addElementsWithConstraints()
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        this.addElementsWithConstraints(gridBagConstraints);

        this.setVisible(true); // Se cambia la visibilidad del objeto para mostrar por pantalla
    }

    /**
     * ! Crea los valores de los atributos del objeto y de los heredados por JFrame
     */
    public void propiedadesJFrame() {

        // Atributos heredados por JFrame
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        // Atributo panel lateral donde se introducirán los botones y su tamaño
        this.jPanelBotonesLateral = new JPanel();
        this.jPanelBotonesLateral.setLayout(new GridBagLayout());
        this.jPanelBotonesLateral
                .setPreferredSize(new Dimension(this.WIDTHJPANELBOTONESLATERAL, this.HEIGHTJPANELBOTONESLATERAL));

        this.jPanelBotonesLatera2 = new JPanel();
        this.jPanelBotonesLatera2.setLayout(new GridBagLayout());
        this.jPanelBotonesLatera2
                .setPreferredSize(new Dimension(this.WIDTHJPANELBOTONESLATERAL, this.HEIGHTJPANELBOTONESLATERAL));

        this.jButtonLateral1 = new JButton("Boton 1");
        this.jButtonLateral2 = new JButton("Boton 2");

    }

    /**
     * ! Añade los Atributos / Elementos al objeto utilizando Constraints
     * 
     * @param gridBagConstraints The GridBagConstraints object that will be used to
     *                           add the elements.
     */
    public void addElementsWithConstraints(GridBagConstraints gridBagConstraints) {

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();

        // TODO Aquí tengo que cambiar los valores de this.jButtonLateral1 mediante el
        // TODO mismo objeto con algun "set" o mediante el objeto "gridBagConstraints2"

        this.jButtonLateral1.setMinimumSize(new Dimension(WIDTHJPANELBOTONESLATERAL,20));
        this.jButtonLateral1.setMaximumSize(new Dimension(WIDTHJPANELBOTONESLATERAL,20));
        this.jButtonLateral1.setPreferredSize(new Dimension(WIDTHJPANELBOTONESLATERAL,20));
        gridBagConstraints2.fill = GridBagConstraints.HORIZONTAL;

        jPanelBotonesLateral.add(jButtonLateral1, gridBagConstraints2);

        // ! este es el obtro panel con el otro boton para tenerlo como referencia
        jPanelBotonesLatera2.add(this.jButtonLateral2, gridBagConstraints);

        this.add(this.jPanelBotonesLateral, gridBagConstraints);

        gridBagConstraints.weightx = 1.0;
        this.add(this.jPanelBotonesLatera2, gridBagConstraints);

    }

    /**
     * ! Se ejecutará cuando se detecte un Evento, se tendrá que identificar el
     * elemento mediante condiciones
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
        VentanaResponsiveGridBagLayoutPruebas ventanaResponsiveGridBagLayout = new VentanaResponsiveGridBagLayoutPruebas();
        System.out.println(ventanaResponsiveGridBagLayout.toString());

    }

}
