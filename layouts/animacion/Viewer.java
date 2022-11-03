package layouts.animacion;

import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Viewer extends Canvas implements Runnable {

    private int posicionX;
    private int posicionY;

    private BufferedImage fondo;
    private BufferedImage item;

    private static final String PATHFONDO = "C:\\Users\\marco\\Desktop\\Workspace\\DAM\\DAM2\\Jumi\\JumiYincanas\\layouts\\animacion\\fondo.jpg";
    private static final String PATHITEM = "C:\\Users\\marco\\Desktop\\Workspace\\DAM\\DAM2\\Jumi\\JumiYincanas\\layouts\\animacion\\imagen.jpeg";

    public Viewer() {

        // Cargar una imagen del disco
        try {
            this.fondo = ImageIO.read(new File(PATHFONDO));
            this.item = ImageIO.read(new File(PATHITEM));

        } catch (IOException e) {
            System.out.println("Img Error");
        }

    }

    public void paintBackground(Graphics graphics) {

        if (graphics == null) {
            System.out.println("No hay manejador de gráficos");
            return;
        }

        graphics.drawImage(this.fondo, 0, 0, null);
        graphics.drawImage(this.item, this.posicionX, this.posicionY, null);

    }

    @Override
    public void paint(Graphics graphics) {
    }

    @Override
    public void run() {

        while (true) {

            this.getGraphics();

            this.paintBackground(getGraphics());

            this.posicionX += 3;
            this.posicionY += 3;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
