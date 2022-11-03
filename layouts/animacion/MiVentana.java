package layouts.animacion;

import javax.swing.JFrame;

public class MiVentana extends JFrame {

    public MiVentana () {
        createMiVentana();
    }
    public void createMiVentana(){
        this.setSize(1920,1080);
        this.setTitle("Marco Canvas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        OtherViewer viewer = new OtherViewer();
        add(viewer);

        this.setVisible(true);
        viewer.paintBackground();
        Thread t = new Thread(viewer);
        t.start();
    }
}
