package layouts.explicacionesjumi.primeraexplicacion;

import javax.swing.*;

public class JFrameVsJWindow {
    public JFrameVsJWindow() {
        JFrame jFrame = new JFrame("Esto es un JFrame");
        jFrame.setSize(350, 300);
        jFrame.setLocation(100, 100);
        jFrame.setVisible(true);

        JWindow jWindow = new JWindow();
        jWindow.setSize(350, 300);
        jWindow.setLocation(500, 100);
        jWindow.setVisible(true);
    }
}
