
import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Viewer extends Canvas implements Runnable {

    private int posicionX;
    private int posicionY;

    private BufferedImage bufferedImage;


    public Viewer() {
        this.posicionX = 0;
        
        // Cargar una imagen del disco
        try {
            this.bufferedImage = ImageIO.read(new File(
                    "C:\\Users\\marco\\Desktop\\Workspace\\DAM\\DAM2\\Jumi\\JumiYincanas\\layouts\\explicacionaddimagenes\\imagen.jpeg"));

        } catch (IOException e) {
            System.out.println("Img Error");
        }
    }



    public void paintBackground(Graphics graphics) {

        if (graphics == null) {
            System.out.println("No hay manejador de gráficos");
            return;
        }

        graphics.drawImage(this.bufferedImage, this.posicionX, this.posicionY, null);

    }


    // @Override
    // public void paint(Graphics graphics) {
    //     this.paintBackground(graphics);
    // }


    @Override
    public void run() {
        while (true) {
            Graphics graphics = this.getGraphics();


            // super.paint(graphics);
            this.paintBackground(graphics);

            this.posicionX += 10;
            this.posicionY += 10;


            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
