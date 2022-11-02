package layouts.explicacionaddimagenes;

import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Viewer extends Canvas {

    private BufferedImage bufferedImage;

    public Viewer() {
        // Cargar una imagen del disco
        try {
            this.bufferedImage = ImageIO.read(new File(
                    "C:\\Users\\monoq\\Desktop\\Workspace\\DAM\\DAM2\\JumiYincanas\\layouts\\explicacionaddimagenes\\imagen.jpeg"));

        } catch (IOException e) {
            System.out.println("Img Error");
        }
    }





    public void paintBackground() {
        Graphics graphics = this.getGraphics();

        if (graphics == null) {
            System.out.println("No hay manejador de gráficos");
            return;
        }


        graphics.drawImage(this.bufferedImage, 0, 0, null);

    }


    @Override
    public void paint(Graphics g) {
        System.out.println("Pintando");
        this.paintBackground();
    }

}
