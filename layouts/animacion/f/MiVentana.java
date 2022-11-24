import javax.swing.JFrame;

public class MiVentana extends JFrame {

    public MiVentana() {
        createMiVentana();
    }

    public void createMiVentana() {
        this.setSize(800, 800);
        this.setTitle("Marco Canvas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Viewer viewer = new Viewer();
        add(viewer);

        this.setVisible(true);
        viewer.paintBackground();
        Thread t = new Thread(viewer);
        t.start();

    }
}
