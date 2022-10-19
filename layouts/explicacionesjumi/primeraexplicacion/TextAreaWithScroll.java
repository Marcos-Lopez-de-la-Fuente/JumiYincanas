package layouts.explicacionesjumi.primeraexplicacion;

import java.awt.*;
import javax.swing.*;

public class TextAreaWithScroll extends JFrame {

    private JScrollPane jScrollPane = new JScrollPane();
    private JTextArea jTextArea = new JTextArea(80, 4);

    public TextAreaWithScroll() {
        super("JFrame + Area Texto + Scroll"); // Llamada al super()

        // Setters principales del objeto
        this.setSize(350, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.jTextArea.setText("Esto es un ejemplo de JFrame con un componente de tipo JTextArea CON barras de desplazamiento");


        this.jScrollPane.setViewportView(this.jTextArea);
        this.add(this.jScrollPane, BorderLayout.CENTER);

        // Poner visible la ventana
        this.setVisible(true);
    }
}
