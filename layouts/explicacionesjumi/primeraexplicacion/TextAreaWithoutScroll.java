package layouts.explicacionesjumi.primeraexplicacion;

import java.awt.*;
import javax.swing.*;

public class TextAreaWithoutScroll extends JFrame {

    private JTextArea jTextArea = new JTextArea(80, 4);
    private JButton jButton = new JButton();

    public TextAreaWithoutScroll() {
        super("JFrame + Area texto"); // Llamada al super()

        // Setters principales del objeto
        this.setSize(300, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Añadir el texto al atributo "jTextArea" y añadirlo en el centro
        this.jTextArea.setText("Esto es un ejemplo de area de texto sin barras de desplazamiento");
        this.add(jTextArea, BorderLayout.CENTER);

        // Añadir el texto al objeto "jButton" y añadirlo abajo
        this.jButton.setText("Press");
        this.add(jButton, BorderLayout.SOUTH);

        // Poner visible la ventana
        this.setVisible(true);
    }

}
