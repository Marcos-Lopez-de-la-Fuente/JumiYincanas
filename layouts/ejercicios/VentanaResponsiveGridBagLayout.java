package layouts.ejercicios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class VentanaResponsiveGridBagLayout extends JFrame implements ActionListener {

    private JTextArea area; // Area donde se puede introducir texto
    private JScrollPane scroll; // Barra de desplazamiento
    private JTextField texto; // Input de texto (Zona donde puedes introducir texto)
    private JButton boton; // Boton


    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;




    public static void main(String[] args) {
        VentanaResponsiveGridBagLayout ventanaResponsiveGridBagLayout = new VentanaResponsiveGridBagLayout();
    }





    public VentanaResponsiveGridBagLayout() {
        // ! Cosas de la ventana, super() y atributos de su super()
        super("VentanaResponsiveGridBagLayout"); // Título de la ventana
        this.setSize(400, 400); // Tamaño predeterminado de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierre la ventana, el programa también se cerrará
        this.setLayout(new GridBagLayout()); // Asignamos el tipo de Layout




        // ! Mediante este objeto se crearán las restricciones que les daremos a cada uno de los objetos para que se comporten de cierta manera en la ventana (Decirle a cada uno de los componentes "Que tienen que hacer")
        GridBagConstraints gridBagConstraints = new GridBagConstraints();



        // ! Asignamos nuestros atributos
        this.area = new JTextArea();
        this.scroll = new JScrollPane(this.area); // Gracias a esta línea conseguimos el el (this.area) tenga un scroll
        this.texto = new JTextField(20); // ! 20 columnas
        this.boton = new JButton("Enviar");

        this.boton1 = new JButton("Boton 1");
        this.boton2 = new JButton("Boton 2");
        this.boton3 = new JButton("Boton 3");
        this.boton4 = new JButton("Boton 4");





        // ! Constraints (Parámetros) el atributo (this.scroll)
        // ! Si se quiere modificar las Constraints de (this.area), se tendrá que modificar las de (this.scroll) debido a las anteriores líneas
        gridBagConstraints.gridx = 1; // La columna a la que quiero que empiece a posicionarse mi componente
        gridBagConstraints.gridy = 0; // La fila en la que posicionamos el componente
        gridBagConstraints.gridwidth = 2; // El ancho (La cantidad de columnas que quiero que ocupe)
        gridBagConstraints.gridheight = 5; // El alto (La cantidad de filas que quiero que ocupe)

        gridBagConstraints.weightx = 1.0; // Que tanto va a crecer mi componente horizontalmente cuando crezca la ventana (Si quiero que mi componente crezca el doble de lo que crezca la ventana le pondré "2.0")
        gridBagConstraints.weighty = 1.0; // Que tanto va a crecer mi componente verticalmente cuando crezca la ventana (Si quiero que mi componente crezca el doble de lo que crezca la ventana le pondré "2.0")

        gridBagConstraints.fill = GridBagConstraints.BOTH; // El modo en que va a crecer el componente ("Como quiero que crezca" modos: horizontal, vertical, ambas y otras...) [BOTH = Crecerá hacia ambos lados (Vertical y horizontal)]

        // Agregar el componente a la ventana junto al Constraint
        add(this.scroll,gridBagConstraints);



        // ! Constraints (Parámetros) el atributo (this.texto)
        gridBagConstraints.gridx = 1; // La columna a la que quiero que empiece a posicionarse mi componente
        gridBagConstraints.gridy = 5; // La fila en la que posicionamos el componente
        gridBagConstraints.gridwidth = 1; // El ancho (La cantidad de columnas que quiero que ocupe)
        gridBagConstraints.gridheight = 1; // El alto (La cantidad de filas que quiero que ocupe)

        gridBagConstraints.weightx = 1.0; // Que tanto va a crecer mi componente horizontalmente cuando crezca la ventana (Si quiero que mi componente crezca el doble de lo que crezca la ventana le pondré "2.0")
        gridBagConstraints.weighty = 0.0; // Que tanto va a crecer mi componente verticalmente cuando crezca la ventana (Si quiero que mi componente crezca el doble de lo que crezca la ventana le pondré "2.0")

        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL; // El modo en que va a crecer el componente ("Como quiero que crezca" modos: horizontal, vertical, ambas y otras...) [BOTH = Crecerá hacia ambos lados (Vertical y horizontal)]

        // Agregar el componente a la ventana junto al Constraint
        add(this.texto,gridBagConstraints);



        // ! Constraints (Parámetros) el atributo (this.texto)
        gridBagConstraints.gridx = 2; // La columna a la que quiero que empiece a posicionarse mi componente
        gridBagConstraints.gridy = 5; // La fila en la que posicionamos el componente
        gridBagConstraints.gridwidth = 1; // El ancho (La cantidad de columnas que quiero que ocupe)
        gridBagConstraints.gridheight = 1; // El alto (La cantidad de filas que quiero que ocupe)

        gridBagConstraints.weightx = 0.0; // Que tanto va a crecer mi componente horizontalmente cuando crezca la ventana (Si quiero que mi componente crezca el doble de lo que crezca la ventana le pondré "2.0")
        gridBagConstraints.weighty = 0.0; // Que tanto va a crecer mi componente verticalmente cuando crezca la ventana (Si quiero que mi componente crezca el doble de lo que crezca la ventana le pondré "2.0")

        gridBagConstraints.fill = GridBagConstraints.NONE; // El modo en que va a crecer el componente ("Como quiero que crezca" modos: horizontal, vertical, ambas y otras...) [BOTH = Crecerá hacia ambos lados (Vertical y horizontal)]

        // Agregar el componente a la ventana junto al Constraint
        add(this.boton,gridBagConstraints);

        this.boton.addActionListener(this); // ! Mediante un Listener, si se pulsa el botón se llamará al método "actionPerformed()"





        // ! Boton 1
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        this.boton1.setMinimumSize(new Dimension(120, 40));
        this.boton1.setPreferredSize(new Dimension(240, 80));
        add(this.boton1,gridBagConstraints);

        // ! Boton 2
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        this.boton2.setMinimumSize(new Dimension(120, 40));
        this.boton2.setPreferredSize(new Dimension(240, 80));
        add(this.boton2,gridBagConstraints);

        // ! Boton 3
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        this.boton3.setMinimumSize(new Dimension(120, 40));
        this.boton3.setPreferredSize(new Dimension(240, 80));
        add(this.boton3,gridBagConstraints);

        // ! Boton 4
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        this.boton4.setMinimumSize(new Dimension(120, 40));
        this.boton4.setPreferredSize(new Dimension(240, 80));
        add(this.boton4,gridBagConstraints);



        

        this.setVisible(true); // Cambiar la visibilidad de la ventana a "true"
    }





    // ! Pareciera ser un método que es ejecutado cada vez que una acción se realiza, mediante IFs se tendrá que identificar que se ha accionado como por ejemplo un botón
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton) {
            this.area.append(this.texto.getText() + "\n");
            this.texto.setText("");
        }
    }





}
