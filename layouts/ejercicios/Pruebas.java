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


// TODO FALTA SEPARAR EN DIFERENTES MÉTODOS Y COMENTAR CORRECTAMENTE
// TODO Tengo que intentar a quitar la mayor parte del código posible para ver si es necesaria o el programa funciona perfectamente sin el y solo es basura que he escrito entre varias pruebas
public class Pruebas extends JFrame implements ActionListener {

    private JTextArea area; // Area donde se puede introducir texto
    private JScrollPane scroll; // Barra de desplazamiento
    private JTextField texto; // Input de texto (Zona donde puedes introducir texto)
    private JButton boton; // Boton













    public Pruebas () {
        super("VentanaResponsiveGridBagLayout"); // Título de la ventana
        this.setSize(400, 400); // Tamaño predeterminado de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierre la ventana, el programa también se cerrará
        this.setLayout(new GridBagLayout());


        this.area = new JTextArea();
        this.scroll = new JScrollPane(this.area); // Gracias a esta línea conseguimos el el (this.area) tenga un scroll
        this.texto = new JTextField();
        this.boton = new JButton("Enviar");


        GridBagConstraints gridBagConstraints = new GridBagConstraints();

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

        this.boton.addActionListener(this);













        JPanel jPanel1 = new JPanel();


        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");
        JButton boton4 = new JButton("Boton 4");

        boton1.setPreferredSize(new Dimension(100, 40));

        boton2.setPreferredSize(new Dimension(100, 40));

        boton3.setPreferredSize(new Dimension(100, 40));

        boton4.setPreferredSize(new Dimension(100, 40));


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        
        gridBagConstraints.fill = GridBagConstraints.NONE;

        jPanel1.add(boton1,gridBagConstraints);
        gridBagConstraints.gridy = 1;
        jPanel1.add(boton2,gridBagConstraints);
        gridBagConstraints.gridy = 2;
        jPanel1.add(boton3,gridBagConstraints);
        gridBagConstraints.gridy = 3;
        jPanel1.add(boton4,gridBagConstraints);

        jPanel1.setPreferredSize(new Dimension(100, 180));


        JScrollPane scrollPane1 = new JScrollPane(jPanel1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        



        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 5;

        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;

        gridBagConstraints.fill = GridBagConstraints.NONE;

        scrollPane1.setMinimumSize(new Dimension(160, 1080));
        scrollPane1.setPreferredSize(new Dimension(160, 1080));
        add(scrollPane1,gridBagConstraints);






        this.setVisible(true);
    }
    public static void main(String[] args) {
        Pruebas pruebas = new Pruebas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton) {
            this.area.append(this.texto.getText() + "\n");
            this.texto.setText("");
        }
    }
}
